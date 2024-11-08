package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Favoritos;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FavoritosSession extends BasicSessionBean {
    
    public List<Favoritos> getAll(int idEmpresa) {
        return getList(Favoritos.class,""
                + "select a "
                + "from Favoritos a, Empresa b, Programa c "
                + "where a.empresa  = b  "
                + "  and a.programa = c  "
                + "  and b.id       = ?1 "
                + "order by c.codigo ", idEmpresa);
    }

    public List<Favoritos> getAllByUsr(int idEmpresa, int idUsr) {
        return getList(Favoritos.class,""
                + "select a "
                + "from Favoritos a, Empresa b, Usuario c "
                + "where a.empresa  = b  "
                + "  and a.usuario  = c  "
                + "  and b.id       = ?1 "
                + "  and c.id       = ?2 ", idEmpresa, idUsr);
    }
    
    public List<Favoritos> getAllOrderDescricao(int idEmpresa) {
        return getList(Favoritos.class,""
                + "select a "
                + "from Favoritos a, Empresa b, Programa c "
                + "where a.empresa  = b  "
                + "  and a.programa = c "
                + "  and b.id       = ?1 "
                + "order by c.descricao ", idEmpresa);
    }
    
    public Favoritos getById(int id) {
        return getPojo(Favoritos.class,id);
    }

    public Favoritos getByEmpProgUsr(int idEmpresa, int idPrograma, int idUsr) {
        return getPojo(Favoritos.class,""
                + "select a "
                + "from Favoritos a, Programa b, Usuario c, Empresa d "
                + "where a.programa     = b  "
                + "  and a.usuario      = c  "
                + "  and a.empresa      = d  "
                + "  and b.empresa      = d  "
                + "  and d.id           = ?1 "
                + "  and b.id           = ?2 "
                + "  and c.id           = ?3 ", idEmpresa, idPrograma, idUsr);
    }
    
    public Favoritos save(Favoritos emp) {
        getEm().persist(emp);
        return emp;
    }

    public Favoritos set(Favoritos emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Favoritos emp) {
        Favoritos empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}