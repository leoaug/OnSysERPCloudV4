package br.com.onsys.faces.basico;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Cep;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.tipos.CEPGenerico;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.util.ValidaAcesso;
import br.com.onsys.session.basico.CepLazy;
import br.com.onsys.session.basico.CepSession;
import br.com.onsys.session.basico.EmpresaSession;
import br.com.onsys.session.basico.EstadoSession;
import br.com.onsys.session.basico.MunicipioSession;
import br.com.onsys.util.ProcurarCep;
import br.com.onsys.util.RelatorioUtil;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.data.PageEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.StreamedContent;

@Named
@SessionScoped
public class CepFace extends BaseCDIBean<Cep> {

    private static final long serialVersionUID = 7L;
    @Inject
    private CepSession          bean;
    @Inject
    private EstadoSession       estadoBean;    
    @Inject
    private MunicipioSession    municipioBean;
    @Inject
    private UsuarioFace         usuarioFace; 
    @Inject    
    private ValidaAcesso        validaAcesso;
    @Inject
    private EmpresaSession      empresaSession; 
    @Inject    
    private ProcurarCep         procurarCep;
    private LazyDataModel<Cep>  list;              
    private Estado              estadoSelected;
    private String              bairro;
    private String              logradouro;    
    private String              estado;
    private String              cidade;          
    private Cep                 cepChanged = null; 
    private Cep                 cepFind;    
    private Cep                 registroSelecionado;
    private Cep                 cep = null;
    private String              cInativo    = "N";    
    private boolean             generico = false;
//  VARIAVEIS DE FILTRO E PAGINAÇÃO
    private static String                   cepFiltro;
    private static int                      pagina;            
/*  VARIAVEIS DE RELATÓRIO */ 
    Connection conn;
    PreparedStatement stmt;
    private Integer idEmpresa;
    private String  cCodIni;
    private String  cCodFin = "ZZZZZZZZZZZZZZZZZZZZ";
    private String  cPar    = null;
    private StreamedContent arquivoRetorno;
    private int tipoRelatorio;
    private Object logo = null;
//  VARIAVEIS DE CONTROLE DE PERMISSÃO     
    private Integer idUsrValido = null;          
    
    public void doValidaUsr() {
        if (!usuarioFace.getLoggedUser().getId().equals(idUsrValido) || idUsrValido == null) {
            usuarioFace.doLogOut();        
        }        
    }        

    public CepFace() {
        setSelectedBean(new Cep());
    }
    
    public String criar() {
        if (validaAcesso.validaUsrUrl("/views/basico/cadastros/cep/add.faces")) { 
            setSelectedBean(new Cep());
            return "/views/basico/cadastros/cep/add.faces?faces-redirect=true";
        } else {
            return "/access-denied.faces";
        }               
    }

    public String fimCriar(String empresa, String url) {
        getSelectedBean().setEstado(estadoBean.getByUF(estado));
        getSelectedBean().setMunicipio(municipioBean.getByDescricao(cidade, estado));        
        if (valida(getSelectedBean()) == false){        
            return null;
        } else {
            if (existente(getSelectedBean()) == true){                    
                FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Registro já existe.","");
                FacesContext.getCurrentInstance().addMessage("Registro já existe.", fm);
                return null; 
            } else { 
                bean.save(getSelectedBean());
                setList(null);         
                setSelectedBean(new Cep());
                return url;       
            }
        }                
    }

    public String editar()  {
        doValidaUsr();
        setSelectedBean(registroSelecionado);
        estadoChanged(getSelectedBean().getEstado());        
        if (validaAcesso.validaUsrUrl("/views/basico/cadastros/cep/edit.faces")) { 
            try {
                estado = getSelectedBean().getEstado().getUf();
                cidade = getSelectedBean().getMunicipio().getDescricao();
            } catch (Exception e) {
                estado = null;
                cidade = null;
            }
            return "/views/basico/cadastros/cep/edit.faces?faces-redirect=true";
        } else {
            return "/access-denied.faces";
        }         
    }

    public String fimEditar() {
        if (valida(getSelectedBean()) == false){        
            return null;
        } else {
            getSelectedBean().setEstado(estadoBean.getByUF(estado));
            getSelectedBean().setMunicipio(municipioBean.getByDescricao(cidade, estado));        
            bean.set(getSelectedBean());
            setList(null);         
            return listar();
        }
    }
    
    public String consultar() {
        doValidaUsr();
        setSelectedBean(registroSelecionado);
        if (validaAcesso.validaUsrUrl("/views/basico/cadastros/cep/view.faces")) { 
            try {
                if (getSelectedBean().getInativo().equals("S")) {
                    setcInativo("S");
                } else {
                    setcInativo("N");
                }  
            } catch (Exception e) {
                setcInativo("N");
            }        
            try {
                estado = getSelectedBean().getEstado().getUf();
                cidade = getSelectedBean().getMunicipio().getDescricao();
            } catch (Exception e) {
                estado = null;
                cidade = null;
            }
            return "/views/basico/cadastros/cep/view.faces?faces-redirect=true";
        } else {
            usuarioFace.doLogOut();             
            return "/access-denied.faces";
        }               
    }    

    public List<Estado> getAllEstados() {        
        return estadoBean.getAll();
    }

    public List<Municipio> getAllMunicipios() {
        /*
        if (getSelectedBean() != null) {
            return municipioBean.getAllMunicipiosUF(getSelectedBean().getEstado().getId());
        } else {   */        
            return   municipioBean.getAll();   
     /*   } */   
    }
    
    public void estadoChanged(Estado estado) {
        estadoSelected = estadoBean.getById(estado.getId());
    }
    
    public List<Municipio> getAllMunicipiosbyUF() {        
        if (estadoSelected != null) {
            return municipioBean.getAllUF(estadoSelected.getUf());
        } else { 
            return null;
        }
        /*else {          
            return municipioBean.getAllMunicipios();   
        }   */    
    }        

    public void cepChanged(ValueChangeEvent e) {
        cepChanged = bean.getUltCepByCep(e.getNewValue().toString());
        doCepChanged();
    }

    public String doCepChanged() {
        return "/views/basico/cadastros/cep/edit.faces?faces-redirect=true";
    }

    public String remover() {       
        if (registroSelecionado == null) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Selecione um CEP.","");
            FacesContext.getCurrentInstance().addMessage("Selecione um CEP.", fm);  
            return null;            
        }        
        try {
            setSelectedBean(registroSelecionado);
            bean.remove(getSelectedBean());
            setList(null);                   
            return listar();
        } catch (Exception e) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Registro possui relacionamentos ativo.","");
            FacesContext.getCurrentInstance().addMessage("Registro possui relacionamentos ativo.", fm);
            return null;
        }
    }
    
    public String inativar() {
        getSelectedBean().setInativo("S");
        getSelectedBean().setDatainativo(new Date());        
        bean.set(getSelectedBean());
        setList(null);        
        return listar();
    }
    
    public String ativar() {
        getSelectedBean().setInativo("N");
        getSelectedBean().setDatainativo(null);        
        bean.set(getSelectedBean());
        setList(null);        
        return listar();
    }   

    public String listar() {
        return "/views/basico/cadastros/cep/list.faces?faces-redirect=true";
    }
    
    public boolean valida(Cep novoRegistro) {        
        // if ("".equals(novoRegistro.getCep().trim()) || novoRegistro.getCep().trim() == null) { 
        //     FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"CEP inválido.","");
        //     FacesContext.getCurrentInstance().addMessage("CEP inválido.", fm);  
        //    return false;
        //}        
        if (generico) { 
            if ("".equals(novoRegistro.getLogradouro().trim()) || novoRegistro.getLogradouro().trim() == null) { 
                FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Logradouro inválido.","");
                FacesContext.getCurrentInstance().addMessage("Logradouro inválido.", fm);  
                return false;
            }   
        }
        if ("".equals(novoRegistro.getBairro().trim()) || novoRegistro.getBairro().trim() == null) { 
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Bairro inválido.","");
            FacesContext.getCurrentInstance().addMessage("Bairro inválido.", fm);  
            return false;
        }           
        if (novoRegistro.getEstado() == null || "".equals(novoRegistro.getEstado().toString())){
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Estado inválido.","");
            FacesContext.getCurrentInstance().addMessage("Estado inválido.", fm);  
            return false;        
        }        
        if (novoRegistro.getMunicipio() == null || "".equals(novoRegistro.getMunicipio().toString())){
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Municipio inválido.","");
            FacesContext.getCurrentInstance().addMessage("Municipio inválido.", fm);  
            return false;
        }        
        return true;
    }    
    
    public boolean existente(Cep novoRegistro) {            
        try {
            
            System.out.println("CepFace.cep===>"+novoRegistro.getCep().trim());
            
            Cep existente = bean.getByCep(novoRegistro.getCep().trim());    
            
            
            
            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    }    

    public List<Cep> completeCep(String prefix){  
//        setcFind(prefix);
        List<Cep> lsCep = null;                            
//      if ("1".equals(getcOrder())) {                                   
            lsCep = bean.getCepComplete(prefix);
/*        } else if ("2".equals(getcOrder()))  {
            lsCep = bean.getLograComplete(prefix);
        } else {
            lsCep = bean.getCepComplete(prefix);            
        }            */
        return  lsCep;
    }
    
    public String doListCepFind() {
        list = new CepLazy(usuarioFace.getLoggedUser().getEmpresa().getId());  
        return "/views/basico/cadastros/cep/list.faces?faces-redirect=true";
    }
    
    public LazyDataModel<Cep> getList() {
        verificarFiltro();

        if (list == null && idUsrValido == null) {
            idUsrValido = usuarioFace.getLoggedUser().getId();                        
            list = new CepLazy(usuarioFace.getLoggedUser().getEmpresa().getId());  
        } else if (!usuarioFace.getLoggedUser().getId().equals(idUsrValido)) {
            usuarioFace.doLogOut();
        } else if (list == null) {
            list = new CepLazy(usuarioFace.getLoggedUser().getEmpresa().getId());  
        }              
        return list;
    }

    public void setList(LazyDataModel<Cep> list) {
        this.list = list;
    }

    public String filtrarRel()  {
        if (validaAcesso.validaUsrUrl("/views/basico/cadastros/cep/filter.faces")) { 
            return "/views/basico/cadastros/cep/filter.faces?faces-redirect=true";
        } else {
            return "/access-denied.faces";
        }         
    }
    
   public StreamedContent getArquivoRetorno(String url) throws FileNotFoundException, IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        String nomeRelatorioJasper;
        String nomeRelatorioSaida;
        
        if (tipoRelatorio == 1){
            nomeRelatorioJasper  = url+"/basico/CEP";
            nomeRelatorioSaida   = usuarioFace.getLoggedUser().getApelido() + "_CEP";
        }else{
            nomeRelatorioJasper  = url+"/basico/CEPExcel";
            nomeRelatorioSaida   = usuarioFace.getLoggedUser().getApelido() + "_CEPExcel";
        }    
        File f = new File(context.getExternalContext().getRealPath(usuarioFace.getLoggedUser().getEmpresa().getLogoimg().toString()));
        try {
            BufferedImage valida_logo = ImageIO.read(f);
        } catch (Exception e) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Logo não cadastrado.","Logo não cadastrado.");
            FacesContext.getCurrentInstance().addMessage("Logo não cadastrado.", fm);  
            return null;
        }  
        BufferedImage logo = ImageIO.read(f);        
        RelatorioUtil relatorioUtil = new RelatorioUtil();
        HashMap parametrosRelatorio = new HashMap();
//        parametrosRelatorio.put("idEmpresa", userLogado.getLoggedUser().getEmpresa().getId());       
        parametrosRelatorio.put("cCodIni", getcCodIni());       
        parametrosRelatorio.put("cCodFin", getcCodFin());       
        parametrosRelatorio.put("logo", logo);       
        parametrosRelatorio.put("cPar", "Seleção de "+getcCodIni()+" até "+getcCodFin().toString()); 
        try {
            this.arquivoRetorno = relatorioUtil.gerarRelatorio(parametrosRelatorio, nomeRelatorioJasper, nomeRelatorioSaida, this.tipoRelatorio);
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro na execução do relatério.","Erro na execução do relatério."));
            return null;
        }         
        return this.arquivoRetorno;
    }
     
    public Cep getCepChanged() {
        return cepChanged;
    }

    public void setCepChanged(Cep cepChanged) {
        this.cepChanged = cepChanged;
    }

    public Estado getEstadoSelected() {
        return estadoSelected;
    }

    public void setEstadoSelected(Estado estadoSelected) {
        this.estadoSelected = estadoSelected;
    }

    public Integer getIdUsrValido() {
        return idUsrValido;
    }

    public void setIdUsrValido(Integer idUsrValido) {
        this.idUsrValido = idUsrValido;
    }

    public String getcInativo() {
        return cInativo;
    }

    public void setcInativo(String cInativo) {
        this.cInativo = cInativo;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getcCodIni() {
        return cCodIni;
    }

    public void setcCodIni(String cCodIni) {
        this.cCodIni = cCodIni;
    }

    public String getcCodFin() {
        return cCodFin;
    }

    public void setcCodFin(String cCodFin) {
        this.cCodFin = cCodFin;
    }

    public String getcPar() {
        return cPar;
    }

    public void setcPar(String cPar) {
        this.cPar = cPar;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public int getTipoRelatorio() {
        return tipoRelatorio;
    }

    public void setTipoRelatorio(int tipoRelatorio) {
        this.tipoRelatorio = tipoRelatorio;
    }
    
    public Cep getSelectedLinha() {
        doValidaUsr();        
        return registroSelecionado;
    }

    public void setSelectedLinha(Cep registroSelecionado) {
        this.registroSelecionado = registroSelecionado;
    }
    
    public CEPGenerico[] getCEPGenerico() {
        return CEPGenerico.values();
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void preencheEndereco(String cep) {
        if (cep != null  && !cep.isEmpty()) { 
            System.out.println("CEP===>"+cep);
            
            String cepSemFormato = cep.replace(".", "");
                   cepSemFormato = cepSemFormato.replace("-", "");
            System.out.println("CEPFACE.preencheEndereco()");
            System.out.println("CEP---------->"+cepSemFormato);        
            System.out.println("RETORNO CEP--->"+procurarCep.Procurar(cepSemFormato));

            List lEndereco = procurarCep.Procurar(cepSemFormato);
            
            if (lEndereco != null) {
                System.out.println("POSIÇÃO 0 ---> "+lEndereco.get(0));
                System.out.println("POSIÇÃO 1 ---> "+lEndereco.get(1)); 
                                
                bairro     = lEndereco.get(0).toString();
                logradouro = lEndereco.get(1).toString(); 
                estado     = lEndereco.get(3).toString();
                cidade     = lEndereco.get(4).toString();
                
                bairro      = bairro.substring(1, bairro.length()-1);
                logradouro  = logradouro.substring(1, logradouro.length()-1);
                estado      = estado.substring(1, estado.length()-1); 
                cidade      = cidade.substring(1, cidade.length()-1);              
                
                System.out.println("LOGRADOURO--->"+logradouro);
                
                try {
                    getSelectedBean().setLogradouro(logradouro);
                    getSelectedBean().setBairro(bairro);
                } catch (Exception e) {
                }
                
            }
        }        
    }    

    public boolean isGenerico() {
        return generico;
    }

    public void setGenerico(boolean generico) {
        this.generico = generico;
    }
    
    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        CepFace.pagina = pagina;
    }
    
    public void datatablePagina(PageEvent event) {
        pagina = event.getPage();
    }   
    
    private void verificarFiltro(){
        if("".equals(cepFiltro)){
            cepFiltro=null;
        }
    }
    
    public boolean filterByCEP(Object value, Object filter, Locale locale) {
        cepFiltro = filter.toString();
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
        setList(null); 
        setSelectedLinha(null);
        try {
            DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("fmListar:Dtb");
//            if (!dataTable.getFilters().isEmpty()) {
//                dataTable.reset();
//                RequestContext requestContext = RequestContext.getCurrentInstance();
//                requestContext.update("fmListar:Dtb");
//            }
//           CepLazy.setCepFiltro(null);
            cepFiltro=null;
        } catch (Exception e) {
            System.out.println("CepFace === limparFiltros ===>"+e);
        }
    }    

    public String getCepFiltro() {
        return cepFiltro;
    }

    public void setCepFiltro(String cepFiltro) {
        CepFace.cepFiltro = cepFiltro;
    }
    
}