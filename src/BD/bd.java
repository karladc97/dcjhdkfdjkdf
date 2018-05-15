/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SISTEMAS
 */
public class bd {
     public static String url = "jdbc:postgresql://localhost:5432/examen";
    public static String user = "postgres";
    public static String password = "1234";
    
    
     public static Connection getConnection() {
         
        Connection conn= null;
        try{
           conn= DriverManager.getConnection(url,user,password) ;
           
        } catch(SQLException ex){
                ex.printStackTrace();
            }              
         return null;
   }
}
