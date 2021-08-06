/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leugean
 */
public class ClsCliente extends ClsPersona {
    private String direccion;
    private String celular;

    public ClsCliente() {
        super(null, null, null, null);
    }
    
    
    

    public ClsCliente(String direccion, String celular, String nombre, String apellidos, String num_Doc, String correoElectronico) {
        super(nombre, apellidos, num_Doc, correoElectronico);
        this.direccion = direccion;
        this.celular = celular;
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
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public static Scanner ingreso_clientes = new Scanner(System.in);
    
    public void cliente_crud(){
        ArrayList<ClsCliente> listaClientes = new ArrayList<>();
        boolean salida = false;
        
        while(!salida){
            System.out.println("Elige una opcion");
                System.out.println("   1. Crear cliente");
                System.out.println("   2. Leer cliente");
                System.out.println("   3. Actualizar cliente");
                System.out.println("   4. Eliminar cliente");
                System.out.println("   5. Salir");
                System.out.println("Opcion  ");
                int opcion = Integer.parseInt(ingreso_clientes.nextLine());
                
                
                if (opcion == 1){
                    System.out.println("Nombre: ");
                    String nombre = ingreso_clientes.nextLine();
                    System.out.println("Apellidos: ");
                    String apellidos = ingreso_clientes.nextLine();
                    System.out.println("Numero de documento");
                    String num_doc = ingreso_clientes.nextLine();
                    System.out.println("Correo electronico");
                    String correoElectronico = ingreso_clientes.nextLine();
                    System.out.println("Telefono");
                    String telefono = ingreso_clientes.nextLine();
                    System.out.println("Direccion");
                    String direccion_cliente = ingreso_clientes.nextLine();
                    ClsCliente cliente = new ClsCliente(direccion, celular, nombre, apellidos,num_doc, correoElectronico);
                    listaClientes.add(cliente);
        }
                break;
                
                else if(opcion == 2){
                  System.out.println("El total de empleados es: "+ listaClientes.size());
                    for (int i = 0; i <= listaClientes.size(); i++){
                        
                        System.out.println(listaClientes.get(i).getNombre());
                        System.out.println(listaClientes.get(i).getApellidos());
                        System.out.println(listaClientes.get(i).getNum_Doc());
                        System.out.println(listaClientes.get(i).getCorreoElectronico());
                        System.out.println(listaClientes.get(i).getCelular());
                        System.out.println(listaClientes.get(i).getDireccion());
                        
                        
                        
                    }  
                }
                break;
                
                else if(opcion == 3){
                    System.out.println("Ingrese el indice del cliente a actualizar");
                    int indice = Integer.parseInt(ingreso_clientes.nextLine());
                    ClsCliente cliente = listaClientes.get(indice);
                    System.out.println("Que inormacion desear actualizar: ");
                    System.out.println("   1. Nombre");
                    System.out.println("   2. Apellidos");
                    System.out.println("   3. Documento");
                    System.out.println("   3. Correo Electronico");
                    System.out.println("Escribe el numero:  ");
                    int eleccion = Integer.parseInt(ingreso_clientes.nextLine());
                    
                    switch(eleccion){
                        case 1 :
                            System.out.println("Nombre nuevo: ");
                            String name = ingreso_clientes.nextLine();
                            cliente.setNombre(name);
                            break;
                            
                        case 2: 
                            System.out.println("Apellidos: ");
                            String apellido = ingreso_clientes.nextLine();
                            cliente.setApellidos(apellido);
                            break;
                        
                        case 3: 
                            System.out.println("Documento: ");
                            String documento = ingreso_clientes.nextLine();
                            cliente.setNum_Doc(documento);
                            break;
                            
                        case 4:
                            System.out.println("Correo electronico: ");
                            String email = ingreso_clientes.nextLine();
                            cliente.setCorreoElectronico(email);
                            break;
                        
                        case 5:
                            System.out.println("Telefono: ");
                            String telefono = ingreso_clientes.nextLine();
                            cliente.setCorreoElectronico(email);
                            break;
                        
                        case 6:
                            System.out.println("Direccion: ");
                            String Direccion_cliente = ingreso_clientes.nextLine();
                            cliente.setCorreoElectronico(email);
                            break;
                            
                        default:
                            System.out.println("Opcion invalida, intenta de nuevo");
                    }
                }
                break;
                
                else if(opccion == 4){
                        System.out.println("Ingrese el indice del empleado a eliminar");
                        int indice_rem = Integer.parseInt(ingreso_clientes.nextLine());
                        ClsCliente cliente_rem = listaClientes.remove(indice_rem - 1);
                        }
                        break;
                
                              
                else if(opccion == 5){
                        salida = true;
                        System.out.println("Gracias");
                        }
                        break;
                else{
                        System.out.println("Intentalo de nuevo");
                        }
        
    }
  }
}
