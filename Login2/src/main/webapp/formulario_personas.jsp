<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Persona</title>
        <style>
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
            input[type="text"], input[type="password"], input[type="date"] {
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
    <form action="AgregarPersonaServlet" method="POST">
        <!-- Encabezado del formulario -->
        <h2 style="text-align: center;">Agregar Persona</h2>
        
        <!-- Campo para el Rut -->
        Rut: <input type="text" name="rut" required><br>
        
        <!-- Campo para los nombres -->
        Nombres: <input type="text" name="nombres" required><br>
        
        <!-- Campo para el apellido paterno -->
        Apellido Paterno: <input type="text" name="apellidoPaterno" required><br>
        
        <!-- Campo para el apellido materno -->
        Apellido Materno: <input type="text" name="apellidoMaterno" required><br>
        
        <!-- Campo para el teléfono -->
        Teléfono: <input type="text" name="telefono" required><br>
        
        <!-- Campo para la fecha de ingreso -->
        Fecha Ingreso: <input type="date" name="fechaIngreso" required><br>
        
        <!-- Botón de envío del formulario -->
        <input type="submit" value="Agregar Persona">
        
        <!-- Enlace para volver al inicio -->
        <br><br><br>
        <a href="index.jsp">Volver al inicio</a>
    </form>
</body>

</html>