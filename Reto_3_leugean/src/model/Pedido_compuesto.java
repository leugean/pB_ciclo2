
package model;

/**
 *
 * @author leugean
 */
public class Pedido_compuesto extends Pedido {
    
    public Pedido_compuesto(String codigo_producto, int numero_productos, int valor_total, Estado_pedido estado_pedido) {
        super(codigo_producto, numero_productos, valor_total, estado_pedido);
    }
    
}
