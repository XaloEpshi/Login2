<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro</title>
    <style>
        /* Puedes a�adir estilos CSS aqu� si es necesario */
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
        
        <!-- Campo para la contrase�a -->
        <input type="password" name="password" placeholder="Contrase�a"/><br>
        
        <!-- Bot�n de env�o del formulario -->
        <input type="submit" value="Registrarse"/>  
        
        <!-- Enlace para iniciar sesi�n -->
        <p style="text-align: center;">�Ya tienes una cuenta? <a href="inicio.jsp">Inicia sesi�n aqu�</a></p>
    </form>
</body>
</html>
