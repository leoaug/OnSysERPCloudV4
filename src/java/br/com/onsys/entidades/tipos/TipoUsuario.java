/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoUsuario {    
    Administrador(1,"Administrador"),Comum(2,"Comum"),Consultor(3,"Consultor"),Digitacao(4,"Digitação"),
    Participante(5,"Participante"),Gerencia(6,"Gerência"),Representante(7,"Representante"),Supervisor(8,"Supervisor"),
    Vendedor(9,"Vendedor"),AdmVendas(10,"Adm.Vendas"),Cliente(11,"Cliente"),Fornecedor(12,"Fornecedor");
  
    private final int id;  
    private final String description;  
  
    TipoUsuario(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoConta getInstance(int id) {  
        for (TipoConta tp : TipoConta.values()) {  
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