/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.ParamGerais;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.UsuRepres;
import br.com.onsys.entidades.seguranca.Modulo;
import br.com.onsys.entidades.seguranca.ModuloSubmodulo;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.SubmoduloPrograma;
import br.com.onsys.entidades.seguranca.UsuUsuMestre;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.seguranca.UsuarioAtalho;
import br.com.onsys.entidades.seguranca.UsuarioEmpresa;
import br.com.onsys.entidades.seguranca.UsuarioModulo;
import br.com.onsys.entidades.seguranca.UsuarioPrograma;
import br.com.onsys.entidades.suporte.UsuarioSuporte;
import br.com.onsys.model.AccessToken;
import br.com.onsys.session.basico.EmpresaSession;
import br.com.onsys.session.basico.ParamGeraisSession;
import br.com.onsys.session.seguranca.LoginSession;
import br.com.onsys.session.seguranca.ModuloSession;
import br.com.onsys.session.seguranca.UsuUsuMestreSession;
import br.com.onsys.session.seguranca.UsuarioAtalhoSession;
import br.com.onsys.session.seguranca.UsuarioEmpresaSession;
import br.com.onsys.session.seguranca.UsuarioSession;
import br.com.onsys.session.suporte.UsuarioSuporteSession;
import br.com.onsys.util.TrocarEmpresa;
import br.com.onsys.util.TrocarIdioma;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;
/**
 *
 * @author cristiano
 */
@Named
@SessionScoped
public class LoginFace extends BaseCDIBean<Usuario> {

    @Inject
    private LoginSession            loginSession;   
    //@Inject 
    //private TrocarIdioma            trocarIdioma;
    //@Inject 
    //private TrocarEmpresa           trocarEmpresa;    
    @Inject
    private UsuarioEmpresaSession   usuarioEmpresaSession;       
    //alrc - inicio
    //alrc - fim
    @Inject 
    private ParamGeraisSession      paramGeraisSession;
    @Inject
    private UsuarioSession          usuarioSession;  
    @Inject
    private UsuUsuMestreSession     usuUsuMestreSession;
    @Inject 
    private ModuloSession           moduloSession; 
    @Inject
    private EmpresaSession          empresaSession;
    @Inject 
    private UsuarioAtalhoSession    usuarioAtalhoSession;
    @Inject 
    private UsuarioSuporteSession   usuarioSuporteSession; 
    @Inject 
    private UsuarioEmpresaFace      usuarioEmpresaFace;
    @Inject 
    private ProgramaFace            programaFace;
    private List<UsuRepres>         listGerente             = null; 
    private boolean                 montarMenu = true;
    private DefaultMenuModel        menuModel;
    private List<UsuarioPrograma>   listUsrProg             = null;
    private List<Programa>          listPrograma            = null;
    private List<UsuRepres>         listUsuRepres           = null;
    private List<UsuUsuMestre>      listUsuUsuMestre        = null;
    private int i = 1;    
    private String                  cListaRepres = null;
    private String                  cCaminho = "";
    private String                  codigoMELI = null;
    private AccessToken             accessTokenML;          
    
    private String                  usuariosDoUsuarioMestre = null;    
    private List<UsuarioEmpresa>    listUsuarioEmpresa;
    private List<Empresa>           listEmpresas;
    private String                  login;
    private String                  senha;
    private Integer                 progress;
    private DefaultStreamedContent  logo        = new DefaultStreamedContent(); 
    
    private Empresa                 empresa;
    private Empresa                 empresaSelecionada;
    private ParamGerais             paramGerais = null;      
    private Representante           representante; 
    private Usuario                 usuarioLogado;    
    private UsuarioEmpresa          usuarioEmpresa;
    private ResourceBundle          rb;
    private Integer                 idUsuario   = null;
    
    public boolean isUserLogged() {
        return usuarioLogado != null;
    }
    
    public String executarLogin(String login, String senha) {
        
        setMontarMenu(true);

        //System.out.println("***IDIOMA SELECIONADO - PONTO 1***");
        //System.out.println("trocarIdioma.getIdiomaSelecionado()===>"+trocarIdioma.getIdiomaSelecionado());
        //System.out.println("***IDIOMA SELECIONADO - PONTO 2***");
        //System.out.println("***1-VERIFICA BEAN ATIVOS***");
        FacesContext context = FacesContext.getCurrentInstance();
        for (String bean : context.getExternalContext().getSessionMap().keySet()) {  
            if (!bean.contains("LoginFace") /*&& 
                !bean.contains("LockStore") && 
                !bean.contains("conversations") && 
                !bean.contains("LogicalViewMap") && 
                !bean.contains("TrocarIdioma")*/) {
            /*
            if (!bean.equals("org.jboss.weld.context.beanstore.http.LockStore") && 
                !bean.equals("com.sun.faces.renderkit.ServerSideStateHelper.LogicalViewMap") && 
                !bean.equals("org.jboss.weld.context.ConversationContext.conversations") && 
                !bean.equals("WELD_S#WELD%ManagedBean%OnSysERPCloud.war.bda|OnSysERPCloud.war|br.com.onsys.faces.seguranca.LoginFace|null|0") && 
                !bean.equals("WELD_S#WELD%ManagedBean%OnSysERPCloud.war.bda|OnSysERPCloud.war|br.com.onsys.util.TrocarIdioma|null|0") && 
                !bean.equals("javax.faces.request.charset"))  {
            */    
                context.getExternalContext().getSessionMap().remove(bean) ;
                
            }
            
            System.out.println("bean===>"+bean);
        }        
        System.out.println("***2-VERIFICA BEAN ATIVOS***");                
        String selecionou = "NAO";
        
        //HttpSession session = (HttpSession) context.getExternalContext().getSession(true);         
        //session.invalidate();
        //session = (HttpSession) context.getExternalContext().getSession(true);        

        
//        if (trocarIdioma.getIdiomaSelecionado()== null) {
//            trocarIdioma.setIdiomaSelecionado("pt");
//        }
        
 //       rb = ResourceBundle.getBundle("messages", new Locale(trocarIdioma.getIdiomaSelecionado(),trocarIdioma.getIdiomaSelecionado()));
        try {
            
            System.out.println("***LOGIN A***");
            System.out.println("***LOGIN===>"+login.trim());
            System.out.println("***SENHA===>"+senha);
            
            usuarioLogado = loginSession.idUsuarioOk(login.trim(),senha);
   //         trocarIdioma.setIdiomaSelecionado(usuarioLogado.getIdiomaPadrao());
            
            System.out.println("***LOGIN B***");
            
            //rb = ResourceBundle.getBundle("messages", new Locale(trocarIdioma.getIdiomaSelecionado(),trocarIdioma.getIdiomaSelecionado()));            
            rb = ResourceBundle.getBundle("messages", new Locale("pt","pt")); 
            
            System.out.println("***LOGIN C***");
            
            empresa = usuarioLogado.getEmpresa();
            if (usuarioLogado.getInativo() != null) {
                if (usuarioLogado.getInativo().equals("S")) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Usuário inativo. Login não permitido"));
                    return null;            
                }
            }
            System.out.println("usuario===>"+usuarioLogado.getApelido());
            System.out.println("empresa"+empresa.getNomeFantasia());
            try {
                paramGerais = paramGeraisSession.getByEmpresa(empresa.getId());
            } catch (Exception e) {
            }
            
            listUsuarioEmpresa = usuarioEmpresaSession.getAllByUsuario(usuarioLogado);
            
            listEmpresas = new ArrayList<Empresa>();
            System.out.println("***LOGIN 1***");
            for (UsuarioEmpresa usuarioEmpresa : listUsuarioEmpresa) {
                System.out.println("***LOGIN 2***");
                listEmpresas.add(usuarioEmpresa.getEmpresa());
            }
            
            System.out.println("***LOGIN 3.3***");            
            for (Empresa empresa : listEmpresas) {
                System.out.println("***EMPRESA===>"+empresa.getCodigo());
            }
            
            UsuarioSuporte usuarioSuporte;
            try {
                usuarioSuporte = usuarioSuporteSession.getByUsuario(usuarioLogado.getId(), usuarioLogado.getEmpresa().getId());
            } catch (Exception e) {
                usuarioSuporte = null;
                listUsuUsuMestre = new ArrayList<UsuUsuMestre>();                 
            }
 
            try {
                
                System.out.println("***LOGIN 3.4***");
                if (usuarioSuporte != null && usuarioSuporte.isAdmSuporte()){   //ADMINISTRADOR DO MODULO DE SUPORTE 
                    listUsuUsuMestre = new ArrayList<UsuUsuMestre>(); 
                } else {
                    try {

                        System.out.println("***ID DA EMPRESA***");
                        System.out.println("ID===>"+usuarioLogado.getEmpresa().getId());
                        System.out.println("***ID DO USUARIO***");
                        System.out.println("ID===>"+usuarioLogado.getId());

                        listUsuUsuMestre = usuUsuMestreSession.getAllByUsrMestre(usuarioLogado.getEmpresa().getId(), usuarioLogado.getId()); 
                    } catch (Exception e) {
                        listUsuUsuMestre = new ArrayList<UsuUsuMestre>(); 
                    }
                }
            } catch (Exception e) {
                
            }
            
            System.out.println("***LOGIN 3.5***");            
            if (usuarioLogado.isAprovaPDV()) {
                listUsuRepres = new ArrayList<UsuRepres>(); 
            } else {

                //System.out.println("listUsuRepres===>"+listUsuRepres);

                try {
                    if (!listUsuRepres.isEmpty()) {
                        for (UsuRepres t : listUsuRepres) {
                        }
                    }
                    if (!listGerente.isEmpty()) {
                        for (UsuRepres t : listGerente) {
                            if (t.getUsuario().getTipo().equals("Supervisor")) {
                                //System.out.println("GERENTE---------->"+t.getUsuario().getApelido());
                                //System.out.println("TIPO DE USUARIO-->"+t.getUsuario().getTipo());
                            }
                        }
                    }

                } catch (Exception e) {
                    listGerente = new ArrayList<UsuRepres>(); 
                }
            }       
            
            //System.out.println("***LOGIN 3.6***");
            usuariosDoUsuarioMestre ="";
            if (!listUsuUsuMestre.isEmpty()) { 
                //System.out.println("ANTES DO DO FOR -- USUARIO MESTRE 1");
                for (UsuUsuMestre usuarioMestre : listUsuUsuMestre) {

                    //System.out.println("***DENTRO DO FOR -- USUARIO MESTRE 1");

                    if (!usuariosDoUsuarioMestre.isEmpty()) { 
                        usuariosDoUsuarioMestre = usuariosDoUsuarioMestre + "," + usuarioMestre.getUsuario().getId().toString();
                    } else {
                        usuariosDoUsuarioMestre = usuarioMestre.getUsuario().getId().toString();
                    }
                }
            }            
           
            //System.out.println("***LOGIN 3.7***");            
            cListaRepres = "";
            if (!listUsuRepres.isEmpty()) { 
                //System.out.println("ANTES DO DO FOR --  1");
                for (UsuRepres usuRepres : listUsuRepres) {

                    //System.out.println("***DENTRO DO FOR --  1");

                    if (!cListaRepres.isEmpty()) { 
                        cListaRepres = cListaRepres + "," + usuRepres.getRepresentante().getId().toString();
                    } else {
                        cListaRepres = usuRepres.getRepresentante().getId().toString();
                    }
                }
            }

            //System.out.println("***LOGIN 3.7.A***");
            //System.out.println("cListaRepres===>"+cListaRepres);
            
            try {
                
                //System.out.println("***VERIFICA SE USUARIOEMPRESA EXISTE***");
                //System.out.println("***ID USR=======>"+usuarioLogado.getId());
                //System.out.println("***ID EMPRESA===>"+usuarioLogado.getEmpresa());
                
                usuarioEmpresa = usuarioEmpresaSession.getUsuarioEmpresa(usuarioLogado.getEmpresa().getId(), usuarioLogado.getId());
                
                //System.out.println("EMPRESA===========>"+usuarioEmpresa.getEmpresa().getNomeFantasia());
                //System.out.println("ESTABELECIMENTO===>"+usuarioEmpresa.getEstabelecimento().getNomefantasia());
                
            } catch (Exception e) {
                
                //System.out.println("***NÃO EXISTE USUARIOEMPRESA***");
                UsuarioEmpresa novoRegistro = new UsuarioEmpresa();
                novoRegistro.setEmpresa(usuarioLogado.getEmpresa());
                novoRegistro.setUsuario(usuarioLogado);
                novoRegistro.setEstabelecimento(usuarioLogado.getEstabelecimento());
                usuarioEmpresaSession.save(novoRegistro);
                usuarioEmpresa = usuarioEmpresaSession.getUsuarioEmpresa(usuarioLogado.getEmpresa().getId(), usuarioLogado.getId());
                
            }
            
            //System.out.println("***APOS O FOR***");
            //System.out.println("cListaRepres===>"+cListaRepres);


            if ("".equals(cListaRepres)  && !usuarioLogado.isAprovaPDV()) {
                try {                     
                    cListaRepres = representante.getId().toString();
                } catch (Exception e) {

                }
            }
                
            idUsuario       = usuarioLogado.getId();
            
        // *************************** SELECAO TO CAPTCHA ***************************************
            /*
            try {
                String gRercaptchaResponse = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("g-recaptcha-response");

                boolean verifica = VerifyRecaptcha.veryfy(gRercaptchaResponse);
                //boolean verifica = true;

                if (verifica){
                    selecionou = "SIM";
                //    return "Sucesso";
                }else{
                    selecionou = "NAO";
                                        
                    FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Aviso.","seleciona Captcha.");
                    FacesContext.getCurrentInstance().addMessage("seleciona Captcha.", fm);
                    return null;
                }

            } catch (Exception e){
                FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Aviso.","seleciona Captcha.");
                FacesContext.getCurrentInstance().addMessage("seleciona Captcha.", fm);
                return null;
            }
            
            */
        // **************************** FINAL DA SELEÇÃO *****************************************
    
            //alrc - inicio            
            //TESTE NOVO LOGIN MULTI-EMPRESAusuarioEmpresaFace.listaUsuarioEmpresas();
            //alrc - fim
            
            //return "dashboard.faces?faces-redirect=true";            
            
            try {
                
                //System.out.println("***VOU ATUALIZAR DASHBOARD***");
                
            } catch (Exception e) {
                
                //System.out.println("***ERRO AO ATUALIZAR DASHBOARD***");
                
            }
            
            try {
                
                //System.out.println("UsuarioFace.getLogoimg() - PONTO 1 ->"+logo);

                if(empresa.getLogoimg() != null) {
                    InputStream img = new ByteArrayInputStream((byte[]) empresa.getLogoimg());
                }            

                System.out.println("UsuarioFace.getLogoimg() - PONTO 2 ->"+logo);        
                
            } catch (Exception e) {
                
                //System.out.println("***CARREGANDO LOGO");
            }
            
            try {
                if (usuarioEmpresa.getDashboard() != null && !usuarioEmpresa.getDashboard().equals("")) {
                    //System.out.println("***CHAMAR DASHBOARD PONTO 1***");
                   // System.out.println("usuarioEmpresa.getDashboard().trim()===>"+usuarioEmpresa.getDashboard().trim());
                    return usuarioEmpresa.getDashboard().trim();
                } else if (usuarioLogado.getTipo().equals("Administrador")){
                    //System.out.println("***CHAMAR DASHBOARD PONTO 2***");
                    return "/dashboard.faces?faces-redirect=true";
                } else if (usuarioLogado.getTipo().equals("Consultor")){
                    //System.out.println("***CHAMAR DASHBOARD PONTO 3***");
                    return "dashboardConsultor.faces?faces-redirect=true";
                } else if (usuarioLogado.getTipo().equals("Representante")){
                    //System.out.println("***CHAMAR DASHBOARD PONTO 4***");
                    return "/dashboardRepresentante.faces?faces-redirect=true";
                } else {          
                    //System.out.println("***CHAMAR DASHBOARD PONTO 5***");
                    return "/dashboard.faces?faces-redirect=true";
                }
            } catch (Exception e) {
                return "/dashboard.faces?faces-redirect=true";                
            }
            
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Identificação inválida"));
            return null;            
        }
        
    }

    public String logout() {   
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
        setUsuarioLogado(null);
        setEmpresa(new Empresa());
        setParamGerais(new ParamGerais()); 
        return "/login.faces?faces-redirect=true";
    } 
    
    /*
    public void trocarIdioma() {
        trocarIdioma.setIdiomaSelecionado(usuarioLogado.getIdiomaPadrao());
        rb = ResourceBundle.getBundle("messages", new Locale(trocarIdioma.getIdiomaSelecionado(),trocarIdioma.getIdiomaSelecionado()));            
    }    
    
    public void trocarEmpresa() {
        System.out.println("***TROCAR EMPRESA***");
        System.out.println("usuarioLogado.getEmpresa()===>"+usuarioLogado.getEmpresa().getCodigo());
        trocarEmpresa.setEmpresaSelecionada(usuarioLogado.getEmpresa());
        empresa = usuarioLogado.getEmpresa();
        rb = ResourceBundle.getBundle("messages", new Locale(trocarIdioma.getIdiomaSelecionado(),trocarIdioma.getIdiomaSelecionado()));   
        System.out.println("***FIM TROCAR EMPRESA***");
    }  
       */ 
    public void submit() {
        System.out.println("***LoginFace.submit***");
        try {
            System.out.println("***LoginFace.submit-1***");
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
            FacesContext.getCurrentInstance().addMessage(null, msg);            
        } catch (Exception e) {
            System.out.println("***LoginFace.submit-2***");
        }
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
    
    public ParamGerais getParamGerais() {
        return paramGerais;
    }

    public void setParamGerais(ParamGerais paramGerais) {
        this.paramGerais = paramGerais;
    }
    
    public DefaultStreamedContent getLogo() {
        
        System.out.println("UsuarioFace.getLogoimg() - PONTO 1 ->"+logo);
        
        if(empresa.getLogoimg() != null) {
        }            
        
        System.out.println("UsuarioFace.getLogoimg() - PONTO 2 ->"+logo);        
        
        return logo;
    }

    public void setLogo(DefaultStreamedContent logo) {
        this.logo = logo;
    }    
    
    public String atalhoTitulo(int iAtalho){
        String cTituloMenu = null;
        List<UsuarioAtalho> rsAtalho = usuarioAtalhoSession.getByUsr(usuarioLogado.getId());
        for (UsuarioAtalho usratalho : rsAtalho){
            if (usratalho.getSeq().equals(iAtalho) && usratalho.getPrograma() != null){
                cTituloMenu = usratalho.getPrograma().getDescatalho();
            }
        }
        return cTituloMenu;
    }

    public String atalhoPrograma(int iAtalho){
        cCaminho = null;
        List<UsuarioAtalho> rsAtalho = usuarioAtalhoSession.getByUsr(usuarioLogado.getId());        
        for (UsuarioAtalho usratalho : rsAtalho){            
            //System.out.println("===6.01==> " + iAtalho);                        
            if (usratalho.getSeq().equals(iAtalho) && usratalho.getPrograma() != null){                                
                //System.out.println("===6.01.A==> " + usratalho.getPrograma().getCaminho());                                            
                cCaminho = usratalho.getPrograma().getCaminho() + "?faces-redirect=true";
            }
        }        
        //System.out. println("===6==> " + cCaminho);
        return cCaminho ;
    }
    
    public void trocarEmpresa() {
        System.out.println("***TROCAR EMPRESA***");
        System.out.println("EMPRESA DA SESSAO=============>"+usuarioEmpresaFace.getEmpresaSessao().getNomeFantasia());
        System.out.println("usuarioEmpresa.getEmpresa()===>"+usuarioEmpresa.getEmpresa().getNomeFantasia());
        System.out.println("usuarioLogado.getEmpresa()====>"+usuarioLogado.getEmpresa().getNomeFantasia());
        
        //usuarioEmpresaFace.setEmpresaSessao(empresa);
        //usuarioEmpresa.setEmpresa(usuarioEmpresaFace.getEmpresaSessao());
        usuarioLogado.setEmpresa(usuarioEmpresaFace.getEmpresaSessao());
        //usuarioEmpresaSession.set(usuarioEmpresa);
        usuarioSession.set(usuarioLogado);
        setEmpresa(usuarioEmpresaFace.getEmpresaSessao());
        programaFace.limparFiltros();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção : ", "Empresa alterada com sucesso."));
        try {
            setMontarMenu(true);
            menuXhtml();
        } catch (Exception e) {
        }        
    }
    
    public MenuModel menuXhtml() {  
        //menuModel = new DefaultMenuModel();
        String contextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();

        System.out.println("menuXhtml()");        
        System.out.println("montarMenu===>"+montarMenu);

        try {
            if (getUsuarioLogado().getEmpresa().isExpandeMenu()) {
                montarMenu = true;
            }            
        } catch (Exception e) {
            montarMenu = true;
        }
        
        if (montarMenu) {            
            System.out.println("menuXhtml().PONTO 1");            
            menuModel = new DefaultMenuModel();

            //DefaultMenuItem progrFav = new DefaultMenuItem();
            //progrFav.setIcon("icon-star-1");
            //progrFav.setValue("Favoritos");
            //progrFav.setUrl("/views/listFavoritos.faces");
            //progrFav.setStyle("background-size: auto;");
            //progrFav.setTitle("Lista os programas favoritos do usuário.");

            //menuModel.addElement(progrFav); 

            //DefaultMenuItem progrQuadro = new DefaultMenuItem();
            //progrQuadro.setIcon("icon-megaphone");
            //progrQuadro.setValue("Quadro de avisos");
            //progrQuadro.setUrl("/avisos.faces?faces-redirect=true");
            //progrQuadro.setStyle("background-size: auto; ");
            //progrQuadro.setTitle("Quadro de avisos.");            
            //menuModel.addElement(progrQuadro);             

            /* INICIO TESTE CCA             
            try {
                if (usuarioEmpresa.getDashboard() != null) {
                    DefaultMenuItem progrDash = new DefaultMenuItem();
                    progrDash.setIcon("pi pi-home");
                    progrDash.setValue("Dashboard");
                    progrDash.setUrl(usuarioEmpresa.getDashboard().trim());
                    progrDash.setStyle("background-size: auto; ");
                    menuModel.getElements().add(progrDash); 
                } else { 
                    DefaultMenuItem progrDash = new DefaultMenuItem();
                    progrDash.setIcon("pi pi-home");
                    progrDash.setValue("Dashboard");
                    //progrDash.setUrl("/dashboard.faces?faces-redirect=true");
                    progrDash.setUrl(usuarioEmpresa.getDashboard().trim());
                    progrDash.setStyle("background-size: auto; ");
                    menuModel.getElements().add(progrDash); 
                }            
            } catch (Exception e) {
            }
            FIM TESTE CCA */
           
            System.out.println("***menuXhtml().VERIFICAR USUARIO LOGADO***");
            System.out.println("E-MAIL=======>"+usuarioLogado.getEmail());
            System.out.println("ID USUARIO===>"+getUsuarioLogado().getId());
            System.out.println("EMPRESA======>"+usuarioLogado.getEmpresa().getCodigo());
            
/*            
            if (usuarioLogado.getEmail().equals("adm@onsys.com.br")) {
                
                System.out.println("***MONTAGEM DO MENU PONTO 1***");
                
                listUsrProg     = new ArrayList<UsuarioPrograma>();                
                listPrograma    = new ArrayList<Programa>();                        
                List<UsuarioModulo> rsModulo = usuarioSession.getAllModulosUsuario(getUsuarioLogado().getId());        
                for (UsuarioModulo usrmodulo : rsModulo) { 
                    
                    System.out.println("***MONTAGEM DO MENU PONTO 1.1***");
                    
                    DefaultSubMenu modulo = new DefaultSubMenu();  
                    modulo.setExpanded(true);
                    modulo.setLabel(usrmodulo.getModulo().getDescricaomenu());
                    if (usrmodulo.getModulo().getIcone().equals("") || usrmodulo.getModulo().getIcone() == null){
                        modulo.setIcon("icon-sitemap");            
                    } else {
                       modulo.setIcon(usrmodulo.getModulo().getIcone().trim()); 
                    }
                    menuModel.addElement(modulo);
                    List<ModuloSubmodulo> rsSubmodulo = usuarioSession.getAllSubModuloModulo(1, usrmodulo.getModulo().getId());
                    for (ModuloSubmodulo moduloSubmodulo : rsSubmodulo) {  
                        DefaultSubMenu menu = new DefaultSubMenu();                 
                        menu.setLabel(moduloSubmodulo.getSubmodulo().getDescricaomenu());
                        menu.setIcon("icon-folder-empty");              
                        menu.setExpanded(true);
                        modulo.getElements().add(menu);
                        List<SubmoduloPrograma> rsPrograma = usuarioSession.getAllProgSubmodulo(1, moduloSubmodulo.getSubmodulo().getId());
                        for (SubmoduloPrograma submoduloPrograma : rsPrograma) {   
                            System.out.println("UsuarioFace.menuXhtml");
                            //System.out.println("Empresa --->"+usuarioLogado.getEmpresa().getId());
                            //System.out.println("Programa--->"+submoduloPrograma.getPrograma().getCodigo());            
                            //System.out.println("URL     --->"+submoduloPrograma.getPrograma().getCaminho());            
                            UsuarioPrograma toAdd = new UsuarioPrograma();                    
                            Programa toAddProg    = new Programa();                    

                            toAdd.setId(i++);                    
                            toAdd.setEmpresa(usuarioLogado.getEmpresa());
                            toAdd.setUsuario(usuarioLogado); 
                            toAdd.setConsultar(submoduloPrograma.isConsultar());
                            toAdd.setEditar(submoduloPrograma.isEditar());
                            toAdd.setIncluir(submoduloPrograma.isIncluir());
                            toAdd.setRemover(submoduloPrograma.isRemover());                    
                            toAdd.setPrograma(submoduloPrograma.getPrograma());  
                            DefaultMenuItem programa = new DefaultMenuItem();
                            //MenuItem programa = new MenuItem();  
                            programa.setValue(submoduloPrograma.getPrograma().getDescricaomenu());
                            programa.setIcon("icon-link"); 
                            programa.setUrl(submoduloPrograma.getPrograma().getCaminho());

                            listUsrProg.add(toAdd);                    
        //                    if (submoduloPrograma.getPrograma().isVermenu() || "BAS0000".equals(submoduloPrograma.getPrograma().getCodigo()) ) {
                            if (submoduloPrograma.getPrograma().isVermenu()) {

                                System.out.println("***CRIANDO PROGRAMA DE MENU***");

                                toAddProg.setCaminho(submoduloPrograma.getPrograma().getCaminho());
                                toAddProg.setCodigo(submoduloPrograma.getPrograma().getCodigo());                        
                                toAddProg.setDescricao(submoduloPrograma.getPrograma().getDescricao());
                                toAddProg.setDescricaomenu(submoduloPrograma.getPrograma().getDescricaomenu());
                                toAddProg.setEmpresa(submoduloPrograma.getPrograma().getEmpresa());                        
                                toAddProg.setId(submoduloPrograma.getPrograma().getId());                        
                                toAddProg.setVermenu(submoduloPrograma.getPrograma().isVermenu());      

                                listPrograma.add(toAddProg);
                                menu.getElements().add(programa);                           
                            }
                        } 
                    } 
                }
                
            } else { 
*/
                System.out.println("***menuXhtml().MONTAGEM DO MENU PONTO 2***");
                /*
                if (usuarioLogado.getEmpresa().getId() == 12){
                    DefaultMenuItem progrPromv = new DefaultMenuItem();
                    progrPromv.setIcon("icon-cube");
                    progrPromv.setValue("Promoções em vigor");
                    progrPromv.setUrl("/viewsBotafogo/promocao.faces");
                    progrPromv.setStyle("background-size: auto;");
                    progrPromv.setTitle("Produtos em promoção.");
                    menuModel.addElement(progrPromv);
                }    
                */
                System.out.println("***USUARIO***");
                System.out.println("LoginFace.MenuModel===>usuarioLogado.getNome()"+usuarioLogado.getEmail());
                
                System.out.println("***PONTO 0 - MONTAGEM DO MODULO ADMINISTRADOR***");
                
                /* ADICIONA MODULO ADMINISTRADOR DO SISTEMA, PARA O USUARIO ADM DA ONSYS */         
                if (usuarioLogado.getEmail().equals("adm@onsys.com.br")) { 
                    
                    listUsrProg     = new ArrayList<UsuarioPrograma>();                
                    listPrograma    = new ArrayList<Programa>();                      
                    
                    DefaultSubMenu modulo = new DefaultSubMenu();
                    modulo.setExpanded(false);
                    modulo.setLabel("Admin");
                    modulo.setIcon("icon-user"); 
                    menuModel.getElements().add(modulo);
                   
                    Modulo  moduloAdm  = moduloSession.getById(Integer.parseInt("8638669"));
                    Empresa empresaAdm = empresaSession.getById(Integer.parseInt("1"));
                    
                    List<ModuloSubmodulo> rsSubmodulo = usuarioSession.getAllSubModuloModulo(empresaAdm.getId(), moduloAdm.getId());
                    for (ModuloSubmodulo moduloSubmodulo : rsSubmodulo) {  
                        
                        System.out.println("***PONTO 0 - MONTAGEM DO MENU ADM PONTO 2.0***");
                        
                        DefaultSubMenu menu = new DefaultSubMenu();                 
                        menu.setLabel(moduloSubmodulo.getSubmodulo().getDescricaomenu());
                        menu.setIcon("icon-folder-empty");              
                        menu.setExpanded(false);
                        modulo.getElements().add(menu);
                        List<SubmoduloPrograma> rsPrograma = usuarioSession.getAllProgSubmodulo(empresaAdm.getId(), moduloSubmodulo.getSubmodulo().getId());
                        for (SubmoduloPrograma submoduloPrograma : rsPrograma) {   
                            
                            System.out.println("***PONTO 0 - MONTAGEM DO MENU ADM PONTO 2.1***");
                            
                            System.out.println("UsuarioFace.menuXhtml");
                            System.out.println("Empresa --->"+empresaAdm.getId());
                            System.out.println("Programa--->"+submoduloPrograma.getPrograma().getCodigo());            
                            System.out.println("URL     --->"+submoduloPrograma.getPrograma().getCaminho());            
                            UsuarioPrograma toAdd = new UsuarioPrograma();                    
                            Programa toAddProg    = new Programa();                    

                            toAdd.setId(i++);                    
                            toAdd.setEmpresa(empresaAdm);
                            toAdd.setUsuario(usuarioLogado); 
                            toAdd.setConsultar(true);
                            toAdd.setEditar(true);
                            toAdd.setIncluir(true);
                            toAdd.setRemover(true);                    
                            toAdd.setPrograma(submoduloPrograma.getPrograma());  
                            DefaultMenuItem programa = new DefaultMenuItem();
                            //MenuItem programa = new MenuItem();  
                            programa.setValue(submoduloPrograma.getPrograma().getDescricaomenu());
                            programa.setIcon("icon-link"); 
                            programa.setUrl("1-OnSysERPCloud/"+submoduloPrograma.getPrograma().getCaminho());

                            listUsrProg.add(toAdd);                    
        //                    if (submoduloPrograma.getPrograma().isVermenu() || "BAS0000".equals(submoduloPrograma.getPrograma().getCodigo()) ) {
                            if (submoduloPrograma.getPrograma().isVermenu()) {

                                System.out.println("***PONTO 0 - CRIANDO PROGRAMA DO MENU ADM***");

                                toAddProg.setCaminho("2-OnSysERPCloud/"+submoduloPrograma.getPrograma().getCaminho());
                                toAddProg.setCodigo(submoduloPrograma.getPrograma().getCodigo());                        
                                toAddProg.setDescricao(submoduloPrograma.getPrograma().getDescricao());
                                toAddProg.setDescricaomenu(submoduloPrograma.getPrograma().getDescricaomenu());
                                toAddProg.setEmpresa(empresaAdm);                        
                                toAddProg.setId(submoduloPrograma.getPrograma().getId());                        
                                toAddProg.setVermenu(submoduloPrograma.getPrograma().isVermenu());      

                                    listPrograma.add(toAddProg);
                                menu.getElements().add(programa);                           
                            }
                        } 
                    }
                }
                
                listUsrProg     = new ArrayList<UsuarioPrograma>();                
                listPrograma    = new ArrayList<Programa>();                        
                List<UsuarioModulo> rsModulo = usuarioSession.getAllModuloUsr(getUsuarioLogado().getEmpresa().getId(), getUsuarioLogado().getId());        
                for (UsuarioModulo usrmodulo : rsModulo) { 
                    
                    String icone = "pi pi-align-left";
                    
                    if (usrmodulo.getModulo().getDescricaomenu().contains("Financeiro")) {
                        icone ="pi pi-dollar";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Comercial")) {
                        icone ="pi pi-shopping-cart";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Suprimentos")) {
                        icone ="pi pi-sync";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Segurança")) {
                        icone ="pi pi-user";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Suporte")) {
                        icone ="pi pi-question-circle";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Básico")) {
                        icone ="pi pi-sitemap";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Logística")) {
                        icone ="pi pi-qrcode";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Frota")) {
                        icone ="pi pi-car";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Contabilidade")) {
                        icone ="pi pi-book";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Manufatura")) {
                        icone ="pi pi-cog";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Projetos")) {
                        icone ="pi pi-share-alt";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Controladoria")) {
                        icone ="pi pi-book";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("SAC")) {
                        icone ="pi pi-phone";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Serviços")) {
                        icone ="pi pi-building";
                    } else if (usrmodulo.getModulo().getDescricaomenu().contains("Marketplace")) {
                        icone ="pi pi-shopping-bag";
                    }
                    
                    DefaultSubMenu modulo = new DefaultSubMenu();  
                    modulo.setExpanded(false);
                    modulo.setLabel(usrmodulo.getModulo().getDescricaomenu());
                    if (usrmodulo.getModulo().getIcone().equals("") || usrmodulo.getModulo().getIcone() == null){
                        modulo.setIcon(icone);            
                    } else {
                       modulo.setIcon(icone); 
                    }
                    
                    System.out.println("***VERIFICA MODULOS***");
                    
                    menuModel.getElements().add(modulo);                    

                    System.out.println("ID EMPRESA===>"+getUsuarioLogado().getEmpresa().getId());
                    System.out.println("ID MODULO====>"+usrmodulo.getModulo().getId());
                    
                    List<ModuloSubmodulo> rsSubmodulo = usuarioSession.getAllSubModuloModulo(getUsuarioLogado().getEmpresa().getId(), usrmodulo.getModulo().getId());
                    for (ModuloSubmodulo moduloSubmodulo : rsSubmodulo) {  
                        
                        System.out.println("***MONTAGEM DO MENU PONTO 2.0***");
                        
                        DefaultSubMenu menu = new DefaultSubMenu();                 
                        menu.setLabel(moduloSubmodulo.getSubmodulo().getDescricaomenu());
                        menu.setIcon("icon-folder-empty");              
                        menu.setExpanded(false);
                        modulo.getElements().add(menu);
                        List<SubmoduloPrograma> rsPrograma = usuarioSession.getAllProgSubmodulo(getUsuarioLogado().getEmpresa().getId(), moduloSubmodulo.getSubmodulo().getId());
                        for (SubmoduloPrograma submoduloPrograma : rsPrograma) {   
                            
                            System.out.println("***MONTAGEM DO MENU PONTO 2.1***");
                            
                            System.out.println("UsuarioFace.menuXhtml");
                            System.out.println("Empresa --->"+usuarioLogado.getEmpresa().getId());
                            System.out.println("Programa--->"+submoduloPrograma.getPrograma().getCodigo());            
                            System.out.println("URL     --->"+submoduloPrograma.getPrograma().getCaminho());            
                            UsuarioPrograma toAdd = new UsuarioPrograma();                    
                            Programa toAddProg    = new Programa();                    
                            
                            toAdd.setId(i++);                    
                            toAdd.setEmpresa(usuarioLogado.getEmpresa());
                            toAdd.setUsuario(usuarioLogado); 
                            toAdd.setConsultar(submoduloPrograma.isConsultar());
                            toAdd.setEditar(submoduloPrograma.isEditar());
                            toAdd.setIncluir(submoduloPrograma.isIncluir());
                            toAdd.setRemover(submoduloPrograma.isRemover());                    
                            toAdd.setPrograma(submoduloPrograma.getPrograma());  
                            DefaultMenuItem programa = new DefaultMenuItem();
                            //MenuItem programa = new MenuItem();  
                            programa.setValue(submoduloPrograma.getPrograma().getDescricaomenu());
                            programa.setIcon("icon-link"); 
                            //programa.setHref("OnSysERPCloud");
                            
                            String url = null;
                            
                            if (submoduloPrograma.getPrograma().getCaminho() != null && submoduloPrograma.getPrograma().getCaminho().isEmpty()) {
                                url = "/" ;
                            } else {
                                url = contextPath + submoduloPrograma.getPrograma().getCaminho();
                            }
                            
                            programa.setUrl(url);

                            listUsrProg.add(toAdd);                    
        //                    if (submoduloPrograma.getPrograma().isVermenu() || "BAS0000".equals(submoduloPrograma.getPrograma().getCodigo()) ) {
                            if (submoduloPrograma.getPrograma().isVermenu()) {

                                System.out.println("***CRIANDO PROGRAMA DE MENU***");
                                String caminho = null;
                                if (submoduloPrograma.getPrograma().getCaminho() != null && submoduloPrograma.getPrograma().getCaminho().isEmpty()) {
                                    caminho = submoduloPrograma.getPrograma().getCaminho();
                                } else {
                                    caminho = "https://onsyserpcloud.com.br/";
                                }
                                
                                System.out.println("CODIGO    PROGRAMA===>"+submoduloPrograma.getPrograma().getCodigo());                                
                                System.out.println("DESCRICAO PROGRAMA===>"+submoduloPrograma.getPrograma().getDescricao());
                                System.out.println("CAMINHO           ===>"+caminho);
                                System.out.println("CAMINHO   PROGRAMA===>"+submoduloPrograma.getPrograma().getCaminho());                                
                                
                                toAddProg.setCaminho("4-OnSysERPCloud/"+caminho);
                                toAddProg.setCodigo(submoduloPrograma.getPrograma().getCodigo());                        
                                toAddProg.setDescricao(submoduloPrograma.getPrograma().getDescricao());
                                toAddProg.setDescricaomenu(submoduloPrograma.getPrograma().getDescricaomenu());
                                toAddProg.setEmpresa(submoduloPrograma.getPrograma().getEmpresa());                        
                                toAddProg.setId(submoduloPrograma.getPrograma().getId());                        
                                toAddProg.setVermenu(submoduloPrograma.getPrograma().isVermenu());
                                listPrograma.add(toAddProg);
                                menu.getElements().add(programa);       
                                
                            }
                        } 
                    } 
                } 
            
            //}

            DefaultMenuItem progrYouTube = new DefaultMenuItem();
            progrYouTube.setIcon("pi pi-youtube");
            progrYouTube.setValue("Canal OnSys");
            progrYouTube.setUrl("https://www.youtube.com/channel/UCtdhH_K-r6RyapfvnOJEUEA/videos");
            progrYouTube.setStyle("background-size: auto; ");
            progrYouTube.setTitle("Video aulas de ajuda e/ou treinamento.");
            menuModel.getElements().add(progrYouTube);
            montarMenu = false;
        }
        
        return menuModel;
        
    }        

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public List<UsuarioPrograma> getListUsrProg() {
        return listUsrProg;
    }

    public void setListUsrProg(List<UsuarioPrograma> listUsrProg) {
        this.listUsrProg = listUsrProg;
    }

    public ResourceBundle getRb() {
        return rb;
    }

    public void setRb(ResourceBundle rb) {
        this.rb = rb;
    }

    public String getcListaRepres() {
        return cListaRepres;
    }

    public void setcListaRepres(String cListaRepres) {
        this.cListaRepres = cListaRepres;
    }

    public String getUsuariosDoUsuarioMestre() {
        return usuariosDoUsuarioMestre;
    }

    public void setUsuariosDoUsuarioMestre(String usuariosDoUsuarioMestre) {
        this.usuariosDoUsuarioMestre = usuariosDoUsuarioMestre;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public String getcCaminho() {
        return cCaminho;
    }

    public void setcCaminho(String cCaminho) {
        this.cCaminho = cCaminho;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public String getCodigoMELI() {
        return codigoMELI;
    }

    public void setCodigoMELI(String codigoMELI) {
        this.codigoMELI = codigoMELI;
    }
    
    public void setAccessTokenML(AccessToken accessTokenML) {
        this.accessTokenML = accessTokenML;
    }

    public AccessToken getAccessTokenML() {
        return accessTokenML;
    }

    public UsuarioEmpresa getUsuarioEmpresa() {
        return usuarioEmpresa;
    }

    public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
        this.usuarioEmpresa = usuarioEmpresa;
    }

    public boolean isMontarMenu() {
        return montarMenu;
    }

    public void setMontarMenu(boolean montarMenu) {
        this.montarMenu = montarMenu;
    }

    public Empresa getEmpresaSelecionada() {
        return empresaSelecionada;
    }

    public void setEmpresaSelecionada(Empresa empresaSelecionada) {
        this.empresaSelecionada = empresaSelecionada;
    }
    
}