/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum EstadoCivil {
    Casado(1,"Casado(a)"),Divorciado(2,"Divorciado(a)"),Solteiro(3,"Solteiro(a)"),Viuvo(4,"Viúvo(a)");
  
    private final int id;  
    private final String description;  
  
    EstadoCivil(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static EstadoCivil getInstance(int id) {  
        for (EstadoCivil tp : EstadoCivil.values()) {  
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