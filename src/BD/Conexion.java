/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    Connection conecta=null;
    
    public Connection conexion(){
    
        String cadena= "jdbc:postgresql://localhost:5432/examen";
        try{
            Class.forName("org.postgresql.Driver");
            conecta = DriverManager.getConnection(cadena,"postgres","1234");
            if (conecta != null){
                System.out.println(" Conexion Exitosa ");
            }
            
        }catch(Exception exc){
                System.out.println(" Error: " + exc.getMessage());
        }
        return conecta;
    }
}
    
