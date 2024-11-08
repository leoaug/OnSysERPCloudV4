/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoCondPagamento {
    Compras(1,"Compras"),Vendas(2,"Vendas"),Ambos(3,"Ambos");
  
    private final int id;  
    private final String description;  
  
    TipoCondPagamento(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoCondPagamento getInstance(int id) {  
        for (TipoCondPagamento tp : TipoCondPagamento.values()) {  
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