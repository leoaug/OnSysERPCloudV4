/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum SituacaoOS {       
    Aberta(1,"Aberta"),Cancelada(2,"Cancelada"), Edicao(3,"Em Edição"),
    Faturada(4,"Faturada"), Execucao(5,"Em execução"), Impressa(6,"Impressa");  
    private final int id;  
    private final String description;  
  
    SituacaoOS(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static br.com.onsys.entidades.tipos.SituacaoOS getInstance(int id) {  
        for (br.com.onsys.entidades.tipos.SituacaoOS gc : br.com.onsys.entidades.tipos.SituacaoOS.values()) {  
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