/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoCanalVendas {    
    Varejo(1,"Varejo"),Atacado(2,"Atacado"),KeyAccount(3,"Key account"),GrandesRedes(4,"Grandes redes")
    ,Televendas(5,"Televendas"),Promocional(6,"Promocional"),Exportacao(7,"Exportação");
  
    private final int id;  
    private final String description;  
  
    TipoCanalVendas(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoCanalVendas getInstance(int id) {  
        for (TipoCanalVendas tp : TipoCanalVendas.values()) {  
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