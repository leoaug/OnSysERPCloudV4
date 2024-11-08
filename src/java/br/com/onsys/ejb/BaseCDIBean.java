package br.com.onsys.ejb;

import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.ResourceBundle;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class BaseCDIBean<T> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private T selectedBean;
    @PersistenceContext
    protected EntityManager em;

    public T getSelectedBean() {
        return selectedBean;
    }

    public void setSelectedBean(T selectedBean) {
        this.selectedBean = selectedBean;
    }
    
    // Alteracao Fernando 14/07/2011
    /** Atributos final - Constantes */
    //private static final long serialVersionUID = 1L;
    // Forwards
    protected static final String FORWARD_MESMA_PAGINA = null;
    /**
     * Retorna valor da chave informada por par�metro, para o arquivo de
     * ResourceBundle padro
     * @param key Chave do arquivo de resource
     * @return String Valor da chave
     */
    protected String getMessage(String key) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application application = facesContext.getApplication();
        // Recupera chave e retorna valor
        StringBuffer value = new StringBuffer(ResourceBundle.getBundle(application.getMessageBundle()).getString(key));
        return value != null ? value.toString() : new StringBuffer("??").append(key).append("??").toString();
    }
    /**
     * Retorna object ServletContext
     * @return ServletContext
     */
    protected ServletContext getServletContext() {
        return (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    }
    /**
     * Retorna object Request
     * @return HttpServletRequest
     */
    protected HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }
    /**
     * Retorna object Response
     * @return HttpServletResponse
     */
    protected HttpServletResponse getResponse() {
        return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    }
    /**
     * Retorna object Session
     * @return HttpSession
     */
    protected HttpSession getSession() {
        return this.getRequest().getSession();
    }
    /**
     * Seta atributo no Request
     * @param name
     *            Nome do atributo
     * @param value
     *            Valor do atributo
     *
     */
    protected void setAttributeOnRequest(String name, Object value) {
        this.getRequest().setAttribute(name, value);
    }
    /**
     * Seta atributo na Session
     * @param name
     *            Nome do atributo
     * @param value
     *            Valor do atributo
     */
    protected void setAttributeOnSession(String name, Object value) {
        this.getSession().setAttribute(name, value);
    }
    /**
     * Recupera objeto na Session
     * @param name
     *            Nome do atributo na Session
     * @param removeAttribute
     *            Indica se atributo deve ser removido ap�s ser recuperado
     * @return Object Retorna null caso atributo n�o seja encontrado
     */
    protected Object getAttributeOnSession(String name, boolean removeAttribute) {
        // Recupera objeto na session, depois remove
        HttpSession session = this.getSession();
        Object object = session.getAttribute(name);

        // Caso atributo precise ser removido
        if (object != null && removeAttribute) {
            session.removeAttribute(name);
        } // end if

        // Retorna objeto
        return object;
    }

    /**
     * Recupera objeto na Session
     * @param name
     *            Nome do atributo na Session
     * @return Object Retorna null caso atributo n�o seja encontrado
     *
     */
    protected Object getAttributeOnSession(String name) {
        return this.getAttributeOnSession(name, false);
    }

    /**
     * Recupera objeto no Request
     *
     * @param name
     *            Nome do atributo no Request
     *
     * @return Object Retorna null caso atributo n�o seja encontrado
     *
     */
    protected Object getAttributeOnRequest(String name) {
        return this.getRequest().getAttribute(name);
    }

    /**
     * Verifica se determinado atributo se encontra na Session
     *
     * @param name
     *            Nome do atributo
     *
     * @return boolean true caso atributo seja encontrado
     *
     */
    protected boolean existsAttributeOnSession(String name) {
        boolean exists = false;
        // Busca atributo na session
        @SuppressWarnings("rawtypes")
        Enumeration atributos = getSession().getAttributeNames();
        while (atributos.hasMoreElements()) {
            String atributo = (String) atributos.nextElement();
            if (name.equals(atributo)) {
                exists = true;
                break;
            } // end if
        } // end while

        // Retorna exists
        return exists;
    }

    /**
     * Adiciona uma messagem simples para cliente.
     *
     * @param message
     *
     */
    protected void addMessage(String message) {
        this.addMessage(null, message, (Object[]) null);
    }

    /**
     * Adiciona uma mensagem para o cliente com parametros.
     *
     * @param message
     * @param arguments
     */
    protected void addMessage(String message, Object... arguments) {
        this.addMessage(null, message, arguments);
    }

    /**
     * Adiciona uma mensagem simlpes para o cliente associada a um espec�fico
     * componente pelo id.
     *
     * @param clientId
     * @param message
     */
    protected void addMessage(String clientId, String message) {
        this.addMessage(clientId, message, (Object[]) null);
    }

    /**
     * Adiciona uma mensagem com parametros para o cliente associada a um
     * espec�fico componente pelo id.
     *
     * @param clientId
     * @param message
     * @param arguments
     *
     */
    protected void addMessage(String clientId, String message, Object... arguments) {
        boolean setObjects = arguments == null ? false : arguments.length > 0;

        if (setObjects) {
            message = MessageFormat.format(message, arguments);
        } // end if
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, message, null);
        FacesContext.getCurrentInstance().addMessage(clientId, facesMessage);
    }  
    
}