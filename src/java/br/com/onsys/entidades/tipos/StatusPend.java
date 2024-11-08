/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum StatusPend {Pendente(1,"Pendente"),Agendada(2,"Agendada"),Finalizada(3,"Finalizada"),
Analisada(4,"Analisada"),Cancelada(5,"Cancelada");
  
    private final int id;  
    private final String description;  
  
    StatusPend(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static StatusPend getInstance(int id) {  
        for (StatusPend gc : StatusPend.values()) {  
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