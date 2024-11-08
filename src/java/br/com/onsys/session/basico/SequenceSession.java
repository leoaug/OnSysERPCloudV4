package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Sequence;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SequenceSession extends BasicSessionBean {    
    
    public Sequence getByName(String descricao) {
        return getPojo(Sequence.class,"select s "
                + "from Sequence s "
                + "where s.seqName = ?1", descricao);
    }   
    
    public Sequence save(Sequence emp) {
        getEm().persist(emp);
        return emp;
    }

    public Sequence set(Sequence emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Sequence emp) {
        Sequence empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}