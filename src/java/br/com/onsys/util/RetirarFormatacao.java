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
public class RetirarFormatacao {
    
    public static String retirarFormatacao(String dadoFormatado) {
        
        String  dadoSemFormato  = dadoFormatado.replaceAll("\\.","");
                dadoSemFormato = dadoSemFormato.replaceAll("/", "");
                dadoSemFormato = dadoSemFormato.replaceAll(".", "");
                dadoSemFormato = dadoSemFormato.replaceAll("-", "");
               
        return dadoSemFormato;

    }
    
}
