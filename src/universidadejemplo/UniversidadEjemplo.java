/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Month;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;

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
        //Alumno alu = new Alumno(190, "Pato", "aksj", LocalDate.of(2000, 4, 25), true);
        //---- BUSCAR ALUMNO ID
//        Alumno alu = new Alumno();
//        AlumnoData data = new AlumnoData();
//        Alumno alumnoEncontrado = data.buscarAlumno(14);
//        if (alumnoEncontrado != null ){
//        System.out.println("Dni "+ alumnoEncontrado.getDni());
//        System.out.println("Nombre "+alumnoEncontrado.getNombre());
//        System.out.println("apellido "+ alumnoEncontrado.getApellido());}

    //---- BUSCAR ALUMNO POR DNI
//   AlumnoData data = new AlumnoData();
//   Alumno porDni = data.buscarAlumnoPorDni(12);
//    System.out.println("Dni "+ porDni.getDni());
//    System.out.println("Nombre "+porDni.getNombre());
//    System.out.println("apellido "+ porDni.getApellido());

//----- LISTAR TODOS LOS ALUMNOS
//AlumnoData data = new AlumnoData();
//for(Alumno alu : data.listarAlumnos()){
//    System.out.println(alu.getIdAlumno());
//    System.out.println(alu.getDni());
//    System.out.println(alu.getApellido());
//    System.out.println(alu.getNombre());
//    System.out.println(alu.getFechaNac());
//    System.out.println("--------");
//}
//-----MODIFICAR ALUMNO
//Alumno alu = new Alumno();
//alu.setIdAlumno(15);
//alu.setDni(2345);
//alu.setApellido("Tunez");
//alu.setNombre("Juan");
//alu.setFechaNac(LocalDate.of(1999, Month.MARCH, 23));
//alu.setActivo(true);
//AlumnoData data = new AlumnoData();
//data.modificarAlumno(alu);

//------- ELIMINAR ALUMNO
//   AlumnoData data = new AlumnoData();
//   data.eliminarAlumno(15);

//-------MateriaData
//------- AGREGAR MATERIA
//   Materia mat = new Materia("Economia 3", 3 , true);
//   MateriaData md = new MateriaData();
//   md.guardarMateria(mat);

//-------BUSCAR MATERIA
   
     MateriaData md = new MateriaData();
    md.buscarMateria(7);
    }

}
