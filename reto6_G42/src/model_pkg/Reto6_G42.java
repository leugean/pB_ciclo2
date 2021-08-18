/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.FrameHospital;

/**
 *
 * @author leugean
 */


public class Reto6_G42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //verificar que la hay conexion con la tabla de datos
        Conexion cn = new Conexion();
        FrameHospital ins_frame = new FrameHospital();
        DataModelDB inst_data = new DataModelDB();
        cn.getConnection();
        ins_frame.setVisible(true);
        inst_data.getOwners(1);

    }
    
}
