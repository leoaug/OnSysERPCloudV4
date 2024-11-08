package br.com.onsys.util;

import static br.com.onsys.util.SendMail.texto;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.*;
import java.io.InputStreamReader;
import java.net.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import org.json.JSONObject;

@ManagedBean
@Named
@SessionScoped
public class ProcurarCNPJ implements java.io.Serializable{
    
    private Client                          client      = ClientBuilder.newClient();
    private MultivaluedMap<String, Object>  myHeaders   = new MultivaluedHashMap<>();
    private String                          urlAPI = "https://api.gw.cellereit.com.br/consultas/receita-federal-sintegra/rj/cnpj-sintegra?cnpj="; // URL DE PRODUÇÃO     
    
    public List Procurar(String cCNPJ){
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        URL url = null;
        String cRetorno;
        List listCNPJ = null;
        try{
//            url = new URL("http://ws.hubdodesenvolvedor.com.br/cnpj/?cnpj=$"+cCNPJ+"j&token=831229225236268ABV6069515110");
            url = new URL("http://www.receitaws.com.br/v1/cnpj/"+cCNPJ);

            System.out.println("url busca CNPJ--->"+url);
            
            urlConn = url.openConnection();
            
            if (urlConn != null){
                urlConn.setReadTimeout(60 * 1000);
            }
            if (urlConn != null && urlConn.getInputStream() != null){
                System.out.println("Charset.defaultCharset()"+Charset.defaultCharset());
                in = new InputStreamReader(urlConn.getInputStream(), "UTF-8");
            }
            BufferedReader bufferedReader = new BufferedReader(in);
            
            System.out.println("bufferedReader--->"+bufferedReader);
            
            if (bufferedReader != null){
                int cp;
                while((cp=bufferedReader.read()) != -1){
                    sb.append((char) cp);
                }
                bufferedReader.close();
            }
            in.close();
            cRetorno = sb.toString();
            
            System.out.println("ProcurarCNPJRetorno--->"+cRetorno);
            
            montarCNPJ(cRetorno);
            if(cRetorno.indexOf("\"erro\":true")>1){
                    listCNPJ=null;
            }else{
                listCNPJ = montarCNPJ(cRetorno);
            }
            return listCNPJ;
       }
       catch(MalformedURLException e){return listCNPJ;}
       catch(IOException e){return listCNPJ;}
    }
    
    public String procurarIE (String cnpj, String uf) {
        System.out.println("***ProcurarCNPJ.procurarIE***");
        myHeaders = new MultivaluedHashMap<>();
        myHeaders.add("authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIzS1dxVWt4U2pTSDc5OUxnc3cyX0htRFozZDlkVzZoNmtsVGx2Q2t2dkdzIn0.eyJleHAiOjE3MDkzNTc4NzcsImlhdCI6MTcwOTM1NzU3NywianRpIjoiODIzZTQ2YzQtYTVjZS00MzgyLWI4ODItYTU1MWNkOGM4YzFkIiwiaXNzIjoiaHR0cHM6Ly9sb2dpbi5jZWxsZXJlaXQuY29tLmJyL2F1dGgvcmVhbG1zL3BvcnRhbC1jbGllbnRlcy1hcGkiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiN2JiYWM5MmYtNGQxMS00OTZkLTk0MDQtNDFiODZhZmY4ZjRlIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoicGRjYS1hcGkiLCJzZXNzaW9uX3N0YXRlIjoiOGUzMDFkMWItZDg2Yi00YjUzLTkyOTgtMmJiMWM5YmFmOTdiIiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvcmdhbml6YXRpb24iLCJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtcG9ydGFsLWNsaWVudGVzLWFwaSIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwbGFucyBwcm9maWxlIiwic2lkIjoiOGUzMDFkMWItZDg2Yi00YjUzLTkyOTgtMmJiMWM5YmFmOTdiIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsImdyb3VwcyI6WyJhY2NvdW50QWRtaW5zIiwib3JnYW5pemF0aW9ucyJdLCJiaWxsaW5nQWNjb3VudElkIjoiNjVlMmJhMDg0ZDExZTg3ZGZkNWY2YTFhIiwicHJlZmVycmVkX3VzZXJuYW1lIjoiY3Jpc3RpYW5vLmFzc2lzQG9uc3lzLmNvbS5iciIsImdpdmVuX25hbWUiOiIiLCJsb2NhbGUiOiJwdC1CUiIsImZhbWlseV9uYW1lIjoiIiwiZW1haWwiOiJjcmlzdGlhbm8uYXNzaXNAb25zeXMuY29tLmJyIn0.SOQhcC19zzc15CTpDifLEcubewY3DrJqYRz92xQXObS8TZjK6hgKUF-w851As_HmFouMWuW3Eh_mFHR4Ef8dN607yiTrXkhbuJUveDQA2pWbDJbTu6cPD3pwVd1TjYlDms9QhRCMDymwfR5-e8DSwJoIFDrABUcG7VRWPWVW8LyDDo1IJ9EZh-i_1wiEWVabLfIGMqBtfT2EE2OmyZLaGeA8CqWgeVfouNa0ZYgHa75T6p4ekQct6BKJrnhRdiGc7evbgBpLbGdQfPuzMFfkScP7YLHiRRnvLDg2IdqZASdCRlizuHY8B-GKmSLFg--jLIQzmNkWSbIO-sRgut39iQ"); 
        myHeaders.add("accept", "application/json");     
        
        String conteudo             = null;
        String inscricaoEstadual    = null;    
        
        try {
            
            urlAPI = "https://api.gw.cellereit.com.br/consultas/receita-federal-sintegra/"+uf+"/cnpj-sintegra?cnpj=";
            System.out.println("urlAPI===>"+urlAPI+cnpj);
            Client client = ClientBuilder.newClient();
            conteudo = client.target(urlAPI+cnpj).request().headers(myHeaders).get(String.class);                        

            System.out.println("***CONTEUDO 1 ===>"+conteudo);        
            
        } catch (Exception e) {
            System.out.println("1-erro===>"+e);
            conteudo = null;
            
        }
        
        if (conteudo != null) {

            try {                
                
                System.out.println("***1-ProcurarCNPJ.procurarIE***");
                
                JSONObject obj      = new JSONObject(conteudo);
                
                System.out.println("***2-ProcurarCNPJ.procurarIE***");
                
                JSONObject objResult = obj.getJSONObject("Result");
                JSONObject objSintegra = objResult.getJSONObject("Sintegra");
                //conteudo="[0," + conteudo + "]";
                //JsonParser jsonParser = new JsonParser();
                //Object obj = jsonParser.parse(conteudo);
                //JsonArray array = (JsonArray) obj;
                //JsonObject obj2 = (JsonObject)array.get(1);    
                //JsonObject objSintegra     = obj.get("Sintegra").getAsJsonObject();                 
                
                System.out.println("3-***ProcurarCNPJ.procurarIE***");
                
                inscricaoEstadual            = objSintegra.get("InscricaoEstadual").toString().replace("\"", "");                                
                
            } catch (Exception e) {
                
                System.out.println("2-erro===>"+e);

            }
        
        }        
        
        return inscricaoEstadual;
        
    }
    
    public List montarCNPJ(String c) {
        ArrayList listCNPJ = new ArrayList();

        String bairro; 
        String logradouro; 
        String cep; 
        String uf;
        String numero;
        String complemento;
        String municipio;
        
        String razaoSocial; 
        String nomeFantasia; 
        String telefone;
        String email; 
        String emallXML;
        String contato;
        String MEI;        
     
        c="[0," + c + "]";
        JsonParser jsonParser = new JsonParser();
        Object obj = jsonParser.parse(c);
        JsonArray array = (JsonArray) obj;
        
        JsonObject obj2 = (JsonObject)array.get(1);
       
        razaoSocial   = obj2.get("nome").toString();
        nomeFantasia  = obj2.get("fantasia").toString();
        logradouro    = obj2.get("logradouro").toString();
        numero        = obj2.get("numero").toString();
        complemento   = obj2.get("complemento").toString();
        cep           = obj2.get("cep").toString();
        bairro        = obj2.get("bairro").toString();
        municipio     = obj2.get("municipio").toString();
        uf            = obj2.get("uf").toString();
        email         = obj2.get("email").toString();
        telefone      = obj2.get("telefone").toString();        
        MEI           = obj2.get("natureza_juridica").toString();
       
       /*
        JSONObject jo = new JSONObject(c);
        JSONObject j = jo.getJSONObject("result");
        
        razaoSocial     = j.getString("nome");
        nomeFantasia    = j.getString("fantasia");
        logradouro      = j.getString("logradouro");
        numero          = j.getString("numero");
        complemento     = j.getString("complemento");
        cep             = j.getString("cep");
        bairro          = j.getString("bairro");
        municipio       = j.getString("municipio");
        uf              = j.getString("uf");
        email           = j.getString("email");
        telefone        = j.getString("telefone");
*/
        listCNPJ.add(0, razaoSocial);
        listCNPJ.add(1, nomeFantasia);
        listCNPJ.add(2, logradouro);
        listCNPJ.add(3, numero);
        listCNPJ.add(4, complemento);
        listCNPJ.add(5, cep);
        listCNPJ.add(6, bairro);
        listCNPJ.add(7, municipio);
        listCNPJ.add(8, uf);
        listCNPJ.add(9, email);
        listCNPJ.add(10, telefone);
        listCNPJ.add(11, MEI);        
        
        return listCNPJ;
    }
}