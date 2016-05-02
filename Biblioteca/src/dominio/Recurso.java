/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Paco
 */
public class Recurso {
    private String fechaDePublicacion;
    private int numeroDeCopias;
    private int id;
    private int nombre;

    /**
     * @return the fechaDePublicacion
     */
    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    /**
     * @param fechaDePublicacion the fechaDePublicacion to set
     */
    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    /**
     * @return the numeroDeCopias
     */
    public int getNumeroDeCopias() {
        return numeroDeCopias;
    }

    /**
     * @param numeroDeCopias the numeroDeCopias to set
     */
    public void setNumeroDeCopias(int numeroDeCopias) {
        this.numeroDeCopias = numeroDeCopias;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
}
