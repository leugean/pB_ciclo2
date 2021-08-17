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
public class Estado_pedido {
    int pendiente;
    int confirmado;
    int pagado;
    int entregado;
    int rechazado;

    public Estado_pedido(int pendiente, int confirmado, int pagado, int entregado, int rechazado) {
        this.pendiente = pendiente;
        this.confirmado = confirmado;
        this.pagado = pagado;
        this.entregado = entregado;
        this.rechazado = rechazado;
    }
    
    
    
}
