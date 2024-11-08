package br.com.onsys.session.sac;


import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.comercial.TiposAcao;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class TiposAcaoSession extends BasicSessionBean {
    
    public List<TiposAcao> getAll(int idEmpresa) {
        return getList(TiposAcao.class,
                "select a "
                + " from TiposAcao a, Empresa b "
                + "where a.empresa = b "
                + "  and b.id = ?1 "
                + "order by a.descricao",idEmpresa);
    }

    public TiposAcao getById(int id) {
        return getPojo(TiposAcao.class,id);
    }

    public TiposAcao getByDescricao(String descricao) {
        return getPojo(TiposAcao.class,"select a "
                + "from TiposAcao a "
                + " where a.descricao = ?1",descricao);
    }
    
    public TiposAcao getByCodigo(int idEmpresa, String codigo) {
        return getPojo(TiposAcao.class,"select a "
                + "  from TiposAcao a, Empresa b"
                + " where a.empresa   = b "
                + "   and b.id        = ?1 "
                + "   and a.codigo    = ?2",idEmpresa, codigo);
    }        
    
    public TiposAcao save(TiposAcao emp) {
        getEm().persist(emp);
        return emp;
    }

    public TiposAcao set(TiposAcao emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(TiposAcao emp) {
        TiposAcao empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}