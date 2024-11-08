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

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.session.basico.EmpresaSession;

@Named
@ViewScoped
public class EmpresaFace extends BaseCDIBean<Empresa> {

	private static final long serialVersionUID = 1L;

	@Inject
	private EmpresaSession empresaSession;

	private Empresa registroSelecionado;

	private List<Empresa> empresas;

	private List<Empresa> filteredEmpresas;

	private String filtroTexto;

	private String titulo;

	private String operacao;
	
	private String inativo;


	@PostConstruct
	public void init() {
		setSelectedBean(new Empresa());
		setEmpresas(empresaSession.getAll());
		setFilteredEmpresas(empresas);
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
		setTitulo("SEG0104 - Incluir Empresa");
		setOperacao("I");
	}

	public void alterar() {
		setTitulo("SEG0104 - Alterar Empresa");
		setOperacao("A");
	}

	public void consultar() {	      
        setTitulo("SEG0104 - Consultar Empresa");
        setOperacao("C");  
	}

	public void remover() {

	}
	
	public void ativar() {
		setSelectedBean(registroSelecionado);        
		getSelectedBean().setInativo("N");
		getSelectedBean().setDatainativo(null);        
		empresaSession.set(getSelectedBean());
		PrimeFaces.current().executeScript("PF('manageDialog').hide()");
		PrimeFaces.current().ajax().update("form:messages", "form:dtb");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro ativado com sucesso."));
	} 
	
	public void inativar() {
		setSelectedBean(registroSelecionado);
		getSelectedBean().setInativo("S");
		getSelectedBean().setDatainativo(new Date());
		empresaSession.set(getSelectedBean());
		PrimeFaces.current().executeScript("PF('manageDialog').hide()");
		PrimeFaces.current().ajax().update("form:messages", "form:dtb");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Registro inativado com sucesso."));
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

}
