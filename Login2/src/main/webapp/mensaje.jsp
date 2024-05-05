<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Validacion</title>
    </head>
    <body>
        <!-- Muestra el mensaje de validación -->
        <h2><%= request.getAttribute("mensaje") %></h2>
        
        <!-- Enlace para volver al inicio -->
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
