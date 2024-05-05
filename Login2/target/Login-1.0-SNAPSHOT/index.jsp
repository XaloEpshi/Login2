<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Inicio de sesión</title>
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
        form {
            width: 300px;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        input[type="text"], input[type="password"] {
            width: calc(100% - 20px);
            margin-bottom: 10px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: calc(100% - 20px);
            padding: 10px;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            color: white;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <form action="ValidadorServlet" method="POST">
        <!-- Encabezado del formulario -->
        <h2 style="text-align: center;">Inicio de sesión</h2>
        
        <!-- Campo para el Rut -->
        <input type="text" name="rut" placeholder="Rut"/><br>
        
        <!-- Campo para el nombre de usuario -->
        <input type="text" name="username" placeholder="Usuario"/><br>
        
        <!-- Campo para la contraseña -->
        <input type="password" name="password" placeholder="Contraseña"/><br>
        
        <!-- Botón de envío del formulario -->
        <input type="submit" value="Iniciar sesión"/>  
        
        <!-- Enlace para registrar una nueva cuenta -->
        <p style="text-align: center;">¿No tienes una cuenta? <a href="registro.jsp">Regístrate aquí</a></p>
    </form>
</body>
</html>
