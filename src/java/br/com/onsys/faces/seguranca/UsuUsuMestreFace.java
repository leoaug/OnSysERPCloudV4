package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.comercial.UsuRepres;
import br.com.onsys.entidades.seguranca.UsuUsuMestre;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.session.basico.EmpresaSession;
import br.com.onsys.session.seguranca.UsuUsuMestreSession;
import br.com.onsys.session.seguranca.UsuarioSession;
import br.com.onsys.util.ValidaAcesso;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

@Named
@SessionScoped
public class UsuUsuMestreFace extends BaseCDIBean<UsuUsuMestre> {

    private static final long serialVersionUID = 7L;
    @Inject
    private UsuUsuMestreSession             bean;
    @Inject
    private EmpresaSession                  empresaBean;
    @Inject
    private UsuarioFace                     userLogado;
    @Inject    
    private ValidaAcesso                    validaAcesso;
    @Inject
    private UsuarioSession                  usuarioSession;
    // @Inject 
    // private ListaPendenciasController   listaPendenciasController;
    
    private List<UsuUsuMestre>              list;
    private List<UsuUsuMestre>              listByUsr;        
    private List<Usuario>                   listUsuario;
    private List<Usuario>                   listUsuario2;

    
    private DualListModel<Usuario>          usuario;    
    private Usuario                         usuarioMestreSelecionado;
//  VARIAVEIS DE CONTROLE DE PERMISSÃO
    private Integer                         idUsrValido = null;         
    private String                          cOrder      = "1";
    private String                          cFind       = null;  
    
    //@PostConstruct
    //public void init() {
    //    usuarioSelecionado = null;
    //   List<Representante> respresSource = new ArrayList<Representante>();
    //    List<Representante> respresTarget = new ArrayList<Representante>();        
    //    listRepres = representanteSession.getAllRepresVendAtivos(userLogado.getLoggedUser().getEmpresa().getId());        
    //    for (Representante representante : listRepres) {          
    //        respresSource.add(representante);
    //    }        
    //    repres = new DualListModel<Representante>(respresSource, respresTarget);        
    //}    
    
    public void doValidaUsr() {
        if (!userLogado.getLoggedUser().getId().equals(idUsrValido) || idUsrValido == null) {
            userLogado.doLogOut();        
        }        
    }          

    public UsuUsuMestreFace() {
        setSelectedBean(new UsuUsuMestre());
    }

    public String editar() {
        
        System.out.println("***UsuUsuMestreFace***");

        if (usuarioMestreSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de alteração."));
            return null;            
        }           
        List<Usuario> usuarioSource = new ArrayList<Usuario>();
        List<Usuario> usuarioTarget = new ArrayList<Usuario>();   
        listUsuario = usuarioSession.getAllUsuarios(userLogado.getLoggedUser().getEmpresa().getId());

        System.out.println("***1-UsuUsuMestreFace***");

        for (Usuario usuario : listUsuario) {   
            
            System.out.println("***2-UsuUsuMestreFace***");            
            System.out.println("userLogado.getLoggedUser().getEmpresa().getId()===>"+userLogado.getLoggedUser().getEmpresa().getId());
            System.out.println("usuarioMestreSelecionado.getId()==================>"+usuarioMestreSelecionado.getId());
            
            if (bean.getByUsrMestre(userLogado.getLoggedUser().getEmpresa().getId(),                                    
                    usuario.getId(),
                    usuarioMestreSelecionado.getId())==null ||
                    bean.getByUsrMestre(userLogado.getLoggedUser().getEmpresa().getId(),
                            usuario.getId(),
                                    usuarioMestreSelecionado.getId()).isEmpty()){
                
                System.out.println("***3-UsuUsuMestreFace-Usuario===>"+usuario.getApelido());
                
                usuarioSource.add(usuario);
            }
        }  
        listByUsr = new ArrayList<UsuUsuMestre>();               
        listByUsr = bean.getAllByUsrMestre(userLogado.getLoggedUser().getEmpresa().getId(), usuarioMestreSelecionado.getId());
        System.out.println("***USUARIOS SELECIONADOS***");
        
        System.out.println("EMPRESA==========>"+userLogado.getLoggedUser().getEmpresa().getId());
        System.out.println("USUARIO MESTRE===>"+usuarioMestreSelecionado.getId());
        
        for (UsuUsuMestre usuUsuMestre : listByUsr){            
            
            System.out.println("APELIDO===>"+usuUsuMestre.getUsuario().getApelido());
            
            Usuario addObj = new Usuario();            
            addObj.setId(usuUsuMestre.getUsuario().getId());
            addObj.setApelido(usuUsuMestre.getUsuario().getApelido());
            addObj.setEmail(usuUsuMestre.getUsuario().getEmail());
            usuarioTarget.add(addObj);
        }                
        usuario = new DualListModel<Usuario>(usuarioSource, usuarioTarget);         
        //if (validaAcesso.validaUsrUrl("/views/seguranca/cadastros/usuUsuMestre/edit.faces")) {
            return "/views/seguranca/cadastros/usuUsuMestre/edit.faces?faces-redirect=true";
        //} else {
        //    return "/access-denied.faces?faces-redirect=true";
        //}
    }
    
    public String fimEditar() {
        /* INICIO TESTE CCA 
        for (UsuRepres usuRepres : listByUsr){
            bean.remove(usuRepres);
        }        
        FIM TESTE CCA */
        //for (Representante lrepre : repres.getTarget()){
        //    
        //    System.out.println("REPRESENTANTE===>"+lrepre.getApelido() + " - "+ lrepre.getCodigo());
        //    
        //    UsuRepres addObj = new UsuRepres();            
        //    addObj.setEmpresa(lrepre.getEmpresa());
        //    addObj.setRepresentante(lrepre);            
        //    addObj.setUsuario(usuarioSelecionado); 
        //    addObj.setEmpresa(userLogado.getLoggedUser().getEmpresa());
        //    addObj.setId(null);
        //    bean.save(addObj);
        //}        
        setList(null);
        //init();
        return listar();
    }  
    
    public String consultar() {        
        //if (validaAcesso.validaUsrUrl("/views/comercial/cadastros/usuUsumestre/view.faces")) {        
        //    try {
                return "/views/seguranca/cadastros/usuUsuMestre/view.faces?faces-redirect=true";
        //    } catch (Exception e) {
        //        return "/views/comercial/cadastros/usuUsumestre/view.faces?faces-redirect=true";
        //    }
        //} else {
        //    return "/access-denied.faces?faces-redirect=true";
        //}
    }
    
    public void manter(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        Usuario usuarioSelecionado = null;
        for (Object item : event.getItems()) {
            builder.append(((Usuario) item).getEmail());
            try {
                
                System.out.println("***EMAIL========>"+builder.toString().trim());
                System.out.println("***ID EMPRESA===>"+userLogado.getLoggedUser().getEmpresa().getId());
                
                usuarioSelecionado = usuarioSession.getByEmail(userLogado.getLoggedUser().getEmpresa().getId(), builder.toString().trim());
            } catch (Exception e) {
            }
        }
        FacesMessage msg = new FacesMessage();
        if (event.isAdd()) {
            
            System.out.println("***VOU ADICIONAR O USUARIO===>"+usuarioMestreSelecionado.getApelido());

            UsuUsuMestre addObj = new UsuUsuMestre();            
            addObj.setUsuarioMestre(usuarioMestreSelecionado);            
            addObj.setUsuario(usuarioSelecionado); 
            addObj.setEmpresa(userLogado.getLoggedUser().getEmpresa());
            addObj.setId(null);
            
            if (addObj.getUsuario() != null) { 
                bean.save(addObj);
            }        
            
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            msg.setSummary("Atenção : ");
            //msg.setSummary("Items Transferred - REMOVER   " + event.isRemove());        
            msg.setDetail("Usuário : " +usuarioSelecionado.getEmail()+ " - " + usuarioSelecionado.getApelido() + ", foi incluído com sucesso.");
            
        } else {
            
            try {
                UsuUsuMestre registroParaDeletar = bean.getByUsuarioRepres(userLogado.getLoggedUser().getEmpresa().getId(), usuarioSelecionado.getId(),usuarioSelecionado.getId());
                bean.remove(registroParaDeletar);
                
                msg.setSeverity(FacesMessage.SEVERITY_INFO);
                msg.setSummary("Atenção : ");
                //msg.setSummary("Items Transferred - REMOVER   " + event.isRemove());        
                msg.setDetail("Usuário : " +usuarioSelecionado.getEmail() + " - " + usuarioSelecionado.getApelido() + ", foi removido com sucesso.");
                
            } catch (Exception e) {
            }
            
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }    

    public String listar() {
        list = bean.getAll(userLogado.getLoggedUser().getEmpresa().getId());
        return "/views/seguranca/cadastros/usuUsuMestre/list.faces?faces-redirect=true";
    }
    
    public boolean valida(UsuRepres registroParaValidar) {        
//        if(getSelectedBean().getCodigo() == null  || "".equals(getSelectedBean().getCodigo())) {
//            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Código inválido.","Código inválido.");
//            FacesContext.getCurrentInstance().addMessage("Código inválido.", fm);  
//            return false;
//        }        
//        if(getSelectedBean().getDescricao() == null  || "".equals(getSelectedBean().getDescricao())) {
//            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Descrição inválida.","Descrição inválida.");
//            FacesContext.getCurrentInstance().addMessage("Descrição inválida.", fm);  
//            return false;
//        }        
        return true;
    }    
    
    public boolean existente(UsuRepres registroParaIncluir) {            
        try {
//            UsuRepres existente = bean.getByCodigo(userLogado.getLoggedUser().getEmpresa().getId(), registroParaIncluir.getCodigo());
//            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    }    
    
    public List<UsuUsuMestre> getList() {
        if (idUsrValido == null) { 
            idUsrValido = userLogado.getLoggedUser().getId();            
            list = bean.getAll(userLogado.getLoggedUser().getEmpresa().getId());
        } else if (!userLogado.getLoggedUser().getId().equals(idUsrValido)) {
            userLogado.doLogOut();
        }        
        else if (list == null) {
            list = bean.getAll(userLogado.getLoggedUser().getEmpresa().getId());
            idUsrValido = userLogado.getLoggedUser().getId();   
        }
        return list;        
    }

    public void setList(List<UsuUsuMestre> list) {
        this.list = list;
    }
    
    public Integer getIdUsrValido() {
        return idUsrValido;
    }

    public void setIdUsrValido(Integer idUsrValido) {
        this.idUsrValido = idUsrValido;
    }

    public String getcFind() {
        return cFind;
    }

    public void setcFind(String cFind) {
        this.cFind = cFind;
    }

    public String getcOrder() {
        return cOrder;
    }

    public void setcOrder(String cOrder) {
        this.cOrder = cOrder;
    }

    public DualListModel<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(DualListModel<Usuario> usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioMestreSelecionado() {
        return usuarioMestreSelecionado;
    }

    public void setUsuarioMestreSelecionado(Usuario usuarioMestreSelecionado) {
        this.usuarioMestreSelecionado = usuarioMestreSelecionado;
    }
        
}