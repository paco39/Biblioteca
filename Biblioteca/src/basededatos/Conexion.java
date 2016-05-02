/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paco
 */
public class Conexion {
    
    private Connection conexion;
    private final String DB = "jdbc:mysql://127.0.0.1/biblioteca";
    private final String USUARIO = "bibliotecaUser";
    private final String CONTRASENA = "b1bl10t3c4";
    
    public Connection obtenerConexion() throws SQLException{
        conecta();
        return conexion;
    }
    
    private void conecta() throws SQLException{
        conexion = DriverManager.getConnection(DB, USUARIO, CONTRASENA);
    }
    
    public void desconecta(){
        if(conexion != null){
            try {
                if(!conexion.isClosed()){
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
