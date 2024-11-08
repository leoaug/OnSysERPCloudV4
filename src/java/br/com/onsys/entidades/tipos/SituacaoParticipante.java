/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;


public enum SituacaoParticipante {
    Ativo(1,"A"),Inativo(2,"I"),Ambos(3,"M");
    private final int id;  
    private final String description;

    private SituacaoParticipante(int id, String description) {
        this.id = id;
        this.description = description;
    }

     public int getId() {  
        return id;  
    }
     
    public static SituacaoParticipante getInstance(int id) {  
        for (SituacaoParticipante tp : SituacaoParticipante.values()) {  
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
