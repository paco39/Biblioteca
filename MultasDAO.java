/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import dominio.Multas;
import java.util.List;
/**
 *
 * @author SAID
 */
public interface MultasDAO {
    public String Buscamultaporclave(String clavemulta);
    public List<Multas> regresatodaslasmultas();
    public List<Multas> buscaUssuariosnombre(String nombre);
    public boolean Cambiaestadomulta(String estadomulta);
    public boolean RegistraMultas(Multas multausuario);
    public float Recargospordia (Multas multausuario);
    public boolean pagomultas (Multas multausuario);
}
