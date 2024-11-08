package br.com.onsys.session.sac;


import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.Acao;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class AcaoSession extends BasicSessionBean {
    
    public List<Acao> getAll(int idEmpresa) {
        return getList(Acao.class,
                "select a "
                + " from Acao a, Empresa b "
                + "where a.empresa = b "
                + "  and b.id = ?1 "
                + "order by a.descricao",idEmpresa);
    }

    public Acao getById(int id) {
        return getPojo(Acao.class,id);
    }

    public Acao getByDescricao(String descricao) {
        return getPojo(Acao.class,"select a "
                + "from Acao a "
                + " where a.descricao = ?1",descricao);
    }
    
    public Acao getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Acao.class,"select a "
                + "  from Acao a, Empresa b"
                + " where a.empresa   = b "
                + "   and b.id        = ?1 "
                + "   and a.codigo    = ?2",idEmpresa, codigo);
    }        
    
    public Acao save(Acao emp) {
        getEm().persist(emp);
        return emp;
    }

    public Acao set(Acao emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Acao emp) {
        Acao empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}