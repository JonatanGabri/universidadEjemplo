/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author pc
 */
public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConnection();
    }

    public void guardarAlumno(Alumno alumno) {
    String sql ="INSERT INTO alumno(dni,apellido, nombre,fechaNacimiento,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate(sql);
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            JOptionPane.showInternalMessageDialog(null , "Alumno añadido con exito :)");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ ex.getMessage());
        }
    }
    public Alumno buscarAlumno(int id) throws SQLException {
 Alumno alumno = null;
 String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
 PreparedStatement ps = null;
 try {
 ps = con.prepareStatement(sql);
 ps.setInt(1,id );
ResultSet rs = ps.executeQuery();

 if (rs.next()) {
 alumno=new Alumno();
 alumno.setIdAlumno(id);
 alumno.setDni(rs.getInt("dni"));
 alumno.setApellido(rs.getString("apellido"));
 alumno.setNombre(rs.getString("nombre"));
 alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
 alumno.setEstado(true);


 } else {
 JOptionPane.showMessageDialog(null, "No existe el alumno");
 }
ps.close();
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 

}

 return alumno;
 }

 public Alumno buscarAlumnoPorDni(int dni) {
 Alumno alumno = null;
 String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
 PreparedStatement ps = null;
 try {
 ps = con.prepareStatement(sql);
 ps.setInt(1,dni );
 ResultSet rs = ps.executeQuery();

 if (rs.next()) {
 alumno=new Alumno();
 alumno.setIdAlumno(rs.getInt("idAlumno"));
 alumno.setDni(rs.getInt("dni"));
 alumno.setApellido(rs.getString("apellido"));
 alumno.setNombre(rs.getString("nombre"));
 alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
 alumno.setEstado(true);


 } else {
 JOptionPane.showMessageDialog(null, "No existe el alumno"); 

}
 ps.close();
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
 }


 return alumno;
 }

}
