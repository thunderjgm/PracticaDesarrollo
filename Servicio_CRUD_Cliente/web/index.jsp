<%-- 
    Document   : index
    Created on : 12/03/2019, 05:19:28 PM
    Author     : user
--%>


<%@page import="webservice.User"%>
<%@page import="java.util.List"%>
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
                    <a href="Controlador?accion=add" class="btn btn-success">Nuevo usuario</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>USUARIO</th>
                                <th>CONTRASEÑA</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <%
                        UserService user=new UserService();
                        List<User> datos=user.listar();
                        for(User u:datos){
                        
                        %>
                        <tr>
                            <td><%= u.getIDUser()%></td>
                            <td><%= u.getUser()%></td>
                            <td><%= u.getPassword()%></td>
                            <td>
                                <a href="Controlador?accion=editar&id=<%=u.getIDUser()%>" class="btn btn-primary">Edit</a>
                                <a href="Controlador?accion=eliminar&id=<%=u.getIDUser()%>" class="btn btn-danger">Delete</a>
                            </td>
                        </tr>
                        <%}%>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
