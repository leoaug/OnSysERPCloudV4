package br.com.onsys.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
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

@ManagedBean
@Named
@SessionScoped
public class ProcurarGTIN implements java.io.Serializable{
    
    public List Procurar(String GTIN){
        StringBuilder sb = new StringBuilder();
        //URLConnection urlConn = null;
        HttpURLConnection myURLConnection = null;
        InputStreamReader in = null;
        URL url = null;
        String retorno;
        List listGTIN = null;
        try{
//            url = new URL("http://ws.hubdodesenvolvedor.com.br/cnpj/?cnpj=$"+cCNPJ+"j&token=831229225236268ABV6069515110");
            url = new URL("https://api.cosmos.bluesoft.com.br/gtins/"+GTIN+".json");
            myURLConnection = (HttpURLConnection)url.openConnection();
            myURLConnection.setRequestProperty ("X-Cosmos-Token", "CfsX0O2-Hb0mMGpGo6_CBA");
            System.out.println("url busca GTIN--->"+url);
            //urlConn.setRequestProperty("X-Cosmos-Token", "CfsX0O2-Hb0mMGpGo6_CBA");
            //urlConn = url.openConnection();
            
            if (myURLConnection != null){
                myURLConnection.setReadTimeout(60 * 1000);
            }
            if (myURLConnection != null && myURLConnection.getInputStream() != null){
                System.out.println("Charset.defaultCharset()"+Charset.defaultCharset());
                in = new InputStreamReader(myURLConnection.getInputStream(), "UTF-8");
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
            retorno = sb.toString();
            
            System.out.println("ProcurarGTINRetorno--->"+retorno);
            
            montarGTIN(retorno);
            if(retorno.indexOf("\"erro\":true")>1){
                    listGTIN=null;
            }else{
                listGTIN = montarGTIN(retorno);
            }
            return listGTIN;
       }
       catch(MalformedURLException e){return listGTIN;}
       catch(IOException e){return listGTIN;}
    }
	
    public List montarGTIN(String c) {
        ArrayList listGTIN = new ArrayList();

        String  descricao; 
        String  precoMedio; 
        String  precoMaximo; 
        String  precoMinimo;
        String  precoAtual;
        String  largura;
        String  altura;
        String  comprimento;
        String  pesoLiquido;
        String  pesoBruto;
     
        c="[0," + c + "]";
        JsonParser jsonParser = new JsonParser();
        Object obj = jsonParser.parse(c);
        JsonArray array = (JsonArray) obj;
        
        JsonObject obj2 = (JsonObject)array.get(1);
       
        descricao   = obj2.get("description").toString();
        listGTIN.add(0, descricao);
        
        return listGTIN;
        
    }
    
}