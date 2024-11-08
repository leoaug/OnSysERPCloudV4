/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum GrupoContaContabil {
    Ativo(1,"Ativo"),Passivo(2,"Passivo"),Despesas(3,"Despesas"),Receitas(4,"Receitas"),Apuracao(5,"Apuração"),Compensacao(6,"Compensação");
  
    private final int id;  
    private final String description;  
  
    GrupoContaContabil(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static GrupoContaContabil getInstance(int id) {  
        for (GrupoContaContabil gc : GrupoContaContabil.values()) {  
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