/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum QualResult {
    N(1,"Não atende"),P(2,"Parcial"),T(3,"Total");
  
    private final int id;  
    private final String description;  
  
    QualResult(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static QualResult getInstance(int id) {  
        for (QualResult gc : QualResult.values()) {  
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