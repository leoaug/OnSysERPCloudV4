/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Andre
 */
public class SincronizarMagaluProcessado {
    private ResultSet rs;
    private String query = ""; 
    private Connection                      conn;    
    private PreparedStatement               stmt;
    
    public void listar(){
        try {
        query = "select p.nrpedcli as nrpedcli "
            + "from PedidoVendas p "
            + "where p.empresa_id      = 12 "
            + "  and p.situacao        = 'Aberto' "        
            + "  and (p.`REPRESENTANTE_ID` = 5549544  "
            + "    or p.`REPRESENTANTE_ID` = 5549543  "
            + "    or p.`REPRESENTANTE_ID` = 6194534  "
            + "    or p.`REPRESENTANTE_ID` = 6194537  "
            + "    or p.`REPRESENTANTE_ID` = 6653287) ";
 
            System.out.println("***PEDIDOS PROCESSADO MAGALU - PONTO 2***");
 
            conn = (Connection) Conexao.getConexao();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            
            System.out.println("***PEDIDOS PROCESSADO MAGALU - PONTO 3***");
            
            while (rs.next()) {
                System.out.println("PEDIDO===>"+rs.getString(1));
 
            }                        
            
        } catch (Exception e) {
        }
    }
    
}
