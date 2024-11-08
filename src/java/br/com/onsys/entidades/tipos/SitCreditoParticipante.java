package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum SitCreditoParticipante {
    Normal(1,"Normal"),PgaVista(2,"Pg a Vista"),Suspenso(3,"Suspenso"),Automatico(4,"Automatico"),SoImpPed(5,"So Imp. Ped");
  
    private final int id;  
    private final String description;  
  
    SitCreditoParticipante(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static SitCreditoParticipante getInstance(int id) {  
        for (SitCreditoParticipante tp : SitCreditoParticipante.values()) {  
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