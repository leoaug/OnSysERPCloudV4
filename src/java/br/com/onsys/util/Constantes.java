package br.com.onsys.util;

public class Constantes {

    // TOTAL EXPRESS
    public static final String USER_DESENV = "btf-qa";
    public static final String PASS_DESENV = "8ZJPQbkv";

    public static final String USER_PROD = "btf-prod";
    public static final String PASS_PROD = "7tEIPWLJ";

    public static final String WSDL_CALCULO_FRETE = "https://edi.totalexpress.com.br/webservice_calculo_frete.php?wsdl";
    public static final String WSDL_REGISTRA_COLETA_OBTER_TRACKING = "https://edi.totalexpress.com.br/webservice24.php?wsdl";

    public static final String WSDL_CALCULO_FRETE_ACTION = "calcularFrete";
    public static final String WSDL_REGISTRA_COLETA_ACTION = "RegistraColeta";
    public static final String WSDL_OBTER_TRACKING_ACTION = "ObterTracking";
    public static final Integer TIMEOUT = 50000000; // 3000;        
    
//  MELI DADOS DA CONTA ONSYS
//  public static final String USER = "contato@onsys.com.br";  
//  public static final String PASS = "ReiArthur@2023";        
//  public static final String USR_ID = "398624812";           

//  MELI DADOS DA CONTA BTF
    //public static final String USER = "lojalar@futurainova.com.br";
    public static final String PASS = "Futur@.inov10";
//TESTE    public static final String USR_ID = "557917818";  

//  MELI DADOS DA CONTA LPG
//    public static final String USER     = "contato@lpgdistribuidora.com.br";
//    public static final String PASS     = "ReiArthur@2023";
 //   public static final String USR_ID   = "678554493";  
    
//  https://api.mercadolibre.com/sites/MLB/search?nickname=NAWACOMATAEVARDEPRODLAR    
//  public static final String USR_ID = "398657417"; NAWA 
//  public static final String USR_ID = "557917818"; BTF 
//    public static final String USER = "contato@onsys.net.br";
//    public static final String PASS = "ReiArthur@2023";
//  public static final String USR_ID = "547051448";    // NOVO CLASSICO
    
    
    public static final Long CLIENT_ID       = 5554740713152886L;
    public static final String CLIENT_SECRET = "QeikJVyhNPcGuM5yUOWjL5KgXKxgcBng";
    //public static final String REFRESHTOKEN  = "TG-5fa89b1d85935e00064a93eb-557917818";
//    public static final String REDIRECT_URL = "http://localhost:8080/NeoSIGE/viewsMarketplace/dashboard.faces";    //URL PARA DESENVOLVIMENTO
    public static final String REDIRECT_URL = "https://www.onsyserpcloud.com/viewsMarketplace/dashboard.faces";
//  public static final String REDIRECT_URL = "https://www.onsyserpcloud.com/loginempresa.faces";

//  public static final Long CLIENT_ID_2 = 2424495574647953L;
//  public static final String CLIENT_SECRET_2 = "JE1ydNnpuhBp4jEVdNTlR93mtIQqXV5H";
//  public static final String REDIRECT_URL_2 = "https://www.onsyserpcloud.com/loginempresa.faces";
    
    public static final String ACESS_TOKEN_SESSION = "accessTokenMercadoLire";
    
    public static final String ENDPOINT_TODAS_RECLAMACOES = "v1/claims/search?stage=dispute&access_token=";	

    public static final Integer CLAIM_ID = 12345;

    public static final String ENDPOINT_DETALHE_PELO_ID_RECLAMACAO = "/v1/claims/" + CLAIM_ID + "?access_token=";

    public static final String ENDPOINT_DETALHE_MENSAGEM_PELO_ID_RECLAMACAO = "/v1/claims/" + CLAIM_ID + "/messages?access_token=";


    public static final String ENDPOINT_TODAS_CATEGORIAS_BRASIL = "sites/MLB/categories";	
    public static final String ENDPOINT_CATEGORIAS_POR_ID = "categories/";

    //filhos do ENDPOINT_TODAS_CATEGORIAS_BRASIL
    public static final String ENDPOINT_TODAS_CATEGORIAS_ATRIBUTOS_BRASIL_PARTE1 = "sites/MLB/search?category=";

    // filhos do ENDPOINT_TODAS_CATEGORIAS_ATRIBUTOS_BRASIL_PARTE1
    public static final String ENDPOINT_TODAS_CATEGORIAS_ATRIBUTOS_DESCRICAO_BRASIL = "sites/MLB/search?q=";

    public static final String ENDPOINT_TODOS_TIPOS = "sites/MLB/listing_types";

    public static final String STATUS_ITEM_ACTIVE = "active";
    public static final String STATUS_ITEM_PAUSED = "paused";
        
}