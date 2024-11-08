package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Pais;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PaisSession extends BasicSessionBean {    
    
    public List<Pais> getAll() {
        return getList(Pais.class,"select pais  "
                + "from Pais pais  "
                + "order by pais.descricao ");
    }

    public Pais getById(int id) {
        return getPojo(Pais.class,id);
    }

    public Pais getByDescricao(String descricao) {
        return getPojo(Pais.class,"select pais "
                + "from Pais pais, Empresa emp "
                + "where pais.descricao = ?1", descricao);
    }   

    public Pais getByCodigo(String codigo) {
        return getPojo(Pais.class,"select pais "
                + "from Pais pais "
                + "where pais.codigo    = ?1", codigo);
    } 
    
    public Pais save(Pais emp) {
        getEm().persist(emp);
        return emp;
    }

    public Pais set(Pais emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Pais emp) {
        Pais empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}