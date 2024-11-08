/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum TipoProjeto {
    Implantacao(1,"Implantação"),Educacional(2,"Educacional");
  
    private final int id;  
    private final String description;  
  
    TipoProjeto(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoProjeto getInstance(int id) {  
        for (TipoProjeto tp : TipoProjeto.values()) {  
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