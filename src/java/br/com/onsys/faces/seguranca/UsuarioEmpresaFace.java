package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.seguranca.UsuarioEmpresa;
import br.com.onsys.entidades.seguranca.UsuarioModulo;
import br.com.onsys.session.basico.EmpresaSession;
import br.com.onsys.session.seguranca.UsuarioEmpresaSession;
import br.com.onsys.session.seguranca.UsuarioSession;
import br.com.onsys.util.ValidaAcesso;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;
import org.primefaces.model.LazyDataModel;

@Named
@SessionScoped
public class UsuarioEmpresaFace extends BaseCDIBean<UsuarioEmpresa> {

    private static final long serialVersionUID = 7L;
    @Inject
    private UsuarioEmpresaSession   bean;
    @Inject
    private UsuarioSession          usuarioSession;
    @Inject
    private UsuarioFace             usuarioFace;
    @Inject
    private EmpresaSession          empresaSession;
    @Inject    
    private ValidaAcesso            validaAcesso;        
    @Inject 
    private LoginFace               loginFace;
    //alrc - inicio
    
    private Integer                 idUsuarioEmpresa;
    //alrc - fim
    //private String                  empresaAtual;
    
    private List<UsuarioEmpresa>    list;
    private List<UsuarioEmpresa>    listByUsr;        
    private List<Empresa>           listaDeEmpresas;
    private List<Empresa>           listaDeEmpresasDoUsuario;    
    private LazyDataModel<Usuario>  listaDeUsuarios;
    private DualListModel<Empresa>  empresas;    
    private Usuario                 usuarioSelecionado;    
    private Usuario                 registroSelecionado;    
    private String                  operacao        = "I";
    private String                  tituloDialogo   = "";     
    private UsuarioEmpresa          novoRegistro    = null;
    //private Empresa                 empresaSelecionada;
    private Empresa                 empresaSessao;    
    
    @PostConstruct
    public void init() {
        
        empresaSessao = usuarioFace.getLoggedUser().getEmpresa();       
        
        usuarioSelecionado = null;
        List<Empresa> empresaSource = new ArrayList<Empresa>();
        List<Empresa> empresaTarget = new ArrayList<Empresa>();       
        if (usuarioFace.getLoggedUser().getEmail().equals("adm@onsys.com.br") || usuarioFace.getLoggedUser().getEmpresa().getId() == 1) {
            listaDeEmpresas = empresaSession.getAll();        
            for (Empresa a : listaDeEmpresas) {          
                empresaSource.add(a);
            }              
        } else {
            empresaSource.add(usuarioFace.getLoggedUser().getEmpresa());
            //listModulo = moduloBean.getAll(userLogado.getLoggedUser().getEmpresa().getId());        
            //for (Modulo modulo : listModulo) {          
            //    empresaSource.add(modulo);
            //}
        }
        empresas = new DualListModel<Empresa>(empresaSource, empresaTarget);
    }    

    public UsuarioEmpresa getNovoRegistro() {
        return novoRegistro;
    }

    public void setNovoRegistro(UsuarioEmpresa novoRegistro) {
        this.novoRegistro = novoRegistro;
    }

    public UsuarioEmpresaFace() {
        setSelectedBean(new UsuarioEmpresa());
    }

    //public List<Modulo> getAllModulos() {
    //    return moduloBean.getAll(userLogado.getLoggedUser().getEmpresa().getId());
    //}

    //public List<Usuario> getAllUsuarios() {
    //    return usuarioBean.getAllUsuarios(userLogado.getLoggedUser().getEmpresa().getId());
    //}
    
    public void alterar()  {
        if (registroSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de alteração."));
        } else {        
            setOperacao("A");
            setTituloDialogo("SEG0133 - Alterar relação usuário x empresa");
            usuarioSelecionado = new Usuario();        
            usuarioSelecionado = usuarioFace.getRegistroSelecionado();
            List<Empresa> empresaSource = new ArrayList<Empresa>();
            List<Empresa> empresaTarget = new ArrayList<Empresa>();   
            listByUsr = new ArrayList<UsuarioEmpresa>();
            if (usuarioFace.getLoggedUser().getEmail().equals("adm@onsys.com.br") || usuarioFace.getLoggedUser().getEmpresa().getId() == 1) {
                listaDeEmpresas = empresaSession.getAll();        
                for (Empresa a : listaDeEmpresas) {          
                    if (bean.getListaUsuarioEmpresa(a.getId(), 
                                                   registroSelecionado.getId())==null ||
                        bean.getListaUsuarioEmpresa(a.getId(), 
                                                   registroSelecionado.getId()).isEmpty()){
                        empresaSource.add(a);
                    }
                }              
            } else {
                listByUsr = bean.getAllByUsuario(usuarioFace.getLoggedUser());
                for (UsuarioEmpresa usuarioEmpresa : listByUsr) {          
                    if (bean.getListaUsuarioEmpresa(usuarioEmpresa.getEmpresa().getId(), 
                                                   registroSelecionado.getId())==null ||
                        bean.getListaUsuarioEmpresa(usuarioEmpresa.getEmpresa().getId(), 
                                                   registroSelecionado.getId()).isEmpty()){
                        Empresa novoRegistro = new Empresa();            
                        novoRegistro.setId(usuarioEmpresa.getEmpresa().getId());
                        novoRegistro.setCodigo(usuarioEmpresa.getEmpresa().getCodigo());
                        novoRegistro.setDescricao(usuarioEmpresa.getEmpresa().getDescricao());
                        empresaSource.add(novoRegistro);
                    }
                }              
            } 
            System.out.println("***USUARIO SELECIONADO***");
            System.out.println("registroSelecionado===>"+registroSelecionado.getApelido());
            listByUsr = bean.getAllByUsuario(registroSelecionado);
            for (UsuarioEmpresa usuarioEmpresa : listByUsr){
                try {
                    Empresa novoRegistro = new Empresa();            
                    novoRegistro.setId(usuarioEmpresa.getEmpresa().getId());
                    novoRegistro.setCodigo(usuarioEmpresa.getEmpresa().getCodigo());
                    novoRegistro.setDescricao(usuarioEmpresa.getEmpresa().getDescricao());
                    empresaTarget.add(novoRegistro);
                } catch (Exception e) {
                }
            }                                
            empresas = new DualListModel<Empresa>(empresaSource, empresaTarget);    
            PrimeFaces.current().executeScript("PF('dialogo').show()");  
        }
    }
    
    public void fimAlterar() {
        //for (UsuarioEmpresa usuarioEmpresa : listByUsr){
        //    if (pesqUsuarioEmprsa(usuarioEmpresa.getUsuario(), usuarioEmpresa.getEmpresa())){
        //        bean.remove(usuarioEmpresa);
        //    }
        //}
        //for (Empresa lEmpresa : empresas.getTarget()){
        //    UsuarioEmpresa novoRegistro = new UsuarioEmpresa();
        //    novoRegistro.setEmpresa(lEmpresa);
        //    novoRegistro.setUsuario(registroSelecionado);
        //    novoRegistro.setId(null);            
        //    bean.save(novoRegistro);
        //}        
        setList(null);
        init();
        PrimeFaces.current().executeScript("PF('dialogo').hide()");
    }      
    
    public void consultar()  {
        System.out.println("***CONSULTAR***");
        if (registroSelecionado == null) {
            System.out.println("***CONSULTAR---1***");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de consulta."));
        } else {        
            System.out.println("***CONSULTAR---2***");
            setOperacao("C");
            setTituloDialogo("Consultar relação usuário x empresa");
            usuarioSelecionado = new Usuario();        
            usuarioSelecionado = usuarioFace.getRegistroSelecionado();
            List<Empresa> empresaSource = new ArrayList<Empresa>();
            List<Empresa> empresaTarget = new ArrayList<Empresa>();   
            listByUsr = new ArrayList<UsuarioEmpresa>();
            if (usuarioFace.getLoggedUser().getEmail().equals("adm@onsys.com.br") || usuarioFace.getLoggedUser().getEmpresa().getId() == 1) {
                listaDeEmpresas = empresaSession.getAll();        
                for (Empresa a : listaDeEmpresas) {          
                    if (bean.getListaUsuarioEmpresa(a.getId(), 
                                                   registroSelecionado.getId())==null ||
                        bean.getListaUsuarioEmpresa(a.getId(), 
                                                   registroSelecionado.getId()).isEmpty()){
                        empresaSource.add(a);
                    }
                }              
            } else {
                listByUsr = bean.getAllByUsuario(usuarioFace.getLoggedUser());
                for (UsuarioEmpresa usuarioEmpresa : listByUsr) {          
                    if (bean.getListaUsuarioEmpresa(usuarioEmpresa.getEmpresa().getId(), 
                                                   registroSelecionado.getId())==null ||
                        bean.getListaUsuarioEmpresa(usuarioEmpresa.getEmpresa().getId(), 
                                                   registroSelecionado.getId()).isEmpty()){
                        Empresa novoRegistro = new Empresa();            
                        novoRegistro.setId(usuarioEmpresa.getEmpresa().getId());
                        novoRegistro.setCodigo(usuarioEmpresa.getEmpresa().getCodigo());
                        novoRegistro.setDescricao(usuarioEmpresa.getEmpresa().getDescricao());
                        empresaSource.add(novoRegistro);
                    }
                }              
            } 
            System.out.println("***USUARIO SELECIONADO***");
            System.out.println("registroSelecionado===>"+registroSelecionado.getApelido());
            listByUsr = bean.getAllByUsuario(registroSelecionado);
            for (UsuarioEmpresa usuarioEmpresa : listByUsr){
                try {
                    Empresa novoRegistro = new Empresa();            
                    novoRegistro.setId(usuarioEmpresa.getEmpresa().getId());
                    novoRegistro.setCodigo(usuarioEmpresa.getEmpresa().getCodigo());
                    novoRegistro.setDescricao(usuarioEmpresa.getEmpresa().getDescricao());
                    empresaTarget.add(novoRegistro);
                } catch (Exception e) {
                }
            }                                
            empresas = new DualListModel<Empresa>(empresaSource, empresaTarget);    
            PrimeFaces.current().executeScript("PF('dialogoConsultar').show()");  
        }
    }
    
    public void onTransfer(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        Empresa empresaSelecionada = null;
        for (Object item : event.getItems()) {
            builder.append(((Empresa) item).getCodigo());
            try {
                
                System.out.println("***CODIGO=======>"+builder.toString().trim());
                System.out.println("***ID EMPRESA===>"+usuarioFace.getLoggedUser().getEmpresa().getId());
                
                empresaSelecionada = empresaSession.getByCodigo(builder.toString().trim());
            } catch (Exception e) {
            }
        }
        FacesMessage msg = new FacesMessage();
        if (event.isAdd()) {
            
            if (empresaSelecionada == null) { 
                empresaSelecionada = usuarioFace.getLoggedUser().getEmpresa();
            } 

            System.out.println("***VOU ADICIONAR A EMPRESA===>"+empresaSelecionada.getCodigo());

            UsuarioEmpresa addObj = new UsuarioEmpresa();            
            addObj.setUsuario(registroSelecionado); 
            addObj.setEmpresa(empresaSelecionada);
            addObj.setId(null);
            
            if (addObj.getEmpresa() != null) { 
                bean.save(addObj);
            }
            
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            msg.setSummary("Atenção : ");
            //msg.setSummary("Items Transferred - REMOVER   " + event.isRemove());        
            msg.setDetail("Empresa : " +empresaSelecionada.getCodigo() + " - " + empresaSelecionada.getDescricao() + ", foi incluída com sucesso.");
            
        } else {
            
            System.out.println("***VOU REMOVER A EMPRESA===>"+empresaSelecionada.getCodigo());
            
            try {
                UsuarioEmpresa registroParaDeletar = bean.getUsuarioEmpresa(empresaSelecionada.getId(), usuarioSelecionado.getId());
                bean.remove(registroParaDeletar);
                
                msg.setSeverity(FacesMessage.SEVERITY_INFO);
                msg.setSummary("Atenção : ");
                //msg.setSummary("Items Transferred - REMOVER   " + event.isRemove());        
                msg.setDetail("Empresa : " +empresaSelecionada.getCodigo() + " - " + empresaSelecionada.getDescricao()+ ", foi removida com sucesso.");
                
            } catch (Exception e) {
            }
            
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }    
    
    public Boolean pesqUsuarioEmprsa(Usuario usuario, Empresa empresa){
        Boolean retorno = true;        
        for(Empresa lEmpresa : empresas.getTarget()){
            if (lEmpresa.equals(empresa)){
                retorno = false;
                empresas.getTarget().remove(lEmpresa);
                break;
             }    
        }
        return retorno;
    }

    public String filtarRel()  {
        return "/views/seguranca/consultas/usuariomodulo/filter.faces?faces-redirect=true";
    }        

    public String listar() {
        list = bean.getAll(usuarioFace.getLoggedUser().getEmpresa().getId());
        return "/views/seguranca/operacoes/usuarioEmpresa/list.faces?faces-redirect=true";
    }
    
    public List<UsuarioEmpresa> getList() {
        if (list == null) { 
            list = bean.getAll(usuarioFace.getLoggedUser().getEmpresa().getId());
        }
        return list;
    }

    public void setList(List<UsuarioEmpresa> list) {
       this.list = list;
    }

    public List<Empresa> getListaDeEmpresasDoUsuario(Usuario usuario) {
        
        System.out.println("***getListaDeEmpresasDoUsuario***");
        
        if (empresaSessao == null) {
            
            System.out.println("***getListaDeEmpresasDoUsuario-1***");
            
            empresaSessao = usuarioFace.getLoggedUser().getEmpresa();
        }        
        
        try {
            listByUsr = bean.getAllByUsuario(usuario);        
            listaDeEmpresasDoUsuario = new ArrayList<Empresa>();
            for (UsuarioEmpresa usuarioEmpresa : listByUsr) {          
                Empresa novoRegistro = new Empresa();            
                novoRegistro.setId(usuarioEmpresa.getEmpresa().getId());
                novoRegistro.setCodigo(usuarioEmpresa.getEmpresa().getCodigo());
                novoRegistro.setDescricao(usuarioEmpresa.getEmpresa().getDescricao());
                novoRegistro.setNomeFantasia(usuarioEmpresa.getEmpresa().getNomeFantasia());
                listaDeEmpresasDoUsuario.add(novoRegistro);
           }              
        } catch (Exception e) {
            listaDeEmpresasDoUsuario = null;
        }
        
        System.out.println("empresaSessao===>"+empresaSessao.getId());
        
       return listaDeEmpresasDoUsuario;
    }

    public void setListaDeEmpresasDoUsuario(List<Empresa> listaDeEmpresasDoUsuario) {
        this.listaDeEmpresasDoUsuario = listaDeEmpresasDoUsuario;
    }

    public void setListaDeUsuarios(LazyDataModel<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public boolean valida(UsuarioModulo novoRegistro) {        
        if ("".equals(novoRegistro.getModulo().getCodigo().trim()) || novoRegistro.getModulo().getCodigo().trim() == null) { 
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Módulo inválido."));
            return false;
        }        
        if ("".equals(novoRegistro.getUsuario().getApelido().trim()) || novoRegistro.getUsuario().getApelido().trim() == null) { 
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Usuário inválido."));
            return false;
        }        
        if (novoRegistro.getEmpresa() == null) { 
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Empresa inválida."));            
            return false;
        }        
        return true;
    }    
    
    public boolean existente(UsuarioModulo novoRegistro) {            
        try {
            //UsuarioModulo existente = bean.getUsuarioModulo(novoRegistro.getEmpresa().getId(), 
            //        getSelectedBean().getUsuario().getId(), getSelectedBean().getModulo().getId());             
            //setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;
        }       
    }    

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

    public DualListModel<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(DualListModel<Empresa> empresas) {
        this.empresas = empresas;
    }
    
    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getTituloDialogo() {
        return tituloDialogo;
    }

    public void setTituloDialogo(String tituloDialogo) {
        this.tituloDialogo = tituloDialogo;
    }

    public Usuario getRegistroSelecionado() {
        return registroSelecionado;
    }

    public void setRegistroSelecionado(Usuario registroSelecionado) {
        this.registroSelecionado = registroSelecionado;
    }

//alrc - inicio
    public Map<String, String> listaUsuarioEmpresas(){
        Map<String, String> empresas = new HashMap<>();
        List<UsuarioEmpresa> lista = bean.getAllByUsuario(usuarioFace.getLoggedUser());
        
        System.out.println("***VERIFICA EMPRESA ATUAL***");
        System.out.println("***EMPRESA ATUAL===>"+usuarioFace.getLoggedUser().getEmpresa().getCodigo());
        
//        for (UsuarioEmpresa usuarioEmpresa : lista) {
//            empresas.put(usuarioEmpresa.getEmpresa().getDescricao(), usuarioEmpresa.getId().toString());
            //if(usuarioEmpresa.isUltimo()==true){
//                System.out.println("usuarioEmpresa.getEmpresa().getDescricao()==>"+usuarioEmpresa.getEmpresa().getDescricao());
            //    idUsuarioEmpresa = usuarioEmpresa.getId();

                //itemSession.setIdEmpresaUltimoAcesso(usuarioEmpresa.getEmpresa().getId());
                
            //    usuarioFace.getLoggedUser().setEmpresa(usuarioEmpresa.getEmpresa());
            //    empresaSessao = usuarioEmpresa.getEmpresa();
            //}
//        }
        
        System.out.println("***VERIFICA EMPRESA ATUAL-1.0***");
        
        if (idUsuarioEmpresa == null) {

            System.out.println("***VERIFICA EMPRESA ATUAL-1.1***");
            
            try {
                idUsuarioEmpresa = usuarioFace.getLoggedUser().getEmpresa().getId();
                empresaSessao = usuarioFace.getLoggedUser().getEmpresa();

            } catch (Exception e) {
            }
        
        }        
        
        System.out.println("***idUsuarioEmpresa===>"+idUsuarioEmpresa);
        
        return empresas;
    }

    public Integer getUltimaEmpresa(){
        System.out.println("getUltimaEmpresa=1=>");
        try {
            System.out.println("getUltimaEmpresa=2=>");
            UsuarioEmpresa ultima = bean.getByUltimaEmpresa(usuarioFace.getLoggedUser());
            System.out.println("getUltimaEmpresa=3=>");
            //itemSession.setIdEmpresaUltimoAcesso(ultima.getEmpresa().getId());
            return ultima.getEmpresa().getId();
        } catch (Exception e) {
            System.out.println("getUltimaEmpresa=4=>"+e);
            //itemSession.setIdEmpresaUltimoAcesso(usuarioFace.getEmpresa().getId());
            return usuarioFace.getEmpresa().getId();
        }
    }
    
    public Integer getIdUsuarioEmpresa() {
        System.out.println("getIdUsuarioEmpresa==>"+ idUsuarioEmpresa);
        return idUsuarioEmpresa;
    }

    public void setIdUsuarioEmpresa(Integer idUsuarioEmpresa) {
        System.out.println("setIdUsuarioEmpresa==>"+ idUsuarioEmpresa);
        
        try {
            UsuarioEmpresa ue = bean.getById(this.idUsuarioEmpresa);
            ue.setUltimo(false);
            bean.set(ue);
                        
            UsuarioEmpresa ueAtual = bean.getById(idUsuarioEmpresa);
            ueAtual.setUltimo(true);
            bean.set(ueAtual);
            
            usuarioFace.getLoggedUser().setEmpresa(ueAtual.getEmpresa());
            usuarioSession.set(usuarioFace.getLoggedUser());            

        } catch (Exception e) {

        }
        this.idUsuarioEmpresa = idUsuarioEmpresa;
    }

    public Empresa getEmpresaSessao() {
        return empresaSessao;
    }

    public void setEmpresaSessao(Empresa empresaSessao) {
        this.empresaSessao = empresaSessao;
    }
    
    //alrc - fim

    
}