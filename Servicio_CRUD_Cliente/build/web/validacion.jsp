<%-- 
    Document   : validacion
    Created on : 15/03/2019, 07:53:17 PM
    Author     :  -Juan José Giraldo
                  -Santiago Villegas
                  -Robinson Sanchez
                  -Mariana Gómez
Acá se desarrolla la parte de validación (HTML), todos los .jsp se
consideran como el FRONT-END de la aplicación; por tanto no encontraremos
mucho codigo de conección, simplemente lenguaje de etiquetado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Inicio sesión</title>
        <script src="js/sesion.js"></script>
    </head>
    <body>

        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                   <h5>Iniciar sesión</h5>
                </div>
                <div class="card-body">
                    <form action="Controlador" method="post">
                        <label>Usuario</label>
                            <input type="text" name="txtuser" class="form-control">
                        <label>Contraseña</label>
                            <input type="password" name="txtpassword" class="form-control">
                            <input type="submit" name="accion" value="Ingresar">
                            <a href="index.html">Regresar</a>
                    </form>
                    <br>
                    No tienes una cuenta... <a href="add.jsp">Registrarme</a>
                </div>
            </div>
        </div>

    </body>
</html>
