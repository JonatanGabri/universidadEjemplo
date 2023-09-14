/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;
    //la constante “connection” representará a un objeto de tipo Connection a través del
    //cual podremos enviar nuestras peticiones a la Base de Datos.

    private Conexion() {
    }
//La consecuencia de tener un único constructor y encima privado, es que no nos permitirá crear
//instancias de la clase Conexion.
    public static Connection getConnection() {
        if (connection == null) {
 /*verifica si el atributo static “connection” es nulo, si es así significa que nadie ha
  llamado este método desde la aplicación para establecer una conexión a la base de datos*/
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                //se cargan los driver de conexión al gestor de base de datos;
                try {
                    connection = DriverManager.getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                            + "&user=" + USUARIO + "&password=" + PASSWORD);
                    /*se establece la conexión a la base de datos invocando al método getConnection()
                   de la clase DriverManager pasando por parámetro un String que contiene la URL de la base de
                   datos, PASSWORD y CONTRASEÑA*/
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la BD");
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());
            }
        }
        return connection;
    }

}
