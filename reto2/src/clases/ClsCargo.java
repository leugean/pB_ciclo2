/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Leugean
 */
public class ClsCargo {
    private String nombre_cargo;
    private String jerarquia;

    public ClsCargo(String nombre_cargo, String jerarquia) {
        this.nombre_cargo = nombre_cargo;
        this.jerarquia = jerarquia;
    }

    
   
    
    

    /**
     * @return the nombre_cargo
     */
    public String getNombre_cargo() {
        return nombre_cargo;
    }

    /**
     * @param nombre_cargo the nombre_cargo to set
     */
    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    /**
     * @return the jerarquia
     */
    public String getJerarquia() {
        return jerarquia;
    }

    /**
     * @param jerarquia the jerarquia to set
     */
    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }
    
    
    
}
