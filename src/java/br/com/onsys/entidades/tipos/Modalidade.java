/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum Modalidade {
    Registrada(1,"Registrada"),Simples(2,"Simples"),Descontada(3,"Descontada"),PDV(4,"PDV"),NBanco(5,"Não bancário");
  
    private final int id;  
    private final String description;  
  
    Modalidade(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static Modalidade getInstance(int id) {  
        for (Modalidade tp : Modalidade.values()) {  
            if (tp.getId() == id) {  
                return tp;  
            }  
        }  
  
        throw new IllegalArgumentException("Enum inexistente (" + id + ")");  
    }  
  
   @Override  
   public String toString() {   
      return description;   
   }      
}