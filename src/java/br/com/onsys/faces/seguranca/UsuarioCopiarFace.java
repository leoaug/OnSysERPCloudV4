/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.session.seguranca.UsuarioSession;
import br.com.onsys.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
/**
 * @author Assis
 */
@Named
@SessionScoped
public class UsuarioCopiarFace extends BaseCDIBean<Usuario>   {
    private static final long serialVersionUID = 7L;
    @Inject
    private UsuarioSession  bean;
    @Inject
    private UsuarioFace     usuarioFace;  
    Connection              conn;
    PreparedStatement       stmt;
    private String          query = "";        
    private List<Usuario>   list;    
    
    public UsuarioCopiarFace() {
        setSelectedBean(new Usuario());
    }
    
    public void copiar(Usuario registroParaCopirar) throws SQLException {
        System.out.println("***UsuarioCopiarFace.copiar***");
        System.out.println("APELIDO===>"+registroParaCopirar.getApelido());
        //try {
//            pedidoVendas = bean.getPedidoByNrPedido(usuarioFace.getLoggedUser().getEmpresa().getId(), pedido.getNrpedido());
        //} catch (Exception e) {
//            pedidoVendas = bean.getPedidoVendasById(pedido.getId());            
        //}        
        
//        Integer iNrPedido        = null;        
//        Integer idPedido        = null;        
//        Integer idTransporte    = null;
        
        try {
            System.out.println("***UsuarioCopiarFace.copiar 1.1***");
            conn = (Connection) Conexao.getConexao();
            System.out.println("***UsuarioCopiarFace.copiar 1.2***");            
        } catch (Exception e) {            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ", "Erro na copia do registro."));
        }
        
        System.out.println("PONTO 1.3");
        
//        queryNrPedido = "select * "
//                      + "from ParamComercial p "
//                      + "where p.empresa_id ="+usuarioFace.getLoggedUser().getEmpresa().getId();
//
//        stmt = conn.prepareStatement(queryNrPedido);            
//        ResultSet rs = stmt.executeQuery();
//        rs.beforeFirst();
//        while (rs.next()){ 
//            iNrPedido = rs.getInt("p.ultpedido");
//            iNrPedido++;
//        }
//        queryNrPedido = "update ParamComercial set ParamComercial.ultpedido = "+iNrPedido
//                      + " where ParamComercial.empresa_id ="+usuarioFace.getLoggedUser().getEmpresa().getId();
//
//        stmt = conn.prepareStatement(queryNrPedido);
//        System.out.println("query--->"+queryNrPedido);
//        stmt.execute();
//        stmt.close();

        query = "insert into usuario(apelido, email, nome, senha, dashboard," +
                "tipo, empresa_id, estabelecimento_id) " +
                "values ('"+registroParaCopirar.getApelido()+","
                        +registroParaCopirar.getEmail()+","                    
                        +registroParaCopirar.getNome()+",'123456',"
                        +registroParaCopirar.getDashboard()+","
                        +registroParaCopirar.getTipo()+","                
                        +registroParaCopirar.getEmpresa().getId()+", "
                        +registroParaCopirar.getEstabelecimento().getId()+")"; 

        stmt = conn.prepareStatement(query);
        System.out.println("query--->"+query);
        stmt.execute();
        stmt.close();
        
    }

    public UsuarioFace getUsuarioFace() {
        return usuarioFace;
    }

    public void setUsuarioFace(UsuarioFace usuarioFace) {
        this.usuarioFace = usuarioFace;
    }
   
}
