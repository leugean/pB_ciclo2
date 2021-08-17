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
public class Producto {
    private String codigo_producto;
    private String nombre_producto;
    private int valor_producto;
    private int disponibilidad;
    private int valorTotalProducto;
    private Linea_pedido linea;
   

    public Producto(String codigo_producto, String nombre_producto, int valor_producto, int disponibilidad, int valorTotalProducto) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.valor_producto = valor_producto;
        this.disponibilidad = disponibilidad;
        this.valorTotalProducto = valorTotalProducto;
    }
     
    
    

    /**
     * @return the codigo_producto
     */
    public String getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @return the nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * @param nombre_producto the nombre_producto to set
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    /**
     * @return the valor_producto
     */
    public int getValor_producto() {
        return valor_producto;
    }

    /**
     * @param valor_producto the valor_producto to set
     */
    public void setValor_producto(int valor_producto) {
        this.valor_producto = valor_producto;
    }

    /**
     * @return the disponibilidad
     */
    public int getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

   

    /**
     * @return the valorTotalProducto
     */
    public int getValorTotalProducto() {
        return valorTotalProducto;
    }

    /**
     * @param valorTotalProducto the valorTotalProducto to set
     */
    public void setValorTotalProducto(int valorTotalProducto) {
        this.valorTotalProducto = valorTotalProducto;
    }

    /**
     * @return the linea
     */
    public Linea_pedido getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(Linea_pedido linea) {
        this.linea = linea;
    }
    
}
