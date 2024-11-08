package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TpEnderParticipante {
    Padrao(1,"Padrão"),Entrega(2,"Entrega"),Cobranca(3,"Cobrança"),Outros(4,"Outros");
  
    private final int id;  
    private final String description;  
  
    TpEnderParticipante(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TpEnderParticipante getInstance(int id) {  
        for (TpEnderParticipante tp : TpEnderParticipante.values()) {  
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