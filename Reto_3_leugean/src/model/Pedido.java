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
public class Pedido {
   
    private int numero_productos;
    private int valor_total;
    private Estado_pedido estado_pedido;

    public Pedido(int numero_productos, int valor_total, Estado_pedido estado_pedido) {
        this.numero_productos = numero_productos;
        this.valor_total = valor_total;
        this.estado_pedido = estado_pedido;
    }
    
    

    

    /**
     * @return the numero_productos
     */
    public int getNumero_productos() {
        return numero_productos;
    }

    /**
     * @param numero_productos the numero_productos to set
     */
    public void setNumero_productos(int numero_productos) {
        this.numero_productos = numero_productos;
    }

    /**
     * @return the valor_total
     */
    public int getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the estado_pedido
     */
    public Estado_pedido getEstado_pedido() {
        return estado_pedido;
    }

    /**
     * @param estado_pedido the estado_pedido to set
     */
    public void setEstado_pedido(Estado_pedido estado_pedido) {
        this.estado_pedido = estado_pedido;
    }
    
}
