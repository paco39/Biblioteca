/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import dominio.Usuarios;
import java.util.List;

/**
 *
 * @author EHECA
 */
public interface UsuariosDAO {
    public Usuarios BuscaUsuariospormatricula(String matricula);
    public List<Usuarios> regresatodosdatos();
    public List<Usuarios> buscaUssuariosnombre(String nombre);
    public boolean DardebajaUsuario(String nombre);
    public boolean RegistrarUsuarios(Usuarios usuariobiblioteca);
    public boolean ActualizarUsuario(Usuarios usuariobiblioteca);
}
