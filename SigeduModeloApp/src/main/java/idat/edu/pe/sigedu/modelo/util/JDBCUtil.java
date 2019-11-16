/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.sigedu.modelo.util;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class JDBCUtil {
    
    private final String usuarioBD = "root";
    private final String passwordBD = "12345678";
    private final String urlConeccion = "jdbc:mysql://localhost:3306/sigedu_db?zeroDateTimeBehavior=convertToNull";
    private final String driverClass = "com.mysql.jdbc.Driver";
    private Connection coneccion;
    private PreparedStatement sentencia;
    private ResultSet resultados;
    
    public JDBCUtil(){
        
        try{
            Class.forName(driverClass);
            coneccion = DriverManager.getConnection(urlConeccion, usuarioBD, passwordBD);
            if(coneccion != null)
                System.out.println("Coneccion Exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
                   
        }
    }

    public Connection getConeccion() {
        return coneccion;
    }
    
    
}
