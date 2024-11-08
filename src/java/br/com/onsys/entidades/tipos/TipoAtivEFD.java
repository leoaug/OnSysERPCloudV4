package br.com.onsys.entidades.tipos;
/**
 *
 * @author Administrador
 */
public enum TipoAtivEFD {
    Industria(1,"Industrial ou equiparado a industrial"),Servico(2,"Prestador de serviços"),Comercio(3,"Atividade de comércio"),Financeira(4,"Atividade financeira"),Imobiliaria(5,"Atividade imobiliária"),Outros(9,"Outros");
  
    private final int id;  
    private final String description;  
  
    TipoAtivEFD(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static TipoAtivEFD getInstance(int id) {  
        for (TipoAtivEFD tp : TipoAtivEFD.values()) {  
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