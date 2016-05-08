/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecadao;

import Acceso.UsuariosDAO;
import Acceso.UsuariosDAOImpl;
import dominio.Usuarios;
import Acceso.MultasDAO;
import Acceso.MultasDAOImpl;
import dominio.Multas;
import java.util.List;

/**
 *
 * @author EHECA
 */
public class BibliotecaDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      UsuariosDAO user = new UsuariosDAOImpl();
        MultasDAO multausuario= new MultasDAOImpl();
        
        List<Usuarios> Usuario = user.regresatodosdatos();
        
        for (Usuarios usuario: Usuario){
            System.out.println(String.format("matricula"));
            
        }
         List<Multas> multa = multausuario.regresatodaslasmultas();
        
        for (Multas multauser: multa){
            System.out.println(String.format("clavemulta"));
    }
    }
    }
    
