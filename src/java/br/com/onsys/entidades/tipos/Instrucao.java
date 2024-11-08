/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum Instrucao {
    MedioIncompleto(1,"Ensino médio incompleto"),MedioCompleto(2,"Ensino médio completo"),SuperiorIncompleto(3,"Superior incompleto"),
    SuperiorCompleto(4,"Superior completo");
  
    private final int id;  
    private final String description;  
  
    Instrucao(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static Instrucao getInstance(int id) {  
        for (Instrucao tp : Instrucao.values()) {  
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