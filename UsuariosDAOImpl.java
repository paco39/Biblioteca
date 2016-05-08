/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

/**
 *
 * @author SAID
 */
import dominio.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuariosDAOImpl implements UsuariosDAO {

    private final ConexionBd conexion;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public UsuariosDAOImpl(){
        conexion= new ConexionBd();
    }
    
    @Override
    public Usuarios BuscaUsuariospormatricula(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuarios> regresatodosdatos() {
        List<Usuarios> Usuario = new ArrayList<>();
        try {
            connection= conexion.ObtenerConexion();
             consulta=connection.createStatement();
             resultados= consulta.executeQuery("select * from Usuarios");
             while(resultados.next()){
                 Usuarios user= new Usuarios();
                 user.setNombre(resultados.getString("nrc"));
                 user.setMatricula(resultados.getString("nombre"));
                 user.setCarrera(resultados.getString("descripcion"));
                 user.setCorreoelectronico(resultados.getString("correo electronico"));
                 user.setDireccion(resultados.getString("direccion"));
                 user.setFacultad(resultados.getString("facultad"));
                 user.setSemestreencurso(resultados.getInt("semestre"));
                 user.setTelefono(resultados.getInt("telefono"));
                 Usuario.add(user);
             }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conexion.desconecta();
        }
       return Usuario;
    }

    @Override
    public List<Usuarios> buscaUssuariosnombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DardebajaUsuario(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RegistrarUsuarios(Usuarios usuariobiblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ActualizarUsuario(Usuarios usuariobiblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
