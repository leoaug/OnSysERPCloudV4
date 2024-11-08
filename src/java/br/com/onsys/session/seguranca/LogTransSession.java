
package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.LogTrans;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)

public class LogTransSession extends BasicSessionBean {
    
    public List<LogTrans> getAll() {
        return getList(LogTrans.class,""
                + "select a "
                + "from LogTrans a ");
    }
    
    public LogTrans getUltimoById() {
        return getUltPojo(LogTrans.class,"select a "
                + "from LogTrans a "
                + "order by a.id desc",1);
    }    

    public LogTrans getById(int id) {
        return getPojo(LogTrans.class,"select a "
                + "from LogTrans a "
                + "where a.id = ?1", id);
    }

    public LogTrans save(LogTrans emp) {
        getEm().persist(emp);
        return emp;
    }

    public LogTrans set(LogTrans emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(LogTrans emp) {
        LogTrans empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}
