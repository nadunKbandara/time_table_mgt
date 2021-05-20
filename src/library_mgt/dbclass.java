/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_mgt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author BIG-BLAST
 */
public class dbclass {
    
    public static Connection c;
    public static void createMyconnection()throws Exception{
        String URL = "jdbc:mysql://localhost:3306/nadun";
        String USER = "root";
        String PASS = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection(URL, USER, PASS);
        
    }
    public static void iud(String sql) throws Exception{
        if(c == null){
            createMyconnection();
        }
        c.createStatement().executeUpdate(sql);
    }
    public static ResultSet search(String sql) throws Exception{
        if(c == null){
            createMyconnection();
        }
        return c.createStatement().executeQuery(sql);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
