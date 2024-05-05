<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro</title>
    <style>
        /* Puedes añadir estilos CSS aquí si es necesario */
    </style>
</head>
<body>
    <form action="RegistroServlet" method="POST">
        <!-- Encabezado del formulario -->
        <h2 style="text-align: center;">Registro de Usuario</h2>
        
        <!-- Campo para el RUT -->
        <input type="text" name="rut" placeholder="Rut"/><br>
        
        <!-- Campo para el nombre de usuario -->
        <input type="text" name="username" placeholder="Usuario"/><br>
        
        <!-- Campo para la contraseña -->
        <input type="password" name="password" placeholder="Contraseña"/><br>
        
        <!-- Botón de envío del formulario -->
        <input type="submit" value="Registrarse"/>  
        
        <!-- Enlace para iniciar sesión -->
        <p style="text-align: center;">¿Ya tienes una cuenta? <a href="inicio.jsp">Inicia sesión aquí</a></p>
    </form>
</body>
</html>
