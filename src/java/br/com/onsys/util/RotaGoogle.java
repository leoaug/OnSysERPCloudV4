package br.com.onsys.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author alrocha
 */
public class RotaGoogle {
    String retornoTxt = "";
    String chave="&key=AIzaSyDQIAgNaL_O8Xx6q7K3I38E7fyBiwB4j8Q";
    String url = "";    
    
    public String retornWS(String servico){
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        URL url = null;
        try{
            url = new URL(servico);
            
            urlConn = url.openConnection();
            if (urlConn != null){
                urlConn.setReadTimeout(60 * 1000);
            }
            
            if (urlConn != null && urlConn.getInputStream() != null){
                in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
            }
            BufferedReader bufferedReader = new BufferedReader(in);
            if (bufferedReader != null){
                int cp;
                while((cp=bufferedReader.read()) != -1){
                    sb.append((char) cp);
                }
                bufferedReader.close();
            }
            in.close();
            return sb.toString();
       }
       catch(MalformedURLException e){return null; }
       catch(IOException e){return null;}
    }
    
    public String executarWS(String caminho){
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        URL url = null;
        String cRetorno = "";
        try{
            url = new URL(caminho);
            
            urlConn = url.openConnection();
            if (urlConn != null){
                urlConn.setReadTimeout(60 * 1000);
            }
            
            if (urlConn != null && urlConn.getInputStream() != null){
                in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
            }
            BufferedReader bufferedReader = new BufferedReader(in);
            if (bufferedReader != null){
                int cp;
                while((cp=bufferedReader.read()) != -1){
                    sb.append((char) cp);
                }
                bufferedReader.close();
            }
            in.close();
            cRetorno = sb.toString();            
        }
        catch(MalformedURLException e){ }
        catch(IOException e){}
        return cRetorno;
    }

    public Double[] BuscaCoordenadas(String cRetorno){
        double lat = 0;
        double lng = 0;
        JSONObject devMovies = new JSONObject(cRetorno);
        JSONArray arrResults = devMovies.getJSONArray("results");
        for (int i=0; i < arrResults.length(); i++) {
            JSONObject objResults = arrResults.getJSONObject(i);
            JSONObject objGeometry = objResults.getJSONObject("geometry");
            JSONObject objLocation = objGeometry.getJSONObject("location");
            lat = objLocation.getDouble("lat");
            lng = objLocation.getDouble("lng");
        }
        Double[] retorno = new Double[2];
        retorno[0] = lat;
        retorno[1] = lng;
        return retorno;
        
    }

    public String[][] montarRota(String[] ponto) {
        int iOrigem = 0;
        double distancia = -999;
        int totPontoValida = 0;
        int contaPonto = 1;
        
        String[][] paradas = new String[ponto.length][2];
        
        for (int i = 1; i < ponto.length; i++) {
            if(ponto[i]!=null && !ponto[i].isEmpty()){
                totPontoValida++;
            }
        }

        while(contaPonto <= totPontoValida){
            for (int i = 1; i < ponto.length; i++) {
                if(ponto[i]!=null && !ponto[i].isEmpty()){
                    url = "https://maps.googleapis.com/maps/api/directions/json?";
                    url += "origin=" + ponto[0].replace(" ", "%20") + "&destination=" + ponto[i].replace(" ", "%20");
                    url += chave;
                    System.out.println("url "+url);
                    retornoTxt = retornWS(url);
                    if (distancia==-999){
                        distancia = distanciaDoisPontos(retornoTxt);
                        iOrigem = i;
                    }else{
                        if (distanciaDoisPontos(retornoTxt) < distancia){
                            distancia = distanciaDoisPontos(retornoTxt);
                            iOrigem = i;
                        }
                    }
                }
            }
            paradas[contaPonto][0] = ponto[iOrigem];
            paradas[contaPonto][1] = Double.toString(distancia);
            ponto[0] = ponto[iOrigem];
            ponto[iOrigem] = null;
            distancia=-999;
            contaPonto++;
        }
        return paradas;
    }

    public double distanciaDoisPontos(String cRetorno){
        double m = 0;
        JSONObject devRota = new JSONObject(cRetorno);
        JSONArray arrRoutes = devRota.getJSONArray("routes");
        for (int i=0; i < arrRoutes.length(); i++) {
            JSONObject objRoutes = arrRoutes.getJSONObject(i);
            JSONArray arrLegs = objRoutes.getJSONArray("legs");
            for (int z=0; z < arrLegs.length(); z++) {
                JSONObject objLegs = arrLegs.getJSONObject(z);
                JSONObject objDistance = objLegs.getJSONObject("distance");
                m = objDistance.getDouble("value");
            }
        }
        return m;
    }

}
