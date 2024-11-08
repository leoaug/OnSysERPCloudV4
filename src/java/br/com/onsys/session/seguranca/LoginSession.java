/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.ejb.*;

/**
 *
 * @author Cristiano
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class LoginSession extends BasicSessionBean {
    
    public Usuario idUsuarioOk(String email, String senha){
        return getPojo(Usuario.class,"select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and usuario.email = ?1 "
                + "  and usuario.senha = ?2 ",email, senha);
    }
    
    public Usuario usuarioToken(String token){
        return getPojo(Usuario.class,"select u "
                + "from Usuario u, Empresa e   "
                + "where u.empresa = e         "                
                + "  and u.token = ?1 ",token);
    }
    
}