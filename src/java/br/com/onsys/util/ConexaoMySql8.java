/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.onsys.util;

//import br.com.onsys.faces.comercial.ExcRepositorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoMySql8 {
    
    private static Connection conn;
    
    public static Connection getConexao()  {
        
        //Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        /* Declare other variables. */
        String url;
        String username = "admin";
        String password = "e?KHrG09";
        String database = "onsys";
        String hostname = "154.12.255.68";
        String port = "3306";
        String sql;

        /* Attempt a connection. */
        try {
            // Set URL.
            url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

            // Create instance of MySQLDriver.
            System.out.println("aqui 01");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("aqui 02");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("aqui 03");

            // Query the version of the database.
            sql = "SELECT version()";
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sql);
            System.out.println("Database connection established");

            // Read row returns for one column.
            while (rset.next()) {
                System.out.println("MySQLDriver Version [" + rset.getString(1) + "]");
            }
        } catch (SQLException e) {
            System.err.println("Cannot connect to database server:");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot find MySQL driver class:");
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.err.println("Cannot instantiate class:");
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.err.println("Illegal access exception:");
            System.out.println(e.getMessage());
        }
        
        //finally {
        //    if (conn != null) {
        //        try {
        //            rset.close();
        //            stmt.close();
        //            conn.close();
        //            System.out.println("Database connection terminated");
        //        } catch (Exception e) {
        //            /* ignore close errors */ }
        //    }
        //}
        
        return conn;
    }
    
}