<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Éxito</title>
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
            background-color: #f8f9fa;
        }
        .container {
            text-align: center;
        }
        .success-message {
            color: green;
            font-size: 24px;
        }
        .link {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <!-- Mensaje de éxito -->
        <div class="success-message">
            ¡Usuario agregado correctamente!
        </div>
        
        <!-- Enlace para volver al formulario de agregar personas -->
        <div class="link">
            <a href="formulario_personas.jsp">Volver al formulario de agregar personas</a>
        </div>
    </div>
</body>
</html>
