
package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.LogTrans;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.session.seguranca.LogTransSession;
//import br.com.onsys.session.seguranca.LogTransSession;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class LogTransFace extends BaseCDIBean<LogTrans>  {
    
    private static final long serialVersionUID = 9L;
    @Inject
    private LogTransSession           bean;
    
    public LogTransFace() {
        setSelectedBean(new LogTrans());
    }

    public boolean doCreate(Empresa empresa, Date dtTrans, String operacao, String detalheOperacao, Usuario usuario) {

        String tDetalheOperacao = null;
        
        try {
            tDetalheOperacao = operacao + detalheOperacao;
        } catch (Exception e) {
        }        
        setSelectedBean(new LogTrans());
        getSelectedBean().setData(dtTrans); 
        getSelectedBean().setEmpresa(empresa);
        getSelectedBean().setOperacao(tDetalheOperacao);                                 
        getSelectedBean().setUsuario(usuario);
        bean.save(getSelectedBean());
        return true;
    }    
    
    
    public boolean criar(Empresa empresa, Date dtTrans, String operacao, String detalheOperacao, Usuario usuario, Programa programa) {

        String tDetalheOperacao = null;
        
        try {
            tDetalheOperacao = operacao + detalheOperacao;
        } catch (Exception e) {
        }        
        setSelectedBean(new LogTrans());
        getSelectedBean().setData(dtTrans); 
        getSelectedBean().setEmpresa(empresa);
        getSelectedBean().setOperacao(tDetalheOperacao);
        getSelectedBean().setPrograma(programa);
        getSelectedBean().setUsuario(usuario);
        bean.save(getSelectedBean());
        return true;
    }            
    
}