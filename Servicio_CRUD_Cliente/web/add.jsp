<%-- 
    Document   : add
    Created on : 13/03/2019, 10:13:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Registro</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                   <h5>Agregar nuevo Usuario</h5>
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Usuario</label>
                            <input type="text" name="txtuser" class="form-control">
                        <label>Contraseña</label>
                            <input type="password" name="txtpassword" class="form-control">
                            <input type="submit" name="accion" value="Guardar">
                            <a href="index.html">Regresar</a>   
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
