/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoParticipante {    
    Cliente(1,"Cliente"),Fornecedor(2,"Fornecedor"),Ambos(3,"Ambos");
  
    private final int id;  
    private final String description;  
  
    TipoParticipante(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoParticipante getInstance(int id) {  
        for (TipoParticipante tp : TipoParticipante.values()) {  
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