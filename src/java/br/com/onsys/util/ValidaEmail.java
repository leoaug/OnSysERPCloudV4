/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaEmail {

    public boolean validaEmail(String email) {	
//        String digitado = email;
//        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
//        Matcher m = p.matcher(digitado);
//        boolean matchFound = m.matches();
//
//        if (!matchFound) {
//            return false;
//        }
//        return true;
        if ((email == null) || (email.trim().length() == 0))
            return false;

        String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();    
    }    
}