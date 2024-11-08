/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoDescPedido {
    Sim(1,"Sim"),Nao(2,"Não"),CatCliente(3,"Cat.Cliente");
  
    private final int id;  
    private final String description;  
  
    TipoDescPedido(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoDescPedido getInstance(int id) {  
        for (TipoDescPedido tp : TipoDescPedido.values()) {  
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