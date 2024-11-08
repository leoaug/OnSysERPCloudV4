/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

/**
 *
 * @author Cristiano
 */
public class RetiraAcento {
    
    public static String retirarAcento(String stringComAcento) {
        
        String stringSemAcento = stringComAcento.replaceAll("ã","a");
               stringSemAcento = stringSemAcento.replaceAll("Ã","A");
               stringSemAcento = stringSemAcento.replaceAll("á","a");
               stringSemAcento = stringSemAcento.replaceAll("Á","A");
               stringSemAcento = stringSemAcento.replaceAll("à","a");
               stringSemAcento = stringSemAcento.replaceAll("À","A");
               stringSemAcento = stringSemAcento.replaceAll("ç","c");
               stringSemAcento = stringSemAcento.replaceAll("Ç","C");
               stringSemAcento = stringSemAcento.replaceAll("ê","e");
               stringSemAcento = stringSemAcento.replaceAll("Ê","E");
               stringSemAcento = stringSemAcento.replaceAll("é","e");
               stringSemAcento = stringSemAcento.replaceAll("É","E");
               stringSemAcento = stringSemAcento.replaceAll("í","i");
               stringSemAcento = stringSemAcento.replaceAll("Í","I");
               stringSemAcento = stringSemAcento.replaceAll("õ","o");
               stringSemAcento = stringSemAcento.replaceAll("Õ","O");
               stringSemAcento = stringSemAcento.replaceAll("ó","o");
               stringSemAcento = stringSemAcento.replaceAll("Ó","O");
               stringSemAcento = stringSemAcento.replaceAll("ú","u");
               stringSemAcento = stringSemAcento.replaceAll("Ú","U");
               stringSemAcento = stringSemAcento.replaceAll("´","");
               stringSemAcento = stringSemAcento.replaceAll("'","");

        return stringSemAcento;

    }
    
}
