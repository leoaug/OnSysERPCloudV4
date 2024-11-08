/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.tipos;
/*
 * @author Administrador
 */
public enum QualificacaoAssinante {
    Diretor(203,"Diretor"),ConselheiroAdm(202,"Conselheiro de Administração"), Administrador(205,"Administrador"), 
    AdministradorGrupo(206,"Administrador do Grupo"), AdministradorSociedade(207,"Administrador de Sociedade Filiada"),
    AdmJudicialPF(220,"Administrador Judicial-Pessoa Física"), AdmJudicialPJ(222,"Administrador Judicial-Pessoa Jurídica"),
    AdmJudicialGestor(223,"Administrador Judicial-Gestor"), GestorJudicial(226,"Gestor Judicial"), Procurador(309,"Procurador"),
    Inventariante(312,"Inventariante"),Liquidante(313,"Liquidante"), Interventor(315,"Interventor"),Empresario(801,"Empresário"),
    ContadorContabilista(900,"Contador/Contabilista"),Outros(999,"Outros");
  
    private final int id;  
    private final String description;  
  
    QualificacaoAssinante(int id, String description) {  
        this.id = id;  
        this.description = description;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public static QualificacaoAssinante getInstance(int id) {  
        for (QualificacaoAssinante tp : QualificacaoAssinante.values()) {  
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