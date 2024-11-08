package br.com.onsys.util;

//import br.com.onsys.faces.comercial.ExcRepositorio;
/* INICIO MYSQL 5 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*FIM MYSQL 5 */

/*INICIO MYSQL 8 
//import br.com.onsys.faces.comercial.ExcRepositorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
FIM MYSQL 8 */

public class ConexaoMySql5 {
    
/* INICIO MYSQL 5 */
    private static Connection con;
    public static Connection getConexao() throws ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
//      String url = "jdbc:mysql://localhost:3306/onsys";
//      String url = "jdbc:mysql://200.98.71.168:3306/onsys";
//      String url = "jdbc:mysql://200.98.71.168:3306/neosige"; 
        String url = "jdbc:mysql://186.202.67.19:3306/onsys?useTimezone=true&serverTimezone=UTC";
//        String url = "jdbc:mysql://186.202.67.19:3306/onsys";
        String login = "root";
        String senha = "ReiArthur@2023";
//      String senha = "onsys";

//      String url = "jdbc:mysql://209.172.53.204:3306/apponsys_onsys";
//      String login = "onsys";
//      String senha = "Corolla@2018";
//
//        try{
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, login, senha);
//        } catch (ClassNotFoundException e){
//            throw new ExcRepositorio("***Driver não encontrado===>"+e.getMessage());
//        } catch (SQLException e){
//            throw new ExcRepositorio("***Erro abrindo conexao===>"+e.getMessage());
//        }


        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, login, senha);
        } catch (SQLException e) {
            //System.out.println("***Erro abrindo conexao===>"+e.getMessage());
        }
        return con;
    }
    
/*FIM MYSQL 5 */        
    
}