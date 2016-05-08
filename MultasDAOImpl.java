/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;
import dominio.Multas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SAID
 */
public class MultasDAOImpl implements MultasDAO {
   private final ConexionBd conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public MultasDAOImpl(){
           conexion= new ConexionBd();
    }

    @Override
    public String Buscamultaporclave(String clavemulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Multas> regresatodaslasmultas() {
        List<Multas> multa = new ArrayList<>();
        try {
            connection= conexion.ObtenerConexion();
             consulta=connection.createStatement();
             resultados= consulta.executeQuery("select * from Usuarios");
             while(resultados.next()){
                 Multas multausuario= new Multas();
                 multausuario.setClavemulta(resultados.getString("clavemultas"));
                multausuario.setDiastranscurridos(resultados.getInt("diastranscurridos"));
                 multausuario.setEstadomulta(resultados.getString("estado multas"));
                 multausuario.setFechapago(resultados.getString("fecha de pago"));
                 multausuario.setFechamulta(resultados.getString("fecha de la multa"));
                multausuario.setPreciopormulta(resultados.getFloat("precio por multa"));
                 multa.add(multausuario);
             }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conexion.desconecta();
        }
       return multa;
    }

    @Override
    public List<Multas> buscaUssuariosnombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cambiaestadomulta(String estadomulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RegistraMultas(Multas multausuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Recargospordia(Multas multausuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean pagomultas(Multas multausuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
