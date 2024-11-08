/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoCor {
    yellow(1,"Amarelo"),blue(2,"Azul"),cyan(3,"Ciano"),grey(4,"Cinza"),coral(5,"Coral"),orange(6,"Laranja"),
    brown(7,"Marrom"),green(8,"Verde"),red(9,"Vermelho"),indigo(10,"Roxo");
  
    private final int id;  
    private final String description;  
  
    TipoCor(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoCor getInstance(int id) {  
        for (TipoCor tp : TipoCor.values()) {  
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