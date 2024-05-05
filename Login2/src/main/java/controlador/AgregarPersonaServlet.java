package controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.Conexion;

@WebServlet(name = "AgregarPersonaServlet", urlPatterns = {"/AgregarPersonaServlet"})
public class AgregarPersonaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            // Obtener parámetros del formulario
            String rut = request.getParameter("rut");
            String nombres = request.getParameter("nombres");
            String apellidoPaterno = request.getParameter("apellidoPaterno");
            String apellidoMaterno = request.getParameter("apellidoMaterno");
            String telefono = request.getParameter("telefono");
            String fechaIngreso = request.getParameter("fechaIngreso");

            // Insertar los datos en la base de datos
            Conexion cn = new Conexion();
            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO personas (Rut, Nombres, Apellido_Paterno, Apellido_Materno, Telefono, Fecha_Ingreso) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, rut);
            ps.setString(2, nombres);
            ps.setString(3, apellidoPaterno);
            ps.setString(4, apellidoMaterno);
            ps.setString(5, telefono);
            ps.setString(6, fechaIngreso);
            ps.executeUpdate();

            // Redirigir a una página de éxito
            response.sendRedirect("exito.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar errores de base de datos
            response.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
