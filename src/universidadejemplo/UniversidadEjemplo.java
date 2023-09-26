/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author pc
 */
public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Connection con = null;
        //PreparedStatement ps = null;
        //con = Conexion.getConnection();
        //ResultSet rs = null;
        Alumno alu = new Alumno(190, "Pato", "aksj", LocalDate.of(2000, 4, 25), true);
        AlumnoData data = new AlumnoData();
        data.guardarAlumno(alu);
        
    }

}
