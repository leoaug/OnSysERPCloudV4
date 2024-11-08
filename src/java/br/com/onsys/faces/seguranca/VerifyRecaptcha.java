/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.onsys.faces.seguranca;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import javax.json.Json;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Cristiano
 */
public class VerifyRecaptcha {
    
    public static final String url = "https://www.google.com/recaptcha/api/siteverify";
    //public static final String secret = "6LdqSOglAAAAADrQTkQM44f-OqLuJLpNPuHoIAoB";     // LOCALHOST
    public static final String secret = "6LdVQ-klAAAAAPGjgiZ8y5jWcjnKJUmSTdxlj7yE";     // SERVIDOR
    public static final String USER_AGENT = "Mozilla/66.0.5";
    
    public static boolean veryfy(String gRecaptchaResponse) throws IOException{
        if (gRecaptchaResponse == null || "".equals(gRecaptchaResponse)){
            return false;
        }
        
        try{
            URL obj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            
            String postParams = "secret=" + secret + "&response=" + gRecaptchaResponse;
            
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            
            int responseCode = con.getResponseCode();
            System.out.println("inSending 'GET' request to URL : "+url);
            System.out.println("Post parameters : "+postParams);
            System.out.println("Response Code : "+responseCode);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            
            System.out.println(response.toString());
           
            javax.json.JsonReader jsonReader = Json.createReader(new StringReader(response.toString()));
            javax.json.JsonObject jsonObject = jsonReader.readObject();
            jsonReader.close();
            
            boolean teste = jsonObject.getBoolean("success");
            return teste;
  
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
}