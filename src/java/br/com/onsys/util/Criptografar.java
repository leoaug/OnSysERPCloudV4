/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.onsys.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

/**
 *
 * @author cristiano
 */
public enum Criptografar {
    
/*    
Exemplo de uso:

if (!usuario.getSenha().equals(Criptografar.MD5.hashing(senha))) {     
*/    
    SHA {@Override String algorithm() {return SHA_256_ALGORITHM;}	},
    MD5 {@Override String algorithm() {return MD5_ALGORITHM;}};

    private static final String MD5_ALGORITHM = "MD5";
    private static final String SHA_256_ALGORITHM = "SHA-256";

    public String hashing(String word) {
        
        MessageDigest messageDigest = getMessageDigest();
        messageDigest.update(word.getBytes());
        byte bytes[] = messageDigest.digest();
        StringBuilder textHexa = new StringBuilder();
        for(byte data:bytes){
                textHexa.append(Integer.toString((data & 0xff) + 0x100, 16).substring(1));
        }

        return textHexa.toString().toUpperCase();
            
    }

    private MessageDigest getMessageDigest(){
        
        try {
                return MessageDigest.getInstance(algorithm());
        } catch (NoSuchAlgorithmException exception) {
                Logger.getLogger(Criptografar.class.getName()).severe(exception.getMessage());
                return null;
        }
            
    }

    abstract String algorithm();    
    
}