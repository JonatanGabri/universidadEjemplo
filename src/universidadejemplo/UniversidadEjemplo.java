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
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
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
        
//----- CREA ALUMNO NUEVO-----
        
//        Alumno alu = new Alumno(4179872, "Lucas", "Patricio", LocalDate.of(2000, 4, 25), true);
//           AlumnoData creado = new AlumnoData();
//        creado.guardarAlumno(alu);

//---- BUSCAR ALUMNO ID
               
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
//    System.out.println(alu.getApellido());
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

//-------MateriaData--------

//------- AGREGAR MATERIA
//   Materia mat = new Materia("Economia 3", 3 , true);
//   MateriaData md = new MateriaData();
//   md.guardarMateria(mat);

//-------BUSCAR MATERIA
   
//     MateriaData md = new MateriaData();
//   Materia materiaEncontrado = md.buscarMateria(7);
//   if(materiaEncontrado != null){
//       System.out.println("Nombre "+materiaEncontrado.getNombre());
//       System.out.println("Año "+materiaEncontrado.getAnioMateria());
//   }

//------- MODIFICAR MATERIA 

//MateriaData mm = new MateriaData();
//Materia materia1 = new Materia();
//materia1.setIdMateria(5);
//materia1.setNombre("Historia 5");
//materia1.setAnioMateria(5);
//mm.modificarMateria(materia1);

//------- ELIMINAR MATERIA 

//MateriaData md2 = new MateriaData();
//md2.eliminarMateria(4);

//-------LISTAR MATERIAS

//     MateriaData md3 = new MateriaData();
//     for(Materia lm : md3.listarMaterias()){
//         System.out.println(lm.getNombre());
//     }

//-------InscripcionData

//-------GUARDAR INSCRIPCION

// AlumnoData ad = new AlumnoData();
// MateriaData md = new MateriaData();
// InscripcionData id = new InscripcionData();
// 
// Alumno alumno1 = ad.buscarAlumno(14);
// Materia materia1 = md.buscarMateria(3);
// Inscripcion save = new Inscripcion(alumno1,materia1,5);
// id.guardarInscripcion(save);
 
//------- ACTUALIZAR NOTA

//InscripcionData id1 = new InscripcionData();
//id1.actualizarNota(9, 7, 4);

//-------- BORRAR INSCRIPCIONMATERIAALUMNO

//InscripcionData id2 = new InscripcionData();
//id2.borrarInscripcionMateriaAlumno(14, 7);

//-------OBTENER INSCIPCIONES

//InscripcionData id3 = new InscripcionData();
//for(Inscripcion insc :id3.obtenerInscripciones()){
//    System.out.println("id "+insc.getIdInscripcion());
//    System.out.println("Apellido "+insc.getAlumno().getApellido());
//    System.out.println("Materia "+insc.getMateria().getNombre());
//}

//------ OBTENER INSCRIPCIONES POR ALUMNO

//      InscripcionData id4 = new InscripcionData();
//        for(Inscripcion insc :id4.obtenerInscripcionesPorAlumno(9)){
//      System.out.println("id "+insc.getIdInscripcion());
//      System.out.println("Apellido "+insc.getAlumno().getApellido());
//      System.out.println("Materia "+insc.getMateria().getNombre());
//    }

//------ OBTENER MATERIAS CURSADAS

// InscripcionData id4 = new InscripcionData();
//for(Materia materia6 : id4.obtenerMateriasCursadas(16)){
//    System.out.println(materia6.getNombre());
//    System.out.println("--------");
//}

//------ OBTENER MATERIAS NO CURSADAS 

//InscripcionData id5 = new InscripcionData();
//for(Materia materia7 : id5.obtenerMateriasNoCursadas(9)){
//    System.out.println(materia7.getNombre());
//    System.out.println("--------");
//    }

//------- OBTENER ALUMNOS POR MATERIA 
    
    
//InscripcionData id6 = new InscripcionData();
//for(Alumno alu8 : id6.obtenerAlumnosPorMateria(7)){
//    System.out.println(alu8.getNombre());
//    System.out.println("--------");
//    }
    }
}
