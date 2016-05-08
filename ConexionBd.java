/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EHECA
 */
public class ConexionBd {
    private  Connection  conexion;
    private final String Bd="jdbc:mysql;//127.0.0.1/bibliotecauv";
    private final String Usuario="bibliotecaUser";
    private final String Clave="bibliotecarpio";
    
      public Connection ObtenerConexion() throws SQLException{
        conectar();
        return conexion;
    }
      
      private  void conectar() throws SQLException{
          conexion= DriverManager.getConnection(Bd, Usuario, Clave);
      }
            
      public void desconecta(){
       if(conexion!=null){
           try {
               if(!conexion.isClosed()){
                   conexion.close();
               }
           } catch (SQLException ex) {
               Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   } 
}
