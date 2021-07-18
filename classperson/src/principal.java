
import clases.classpersona;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leugean
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        classpersona persona1 = new classpersona("Carlos", "Cedula", 88930242, 1979, 'm', "Colombia", "Cucuta", "Comerciante\n\n");
        
        persona1.mostrar_info(); 
        
        classpersona persona2 = new classpersona("Maria", "Cedula", 60567345, 1990, 'f', "Colombia", "Bucaramanga", "Arquitecta\n\n");
                
        persona2.mostrar_info();
        
        classpersona persona3 = new classpersona("Camilo", "Tarjeta de identidad", 1090802030, 2005, 'm', "Colombia", "Manizales", "Estudiante");
        persona3.mostrar_info();
        
        persona1.vacaciones();
        persona2.vacaciones();
        persona3.vacaciones();
                }
    
}
