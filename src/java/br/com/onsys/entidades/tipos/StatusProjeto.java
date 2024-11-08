/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum StatusProjeto {
    Ava(1,"Em avaliação"),Aprovado(2,"Aprovado"),Exe(3,"Em execução"),
    Cancelado(4,"Cancelado"), Suspenso(5,"Suspenso"), Concluido(6,"Concluído");
  
    private final int id;  
    private final String description;  
  
    StatusProjeto(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static StatusProjeto getInstance(int id) {  
        for (StatusProjeto tp : StatusProjeto.values()) {  
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