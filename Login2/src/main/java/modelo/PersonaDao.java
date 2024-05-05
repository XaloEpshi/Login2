package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.Conexion;

public class PersonaDao {

    /**
     * Este método inserta una nueva persona en la base de datos.
     * @param rut El RUT de la persona.
     * @param nombres Los nombres de la persona.
     * @param apellidoPaterno El apellido paterno de la persona.
     * @param apellidoMaterno El apellido materno de la persona.
     * @param telefono El teléfono de la persona.
     * @param fechaIngreso La fecha de ingreso de la persona.
     * @return true si la inserción fue exitosa, false de lo contrario.
     */
    public static boolean insertarPersona(String rut, String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String fechaIngreso) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean insercionExitosa = false;

        // Consulta SQL para insertar una nueva persona en la tabla personas
        String sql = "INSERT INTO personas (rut, nombres, apellido_paterno, apellido_materno, telefono, fecha_ingreso) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // Obtener la conexión a la base de datos
            Conexion cn = new Conexion();
            con = cn.getConnection();

            // Preparar la consulta SQL
            ps = con.prepareStatement(sql);
            ps.setString(1, rut);
            ps.setString(2, nombres);
            ps.setString(3, apellidoPaterno);
            ps.setString(4, apellidoMaterno);
            ps.setString(5, telefono);
            ps.setString(6, fechaIngreso);

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
