package br.com.onsys.session.sac;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.SubcatOcorrencia;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SubCatOcorSession extends BasicSessionBean {
    
    public List<SubcatOcorrencia> getAllSubCatOcor(int idEmpresa) {
        return getList(SubcatOcorrencia.class,""
                + "select subcatocor "
                + "from SubcatOcorrencia subcatocor, Empresa emp "
                + "where subcatocor.empresa = emp and emp.id = ?1",idEmpresa);
    }
    
    public SubcatOcorrencia getSubCatOcorById(int id) {
        return getPojo(SubcatOcorrencia.class,id);
    }

    public SubcatOcorrencia getSubCatOcorByDescricao(int idEmpresa, String descricao) {
        return getPojo(SubcatOcorrencia.class,"select subcatocor "
                + "from SubcatOcorrencia subcatocor, Empresa emp "
                + "where subcatocor.empresa = emp and emp.id = ?1 and "
                + "subcatocor.descricao = ?2 ",idEmpresa, descricao);
    }
    
    public SubcatOcorrencia getSubCatOcorByCodigo(int idEmpresa, String codigo) {
        return getPojo(SubcatOcorrencia.class,"select subcatocor "
                + "from SubcatOcorrencia subcatocor, "
                + "Empresa emp "
                + "where subcatocor.empresa = emp and emp.id = ?1 and "
                + "subcatocor.codigo = ?2",idEmpresa, codigo);
    }
    
    public SubcatOcorrencia saveSubCatOcor(SubcatOcorrencia emp) {
        getEm().persist(emp);
        return emp;
    }

    public SubcatOcorrencia setSubCatOcor(SubcatOcorrencia emp) {
        getEm().merge(emp);
        return emp;
    }

    public void removeSubCatOcor(SubcatOcorrencia emp) {
        SubcatOcorrencia empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}