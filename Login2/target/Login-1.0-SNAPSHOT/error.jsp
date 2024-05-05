<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Error</title>
    <style>
        /* Estilos CSS */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f8d7da; /* Color de fondo rojo */
        }
        .container {
            text-align: center;
        }
        h1 {
            color: #721c24; /* Color de texto rojo oscuro */
        }
        p {
            margin-top: 20px;
        }
        a {
            color: #007bff; /* Color del enlace */
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <!-- Título de error -->
        <h1>¡Error!</h1>
        
        <!-- Mensaje de error -->
        <p>Hubo un error al procesar tu solicitud.</p>
        
        <!-- Enlace para volver al formulario de registro -->
        <p><a href="registro.jsp">Volver al registro</a></p>
    </div>
</body>
</html>
