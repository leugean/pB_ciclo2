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
public class ClsEmpleado extends ClsPersona{
    
    private int sueldo;
    private ClsCargo cargo;
    private ClsEmpresa empresa;
    private ClsAdministrativo administrativo;

    /**
     *
     * @param sueldo
     * @param cargo
     * @param empresa
     * @param nombre
     * @param apellidos
     * @param num_Doc
     * @param correoElectronico
     */
    
    
    public ClsEmpleado() {
        super(null, null, null, null);
      
    }

    public ClsEmpleado(int sueldo, ClsCargo cargo, ClsEmpresa empresa, String nombre, String apellidos, String num_Doc, String correoElectronico) {
        super(nombre, apellidos, num_Doc, correoElectronico);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    

    /**
     * @return the sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the cargo
     */
    public ClsCargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(ClsCargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the administrativo
     */
    public ClsAdministrativo getAdministrativo() {
        return administrativo;
    }

    /**
     * @param administrativo the administrativo to set
     */
    public void setAdministrativo(ClsAdministrativo administrativo) {
        this.administrativo = administrativo;
    }

    /**
     * @return the empresa
     */
    public ClsEmpresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(ClsEmpresa empresa) {
        this.empresa = empresa;
    }
    

    private static Scanner ingresar_datos = new Scanner(System.in);

        public static void crud_empleado(){
            //creo las listas
            ArrayList<ClsEmpleado> listaEmpleados = new ArrayList<>();
            ArrayList<ClsCargo> listaCargos = new ArrayList<>();
            boolean salida = false;
            ClsEmpresa empresa = new ClsEmpresa("creaciones online", "7773331", "Av simpreviva 123");

            while(!salida){
                System.out.println("Elige una opcion");
                System.out.println("   1. Crear empleado");
                System.out.println("   2. Leer empleado");
                System.out.println("   3. Actualizar empleado");
                System.out.println("   4. Eliminar empleado");
                System.out.println("   5. Salir");
                System.out.println("Opcion  ");
                int opcion = Integer.parseInt(ingresar_datos.nextLine());

                if (opcion == 1){
                    System.out.println("Nombre: ");
                    String nombre = ingresar_datos.nextLine();
                    System.out.println("Apellidos: ");
                    String apellidos = ingresar_datos.nextLine();
                    System.out.println("Numero de documento");
                    String num_doc = ingresar_datos.nextLine();
                    System.out.println("Correo electronico");
                    String correoElectronico = ingresar_datos.nextLine();
                    
                    System.out.println("Cargo: ");
                    String cargo = ingresar_datos.nextLine();
                    System.out.println("Jerarquia: ");
                    String jerarquia = ingresar_datos.nextLine();
                    ClsCargo trabajador = new ClsCargo(cargo, jerarquia);
                    listaCargos.add(trabajador);
                  
                    
                    System.out.println("Salario: ");
                    int sueldo = Integer.parseInt(ingresar_datos.nextLine());
                    ClsEmpleado empleado = new ClsEmpleado(sueldo,trabajador,empresa,nombre,apellidos,correoElectronico,jerarquia);

                    listaEmpleados.add(empleado);
                    break;
                
                }
                
                  else if(opcion == 2){
                    System.out.println("El total de empleados es: "+ listaEmpleados.size());
                    for (int i = 0; i <= listaEmpleados.size(); i++){
                        
                        System.out.println(listaEmpleados.get(i).getNombre());
                        System.out.println(listaEmpleados.get(i).getApellidos());
                        System.out.println(listaEmpleados.get(i).getNum_Doc());
                        System.out.println(listaEmpleados.get(i).getCorreoElectronico());
                        System.out.println(listaCargos.get(i).getNombre_cargo());
                        System.out.println(listaEmpleados.get(i).getSueldo());
                        
                        
                        
                    }
                    
                }
                  break;
                  
                else if(opcion == 3){
                    System.out.println("Ingrese el indice del empleado a actualizar");
                    int indice = Integer.parseInt(ingresar_datos.nextLine());
                    ClsEmpleado empleado = listaEmpleados.get(indice);
                    System.out.println("Que inormacion desear actualizar: ");
                    System.out.println("   1. Nombre");
                    System.out.println("   2. Apellidos");
                    System.out.println("   3. Documento");
                    System.out.println("   3. Correo Electronico");
                    System.out.println("Escribe el numero:  ");
                    int eleccion = Integer.parseInt(ingresar_datos.nextLine());
                    
                    switch(eleccion){
                        case 1 :
                            System.out.println("Nombre nuevo: ");
                            String name = ingresar_datos.nextLine();
                            empleado.setNombre(name);
                            break;
                            
                        case 2: 
                            System.out.println("Apellidos: ");
                            String apellido = ingresar_datos.nextLine();
                            empleado.setApellidos(apellido);
                            break;
                        
                        case 3: 
                            System.out.println("Documento: ");
                            String documento = ingresar_datos.nextLine();
                            empleado.setNum_Doc(documento);
                            break;
                            
                        case 4:
                            System.out.println("Correo electronico: ");
                            String email = ingresar_datos.nextLine();
                            empleado.setCorreoElectronico(email);
                            break;
                            
                        default:
                            System.out.println("Opcion invalida, intenta de nuevo");
                    }
                }
                break;
                
                else if(opccion == 4){
                        System.out.println("Ingrese el indice del empleado a eliminar");
                        int indice_rem = Integer.parseInt(ingresar_datos.nextLine());
                        ClsEmpleado empleado_rem = listaEmpleados.remove(indice_rem - 1);
                        }
                        break;
                              
                else if(opccion == 5){
                        salida = true;
                        System.out.println("Gracias");
                        }
                else{
                        System.out.println("Intentalo de nuevo");
                        }
            }
       
    
       }
            
}