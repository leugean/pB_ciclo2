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
public class Pedido_simple extends Pedido{
    
    public Pedido_simple(String codigo_producto, int numero_productos, int valor_total, Estado_pedido estado_pedido) {
        super(codigo_producto, numero_productos, valor_total, estado_pedido);
    }
    
}
