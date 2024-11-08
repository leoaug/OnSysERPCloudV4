/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum SitDocto {
    Calculada(1,"Calculada"),Emitida(2,"Emitida"),Autorizada(3,"Autorizada"),Impressa(4,"Impressa"),
    Cancelada(5,"Cancelada"),Edicao(6,"Em edição"),Atualizada(7,"Atualizada"),Aberto(8,"Aberto"),
    Atualizado(9,"Atualizado");
  
    private final int id;  
    private final String description;  
  
    SitDocto(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static SitDocto getInstance(int id) {  
        for (SitDocto sitDoc : SitDocto.values()) {  
            if (sitDoc.getId() == id) {  
                return sitDoc;  
            }  
        }  
  
        throw new IllegalArgumentException("Enum inexistente (" + id + ")");  
    }  
  
   @Override  
   public String toString() {   
      return description;   
   }  
    
}