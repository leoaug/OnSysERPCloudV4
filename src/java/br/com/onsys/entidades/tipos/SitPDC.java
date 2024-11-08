/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 * SITUAÇÃO PEDIDO DE COMPRAS
 */
public enum SitPDC {
    Aberto(1,"Aberto"), Negociado(2,"Negociado"),Recebido(3,"Recebido"),RecebParcial(4,"Receb.Parcial"),
    Cancelado(5,"Cancelado") ;
    private final int id;  
    private final String description;  
  
    SitPDC(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static SitPDC getInstance(int id) {  
        for (SitPDC gc : SitPDC.values()) {  
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