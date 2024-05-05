package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.Conexion;

public class RegistroDao {

    /**
     * Este método inserta un nuevo usuario en la base de datos.
     * @param rut El RUT del usuario.
     * @param username El nombre de usuario.
     * @param password La contraseña del usuario.
     * @return true si la inserción fue exitosa, false de lo contrario.
     */
    public static boolean insertarUsuario(String rut, String username, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean insercionExitosa = false;

        // Consulta SQL para insertar un nuevo usuario en la tabla usuarios
        String sql = "INSERT INTO usuario (rut, username, password) VALUES (?, ?, ?)";

        try {
            // Obtener la conexión a la base de datos
            Conexion cn = new Conexion();
            con = cn.getConnection();

            // Preparar la consulta SQL
            ps = con.prepareStatement(sql);
            ps.setString(1, rut);
            ps.setString(2, username);
            ps.setString(3, password);

            // Ejecutar la consulta
            int filasInsertadas = ps.executeUpdate();

            // Si se insertó al menos una fila, la inserción fue exitosa
            if (filasInsertadas > 0) {
                insercionExitosa = true;
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción SQL que pueda ocurrir
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                // Manejar cualquier excepción al cerrar la conexión
                ex.printStackTrace();
            }
        }

        return insercionExitosa;
    }
}
