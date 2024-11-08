package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.session.seguranca.ProgramaLazy;
import br.com.onsys.session.seguranca.ProgramaSession;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.model.LazyDataModel;
/**
 *
 * @author cristiano
 */ 
@Named
@ViewScoped
public class ProgramaFace  extends BaseCDIBean<Programa> {

    private static final long serialVersionUID = 7L;
    @Inject
    private ProgramaSession         bean;
    @Inject 
    private LoginFace               loginFace;
    private LazyDataModel<Programa> lazy; 
    private Programa                registroSelecionado;
    private String                  operacao = null;
    private String                  inativo  = null;
    private String                  titulo  = null;    
  
    public ProgramaFace() {
        setSelectedBean(new Programa());
    }
    
    @PostConstruct
    public void init() {
        limparFiltros();
        lazy = new ProgramaLazy(loginFace.getUsuarioLogado().getEmpresa().getId());        
    }
    
    public void incluir() {    
        setSelectedBean(new Programa());
        setRegistroSelecionado(new Programa());
        setOperacao("I");
        setTitulo("SEG0104 - Incluir programa");
        limparFiltros();
    }
    
    public void alterar() {    
        try {
            if (registroSelecionado.getInativo().equals("S")) {
                setInativo("S");
            } else {
                setInativo("N");
            }  
        } catch (Exception e) {
            setInativo("N");
        }
        setOperacao("A"); 
        setTitulo("SEG0104 - Alterar programa");
    }
    
    public void consultar() {    
        try {
            if (registroSelecionado.getInativo().equals("S")) {
                setInativo("S");
            } else {
                 setInativo("N");
            }  
        } catch (Exception e) {
            setInativo("N");
        }
        setOperacao("C");        
        setTitulo("SEG0104 - Consultar programa");
    }

    public void remover() { 
        if (registroSelecionado == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Selecione um registro na lista abaixo, para utilizar a função de deleção"));  
        } else {       
            try {         
                setSelectedBean(registroSelecionado);
                bean.remove(getSelectedBean());
                setLazy(null);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro deletado com sucesso"));   
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro possui relacionamentos ativo")); 
            }
            PrimeFaces.current().ajax().update("form:messages", "form:dtb");   
            limparFiltros();
        }
    }
    
    public void limparFiltros() {
        setLazy(null);
        try {
            DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:dtb");
            dataTable.reset();
            PrimeFaces.current().executeScript("form:dtb");
        } catch (Exception e) {
            System.out.println("limparFiltros=5=>"+e);
        }
    } 
    
    public void salvar(Boolean novoRegistro) {
        System.out.println("***SALVAR***");
        setSelectedBean(registroSelecionado);
        Date dateModificacao = new Date(); 
        Date now = new Date();
        getSelectedBean().setModificado("S");
        getSelectedBean().setEmpresa(loginFace.getEmpresa());     
        System.out.println("***1-SALVAR***");
        if (valida(getSelectedBean()) == false){        
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro não pode ser salvo."));  
            PrimeFaces.current().ajax().update("form:messages");        
        } else {       
            System.out.println("***2-SALVAR***");
            if (getSelectedBean().getId() == null) {
                if (existente(getSelectedBean()) == true) {                    
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Registro já existe."));
                } else {                 
                    bean.save(getSelectedBean());            
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro incluído com sucesso!"));
                    if (!novoRegistro) {
                        PrimeFaces.current().executeScript("PF('manageDialog').hide()");
                    }
                    setSelectedBean(new Programa());
                }
            }
            else {
                bean.set(getSelectedBean());            
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro atualizado com sucesso!"));
                PrimeFaces.current().executeScript("PF('manageDialog').hide()");
                setSelectedBean(new Programa());
                //setRegistroSelecionado(new Programa());                
            }
            PrimeFaces.current().ajax().update("form:messages", "form:dtb");
            setLazy(null);
        }
    }
    
    public void inativar() {
        setSelectedBean(registroSelecionado);
        getSelectedBean().setInativo("S");
        getSelectedBean().setDatainativo(new Date());
        bean.set(getSelectedBean());
        PrimeFaces.current().executeScript("PF('manageDialog').hide()");
        PrimeFaces.current().ajax().update("form:messages", "form:dtb");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro inativado com sucesso."));
    }
    
    public void ativar() {
        setSelectedBean(registroSelecionado);        
        getSelectedBean().setInativo("N");
        getSelectedBean().setDatainativo(null);        
        bean.set(getSelectedBean());
        PrimeFaces.current().executeScript("PF('manageDialog').hide()");
        PrimeFaces.current().ajax().update("form:messages", "form:dtb");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro ativado com sucesso."));
    }   

    public boolean valida(Programa registroParaValidar) {        
        if(getSelectedBean().getCodigo() == null  || "".equals(getSelectedBean().getCodigo())) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Código inválido."));            
            return false;
        }        
        if(getSelectedBean().getDescricao() == null  || "".equals(getSelectedBean().getDescricao())) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Descrição inválida."));            
            return false;
        }        
        return true;
    }    
    
    public boolean existente(Programa registroParaIncluir) {            
        try {
            Programa existente = bean.getByCodigo(loginFace.getUsuarioLogado().getEmpresa().getId(), registroParaIncluir.getCodigo());
            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    }    
    
    public LazyDataModel<Programa> getLazy() {
        if (lazy == null) {
            lazy = new ProgramaLazy(loginFace.getUsuarioLogado().getEmpresa().getId()); 
        }
        return lazy;
    }

    public void setLazy(LazyDataModel<Programa> lazy) {
        this.lazy = lazy;
    }

    public Programa getRegistroSelecionado() {
        return registroSelecionado;
    }

    public void setRegistroSelecionado(Programa registroSelecionado) {
        this.registroSelecionado = registroSelecionado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}