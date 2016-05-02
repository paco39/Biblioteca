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
public class Revista extends Escrito{
    private String periodoRevista;
    private String issn;
    private String editorial;

    /**
     * @return the periodoRevista
     */
    public String getPeriodoRevista() {
        return periodoRevista;
    }

    /**
     * @param periodoRevista the periodoRevista to set
     */
    public void setPeriodoRevista(String periodoRevista) {
        this.periodoRevista = periodoRevista;
    }

    /**
     * @return the issn
     */
    public String getIssn() {
        return issn;
    }

    /**
     * @param issn the issn to set
     */
    public void setIssn(String issn) {
        this.issn = issn;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
