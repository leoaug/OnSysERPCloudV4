/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author cristiano
 */
@ManagedBean
@Named
@SessionScoped
public class CalculaDigito implements java.io.Serializable {
      
    public int calcularDigitoMod10(String num){    
  
        //variáveis de instancia  
        int soma = 0;  
        int resto = 0;  
        int dv = 0;  
        String[] numeros = new String[num.length()+1];  
        int multiplicador = 2;  
        String aux;  
        String aux2;  
        String aux3;  
          
        for (int i = num.length(); i > 0; i--) {               
            //Multiplica da direita pra esquerda, alternando os algarismos 2 e 1  
            if(multiplicador%2 == 0){  
                // pega cada numero isoladamente    
                numeros[i] = String.valueOf(Integer.valueOf(num.substring(i-1,i))*2);  
                multiplicador = 1;  
            }else{  
                numeros[i] = String.valueOf(Integer.valueOf(num.substring(i-1,i))*1);  
                multiplicador = 2;  
            }  
        }    
          
        // Realiza a soma dos campos de acordo com a regra  
        for(int i = (numeros.length-1); i > 0; i--){  
            aux = String.valueOf(Integer.valueOf(numeros[i]));  
              
            if(aux.length()>1){  
                aux2 = aux.substring(0,aux.length()-1);               
                aux3 = aux.substring(aux.length()-1,aux.length());  
                numeros[i] = String.valueOf(Integer.valueOf(aux2) + Integer.valueOf(aux3));               
            }  
            else{  
                numeros[i] = aux;             
            }  
        }  
          
        //Realiza a soma de todos os elementos do array e calcula o digito verificador  
        //na base 10 de acordo com a regra.       
        for(int i = numeros.length; i > 0 ; i--){  
            if(numeros[i-1] != null){  
                soma += Integer.valueOf(numeros[i-1]);  
            }  
        }  
        resto = soma%10;  
        dv = 10 - resto;  
        
        if (resto == 0) {
            dv = 0;
        }
        
        //retorna o digito verificador  
        return dv;  
    }  
    
    //MÓDULO 11 COM AJUSTE
    public int calcularDigitoMod11(String num){      
    
        System.out.println("NOSSO NÚMERO --->"+num);
        
        //variáveis de instancia    
        int soma = 0;    
        int resto = 0;    
        int dv = 0;    
        String[] numeros = new String[num.length()+1];    
        int multiplicador = 2;    
            
        for (int i = num.length(); i > 0; i--) {                 
            //Multiplica da direita pra esquerda, incrementando o multiplicador de 2 a 9    
            //Caso o multiplicador seja maior que 9 o mesmo recomeça em 2    
            if(multiplicador > 9){    
                // pega cada numero isoladamente      
                multiplicador = 2;    
                numeros[i] = String.valueOf(Integer.valueOf(num.substring(i-1,i))*multiplicador);    
                multiplicador++;    
            }else{    
                numeros[i] = String.valueOf(Integer.valueOf(num.substring(i-1,i))*multiplicador);    
                multiplicador++;    
            }    
        }      
    
        //Realiza a soma de todos os elementos do array e calcula o digito verificador    
        //na base 11 de acordo com a regra.         
        for(int i = numeros.length; i > 0 ; i--){    
            if(numeros[i-1] != null){    
                soma += Integer.valueOf(numeros[i-1]);    
            }    
        }    
        resto = soma%11;    
        dv = 11 - resto;    
        if(dv > 9 || dv == 0 ){  
           dv = 1;   
        }              
        //retorna o digito verificador    
        return dv;    
    }       

    //MÓDULO 11 SEM AJUSTE
    public int calcularDigitoMod11SemAjuste(String num){      
    
        System.out.println("NOSSO NÚMERO --->"+num);
        
        //variáveis de instancia    
        int soma = 0;    
        int resto = 0;    
        int dv = 0;    
        String[] numeros = new String[num.length()+1];    
        int multiplicador = 2;    
            
        for (int i = num.length(); i > 0; i--) {                 
            //Multiplica da direita pra esquerda, incrementando o multiplicador de 2 a 9    
            //Caso o multiplicador seja maior que 9 o mesmo recomeça em 2    
            if(multiplicador > 9){    
                // pega cada numero isoladamente      
                multiplicador = 2;    
                numeros[i] = String.valueOf(Integer.valueOf(num.substring(i-1,i))*multiplicador);    
                multiplicador++;    
            }else{    
                numeros[i] = String.valueOf(Integer.valueOf(num.substring(i-1,i))*multiplicador);    
                multiplicador++;    
            }    
        }      
    
        //Realiza a soma de todos os elementos do array e calcula o digito verificador    
        //na base 11 de acordo com a regra.         
        for(int i = numeros.length; i > 0 ; i--){    
            if(numeros[i-1] != null){    
                soma += Integer.valueOf(numeros[i-1]);    
            }    
        }    
        resto = soma%11;    
        dv = 11 - resto;    
        if(dv > 9){  
           dv = 1;   
        }              
        //retorna o digito verificador    
        return dv;    
    }       
    
}
