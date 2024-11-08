package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.AreaTransporte;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class AreaTransporteSession extends BasicSessionBean {
    
    public List<AreaTransporte> getAll(int idEmpresa) {
        return getList(AreaTransporte.class,"select areatransp "
                + "from AreaTransporte areatransp, Empresa emp "
                + "where areatransp.empresa = emp and emp.id = ?1 "
                + "order by areatransp.nome", idEmpresa);
    }
    
    public List<AreaTransporte> getAreaTransByCliente(int idEmpresa, int idCliente) {
        return getList(AreaTransporte.class,"select areatransp "
                + "from AreaTransporte areatransp, Empresa emp, Participante cli "
                + "where areatransp.empresa = emp"
                + "  and cli.areatransporte = areatransp  "
                + "  and emp.id = ?1 "
                + "  and cli.id = ?2 "
                + "order by areatransp.nome", idEmpresa, idCliente );
    }

    public AreaTransporte getById(int id) {
        return getPojo(AreaTransporte.class,id);
    }

    public AreaTransporte getByNome(int idEmpresa, String descricao) {
        return getPojo(AreaTransporte.class,"select areatransp "
                + "from AreaTransporte areatransp, Empresa emp "
                + "where areatransp.empresa = emp and emp.id = ?1 "
                + "  and areatransp.nome = ?2",idEmpresa, descricao);
    }
        
    public AreaTransporte getByNomeFantasia(String descricao) {
        return getPojo(AreaTransporte.class,"select areatransp "
                + "from AreaTransporte areatransp, Transportadora transp "
                + "where areatransp.transportadora = transp "
                + "  and transp.nomefantasia = ?1",descricao);
    }

    public AreaTransporte getByCodigo(int idEmpresa, String codigo) {
        return getPojo(AreaTransporte.class,"select areatransp from AreaTransporte areatransp, "
                + "Empresa emp where areatransp.empresa = emp "
                + "and emp.id = ?1 "
                + "and areatransp.codigo = ?2 ", idEmpresa, codigo);
    }
    
    public AreaTransporte save(AreaTransporte emp) {
        getEm().persist(emp);
        return emp;
    }

    public AreaTransporte set(AreaTransporte emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(AreaTransporte emp) {
        AreaTransporte empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}