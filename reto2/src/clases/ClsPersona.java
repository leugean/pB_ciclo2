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
public class ClsPersona {
    private String nombre;
    private String apellidos;
    private String num_Doc;
    private String correoElectronico;
    
    //constructor de la clase

    public ClsPersona(String nombre, String apellidos, String num_Doc, String correoElectronico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_Doc = num_Doc;
        this.correoElectronico = correoElectronico;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the num_Doc
     */
    public String getNum_Doc() {
        return num_Doc;
    }

    /**
     * @param num_Doc the num_Doc to set
     */
    public void setNum_Doc(String num_Doc) {
        this.num_Doc = num_Doc;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
