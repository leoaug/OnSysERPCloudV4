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
public class ProcurarCep implements java.io.Serializable{
    
    public List Procurar(String cCep){
        StringBuilder       sb      = new StringBuilder();
        URLConnection       urlConn = null;
        InputStreamReader   in      = null;
        URL                 url     = null;
        String              cRetorno;
        List                listCep = null;
        try{
            url = new URL("http://viacep.com.br/ws/"+cCep+"/json");
            
            System.out.println("url busca CEP--->"+url);
            
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
            
            System.out.println("ProcurarCepcRetorno--->"+cRetorno);
            
            montarCep(cRetorno);  // TESTAR SE PODE RETIRAR
            if(cRetorno.indexOf("\"erro\":true")>1){
                    listCep=null;
            }else{
                listCep = montarCep(cRetorno);
            }
            return listCep;
       }
       catch(MalformedURLException e){return listCep;}
       catch(IOException e){return listCep;}
    }
	
    public List montarCep(String c) {
        ArrayList listCep = new ArrayList();
        
        String bairro; 
        String logradouro; 
        String cep; 
        String uf;
        String localidade;
        
        c="[0," + c + "]";
        JsonParser jsonParser = new JsonParser();
        Object obj = jsonParser.parse(c);
        JsonArray array = (JsonArray) obj;
        
        JsonObject obj2 = (JsonObject)array.get(1);
        
        bairro      = obj2.get("bairro").toString();
        logradouro  = obj2.get("logradouro").toString();
        cep         = obj2.get("cep").toString();
        uf          = obj2.get("uf").toString();
        localidade  = obj2.get("localidade").toString();
        
        listCep.add(0, bairro);
        listCep.add(1, logradouro);
        listCep.add(2, cep);
        listCep.add(3, uf);
        listCep.add(4, localidade);
        
        return listCep;
        
    }
}