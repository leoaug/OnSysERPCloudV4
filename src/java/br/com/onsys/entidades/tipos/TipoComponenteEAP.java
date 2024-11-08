/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoComponenteEAP {
    Projeto(1,"Projeto"),Fase(2,"Fase"),Subfase(3,"Subfase"),Pacote(4,"Pacote");
  
    private final int id;  
    private final String description;  
  
    TipoComponenteEAP(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoComponenteEAP getInstance(int id) {  
        for (TipoComponenteEAP tp : TipoComponenteEAP.values()) {  
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