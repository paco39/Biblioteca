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
public class Multas {
    private String clavemulta;
    private String fechamulta;
    private Float preciopormulta;
    private String fechapago;
    private String estadomulta;
    private int diastranscurridos;
    

    /**
     * @return the clavemulta
     */
    public String getClavemulta() {
        return clavemulta;
    }

    /**
     * @param clavemulta the clavemulta to set
     */
    public void setClavemulta(String clavemulta) {
        this.clavemulta = clavemulta;
    }

    /**
     * @return the fechamulta
     */
    public String getFechamulta() {
        return fechamulta;
    }

    /**
     * @param fechamulta the fechamulta to set
     */
    public void setFechamulta(String fechamulta) {
        this.fechamulta = fechamulta;
    }

    /**
     * @return the preciopormulta
     */
    public Float getPreciopormulta() {
        return preciopormulta;
    }

    /**
     * @param preciopormulta the preciopormulta to set
     */
    public void setPreciopormulta(Float preciopormulta) {
        this.preciopormulta = preciopormulta;
    }

    /**
     * @return the fechapago
     */
    public String getFechapago() {
        return fechapago;
    }

    /**
     * @param fechapago the fechapago to set
     */
    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    /**
     * @return the estadomulta
     */
    public String getEstadomulta() {
        return estadomulta;
    }

    /**
     * @param estadomulta the estadomulta to set
     */
    public void setEstadomulta(String estadomulta) {
        this.estadomulta = estadomulta;
    }

    /**
     * @return the diastranscurridos
     */
    public int getDiastranscurridos() {
        return diastranscurridos;
    }

    /**
     * @param diastranscurridos the diastranscurridos to set
     */
    public void setDiastranscurridos(int diastranscurridos) {
        this.diastranscurridos = diastranscurridos;
    }
}
