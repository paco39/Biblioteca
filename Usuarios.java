/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author EHECA
 */
public class Usuarios {
    private String nombre;
    private String matricula;
    private String carrera;
    private int semestreencurso;
    private int telefono;
    private String facultad;
    private String direccion;
    private String correoelectronico;

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the semestreencurso
     */
    public int getSemestreencurso() {
        return semestreencurso;
    }

    /**
     * @param semestreencurso the semestreencurso to set
     */
    public void setSemestreencurso(int semestreencurso) {
        this.semestreencurso = semestreencurso;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the correoelectronico
     */
    public String getCorreoelectronico() {
        return correoelectronico;
    }

    /**
     * @param correoelectronico the correoelectronico to set
     */
    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
}
