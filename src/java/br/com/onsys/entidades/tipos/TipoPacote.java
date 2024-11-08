/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum TipoPacote {
    Aberto(1,"Hora aberta"),Fechado(2,"Fechado");
  
    private final int id;  
    private final String description;  
  
    TipoPacote(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoPacote getInstance(int id) {  
        for (TipoPacote tp : TipoPacote.values()) {  
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