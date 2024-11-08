package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TpRegimeTributario {
    Simples(1,"Simples"),Presumido(2,"Lucro presumido"),Real(3,"Lucro real");
  
    private final int id;  
    private final String description;  
  
    TpRegimeTributario(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TpRegimeTributario getInstance(int id) {  
        for (TpRegimeTributario tp : TpRegimeTributario.values()) {  
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