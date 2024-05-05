package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Esta clase maneja la conexión a la base de datos.
 */
public class Conexion {

    Connection con;

    /**
     * Este método devuelve una conexión a la base de datos.
     * @return La conexión a la base de datos.
     */
    public Connection getConnection() {
        try {
            // Registra el controlador JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establece la conexión a la base de datos utilizando la URL, el usuario y la contraseña proporcionados
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?serverTimezone=UTC", "root", "root");
        } catch (Exception e) {
            // Maneja cualquier excepción lanzada durante el proceso de conexión
            e.printStackTrace();
        }
        return con;
    }
}
