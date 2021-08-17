/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leugean
 */
public class Cuenta {
    
    private String numero_tarjeta;
    private double cupo_disponible;

    public Cuenta() {
    }

    public Cuenta(String numero_tarjeta, double cupo_disponible) {
        this.numero_tarjeta = numero_tarjeta;
        this.cupo_disponible = cupo_disponible;
    }

    /**
     * @return the numero_tarjeta
     */
    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    /**
     * @param numero_tarjeta the numero_tarjeta to set
     */
    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    /**
     * @return the cupo_disponible
     */
    public double getCupo_disponible() {
        return cupo_disponible;
    }

    /**
     * @param cupo_disponible the cupo_disponible to set
     */
    public void setCupo_disponible(double cupo_disponible) {
        this.cupo_disponible = cupo_disponible;
    }
    
    
    
}
