
import clases.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author leugean
 * 
 * 
 */


public class principal {
    
    public static Scanner opciones = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClsEmpleado empleado =new ClsEmpleado();
        ClsCliente cliente =new ClsCliente ();
        
        
        System.out.println("Bienvenido");
        System.out.println("1. clientes  2. empleados");
        int opcion =Integer.parseInt(opciones.nextLine());
        
        if (opcion == 1){
            cliente.cliente_crud();
        }
        else if (opcion == 2){
            ClsEmpleado.crud_empleado();
        }
        else{
            System.out.println("Opcion invalida");
        }
        
      
    }
    
}
