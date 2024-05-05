package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Conexion;

public class LoginDao {

    /**
     * Este método valida las credenciales de inicio de sesión en la base de datos.
     * @param rut El RUT del usuario.
     * @param username El nombre de usuario.
     * @param password La contraseña del usuario.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    public static boolean validar(String rut, String username, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean valido = false;

        // Consulta SQL para validar las credenciales en la tabla usuario
        String sql = "SELECT * FROM usuario WHERE rut = ? AND username = ? AND password = ?";

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
            rs = ps.executeQuery();

            // Si se encuentra una fila, las credenciales son válidas
            if (rs.next()) {
                valido = true;
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción SQL que pueda ocurrir
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
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

        return valido;
    }
}
