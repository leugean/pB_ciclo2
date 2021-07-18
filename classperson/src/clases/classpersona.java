/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Leugean
 */
public class classpersona {
   private String name;
   private String tipo_doc;
   private int num_doc;
   private int anio_nacimiento;
   private char sexo;
   private String nacionalidad;
   private String ciudad_actual;
   private String profesion;

    public classpersona(String name, String tipo_doc, int num_doc, int anio_nacimiento, char sexo, String nacionalidad, String ciudad_actual, String profesion) {
        this.name = name;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
        this.anio_nacimiento = anio_nacimiento;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.ciudad_actual = ciudad_actual;
        this.profesion = profesion;
        
    }
    
    public void mostrar_info(){
         System.out.println("Los datos son: \n " + "Nombre: "+this.name +"\n Tipo de documento: " + this.tipo_doc + "\n Numero de documento: " +this.num_doc + "\n Año de nacimiento: " + this.anio_nacimiento + "\n Sexo: "+ this.sexo + "\n Nacionalidad: " + this.nacionalidad + "\n Ciudad actual: " + this.ciudad_actual + "\n Profesion: " + this.profesion);
     }
    public void vacaciones(){
       Calendar cal = Calendar.getInstance();
       int anio_actual = cal.get(Calendar.YEAR);
       int edad = anio_actual - anio_nacimiento;
       
       if (edad > 25 && profesion != "Estudiante"){
           System.out.println("Usted merece unas vacaciones");
       }
       
       else {
           System.out.println("Debes empezar a trabajar para pagarte unas buenas vacaciones");
       }
    }

    public classpersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tipo_doc
     */
    public String getTipo_doc() {
        return tipo_doc;
    }

    /**
     * @param tipo_doc the tipo_doc to set
     */
    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    /**
     * @return the num_doc
     */
    public int getNum_doc() {
        return num_doc;
    }

    /**
     * @param num_doc the num_doc to set
     */
    public void setNum_doc(int num_doc) {
        this.num_doc = num_doc;
    }

    /**
     * @return the fecha_nacimiento
     */
    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the ciudad_actual
     */
    public String getCiudad_actual() {
        return ciudad_actual;
    }

    /**
     * @param ciudad_actual the ciudad_actual to set
     */
    public void setCiudad_actual(String ciudad_actual) {
        this.ciudad_actual = ciudad_actual;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
