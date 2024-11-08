/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.ParamGerais;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.UsuRepres;
import br.com.onsys.entidades.seguranca.Dashboard;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.seguranca.UsuarioEmpresa;
import br.com.onsys.entidades.suporte.UsuarioSuporte;
import br.com.onsys.entidades.tipos.TipoUsuario;
import br.com.onsys.session.seguranca.UsuarioEmpresaSession;
import br.com.onsys.session.seguranca.UsuarioSession;
import br.com.onsys.session.suporte.UsuarioSuporteSession;
import br.com.onsys.util.TrocarEmpresa;
import br.com.onsys.util.TrocarIdioma;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
//import br.com.onsys.model.AccessToken;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import org.primefaces.PrimeFaces;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.DualListModel;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.MeterGaugeChartModel;
/**
 *
 * @author cristiano
 */
@Named
@SessionScoped
public class UsuarioFace extends BaseCDIBean<Usuario> {

    private static final long serialVersionUID = 1L;
    @Inject
    private UsuarioSession          bean;
    @Inject 
    private LoginFace               loginFace;    
    @Inject 
    private TrocarIdioma            trocarIdioma;
    @Inject 
    private TrocarEmpresa           trocarEmpresa;   
    @Inject
    private UsuarioSuporteSession   usuarioSuporteSession;  
    @Inject     
    private UsuarioEmpresaSession   usuarioEmpresaSession;
    private Integer                 idUsuario   = null;    
    private String                  login;
    private String                  senha;
    private String                  novaSenha1;
    private String                  novaSenha2;    
    private Integer                 progress;
    private Usuario                 loggedUser      = null;
    private Integer                 idEmpresa       = null;    
    private Empresa                 empresa         = null;    
    private ParamGerais             paramGerais     = null;     
    private String                  inativo   = null;        
    private Integer                 idUsrValido = null;              
    private String                  cListaRepres    = null;    
    private Representante           representante   = null;; 

    private String                  listaRepresDashboard;        
    //private List<UsuarioPrograma>   listUsrProg             = null;
    private List<UsuRepres>         listGerente             = null;    
    private String                  codigoMELI              = null;
    private Usuario                 registroSelecionado;
    private Representante           representanteSelecionado;
    private UsuarioSuporte          usuarioSuporte;
    private UsuarioEmpresa          usuarioEmpresaSelecionado;
    private Estabelecimento         estabelecimentoSelecionado;
    private String                  operacao        = "I";
    private String                  tituloDialogo   = ""; 
    private boolean                 atuDashBoard = true;
    private Dashboard               dashboard;
    private List<Usuario>           list;
    private LazyDataModel<Usuario>  lazy;
    private DualListModel<Usuario>  cpUsr;    
    private double  pdvDia      = 0;
    private double  pdvQtdDia   = 0;    
    private double  pdvMes      = 0;
    private double  pdvQtdMes   = 0;    
    private double  pdvOntem    = 0;
    private double  pdvQtdOntem = 0;    
    private double  pdvTotal    = 0;
    
    private double metapedido       = 0;
    private double metavalor        = 0;
    private double percmetapedido   = 0;
    private double percmetavalor    = 0;

    private double faltapdvMes          = 0;
    private double faltapdvMesQtd       = 0;
    private double faltapercmetapedido  = 0;
    private double faltapercmetavalor   = 0;

    private double  pdvDiaQtd  = 0;
    private double  pdvMesQtd  = 0;
    private double  pdvAnoQtd  = 0;
    
    private double  osDia      = 0;
    private double  osMes      = 0;
    private double  osTotal    = 0;

    private double  saldoportador = 0;
    private double  arDia      = 0;
    private double  arMes      = 0;
    private double  arTotal    = 0;
    private double  arVencido  = 0;    

    private double  apDia      = 0;
    private double  apMes      = 0;
    private double  apTotal    = 0;
    private double  apVencido  = 0;    
    
    private double  venda1trim   = 0;
    private double  venda2trim   = 0;
    private double  venda3trim   = 0;
    private double  venda4trim   = 0;
    private double  vendames     = 0;
    private double  vendatotal   = 0;
    
    private double  hrsDia      = 0;
    private double  hrsMes      = 0;    
    private double  hrsTotal    = 0;
    
    private LineChartModel lineModel;        
    private LineChartModel lineModelValor;    
    
    private DefaultStreamedContent      logo = new DefaultStreamedContent();    
    private DefaultStreamedContent      imgFundo; 
    private DefaultStreamedContent      logoDashboard;    
    private MeterGaugeChartModel        meterGaugeModelPedidos;
    private MeterGaugeChartModel        meterGaugeModelValor;
    private Double                      metaQtdPedOri =  0.00;
    private Double                      metaVlPedOri =  0.00;
    private String                      cnpjSemFormato = null;
//  VARIAVEIS DE FILTRO E PAGINAÇÃO
    private String                      apelidoFiltro;
    private String                      emailFiltro;
    private int                         pagina;    
    
    private boolean primeiraVezDash         = true;
    private boolean salvaDadosUltimoAcesso  = true;   
    private Integer activTab = 0;    
    
//  VARIAVEIS DE FILTRO E PAGINAÇÃO
    private ResourceBundle          rb;
    private Empresa                 empresaSessao;
    //private AccessToken             accessTokenML;        
    
    @PostConstruct
    public void init() {
        setLoggedUser(loginFace.getUsuarioLogado());
        setListaRepresDashboard(loginFace.getcListaRepres());
        setcListaRepres(loginFace.getcListaRepres());
        setEmpresa(loginFace.getUsuarioLogado().getEmpresa());
        setRepresentante(loginFace.getRepresentante());
        setUsuarioEmpresaSelecionado(loginFace.getUsuarioEmpresa());
        criarDualList();
    }    
        
    public UsuarioFace() {
        setSelectedBean(new Usuario());
    }
    
    public void doValidaUsr() {
        
    }         
    
    public void doValidaUsr(int idUsr) {
        if (idUsr != getLoggedUser().getId() || idUsr == 0) {
            doLogOut();        
        }        
    }      
    
    public String executarLogin(String login, String senha) {
        
        System.out.println("***EXECUTARLOGIN***");
        System.out.println("LOGIN===>"+login);
        System.out.println("SENHA===>"+senha);
        
        
        System.out.println("***EXECUTARLOGIN - PONTO 2***");
        System.out.println("REPRESENTANTE===>"+representante.getCodigo());
        
        try {
            System.out.println("***1-VOU ATUALIZAR DASHBOARD***");
        } catch (Exception e) {
            System.out.println("***2-VOU ATUALIZAR DASHBOARD***");
        }

        return "dashboard.faces?faces-redirect=true";
        
    }
    
    public void incluir() {
        setSelectedBean(new Usuario());
        setUsuarioSuporte(new UsuarioSuporte());
        setRegistroSelecionado(new Usuario());        
        setOperacao("I");
        
        try {

            System.out.println("***CRIAR REGISTRO USUARIOEMPRESA***");
            System.out.println("***ID USR=======>"+registroSelecionado.getId());
            System.out.println("***ID EMPRESA===>"+loggedUser.getEmpresa());

            System.out.println("***NÃO EXISTE USUARIOEMPRESA***");
            usuarioEmpresaSelecionado = new UsuarioEmpresa();
            usuarioEmpresaSelecionado.setEmpresa(getLoggedUser().getEmpresa());
            //novoRegistro.setUsuario(registroSelecionado);
            //novoRegistro.setEstabelecimento(registroSelecionado.getEstabelecimento());
            //usuarioEmpresaSession.save(novoRegistro);
            //usuarioEmpresa = usuarioEmpresaSession.getUsuarioEmpresa(registroSelecionado.getEmpresa().getId(), registroSelecionado.getId());

        } catch (Exception e) {

        }

        setTituloDialogo("Incluir usuário");
        PrimeFaces.current().executeScript("PF('dialogo').show()");
    }
    
    public void alterar() {    
        if (registroSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de alteração."));
        } else {
            
            try {
                if (registroSelecionado.getInativo().equals("S")) {
                    setInativo("S");
                } else {
                     setInativo("N");
                }  
            } catch (Exception e) {
                setInativo("N");
            }
            
            try {
                
                //System.out.println("***VERIFICA SE USR ADM DE SUPORTE EXISTE***");
                //System.out.println("***ID USR=======>"+registroSelecionado.getId());
                //System.out.println("***ID EMPRESA===>"+registroSelecionado.getEmpresa());
                
                usuarioSuporte = usuarioSuporteSession.getByUsuario(registroSelecionado.getId(), registroSelecionado.getEmpresa().getId());
            } catch (Exception e) {
                setUsuarioSuporte(new UsuarioSuporte());
                usuarioSuporte.setEmpresa(registroSelecionado.getEmpresa());
                usuarioSuporte.setUsuario(registroSelecionado);
            }
            
            try {
                
                //System.out.println("***VERIFICA SE USUARIOEMPRESA EXISTE***");
                //System.out.println("***ID USR=======>"+registroSelecionado.getId());
                //System.out.println("***ID EMPRESA===>"+registroSelecionado.getEmpresa());
                
                usuarioEmpresaSelecionado = usuarioEmpresaSession.getUsuarioEmpresa(registroSelecionado.getEmpresa().getId(), registroSelecionado.getId());
                
            } catch (Exception e) {
                
                System.out.println("***NÃO EXISTE USUARIOEMPRESA***");
                UsuarioEmpresa novoRegistro = new UsuarioEmpresa();
                novoRegistro.setEmpresa(registroSelecionado.getEmpresa());
                novoRegistro.setUsuario(registroSelecionado);
                novoRegistro.setEstabelecimento(registroSelecionado.getEstabelecimento());
                novoRegistro.setAprovaPDV(registroSelecionado.isAprovaPDV());
                usuarioEmpresaSession.save(novoRegistro);
                usuarioEmpresaSelecionado = usuarioEmpresaSession.getUsuarioEmpresa(registroSelecionado.getEmpresa().getId(), registroSelecionado.getId());
                
            }
            
            setEstabelecimentoSelecionado(usuarioEmpresaSelecionado.getEstabelecimento());
            
            setOperacao("A");
            setTituloDialogo("Alterar usuário - "+registroSelecionado.getApelido());
            PrimeFaces.current().executeScript("PF('dialogo').show()");  
            
        }      
    }
    
    public void consultar() {     
        if (registroSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de consulta."));
        } else {        
            try {
                if (registroSelecionado.getInativo().equals("S")) {
                    setInativo("S");
                } else {
                     setInativo("N");
                }  
            } catch (Exception e) {
                setInativo("N");
            }    
            
            try {
                //System.out.println("***VERIFICA SE USR ADM EXISTE***");
                //System.out.println("***ID USR=========>"+registroSelecionado.getId());
                //System.out.println("***ID EMPRESA===>"+registroSelecionado.getEmpresa());
                
                usuarioSuporte = usuarioSuporteSession.getByUsuario(registroSelecionado.getId(), registroSelecionado.getEmpresa().getId());
            } catch (Exception e) {
            }            
            
            try {
                
                System.out.println("***VERIFICA SE USUARIOEMPRESA EXISTE***");
                System.out.println("***ID USR=======>"+registroSelecionado.getId());
                System.out.println("***ID EMPRESA===>"+registroSelecionado.getEmpresa());
                
                usuarioEmpresaSelecionado = usuarioEmpresaSession.getUsuarioEmpresa(registroSelecionado.getEmpresa().getId(), registroSelecionado.getId());
                
            } catch (Exception e) {
                
                System.out.println("***NÃO EXISTE USUARIOEMPRESA***");
                //UsuarioEmpresa novoRegistro = new UsuarioEmpresa();
                //novoRegistro.setEmpresa(registroSelecionado.getEmpresa());
                //novoRegistro.setUsuario(registroSelecionado);
                //novoRegistro.setEstabelecimento(registroSelecionado.getEstabelecimento());
                //usuarioEmpresaSession.save(novoRegistro);
                //usuarioEmpresaSelecionado = usuarioEmpresaSession.getUsuarioEmpresa(registroSelecionado.getEmpresa().getId(), registroSelecionado.getId());
                
            }
            
            setSelectedBean(registroSelecionado);
            setOperacao("C");
            setTituloDialogo("Consultar usuário - "+registroSelecionado.getApelido());
            PrimeFaces.current().executeScript("PF('dialogoConsultar').show()");     
            
        }
    }
    
    public void copiar() {     
        if (registroSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de consulta."));
        } else {        
            try {
                if (registroSelecionado.getInativo().equals("S")) {
                    setInativo("S");
                } else {
                     setInativo("N");
                }  
            } catch (Exception e) {
                setInativo("N");
            }    
            registroSelecionado.setEmail("");
            registroSelecionado.setApelido("");
            registroSelecionado.setNome("");
            registroSelecionado.setId(null);
            try {
                System.out.println("***VERIFICA SE USR ADM EXISTE***");
                System.out.println("***ID USR=========>"+registroSelecionado.getId());
                System.out.println("***ID EMPRESA===>"+registroSelecionado.getEmpresa());
                
                usuarioSuporte = usuarioSuporteSession.getByUsuario(registroSelecionado.getId(), registroSelecionado.getEmpresa().getId());
            } catch (Exception e) {
            }            
            
            setSelectedBean(registroSelecionado);
            setOperacao("I");
            setTituloDialogo("Copiar");
            PrimeFaces.current().executeScript("PF('dialogoCopiar').show()");                    
        }
    }    

    public void remover() { 
        if (registroSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de deleção."));
        } else {       
            try {         
                setSelectedBean(registroSelecionado);
                bean.remove(getSelectedBean());
                setList(null);
                setLazy(null);
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro não pode ser deletado, pois possui relacionamentos ativo."));
            }
        }
    }    
    
    public void fimIncluirAlterar(String empresa, Boolean novoRegistro) {
        setSelectedBean(registroSelecionado);
        Locale locale = new Locale("pt","BR");
        Date dateModificacao = new Date(); 
        Date now = new Date();
        getSelectedBean().setModificado("S");
        getSelectedBean().setEmpresa(loginFace.getUsuarioLogado().getEmpresa());
        if (valida(getSelectedBean()) == false){        
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro não pode ser salvo"));
        } else {
            if (salvar(getSelectedBean())) {         
                if (!novoRegistro) { 
                    PrimeFaces.current().executeScript("PF('dialogo').hide()");
                } 
            }
        }
    }    
    
    public void fimCopiar(String empresa, Boolean novoRegistro) {
        setSelectedBean(registroSelecionado);
        Locale locale = new Locale("pt","BR");
        Date dateModificacao = new Date(); 
        Date now = new Date();
        getSelectedBean().setModificado("S");
        getSelectedBean().setEmpresa(loginFace.getUsuarioLogado().getEmpresa());
        if (valida(getSelectedBean()) == false){        
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro não pode ser salvo"));
        } else {
            if (salvar(getSelectedBean())) {         
                if (!novoRegistro) { 
                    PrimeFaces.current().executeScript("PF('dialogoCopiar').hide()");
                } 
            }
        }
    }    
    
    public Boolean salvar(Usuario registroParaSalvar) {
        registroParaSalvar.setEmpresa(loginFace.getUsuarioLogado().getEmpresa());             
        if (registroParaSalvar.getId() == null) {
            if (existenteApelido(registroParaSalvar) == true  || existenteEmail(registroParaSalvar) == true){   
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro já existe"));   
                return false; 
            }                 
        }   
        
        usuarioSuporte.setEmpresa(registroSelecionado.getEmpresa());
        usuarioSuporte.setUsuario(registroSelecionado);      
        //usuarioEmpresaSelecionado.setEstabelecimento(estabelecimentoSelecionado);
        
        if (operacao.equals("I")) {
            bean.save(registroParaSalvar);
            usuarioSuporteSession.save(usuarioSuporte);            
            
            try {
                
                //usuarioEmpresaSelecionado = new UsuarioEmpresa();            
                usuarioEmpresaSelecionado.setUsuario(registroSelecionado); 
                usuarioEmpresaSelecionado.setEmpresa(usuarioSuporte.getEmpresa());
                usuarioEmpresaSelecionado.setId(null);

                if (usuarioEmpresaSelecionado.getEmpresa() != null) { 
                    usuarioEmpresaSession.save(usuarioEmpresaSelecionado);
                }
                
            } catch (Exception e) {
                
            }            
            
            setSelectedBean(new Usuario());
            setRegistroSelecionado(new Usuario());
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro incluído com sucesso."));            
        } else {
            bean.set(registroParaSalvar);
            usuarioSuporteSession.set(usuarioSuporte);     
            usuarioEmpresaSession.set(usuarioEmpresaSelecionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro alterado com sucesso."));            
        }
        
        setList(null);         
        setLazy(null);
        return true;     
    }
    
    public void inativar() {
        setSelectedBean(registroSelecionado);
        getSelectedBean().setInativo("S");
        getSelectedBean().setDatainativo(new Date());        
        bean.set(getSelectedBean());
        PrimeFaces.current().executeScript("PF('dialogo').hide()");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro inativado com sucesso."));            
    }
    
    public void ativar() {
        setSelectedBean(registroSelecionado);        
        getSelectedBean().setInativo("N");
        getSelectedBean().setDatainativo(null);        
        bean.set(getSelectedBean());
        PrimeFaces.current().executeScript("PF('dialogo').hide()");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro ativado com sucesso."));            
    }   
    
    public boolean valida(Usuario registroParaValidar) {        
        if(registroParaValidar.getApelido() == null  || "".equals(registroParaValidar.getApelido())) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Apelido inválido."));
            return false;
        }        
        if(registroParaValidar.getNome() == null  || "".equals(registroParaValidar.getNome())) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Nome inválido."));
            return false;
        }                
        if(registroParaValidar.getEmail() == null  || "".equals(registroParaValidar.getEmail())) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "E-mail inválido."));
            return false;
        }        
        return true;
    }    
    
    public List<Usuario> getList() {
        if (idUsrValido == null) { 
            idUsrValido = getLoggedUser().getId();            
            list = bean.getAllUsuarios(getLoggedUser().getEmpresa().getId());
        } else if (!idUsrValido.equals(getLoggedUser().getId())) {
            doLogOut();
        }        
        else if (list == null) {
            list = bean.getAllUsuarios(getLoggedUser().getEmpresa().getId());
            idUsrValido = getLoggedUser().getId();   
        }        
        return list;
    }

    public void setList(List<Usuario> list) {
       this.list = list;
    }
    
    public void trocarIdioma() {
        trocarIdioma.setIdiomaSelecionado(getLoggedUser().getIdiomaPadrao());
        rb = ResourceBundle.getBundle("messages", new Locale(trocarIdioma.getIdiomaSelecionado(),trocarIdioma.getIdiomaSelecionado()));            
    }    
    
    public String trocarEmpresa() {
        System.out.println("***TROCAR EMPRESA***");
        System.out.println("usuarioLogado.getEmpresa()===>"+getLoggedUser().getEmpresa().getCodigo());
        trocarEmpresa.setEmpresaSelecionada(getLoggedUser().getEmpresa());
        empresa = getLoggedUser().getEmpresa();
        rb = ResourceBundle.getBundle("messages", new Locale(trocarIdioma.getIdiomaSelecionado(),trocarIdioma.getIdiomaSelecionado()));   
        bean.set(loggedUser);
        loginFace.setUsuarioLogado(getLoggedUser());        
        System.out.println("***FIM TROCAR EMPRESA***");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Empresa alterada com sucesso."));
        return "/dashboard.faces?faces-redirect=true";
    }  
        
    public void selecionarEstabelecimento() {
        
        System.out.println("***selecionarEstabelecimento-Inicio***");
        
        usuarioEmpresaSelecionado.setEstabelecimento(estabelecimentoSelecionado);

        System.out.println("***selecionarEstabelecimento-Fim***");        
        
    }    
    
    public boolean existenteApelido(Usuario registroParaIncluir) {            
        try {
            Usuario existente = bean.getByApelido(loggedUser.getEmpresa().getId(), registroParaIncluir.getApelido());
            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    }    
    
    public boolean existenteEmail(Usuario registroParaIncluir) {            
        try {
            Usuario existente = bean.getByEmail(loggedUser.getEmpresa().getId(), registroParaIncluir.getEmail());
            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    } 
    
    public String doTrocaSenha() {
        setSelectedBean(getLoggedUser());
        return "/views/utilitarios/cadastros/usuario/trocaSenha.faces?faces-redirect=true";
    }
    
    public String doFinishTrocaSenha() {
        if (getNovaSenha1().equals(getNovaSenha2())) {
            getLoggedUser().setSenha(getNovaSenha1());
            bean.set(getLoggedUser());
            return "/loginempresa.faces?faces-redirect=true";  
        }        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Nova senha inválida."));
        return null;       
    }    
    
    public LazyDataModel<Usuario> getLazy() {
        if (empresaSessao == null) { 
            setEmpresaSessao(getLoggedUser().getEmpresa());
        }
        if (!Objects.equals(empresaSessao.getId(), getLoggedUser().getEmpresa().getId())) {
            setLazy(null);
            setRegistroSelecionado(null);            
        }        
        return lazy;
    }

    public void setLazy(LazyDataModel<Usuario> lazy) {
        this.lazy = lazy;
    }
    
    public boolean filterByApelido(Object value, Object filter, Locale locale) {
        apelidoFiltro = filter.toString();
        String filterText = (filter == null) ? null : filter.toString().trim();
        if (filterText == null || filterText.equals("")) {
            return true;
        }
        if (value == null) {
            return false;
        }
        String name = value.toString().toUpperCase();
        filterText = filterText.toUpperCase();
        if (name.contains(filterText)) {
            return true;
        } else {
            return false;
        }
    }    
    
    public boolean filterByEmail(Object value, Object filter, Locale locale) {
        emailFiltro = filter.toString();        
        String filterText = (filter == null) ? null : filter.toString().trim();
        if (filterText == null || filterText.equals("")) {
            return true;
        }
        if (value == null) {
            return false;
        }
        String name = value.toString().toUpperCase();
        filterText = filterText.toUpperCase();
        if (name.contains(filterText)) {
            return true;
        } else {
            return false;
        }
    }    
    
    public void limparFiltros() {
        DefaultStreamedContent logo = new DefaultStreamedContent();
        apelidoFiltro=null;
        emailFiltro=null;
        setLazy(null); 
        setRegistroSelecionado(null);
    }        

    public Integer getProgress() {
        if(progress == null) {
            progress = 0;
        }
        else {
            progress = progress + (int)(Math.random() * 35);
             
            if(progress > 100)
                progress = 100;
        }         
        return progress;
    }
 
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getApelidoFiltro() {
        return apelidoFiltro;
    }

    public void setApelidoFiltro(String apelidoFiltro) {
        this.apelidoFiltro = apelidoFiltro;
    }

    public String getEmailFiltro() {
        return emailFiltro;
    }

    public void setEmailFiltro(String emailFiltro) {
        this.emailFiltro = emailFiltro;
    }
     
    public void onComplete() {
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(Usuario loggedUser) {
        this.loggedUser = loggedUser;
    }
    
    public boolean isUserLogged() {
        return loggedUser != null;
    }    
    
    public String doLogOut() {   
        System.out.println("***UsuarioFace.doLogOut()**");
        //nova tentantiva de invalidar a sessão 
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);    
        session.invalidate();          
        //remove todos os beans da sessão  
        for (String bean : context.getExternalContext().getSessionMap().keySet()) {  
            System.out.println("***doLogout-dentro do for***");            
            //System.out.println(bean.toString());
            context.getExternalContext().getSessionMap().remove(bean);  
        }  
        setLoggedUser(null);
        setEmpresa(new Empresa());
        setParamGerais(new ParamGerais()); 
        return "/login.faces?faces-redirect=true";
    }     
    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ParamGerais getParamGerais() {
        return paramGerais;
    }

    public void setParamGerais(ParamGerais paramGerais) {
        this.paramGerais = paramGerais;
    }    
    
    public String getcListaRepres() {
        return cListaRepres;
    }

    public void setcListaRepres(String cListaRepres) {
        this.cListaRepres = cListaRepres;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }
    
    public String getListaRepresDashboard() {
        return listaRepresDashboard;
    }

    public void setListaRepresDashboard(String listaRepresDashboard) {
        this.listaRepresDashboard = listaRepresDashboard;
    }

    //public List<UsuarioPrograma> getListUsrProg() {
    //    return listUsrProg;
    //}

    //public void setListUsrProg(List<UsuarioPrograma> listUsrProg) {
    //    this.listUsrProg = listUsrProg;
    //}

    public List<UsuRepres> getListGerente() {
        return listGerente;
    }

    public void setListGerente(List<UsuRepres> listGerente) {
        this.listGerente = listGerente;
    }

    public String getCodigoMELI() {
        return codigoMELI;
    }

    public void setCodigoMELI(String codigoMELI) {
        this.codigoMELI = codigoMELI;
    }

    public Usuario getRegistroSelecionado() {
        return registroSelecionado;
    }

    public void setRegistroSelecionado(Usuario registroSelecionado) {
        this.registroSelecionado = registroSelecionado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public TipoUsuario[] getTipoUsuario() {
        return TipoUsuario.values();
    }

    public String getTituloDialogo() {
        return tituloDialogo;
    }

    public void setTituloDialogo(String tituloDialogo) {
        this.tituloDialogo = tituloDialogo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getInativo() {
        return inativo;
    }

    public Integer getIdUsrValido() {
        return idUsrValido;
    }

    public void setIdUsrValido(Integer idUsrValido) {
        this.idUsrValido = idUsrValido;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public boolean isAtuDashBoard() {
        return atuDashBoard;
    }

    public void setAtuDashBoard(boolean atuDashBoard) {
        this.atuDashBoard = atuDashBoard;
    }

    public Empresa getEmpresaSessao() {
        return empresaSessao;
    }

    public void setEmpresaSessao(Empresa empresaSessao) {
        this.empresaSessao = empresaSessao;
    }
    
    public void atualizarDashBoard() {

    }    

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Representante getRepresentanteSelecionado() {
        return representanteSelecionado;
    }

    public void setRepresentanteSelecionado(Representante representanteSelecionado) {
        this.representanteSelecionado = representanteSelecionado;
    }

    public Double getMetaQtdPedOri() {
        return metaQtdPedOri;
    }

    public void setMetaQtdPedOri(Double metaQtdPedOri) {
        this.metaQtdPedOri = metaQtdPedOri;
    }

    public Double getMetaVlPedOri() {
        return metaVlPedOri;
    }

    public void setMetaVlPedOri(Double metaVlPedOri) {
        this.metaVlPedOri = metaVlPedOri;
    }

    public double getPdvDia() {
        return pdvDia;
    }

    public void setPdvDia(double pdvDia) {
        this.pdvDia = pdvDia;
    }

    public double getPdvQtdDia() {
        return pdvQtdDia;
    }

    public void setPdvQtdDia(double pdvQtdDia) {
        this.pdvQtdDia = pdvQtdDia;
    }

    public double getPdvMes() {
        return pdvMes;
    }

    public void setPdvMes(double pdvMes) {
        this.pdvMes = pdvMes;
    }

    public double getPdvQtdMes() {
        return pdvQtdMes;
    }

    public void setPdvQtdMes(double pdvQtdMes) {
        this.pdvQtdMes = pdvQtdMes;
    }

    public double getPdvOntem() {
        return pdvOntem;
    }

    public void setPdvOntem(double pdvOntem) {
        this.pdvOntem = pdvOntem;
    }

    public double getPdvQtdOntem() {
        return pdvQtdOntem;
    }

    public void setPdvQtdOntem(double pdvQtdOntem) {
        this.pdvQtdOntem = pdvQtdOntem;
    }

    public double getPdvTotal() {
        return pdvTotal;
    }

    public void setPdvTotal(double pdvTotal) {
        this.pdvTotal = pdvTotal;
    }

    public double getMetapedido() {
        return metapedido;
    }

    public void setMetapedido(double metapedido) {
        this.metapedido = metapedido;
    }

    public double getMetavalor() {
        return metavalor;
    }

    public void setMetavalor(double metavalor) {
        this.metavalor = metavalor;
    }

    public double getPercmetapedido() {
        return percmetapedido;
    }

    public void setPercmetapedido(double percmetapedido) {
        this.percmetapedido = percmetapedido;
    }

    public double getPercmetavalor() {
        return percmetavalor;
    }

    public void setPercmetavalor(double percmetavalor) {
        this.percmetavalor = percmetavalor;
    }

    public double getFaltapdvMes() {
        return faltapdvMes;
    }

    public void setFaltapdvMes(double faltapdvMes) {
        this.faltapdvMes = faltapdvMes;
    }

    public double getFaltapdvMesQtd() {
        return faltapdvMesQtd;
    }

    public void setFaltapdvMesQtd(double faltapdvMesQtd) {
        this.faltapdvMesQtd = faltapdvMesQtd;
    }

    public double getFaltapercmetapedido() {
        return faltapercmetapedido;
    }

    public void setFaltapercmetapedido(double faltapercmetapedido) {
        this.faltapercmetapedido = faltapercmetapedido;
    }

    public double getFaltapercmetavalor() {
        return faltapercmetavalor;
    }

    public void setFaltapercmetavalor(double faltapercmetavalor) {
        this.faltapercmetavalor = faltapercmetavalor;
    }

    public double getPdvDiaQtd() {
        return pdvDiaQtd;
    }

    public void setPdvDiaQtd(double pdvDiaQtd) {
        this.pdvDiaQtd = pdvDiaQtd;
    }

    public double getPdvMesQtd() {
        return pdvMesQtd;
    }

    public void setPdvMesQtd(double pdvMesQtd) {
        this.pdvMesQtd = pdvMesQtd;
    }

    public double getPdvAnoQtd() {
        return pdvAnoQtd;
    }

    public void setPdvAnoQtd(double pdvAnoQtd) {
        this.pdvAnoQtd = pdvAnoQtd;
    }

    public double getSaldoportador() {
        return saldoportador;
    }

    public void setSaldoportador(double saldoportador) {
        this.saldoportador = saldoportador;
    }

    public double getArDia() {
        return arDia;
    }

    public void setArDia(double arDia) {
        this.arDia = arDia;
    }

    public double getArMes() {
        return arMes;
    }

    public void setArMes(double arMes) {
        this.arMes = arMes;
    }

    public double getArTotal() {
        return arTotal;
    }

    public void setArTotal(double arTotal) {
        this.arTotal = arTotal;
    }

    public double getArVencido() {
        return arVencido;
    }

    public void setArVencido(double arVencido) {
        this.arVencido = arVencido;
    }

    public double getApDia() {
        return apDia;
    }

    public void setApDia(double apDia) {
        this.apDia = apDia;
    }

    public double getApMes() {
        return apMes;
    }

    public void setApMes(double apMes) {
        this.apMes = apMes;
    }

    public double getApTotal() {
        return apTotal;
    }

    public void setApTotal(double apTotal) {
        this.apTotal = apTotal;
    }

    public double getApVencido() {
        return apVencido;
    }

    public void setApVencido(double apVencido) {
        this.apVencido = apVencido;
    }

    public double getVenda1trim() {
        return venda1trim;
    }

    public void setVenda1trim(double venda1trim) {
        this.venda1trim = venda1trim;
    }

    public double getVenda2trim() {
        return venda2trim;
    }

    public void setVenda2trim(double venda2trim) {
        this.venda2trim = venda2trim;
    }

    public double getVenda3trim() {
        return venda3trim;
    }

    public void setVenda3trim(double venda3trim) {
        this.venda3trim = venda3trim;
    }

    public double getVenda4trim() {
        return venda4trim;
    }

    public void setVenda4trim(double venda4trim) {
        this.venda4trim = venda4trim;
    }

    public double getVendames() {
        return vendames;
    }

    public void setVendames(double vendames) {
        this.vendames = vendames;
    }

    public double getVendatotal() {
        return vendatotal;
    }

    public void setVendatotal(double vendatotal) {
        this.vendatotal = vendatotal;
    }

    public double getHrsDia() {
        return hrsDia;
    }

    public void setHrsDia(double hrsDia) {
        this.hrsDia = hrsDia;
    }

    public double getHrsMes() {
        return hrsMes;
    }

    public void setHrsMes(double hrsMes) {
        this.hrsMes = hrsMes;
    }

    public double getHrsTotal() {
        return hrsTotal;
    }

    public void setHrsTotal(double hrsTotal) {
        this.hrsTotal = hrsTotal;
    }

    public String getCnpjSemFormato() {
        return cnpjSemFormato;
    }

    public void setCnpjSemFormato(String cnpjSemFormato) {
        this.cnpjSemFormato = cnpjSemFormato;
    }

    public Integer getActivTab() {
        return activTab;
    }

    public void setActivTab(Integer activTab) {
        this.activTab = activTab;
    }

    public double getOsDia() {
        return osDia;
    }

    public void setOsDia(double osDia) {
        this.osDia = osDia;
    }

    public double getOsMes() {
        return osMes;
    }

    public void setOsMes(double osMes) {
        this.osMes = osMes;
    }

    public double getOsTotal() {
        return osTotal;
    }

    public void setOsTotal(double osTotal) {
        this.osTotal = osTotal;
    }

    public LineChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(LineChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public LineChartModel getLineModelValor() {
        return lineModelValor;
    }

    public void setLineModelValor(LineChartModel lineModelValor) {
        this.lineModelValor = lineModelValor;
    }

    public MeterGaugeChartModel getMeterGaugeModelPedidos() {
        return meterGaugeModelPedidos;
    }

    public void setMeterGaugeModelPedidos(MeterGaugeChartModel meterGaugeModelPedidos) {
        this.meterGaugeModelPedidos = meterGaugeModelPedidos;
    }

    public MeterGaugeChartModel getMeterGaugeModelValor() {
        return meterGaugeModelValor;
    }

    public void setMeterGaugeModelValor(MeterGaugeChartModel meterGaugeModelValor) {
        this.meterGaugeModelValor = meterGaugeModelValor;
    }

    public UsuarioSuporte getUsuarioSuporte() {
        return usuarioSuporte;
    }

    public void setUsuarioSuporte(UsuarioSuporte usuarioSuporte) {
        this.usuarioSuporte = usuarioSuporte;
    }

    public UsuarioEmpresa getUsuarioEmpresaSelecionado() {
        return usuarioEmpresaSelecionado;
    }

    public void setUsuarioEmpresaSelecionado(UsuarioEmpresa usuarioEmpresaSelecionado) {
        this.usuarioEmpresaSelecionado = usuarioEmpresaSelecionado;
    }

    public Estabelecimento getEstabelecimentoSelecionado() {
        return estabelecimentoSelecionado;
    }

    public void setEstabelecimentoSelecionado(Estabelecimento estabelecimentoSelecionado) {
        this.estabelecimentoSelecionado = estabelecimentoSelecionado;
    }

    public String getNovaSenha1() {
        return novaSenha1;
    }

    public void setNovaSenha1(String novaSenha1) {
        this.novaSenha1 = novaSenha1;
    }

    public String getNovaSenha2() {
        return novaSenha2;
    }

    public void setNovaSenha2(String novaSenha2) {
        this.novaSenha2 = novaSenha2;
    }
    
    public void criarDualList(){
        List<Usuario> usrSource = new ArrayList<Usuario>();
        List<Usuario> usrTarget = new ArrayList<Usuario>();        
        
        try {
            list = bean.getAllAtivos(getLoggedUser().getEmpresa().getId());
        } catch (Exception e) {
            list = null;
        }
        
        for (Usuario tUsr : list) {          
            usrSource.add(tUsr);
        }
        cpUsr = new DualListModel<Usuario>(usrSource, usrTarget);
    }

    public DualListModel<Usuario> getCpUsr() {
        return cpUsr;
    }

    public void setCpUsr(DualListModel<Usuario> cpUsr) {
        this.cpUsr = cpUsr;
    }
    
    
    
}