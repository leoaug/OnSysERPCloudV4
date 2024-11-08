/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum Sexo {
    Feminino(1,"Feminino"),Masculino(2,"Masculino");
  
    private final int id;  
    private final String description;  
  
    Sexo(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static Sexo getInstance(int id) {  
        for (Sexo tp : Sexo.values()) {  
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