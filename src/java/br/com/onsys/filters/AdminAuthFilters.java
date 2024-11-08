package br.com.onsys.filters;

import br.com.onsys.entidades.seguranca.LogUsrProgAcessado;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.UsuarioAtalho;
import br.com.onsys.entidades.seguranca.UsuarioPrograma;
import br.com.onsys.faces.seguranca.LoginFace;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.seguranca.LogUsrProgAcessadoSession;
import br.com.onsys.session.seguranca.UsuarioAtalhoSession;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;
import javax.faces.event.PhaseId;
import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebFilter(filterName = "AdminAuthFilter", urlPatterns = {"/views/*","/viewsMarketplace/*","/viewsLojaMoveis/*","/viewsTransportadoras/*","/viewsBotafogo/*"})
public class AdminAuthFilters implements Filter  {

    private static final boolean debug = true;
//  @Inject
//  private UsuarioFace loginBean;
//    @Inject
//    private UsuarioProgramaSession  usuarioProgramaSession;   
    @Inject
    private UsuarioFace                 usuarioFace;        
    @Inject
    private UsuarioAtalhoSession        usuarioAtalhoSession;   
    @Inject
    private LogUsrProgAcessadoSession   logUsrProgAcessadoSession;   
    @Inject    
    private UsuarioAtalho               novoRegistro;  
    @Inject 
    private LoginFace                   loginFace;
    private UsuarioPrograma             usrProgramaValido   = null;
    private LogUsrProgAcessado          logUsrProgAcessado  = null; 
    private boolean                     isAchei = false;
    private Integer                     idUsuarioValido = null;  
    private FilterConfig                filterConfig = null;
    public  Programa                    programaAtivo = null;
    
    public AdminAuthFilters() {
    }
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        
        if (debug) {
            log("Teste:DoBeforeProcessing");
        }
        
        HttpServletRequest  reqBefore     = (HttpServletRequest) request;
        HttpServletResponse respBefore    = (HttpServletResponse) response;
        String urlBefore       = reqBefore.getRequestURL().toString();
        String urlPaginaBefore = reqBefore.getRequestURI().substring(6);   
        
        System.out.println("***BEFORE***");
        System.out.println("reqBefore=========>"+reqBefore);
        System.out.println("respBefore========>"+respBefore);
        System.out.println("urlBefore=========>"+urlBefore);
        System.out.println("urlPaginaBefore===>"+urlPaginaBefore);
        

        // Write code here to process the request and/or response before
        // the rest of the filter chain is invoked.

        // For example, a logging filter might log items on the request object,
        // such as the parameters.
	/*
         * for (Enumeration en = request.getParameterNames();
         * en.hasMoreElements(); ) { String name = (String)en.nextElement();
         * String values[] = request.getParameterValues(name); int n =
         * values.length; StringBuffer buf = new StringBuffer();
         * buf.append(name); buf.append("="); for(int i=0; i < n; i++) {
         * buf.append(values[i]); if (i < n-1) buf.append(","); }
         * log(buf.toString()); }
         */
    }    
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("Teste:DoAfterProcessing");
        }        
        HttpServletRequest  req     = (HttpServletRequest) request;
        HttpServletResponse resp    = (HttpServletResponse) response;
        String url       = req.getRequestURL().toString();
        String urlPagina = req.getRequestURI().substring(6);

        // Write code here to process the request and/or response after
        // the rest of the filter chain is invoked.

        // For example, a logging filter might log the attributes on the
        // request object after the request has been processed. 
	/*
         * for (Enumeration en = request.getAttributeNames();
         * en.hasMoreElements(); ) { String name = (String)en.nextElement();
         * Object value = request.getAttribute(name); log("attribute: " + name +
         * "=" + value.toString());
         *
         * }
         */

        // For example, a filter might append something to the response.
	/*
         * PrintWriter respOut = new PrintWriter(response.getWriter());
         * respOut.println("<P><B>This has been appended by an intrusive
         * filter.</B>");
         */
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
        FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest  req     = (HttpServletRequest) request;
        HttpServletResponse resp    = (HttpServletResponse) response;
        String url       = req.getRequestURL().toString();
        String urlPagina = req.getRequestURI().substring(8);
        String queryString = req.getQueryString();
        
        doBeforeProcessing(request, response);
        doAfterProcessing(request, response);
        
//      resolve o problema de acento.   
        response.setCharacterEncoding("UTF-8");        
        request.setCharacterEncoding("UTF-8");    
        
        System.out.println("ANTES DO IF ");
        System.out.println("URL--->"+url);    
        
        if(queryString != null && queryString.contains("code=")) {

           System.out.println("***AdminAuthFilters.doFilter - PONTO 2 ***");

            usuarioFace.setCodigoMELI(queryString.substring(5, queryString.length())); 
            req.getSession().setAttribute("code_auth", queryString.substring(5, queryString.length()));

        }        
        
        if (!url.contains("login")  && !url.contains("JPG") && !url.contains("jpg") &&
            !url.contains("PNG") && !url.contains("png")    &&
            !url.contains("PDF") && !url.contains("pdf")     ) {
            if (usuarioFace.isUserLogged()) {
                System.out.println("DENTRO DO IF ");
                System.out.println("URL--->"+url);    
                if (url.contains("/OnSysERPCloud/views") && (!url.contains("pesquisa")) && (!url.contains("dash") && (!url.contains("promo"))  && (!url.contains("favicon")))) { 
                    setIsAchei(false);
                    for (UsuarioPrograma usuarioPrograma : loginFace.getListUsrProg()) {    
                        if (urlPagina.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                            setIsAchei(true);                                
                            System.out. println("===FILTRO 1.01==> " + loginFace.getcCaminho());                                                        
                            System.out. println("===FILTRO 1.01a==> " + urlPagina);                                                                                
                            System.out. println("===FILTRO 1.01b==> " + usuarioPrograma.getPrograma().getCaminho());   
                            if (usuarioPrograma.getPrograma().isVermenu()) {
                                programaAtivo = usuarioPrograma.getPrograma();
                                logUsrProgAcessado = new LogUsrProgAcessado();
                                logUsrProgAcessado.setData(new Date());
                                logUsrProgAcessado.setEmpresa(usuarioFace.getEmpresa());
                                logUsrProgAcessado.setPrograma(programaAtivo);
                                logUsrProgAcessado.setUsuario(usuarioFace.getLoggedUser());
                                logUsrProgAcessadoSession.save(logUsrProgAcessado);
                            }
                            if (loginFace.getcCaminho() == null) {
                                System.out. println("===FILTRO 1.02==> "); 
                                List<UsuarioAtalho> rsAtalho = usuarioAtalhoSession.getByUsrLista(usuarioFace.getIdUsuario());
                                List<UsuarioAtalho> rsAtalho2 = null;
                                List<UsuarioAtalho> rsAtalho3 = null;
                                if (rsAtalho.size() == 0){
                                    for (int i = 1; i < 6; i++){
                                        if (i == 1){
                                            novoRegistro.setUsuario(usuarioPrograma.getUsuario());
                                            novoRegistro.setPrograma(usuarioPrograma.getPrograma());
                                        } else {
                                            novoRegistro.setUsuario(usuarioPrograma.getUsuario());
                                            novoRegistro.setPrograma(null);
                                        }
                                        novoRegistro.setId(null);
                                        novoRegistro.setSeq(i);
                                        if (usuarioPrograma.getPrograma().isVermenu()) {
                                            usuarioAtalhoSession.save(novoRegistro);
                                        }
                                    }
                                } else {
                                    rsAtalho3 = usuarioAtalhoSession.getUsrAtalhoByUsrPrg(usuarioFace.getIdUsuario(), usuarioPrograma.getPrograma().getId());
                                    if (rsAtalho3.size() == 0) {
                                        for (UsuarioAtalho usratalho : rsAtalho){
                                            novoRegistro = usratalho;
                                            if (usratalho.getSeq().equals(1)){
                                                novoRegistro.setPrograma(usuarioPrograma.getPrograma());
                                                if (usuarioPrograma.getPrograma().isVermenu()) {
                                                    usuarioAtalhoSession.set(novoRegistro);
                                                }
                                            } else {
                                                rsAtalho2 = usuarioAtalhoSession.getUsrAtalhoByUsrSeq(usuarioFace.getIdUsuario(),usratalho.getSeq() - 1);
                                                for (UsuarioAtalho usratalho2 : rsAtalho2){
                                                    if (usratalho2.getPrograma() != null){
                                                        novoRegistro.setPrograma(usratalho2.getPrograma());
                                                        if (usuarioPrograma.getPrograma().isVermenu()) {
                                                            usuarioAtalhoSession.set(novoRegistro);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } 
                    }                
                    if (isAchei) { 
                        chain.doFilter(request, response);                    
                        loginFace.setcCaminho(null);
                    } else {
    //                  userLogado.doLogOut();             
                        resp.sendRedirect("/OnSysERPCloud/erro.faces"); 
                        chain.doFilter(request, response); 
    //                  userLogado.doLogOut();             
                    }
                } else  {               
                    chain.doFilter(request, response);                
                }
            } else {
                resp.sendRedirect("/OnSysERPCloud/login.faces");            
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);                
        }    
    }
    
    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter 
     */
    public void destroy() {
    }

    /**
     * Init method for this filter 
     */
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {
                log("AdminAuthFilter:Initializing filter");
            }
        }
    }

    /**
     * Return a String representation of this object.
     */
    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("AdminAuthFilter()");
        }
        StringBuffer sb = new StringBuffer("AdminAuthFilter(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }
    
    public PhaseId getPhaseId() {  
        //return PhaseId.RESTORE_VIEW;  
        return PhaseId.RENDER_RESPONSE;  
    }  

    private void sendProcessingError(Throwable t, ServletResponse response) {
        String stackTrace = getStackTrace(t);

        if (stackTrace != null && !stackTrace.equals("")) {
            try {
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");
                pw.print(stackTrace);
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        }
    }

    public static String getStackTrace(Throwable t) {
        String stackTrace = null;
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {
        }
        return stackTrace;
    }

    public void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }

    public UsuarioPrograma getUsrProgramaValido() {
        return usrProgramaValido;
    }

    public void setUsrProgramaValido(UsuarioPrograma usrProgramaValido) {
        this.usrProgramaValido = usrProgramaValido;
    }

    public boolean isIsAchei() {
        return isAchei;
    }

    public void setIsAchei(boolean isAchei) {
        this.isAchei = isAchei;
    }

    public Integer getIdUsuarioValido() {
        return idUsuarioValido;
    }

    public void setIdUsuarioValido(Integer idUsuarioValido) {
        this.idUsuarioValido = idUsuarioValido;
    }

    public Programa getProgramaAtivo() {
        return programaAtivo;
    }

    public void setProgramaAtivo(Programa programaAtivo) {
        this.programaAtivo = programaAtivo;
    }
    
}