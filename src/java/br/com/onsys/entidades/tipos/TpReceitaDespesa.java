/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TpReceitaDespesa {
    Receita(1,"Receita"),Despesa(2,"Despesa");
  
    private final int id;  
    private final String description;  
  
    TpReceitaDespesa(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TpReceitaDespesa getInstance(int id) {  
        for (TpReceitaDespesa tp : TpReceitaDespesa.values()) {  
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