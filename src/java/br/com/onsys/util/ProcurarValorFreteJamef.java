package br.com.onsys.util;

import br.com.onsys.entidades.marketplace.shippingQuotes;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.io.*;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@ManagedBean
@Named
@SessionScoped
public class ProcurarValorFreteJamef implements java.io.Serializable{

    private String      urlAPI ;    
    private double      valorFrete = 0;     
    private String      prazo;
    SimpleDateFormat    out = new SimpleDateFormat("dd/MM/yyyy");  
    
    shippingQuotes  shippingQuotesCalculado = new shippingQuotes();  

    public void Procurar(String cep, BigDecimal valorTotal, BigDecimal pesoTotal) throws JsonProcessingException{       
        
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        URL url = null;
        String cRetorno;
        List listCep = null;        
        String dataString = out.format(new Date());
        
        System.out.println("dataString===>"+dataString);
        System.out.println("valorJAMEF===>"+valorTotal.toString());
        System.out.println("pesoJAMEF====>"+pesoTotal.toString());        
        
        try{
            url = new URL("https://www.jamef.com.br/frete/rest/v1/1/18257524000128/PARACAMBI/RJ/000004/7.176/204.00/0.0400400000/"+cep+"/06/23/09/2019/ourense");
            
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
            
       }
       catch(MalformedURLException e){}
       catch(IOException e){}
        
    }
    
    public void montarCep(String c) {
        ArrayList listCep = new ArrayList();
        
        c="[0," + c + "]";
        JsonParser jsonParser = new JsonParser();
        Object obj = jsonParser.parse(c);
        JsonArray array = (JsonArray) obj;
        
        JsonObject obj2 = (JsonObject)array.get(1);
        
        valorFrete     = obj2.get("valor").getAsDouble();  
        
//        valor       = Double.parseDouble(valorStr);
        //logradouro  = obj2.get("logradouro").toString();
//        cep         = obj2.get("cep").toString();
//        uf          = obj2.get("uf").toString();
//        localidade  = obj2.get("localidade").toString();
        
        
        System.out.println("VALOR JAMEF===>"+valorFrete);
        
        shippingQuotesCalculado.setShippingCost(valorFrete);
        shippingQuotesCalculado.setShippingMethodDisplayName("Jamef");
        shippingQuotesCalculado.setShippingMethodId("Jamef");
        shippingQuotesCalculado.setShippingMethodName("Normal");        
        
    }

    public shippingQuotes getShippingQuotesCalculado() {
        return shippingQuotesCalculado;
    }

    public void setShippingQuotesCalculado(shippingQuotes shippingQuotesCalculado) {
        this.shippingQuotesCalculado = shippingQuotesCalculado;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

}