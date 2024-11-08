package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.TranspUFTipoFrete;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class TranspUFTipoFreteSession extends BasicSessionBean {
    
    public List<TranspUFTipoFrete> getAll(int idEmpresa) {
        return getList(TranspUFTipoFrete.class,"select a "
                + "from TranspUFTipoFrete a, Empresa b, Estado c "
                + "where a.empresa  = b  "                
                + "  and a.estado   = c  "                
                + "  and b.id       = ?1 "
                + "order by c.uf", idEmpresa);
    }

    public TranspUFTipoFrete getById(int id) {
        return getPojo(TranspUFTipoFrete.class,id);
    }

    public TranspUFTipoFrete getByNomeFantasia(String descricao) {
        return getPojo(TranspUFTipoFrete.class,"select transp "
                + "from Transportadora transp "
                + " where transp.nomefantasia = ?1",descricao);
    }

    public TranspUFTipoFrete getByTranspUFTpFrete(int idEmpresa, int idEstado, int idMunicipio ) {
        return getPojo(TranspUFTipoFrete.class,"select a "
                + " from TranspUFTipoFrete a, Empresa b, Estado d, Municipio e"
                + " where a.empresa         = b "
                + "   and a.estado          = d "
                + "   and a.municipio       = e "                
                + "   and b.id = ?1 "
                + "   and d.id = ?2 "
                + "   and e.id = ?3 ", idEmpresa, idEstado, idMunicipio);
    }

    public TranspUFTipoFrete getByTranspUFTpFreteUF(int idEmpresa, int idEstado) {
        return getPojo(TranspUFTipoFrete.class,"select a "
                + " from TranspUFTipoFrete a, Empresa b, Estado d"
                + " where a.empresa         = b "
                + "   and a.estado          = d "
                + "   and b.id = ?1 "
                + "   and d.id = ?2 ", idEmpresa, idEstado);
    }
    
    public TranspUFTipoFrete getByTranspUFTpFreteMunicipio(int idEmpresa, String UF, String nomeMunicipio ) {
        return getPojo(TranspUFTipoFrete.class,"select a "
                + " from TranspUFTipoFrete a, Empresa b, Estado d, Municipio e"
                + " where a.empresa         = b "
                + "   and a.estado          = d "
                + "   and a.municipio       = e "                
                + "   and b.id = ?1 "
                + "   and d.uf = ?2 "
                + "   and e.descricao = ?3 ", idEmpresa, UF, nomeMunicipio);
    }

    public TranspUFTipoFrete getByTranspUFTpFrete(int idEmpresa, String UF) {
        return getPojo(TranspUFTipoFrete.class,"select a "
                + " from TranspUFTipoFrete a, Empresa b, Estado d"
                + " where a.empresa         = b "
                + "   and a.estado          = d "
                + "   and a.municipio       is null "               
                + "   and b.id = ?1 "
                + "   and d.uf = ?2 ", idEmpresa, UF);
    }
    
    public TranspUFTipoFrete save(TranspUFTipoFrete emp) {
        getEm().persist(emp);
        return emp;
    }

    public TranspUFTipoFrete set(TranspUFTipoFrete emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(TranspUFTipoFrete emp) {
        TranspUFTipoFrete empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}