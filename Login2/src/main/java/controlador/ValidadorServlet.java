package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import modelo.LoginDao;

@WebServlet(name = "ValidadorServlet", urlPatterns = {"/ValidadorServlet"})
public class ValidadorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtener parámetros de la solicitud
        String rut = request.getParameter("rut");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String msg;

        // Validar si los campos están vacíos
        if (rut == null || username == null || password == null || rut.isEmpty() || username.isEmpty() || password.isEmpty()) {
            msg = "Por favor, complete todos los campos.";
        } else {
            try {
                // Validar las credenciales utilizando el modelo LoginDao
                if (LoginDao.validar(rut, username, password)) {
                    // Si las credenciales son correctas, redirigir al formulario de personas
                    response.sendRedirect(request.getContextPath() + "/formulario_personas.jsp");
                    return; // Detener el flujo para evitar despacho adicional
                } else {
                    // Si las credenciales no son válidas, redirigir al formulario de inicio de sesión
                    msg = "Usuario o contraseña incorrectos";
                    request.setAttribute("mensaje", msg);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/mensaje.jsp");
                    dispatcher.forward(request, response);
                    return; // Detener el flujo para evitar despacho adicional
                }
            } catch (Exception e) {
                // Manejar cualquier excepción que ocurra durante la autenticación
                msg = "Ocurrió un error durante la autenticación.";
            }
        }

        // Enviar mensaje como atributo de solicitud
        request.setAttribute("mensaje", msg);

        // Redirigir a la página de mensaje
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mensaje.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "short description";
    }
}
