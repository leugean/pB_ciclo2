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
public class ClsEmpresa {
    private String razon_social;
    private String nit;
    private String dir_empresa;

    public ClsEmpresa(String razon_social, String nit, String dir_empresa) {
        this.razon_social = razon_social;
        this.nit = nit;
        this.dir_empresa = dir_empresa;
    }

    /**
     * @return the razon_social
     */
    public String getRazon_social() {
        return razon_social;
    }

    /**
     * @param razon_social the razon_social to set
     */
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the dir_empresa
     */
    public String getDir_empresa() {
        return dir_empresa;
    }

    /**
     * @param dir_empresa the dir_empresa to set
     */
    public void setDir_empresa(String dir_empresa) {
        this.dir_empresa = dir_empresa;
    }
    
    
    
}
