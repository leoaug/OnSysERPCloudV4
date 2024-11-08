package br.com.onsys.faces.basico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.model.LazyDataModel;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.faces.seguranca.LoginFace;
import br.com.onsys.session.basico.EmpresaLazy;
import br.com.onsys.session.basico.EmpresaSession;

@Named
@ViewScoped
public class EmpresaFace extends BaseCDIBean<Empresa> {

	private static final long serialVersionUID = 1L;

	@Inject
	private EmpresaSession 			bean;
	
	@Inject 
    private LoginFace               loginFace;

	private Empresa 	   			registroSelecionado;

	private List<Empresa>  			empresas;

	private List<Empresa>  			filteredEmpresas;

	private String 	       			filtroTexto;

	private String 	       			titulo;

	private String         			operacao;
	
	private String         			inativo;
	
	private LazyDataModel <Empresa> lazy;


	@PostConstruct
	public void init() {
		setSelectedBean(new Empresa());
		setEmpresas(bean.getAll());
		setFilteredEmpresas(empresas);
		lazy = new EmpresaLazy(loginFace.getUsuarioLogado().getEmpresa().getId()); 
	}

	public void filter() {
		if (filtroTexto == null || filtroTexto.isEmpty()) {
			filteredEmpresas = new ArrayList<>(empresas);
		} else {
			filteredEmpresas = empresas.stream()
					.filter(emp -> emp.getDescricao().toLowerCase().contains(filtroTexto.toLowerCase())
							|| emp.getCodigo().toLowerCase().contains(filtroTexto.toLowerCase()))
					.collect(Collectors.toList());
		}
	}

	public void limparFiltros() {
		System.out.println("caiu limpar filtros");
	}

	public void incluir() {
		
		setSelectedBean(new Empresa());
		setRegistroSelecionado(new Empresa());
		setOperacao("I");
		setTitulo("SEG0104 - Incluir Empresa");
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
        setTitulo("SEG0104 - Alterar Empresa");
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
		setTitulo("SEG0104 - Consultar Empresa");
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
	
	public void ativar() {
		setSelectedBean(registroSelecionado);        
		getSelectedBean().setInativo("N");
		getSelectedBean().setDatainativo(null);        
		bean.set(getSelectedBean());
		PrimeFaces.current().executeScript("PF('manageDialog').hide()");
		PrimeFaces.current().ajax().update("form:messages", "form:dtb");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro ativado com sucesso."));
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
	
	public void salvar(Boolean novoRegistro) {
        System.out.println("***SALVAR***");
        setSelectedBean(registroSelecionado);
        getSelectedBean().setModificado("S");
        setSelectedBean(getRegistroSelecionado());     
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
                    setSelectedBean(new Empresa());
                }
            }
            else {
                bean.set(getSelectedBean());            
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro atualizado com sucesso!"));
                PrimeFaces.current().executeScript("PF('manageDialog').hide()");
                setSelectedBean(new Empresa());
            }
            PrimeFaces.current().ajax().update("form:messages", "form:dtb");
            setLazy(null);
        }
    }
	
	public boolean valida(Empresa registroParaValidar) {        
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
	
	public boolean existente(Empresa registroParaIncluir) {            
		try {
			Empresa existente = bean.getById(registroSelecionado.getId());
			setSelectedBean(existente);            
			return true;
		} catch (Exception e) {
			return false;            
		}
	} 

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Empresa> getFilteredEmpresas() {
		return filteredEmpresas;
	}
	
	public void setFilteredEmpresas(List<Empresa> filteredEmpresas) {
		this.filteredEmpresas = filteredEmpresas;
	}

	public String getFiltroTexto() {
		return filtroTexto;
	}

	public void setFiltroTexto(String filtroTexto) {
		this.filtroTexto = filtroTexto;
	}

	public Empresa getRegistroSelecionado() {
		return registroSelecionado;
	}

	public void setRegistroSelecionado(Empresa registroSelecionado) {
		this.registroSelecionado = registroSelecionado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public LazyDataModel<Empresa> getLazy() {
		return lazy;
	}

	public void setLazy(LazyDataModel<Empresa> lazy) {
		this.lazy = lazy;
	}
	

}
