/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.ejb;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author benignoms
 */
public class Connection {

    private Connection() {
    }

    public static Connection getMySQLConnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://186.202.67.19:3306/onsys?user=root&password=ReiArthur@2023");
          //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/onsys?user=root&password=334863333");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao conectar-se ao Banco de Dados!");
        }
        return con;

    }
}
