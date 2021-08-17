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
public class Cliente {
    
    private String nombre;
    private String tipo_docum;
    private String documento;
    private String direccion;
    private String telefono;
    private String email;
    private Cuenta Cuenta;

    public Cliente() {
    }

    public Cliente(String nombre, String tipo_docum, String documento, String direccion, String telefono, String email, Cuenta Cuenta) {
        this.nombre = nombre;
        this.tipo_docum = tipo_docum;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.Cuenta = Cuenta;
    }
    
    

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
     * @return the tipo_docum
     */
    public String getTipo_docum() {
        return tipo_docum;
    }

    /**
     * @param tipo_docum the tipo_docum to set
     */
    public void setTipo_docum(String tipo_docum) {
        this.tipo_docum = tipo_docum;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the Cuenta
     */
    public Cuenta getCuenta() {
        return Cuenta;
    }

    /**
     * @param Cuenta the Cuenta to set
     */
    public void setCuenta(Cuenta Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    
    
}
