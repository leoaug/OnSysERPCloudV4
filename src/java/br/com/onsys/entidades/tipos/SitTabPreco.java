/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum SitTabPreco {
    Nao(1,"Não"), Cliente(2,"Cliente"),Representante(3,"Representante"),RepTabPreco(4,"Repr x Tab.Preco") ;
    private final int id;  
    private final String description;  
  
    SitTabPreco(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static SitTabPreco getInstance(int id) {  
        for (SitTabPreco gc : SitTabPreco.values()) {  
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