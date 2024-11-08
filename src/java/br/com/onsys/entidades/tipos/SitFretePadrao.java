/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum SitFretePadrao {
    Nao(1,"Não"),Microregiao(2,"Microregião"),Transportadora(3,"Transportadora"), CatCliente(3,"Cat.Cliente");
  
    private final int id;  
    private final String description;  
  
    SitFretePadrao(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static SitFretePadrao getInstance(int id) {  
        for (SitFretePadrao gc : SitFretePadrao.values()) {  
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