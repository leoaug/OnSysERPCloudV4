/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TpDebitoCredito {
    Debito(1,"Débito"),Credito(2,"Crédito");
  
    private final int id;  
    private final String description;  
  
    TpDebitoCredito(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TpDebitoCredito getInstance(int id) {  
        for (TpDebitoCredito gc : TpDebitoCredito.values()) {  
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