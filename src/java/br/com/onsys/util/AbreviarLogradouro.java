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
public class AbreviarLogradouro implements java.io.Serializable {
    
    public static String abreviarLogradouro(String logradouro) {
        
        String logradouroAbreviado = logradouro.replaceAll(" Rua ","R ");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Rua ","R ");        
               logradouroAbreviado = logradouroAbreviado.replaceAll("Advogado","Adv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Advogada","Adv");        
               logradouroAbreviado = logradouroAbreviado.replaceAll("Acampamento","Acamp");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Acesso","Ac");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Alameda","Al");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Apartamento","Ap");
               logradouroAbreviado = logradouroAbreviado.replaceAll("apartamento","Ap");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Apto","Ap");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Avenida","Av");                       
               logradouroAbreviado = logradouroAbreviado.replaceAll("Beco","Bc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Belvedere","Belv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Bloco","Bl");          
               logradouroAbreviado = logradouroAbreviado.replaceAll("Boulevard","Bvd");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Brasileiro","Bras");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Brasileira","Bras(a)");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Calcada","Calc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Campo","Cpo");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Caminho","Cam");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Canal","Can");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Casa","Cs");
               logradouroAbreviado = logradouroAbreviado.replaceAll("casa","Cs");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Católico","Catól");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Católica","Catól");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Catolico","Catól");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Catolica","Catól");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Chacara","Chap");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Circular","Circ");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Colonia","Col");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Condominio","Cond");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Conjunto","Cj");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Coronel","Cel");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Corredor","Cor");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Deputado","Dep");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Deputada","Dep(a");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Destrito","Dt");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Doutor","Dr");  
               logradouroAbreviado = logradouroAbreviado.replaceAll("Embaixador","Emb");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Engenheiro","Eng");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Engenheira","Eng(a)");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Escola","Esc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("escola","Esc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Esplanada","Esp");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Estação","Etc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("estação","Etc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Estacao","Etc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("estacao","Etc");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Estrada","Estr");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Estacionamento","Estc");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("estacionamento","Estc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("General","Gal");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Governador","Gov");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Habitacional","Hab");
               logradouroAbreviado = logradouroAbreviado.replaceAll("habitacional","Hab");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Júnior","Jr");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Junior","Jr");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Loja","Lj");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Lojas","Lj");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("loja","Lj");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("lojas","Lj");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Lote","Lt");
               logradouroAbreviado = logradouroAbreviado.replaceAll("lote","Lt");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Loteamento","Lot");
               logradouroAbreviado = logradouroAbreviado.replaceAll("loteamento","Lot");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Mercado","Merc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("mercado","Merc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Praca","Pc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("praca","Pc");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Praia","Pr");
               logradouroAbreviado = logradouroAbreviado.replaceAll("praia","Pr");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Prefeito","Pref");         
               logradouroAbreviado = logradouroAbreviado.replaceAll("Presidente","Pres");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Professor","Prof");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Professora","Prof(a)");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("professor","Prof");
               logradouroAbreviado = logradouroAbreviado.replaceAll("professora","Prof(a)");                              
               logradouroAbreviado = logradouroAbreviado.replaceAll("Projetada","Proj");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Quadra","Qd");
               logradouroAbreviado = logradouroAbreviado.replaceAll("quadra","Qd");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Residencial","Res");
               logradouroAbreviado = logradouroAbreviado.replaceAll("residencial","Res");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Rodovia","Rod");
               logradouroAbreviado = logradouroAbreviado.replaceAll("rodovia","Rod");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Rotatoria","Rtt");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("rotatoria","Rtt");                              
               logradouroAbreviado = logradouroAbreviado.replaceAll("rua ","R ");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Senador","Sen");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Senadora","Sen(a)");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Santa","Sta");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Santo","Sto");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Senhor","Sr");
               logradouroAbreviado = logradouroAbreviado.replaceAll("senhor","Sr");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Senhora","Sra");
               logradouroAbreviado = logradouroAbreviado.replaceAll("senhora","Sra");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Servidão","Srv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("servidão","Srv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Servidao","Srv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("servidao","Srv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Tenente","Ten");
               logradouroAbreviado = logradouroAbreviado.replaceAll("tenente","Ten");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Terminal","Ter");
               logradouroAbreviado = logradouroAbreviado.replaceAll("terminal","Ter");               
               logradouroAbreviado = logradouroAbreviado.replaceAll("Travessa","Tv");   
               logradouroAbreviado = logradouroAbreviado.replaceAll("travessa","Tv");                  
               logradouroAbreviado = logradouroAbreviado.replaceAll("Trecho","Trv");                  
               logradouroAbreviado = logradouroAbreviado.replaceAll("trecho","Trv");                                 
               logradouroAbreviado = logradouroAbreviado.replaceAll("Trevo","Trv");                                 
               logradouroAbreviado = logradouroAbreviado.replaceAll("trevo","Trv");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Vereador","Ver");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Vereadora","Ver(a)");
               logradouroAbreviado = logradouroAbreviado.replaceAll("null","");
               logradouroAbreviado = logradouroAbreviado.replaceAll("Null","");
               logradouroAbreviado = logradouroAbreviado.replaceAll("NULL","");
               
        return logradouroAbreviado;

    }
    
}
