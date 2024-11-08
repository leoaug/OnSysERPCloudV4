/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class ValidaCNPJCPF implements java.io.Serializable{
    
    /** Creates a new instance of ValidaCnpj */  
    public ValidaCNPJCPF() {  
    }  
    
    public  boolean validaCNPJCPF(String str_cnpjcpf ) {  
        System.out.println("***validaCNPJCPF***");
        System.out.println("str_cnpjcpf===>"+str_cnpjcpf);
        
        if (str_cnpjcpf.length() == 18) {
            
            System.out.println("***validaCNPJCPF - PONTO 1 ***");
            
            if (!str_cnpjcpf.substring(0,1).equals("") && !"__.___.___/____-__".equals(str_cnpjcpf)){  
                
                System.out.println("***validaCNPJCPF - PONTO 2 ***");
                
                try{  
                    
                    System.out.println("***validaCNPJCPF - PONTO 3 ***");
                    
                    str_cnpjcpf=str_cnpjcpf.replace('.',' ');  
                    str_cnpjcpf=str_cnpjcpf.replace('/',' ');  
                    str_cnpjcpf=str_cnpjcpf.replace('-',' ');  
                    str_cnpjcpf=str_cnpjcpf.replaceAll(" ","");  
                    int soma = 0, aux, dig;  
                    String cnpj_calc = str_cnpjcpf.substring(0,12);  

                    if ( str_cnpjcpf.length() != 14 )  
                        return false;  
                    char[] chr_cnpj = str_cnpjcpf.toCharArray();  
                    /* Primeira parte */  
                    for( int i = 0; i < 4; i++ )  
                        if ( chr_cnpj[i]-48 >=0 && chr_cnpj[i]-48 <=9 )  
                            soma += (chr_cnpj[i] - 48 ) * (6 - (i + 1)) ;  
                    for( int i = 0; i < 8; i++ )  
                        if ( chr_cnpj[i+4]-48 >=0 && chr_cnpj[i+4]-48 <=9 )  
                            soma += (chr_cnpj[i+4] - 48 ) * (10 - (i + 1)) ;  
                    dig = 11 - (soma % 11);  
                    cnpj_calc += ( dig == 10 || dig == 11 ) ?  
                        "0" : Integer.toString(dig);  
                    /* Segunda parte */  
                    soma = 0;  
                    for ( int i = 0; i < 5; i++ )  
                        if ( chr_cnpj[i]-48 >=0 && chr_cnpj[i]-48 <=9 )  
                            soma += (chr_cnpj[i] - 48 ) * (7 - (i + 1)) ;  
                    for ( int i = 0; i < 8; i++ )  
                        if ( chr_cnpj[i+5]-48 >=0 && chr_cnpj[i+5]-48 <=9 )  
                            soma += (chr_cnpj[i+5] - 48 ) * (10 - (i + 1)) ;  
                    dig = 11 - (soma % 11);  
                    cnpj_calc += ( dig == 10 || dig == 11 ) ?  
                        "0" : Integer.toString(dig);  
                    
                    System.out.println("***validaCNPJCPF - PONTO 4 ***");
                    
                    return str_cnpjcpf.equals(cnpj_calc);  
                }catch (Exception e){  
                    
                    System.out.println("***validaCNPJCPF - PONTO 5 ***");
                    
                    System.err.println("Erro !"+e);  
                    return false;  
                }  
            }else return false;          
        } else if (str_cnpjcpf.length() == 14) { 
            if (! str_cnpjcpf.substring(0,1).equals("")){  
                try{  
                    boolean validado=true;  
                    int     d1, d2;  
                    int     digito1, digito2, resto;  
                    int     digitoCPF;  
                    String  nDigResult;  
                    str_cnpjcpf=str_cnpjcpf.replace('.',' ');  
                    str_cnpjcpf=str_cnpjcpf.replace('-',' ');  
                    str_cnpjcpf=str_cnpjcpf.replaceAll(" ","");  
                    d1 = d2 = 0;  
                    digito1 = digito2 = resto = 0;  

                    for (int nCount = 1; nCount < str_cnpjcpf.length() -1; nCount++) {  
                        digitoCPF = Integer.valueOf(str_cnpjcpf.substring(nCount -1, nCount)).intValue();  

                        //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.  
                        d1 = d1 + ( 11 - nCount ) * digitoCPF;  

                        //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.  
                        d2 = d2 + ( 12 - nCount ) * digitoCPF;  
                    };  

                    //Primeiro resto da divisao por 11.  
                    resto = (d1 % 11);  

                    //Se o resultado for 0 ou 1 o digito e 0 caso contrario o digito e 11 menos o resultado anterior.  
                    if (resto < 2)  
                        digito1 = 0;  
                    else  
                        digito1 = 11 - resto;  

                    d2 += 2 * digito1;  

                    //Segundo resto da divisao por 11.  
                    resto = (d2 % 11);  

                    //Se o resultado for 0 ou 1 o digito e 0 caso contrario o digito e 11 menos o resultado anterior.  
                    if (resto < 2)  
                        digito2 = 0;  
                    else  
                        digito2 = 11 - resto;  

                    //Digito verificador do CPF que esta sendo validado.  
                    String nDigVerific = str_cnpjcpf.substring(str_cnpjcpf.length()-2, str_cnpjcpf.length());  

                    //Concatenando o primeiro resto com o segundo.  
                    nDigResult = String.valueOf(digito1) + String.valueOf(digito2);  

                    //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.  
                    return nDigVerific.equals(nDigResult);  
                }catch (Exception e){  
                    System.err.println("Erro !"+e);  
                    return false;  
                }  
            }else return false;  
        }
        return false;          
    }  
}