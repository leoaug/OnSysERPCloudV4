/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum StatusAgenda {
    N(1,"Não Iniciada"),C(2,"Cancelada"),F(3,"Finalizada");
  
    private final int id;  
    private final String description;  
  
    StatusAgenda(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static StatusAgenda getInstance(int id) {  
        for (StatusAgenda gc : StatusAgenda.values()) {  
            if (gc.getId() == id) {  
                return gc;  
            }  
        }  
        throw new IllegalArgumentException("Enum inexistente (" + id + ")");  
    }  
  
   @Override  
   public String toString() {   
      return description;   
   }  
   
}