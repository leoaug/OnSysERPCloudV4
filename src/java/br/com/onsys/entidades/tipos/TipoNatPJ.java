package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoNatPJ {
    Empresa(1,"Sociedade empresarial em geral"),Cooperativa(2,"Sociedade cooperativa"),Outras(3,"Outras");
  
    private final int id;  
    private final String description;  
  
    TipoNatPJ(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoNatPJ getInstance(int id) {  
        for (TipoNatPJ tp : TipoNatPJ.values()) {  
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