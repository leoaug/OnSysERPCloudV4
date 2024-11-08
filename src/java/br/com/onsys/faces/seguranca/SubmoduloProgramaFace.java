package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Submodulo;
import br.com.onsys.entidades.seguranca.SubmoduloPrograma;
import br.com.onsys.session.basico.EmpresaSession;
import br.com.onsys.session.seguranca.ProgramaSession;
import br.com.onsys.session.seguranca.SubmoduloProgramaSession;
import br.com.onsys.util.ValidaAcesso;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

@Named
@SessionScoped
public class SubmoduloProgramaFace extends BaseCDIBean<SubmoduloPrograma> {

    private static final long serialVersionUID = 17L;
    @Inject
    private SubmoduloProgramaSession    bean;
    @Inject
    private EmpresaSession              empresaSession;
    @Inject
    private UsuarioFace                 usuarioFace;
    @Inject    
    private ValidaAcesso                validaAcesso;
    @Inject
    private ProgramaSession             programaSession;
    @Inject 
    private SubmoduloFace               submoduloFace;
    private List<SubmoduloPrograma>     list;
    private List<SubmoduloPrograma>     listBySubmodulo;//lista dos programas do submodulo        
    private List<Programa>              listPrograma;
    private DualListModel<Programa>     programas;    
    private Programa                    programaSelecionado;
    private Submodulo                   submoduloSelecionado = null;
    private String                      titulo;
    private String                      tituloDialogoPermissao;
    private boolean lVerMenu    = false;
    private boolean permissaoConsultar   = false; 
    private boolean permissaoAlterar     = false; 
    private boolean permissaoIncluir     = false; 
    private boolean permissaoRemover     = false;  
//  VARIAVEIS DE CONTROLE DE PERMISSÃO
    private Integer                     idUsrValido = null;         
    //private String                          cOrder      = "1";
    //private String                          cFind       = null;  
    
    public void doValidaUsr() {
        if (!usuarioFace.getLoggedUser().getId().equals(idUsrValido) || idUsrValido == null) {
            usuarioFace.doLogOut();        
        }        
    }          

    public SubmoduloProgramaFace() {
        setSelectedBean(new SubmoduloPrograma());
    }

    public void alterar() {
        System.out.println("***submoduloProgramaFace.alterar***");
        if (submoduloSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de alteração."));
            //return null;            
        } else {           
            List<Programa> source = new ArrayList<Programa>();
            List<Programa> target = new ArrayList<Programa>();   
            System.out.println("***1-submoduloProgramaFace.alterar***");
            listPrograma = programaSession.getAll(usuarioFace.getLoggedUser().getEmpresa().getId());          
            System.out.println("***2-submoduloProgramaFace.alterar***");
            for (Programa programa : listPrograma) {   
                
                System.out.println("3-programasDisponiveis.getCodigo()===>"+programa.getCodigo());
                
                if (bean.getListSubmoduloPrograma(usuarioFace.getLoggedUser().getEmpresa().getId(), 
                               submoduloSelecionado,       
                        programa)==null ||
                        bean.getListSubmoduloPrograma(usuarioFace.getLoggedUser().getEmpresa().getId(), 
                                       submoduloSelecionado, 
                                programa).isEmpty()){                        
                    source.add(programa);
                }
            }  
            listBySubmodulo = new ArrayList<SubmoduloPrograma>();               
            System.out.println("***4-submoduloProgramaFace.alterar***");
            listBySubmodulo = bean.getAllBySubmodulo(usuarioFace.getLoggedUser().getEmpresa().getId(), submoduloSelecionado);
            System.out.println("***5-submoduloProgramaFace.alterar***");            
            for (SubmoduloPrograma s : listBySubmodulo){
                System.out.println("6-s.getPrograma().getCodigo()===>"+s.getPrograma().getCodigo());
                Programa addObj = new Programa();            
                addObj.setId(s.getPrograma().getId());
                addObj.setCodigo(s.getPrograma().getCodigo());
                addObj.setDescricao(s.getPrograma().getDescricao());
                target.add(addObj);
            }
            System.out.println("***7-submoduloPrograma***");
            programas = new DualListModel<Programa>(source, target);
        }
        
        setTitulo("SEG0108 - Submódulo x Programa");
        
        //if (validaAcesso.validaUsrUrl("/views/comercial/cadastros/usuTipoPedido/edit.faces")) {
        //    return "/views/comercial/cadastros/tipoPedidoUsr/edit.faces?faces-redirect=true";
        //} else {
        //    return "/access-denied.faces?faces-redirect=true";
        //}
    }
    
  
    
    public String consultar() {        
        if (validaAcesso.validaUsrUrl("/views/comercial/cadastros/tipoPedidoUsr/view.faces")) {        
            try {
                return "/views/comercial/cadastros/tipoPedidoUsr/view.faces?faces-redirect=true";
            } catch (Exception e) {
                return "/views/comercial/cadastros/tipoPedidoUsr/view.faces?faces-redirect=true";
            }
        } else {
            return "/access-denied.faces?faces-redirect=true";
        }
    }
    
    public void onTransfer(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        programaSelecionado = null;
        for (Object item : event.getItems()) {
            builder.append(((Programa) item).getCodigo());
            try {
                
                System.out.println("***CODIGO=======>"+builder.toString().trim());
                System.out.println("***ID EMPRESA===>"+usuarioFace.getLoggedUser().getEmpresa().getId());
                
                programaSelecionado = programaSession.getByCodigo(usuarioFace.getLoggedUser().getEmpresa().getId(), builder.toString().trim());
            } catch (Exception e) {
            }
        }
        FacesMessage msg = new FacesMessage();
        if (event.isAdd()) {
            
            System.out.println("***ABRIR DIALOGO PERMISSÕES***");
            
            setTituloDialogoPermissao("Permissões do programa - "+programaSelecionado.getCodigo());

            PrimeFaces.current().executeScript("PF('manageDialogPermissao').show()"); 
            
            SubmoduloPrograma addObj = new SubmoduloPrograma();            
            addObj.setSubmodulo(submoduloSelecionado);             
            addObj.setPrograma(programaSelecionado); 
            addObj.setEmpresa(usuarioFace.getLoggedUser().getEmpresa());
            addObj.setId(null);
            
            if (addObj.getSubmodulo() != null) { 
                bean.save(addObj);
            }
            
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            msg.setSummary("Atenção : ");
            //msg.setSummary("Items Transferred - REMOVER   " + event.isRemove());        
            msg.setDetail("Programa : " +programaSelecionado.getCodigo() + " - " + programaSelecionado.getDescricaomenu() + ", foi incluído com sucesso.");
            
        } else {
            
            System.out.println("***VOU REMOVER O PROGRAMA***");
            System.out.println("***SUBMODULO===>"+submoduloSelecionado.getCodigo());
            System.out.println("***PROGRAMA====>"+programaSelecionado.getCodigo());
            
            try {
                SubmoduloPrograma registroParaDeletar = bean.getSubmodProg(usuarioFace.getLoggedUser().getEmpresa().getId(), submoduloSelecionado.getId(),programaSelecionado.getId());
                bean.remove(registroParaDeletar);
                
                msg.setSeverity(FacesMessage.SEVERITY_INFO);
                msg.setSummary("Atenção : ");
                //msg.setSummary("Items Transferred - REMOVER   " + event.isRemove());        
                msg.setDetail("Programa : " +programaSelecionado.getCodigo() + " - " + programaSelecionado.getDescricaomenu()+ ", foi removido com sucesso.");
                
            } catch (Exception e) {
            }
            
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }      
    
    public void salvarPermisao() {
         System.out.println("***SALVAR PERMISSAO***");
         System.out.println("PROGRAMA====>");
         System.out.println("SUBMODULO===>");
         System.out.println("ALTERAR=====>"+permissaoAlterar);
         PrimeFaces.current().executeScript("PF('dialogoPermissao').hide()");     

        try {
            SubmoduloPrograma registroParaAlterar = bean.getSubmodProg(usuarioFace.getLoggedUser().getEmpresa().getId(), submoduloFace.getRegistroSelecionado().getId(),programaSelecionado.getId());
            registroParaAlterar.setEditar(permissaoAlterar);
            registroParaAlterar.setConsultar(permissaoConsultar);
            registroParaAlterar.setIncluir(permissaoIncluir);
            registroParaAlterar.setRemover(permissaoRemover);
            bean.set(registroParaAlterar);
            System.out.println("***SALVAR PERMISSAO - 1***");
        } catch (Exception e) {
        }
        System.out.println("***SALVAR PERMISSAO - 2***");
    }    
    
    public boolean valida(SubmoduloPrograma registroParaValidar) {        
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
    
    public boolean existente(SubmoduloPrograma registroParaIncluir) {            
        try {
//            SubmoduloPrograma existente = bean.getByCodigo(usuarioFace.getLoggedUser().getEmpresa().getId(), registroParaIncluir.getCodigo());
//            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    }    

    public List<SubmoduloPrograma> getList() {
        if (idUsrValido == null) { 
            idUsrValido = usuarioFace.getLoggedUser().getId();            
            list = bean.getAllSubmoduloPrograma(usuarioFace.getLoggedUser().getEmpresa().getId());
        } else if (!usuarioFace.getLoggedUser().getId().equals(idUsrValido)) {
            usuarioFace.doLogOut();
        } else if (list == null) {
            list = bean.getAllSubmoduloPrograma(usuarioFace.getLoggedUser().getEmpresa().getId());
            idUsrValido = usuarioFace.getLoggedUser().getId();   
        }
        return list;
    }
    
    public void setList(List<SubmoduloPrograma> list) {
       this.list = list;
    }
    
    public Integer getIdUsrValido() {
        return idUsrValido;
    }

    public void setIdUsrValido(Integer idUsrValido) {
        this.idUsrValido = idUsrValido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Programa getProgramaSelecionado() {
        return programaSelecionado;
    }

    public void setProgramaSelecionado(Programa programaSelecionado) {
        this.programaSelecionado = programaSelecionado;
    }

    public Submodulo getSubmoduloSelecionado() {
        return submoduloSelecionado;
    }

    public void setSubmoduloSelecionado(Submodulo submoduloSelecionado) {
        this.submoduloSelecionado = submoduloSelecionado;
    }
    
    public DualListModel<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(DualListModel<Programa> programas) {
        this.programas = programas;
    }

    public String getTituloDialogoPermissao() {
        return tituloDialogoPermissao;
    }

    public void setTituloDialogoPermissao(String tituloDialogoPermissao) {
        this.tituloDialogoPermissao = tituloDialogoPermissao;
    }

    public boolean islVerMenu() {
        return lVerMenu;
    }

    public void setlVerMenu(boolean lVerMenu) {
        this.lVerMenu = lVerMenu;
    }

    public boolean isPermissaoConsultar() {
        return permissaoConsultar;
    }

    public void setPermissaoConsultar(boolean permissaoConsultar) {
        this.permissaoConsultar = permissaoConsultar;
    }

    public boolean isPermissaoAlterar() {
        return permissaoAlterar;
    }

    public void setPermissaoAlterar(boolean permissaoAlterar) {
        this.permissaoAlterar = permissaoAlterar;
    }

    public boolean isPermissaoIncluir() {
        return permissaoIncluir;
    }

    public void setPermissaoIncluir(boolean permissaoIncluir) {
        this.permissaoIncluir = permissaoIncluir;
    }

    public boolean isPermissaoRemover() {
        return permissaoRemover;
    }

    public void setPermissaoRemover(boolean permissaoRemover) {
        this.permissaoRemover = permissaoRemover;
    }
    
}