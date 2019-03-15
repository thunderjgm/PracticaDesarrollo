<%-- 
    Document   : edit
    Created on : 15/03/2019, 12:23:54 AM
    Author     : Juan Jose
--%>

<%@page import="webservice.User"%>
<%@page import="Modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                   <h5>Agctualizar nuevo Usuario</h5>
                </div>
                <%
                    int id=Integer.parseInt((String) request.getAttribute("iduser"));
                UserService user=new UserService();
                User u = user.listarID(id);
                %>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Id</label>
                        <input type="text" value="<%=u.getIDUser()%>" name="txtid" readonly="" class="form-control" value="">
                        <label>Usuario</label>
                            <input type="text" value="<%=u.getUser() %>" name="txtuser" class="form-control" value="">
                        <label>Contraseña</label>
                            <input type="password" name="txtpassword" class="form-control" value="<%=u.getPassword() %>">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                            <a href="Controlador?accion=index">Regresar</a>   
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
