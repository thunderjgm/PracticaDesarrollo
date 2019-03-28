<%-- 
    Document   : index
    Created on : 12/03/2019, 05:19:28 PM
    Author     : -Juan José Giraldo
                  -Santiago Villegas
                  -Robinson Sanchez
                  -Mariana Gómez
--%>


<%@page import="webservice.Movil"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.MovilService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession objsesion = request.getSession(false);
    String user = (String) objsesion.getAttribute("User");
    if(user.isEmpty()){
        response.sendRedirect("index.html");
    }
%>
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
                    <h4>Tabla de Celulares</h4>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>MARCA</th>                                
                            </tr>
                        </thead>
                        <%
                        MovilService movil=new MovilService();
                        List<Movil> datos=movil.listarM();
                        for(Movil m:datos){
                        
                        %>
                        <tr>
                            <td><%= m.getIdMarca()%></td>
                            <td><%= m.getNombre()%></td>
                            
                        </tr>
                        <%}%>
                    </table>
                    <a href="index.html" class="btn btn-danger">Inicio</a>
                                        
                </div>
            </div>
        </div>
    </body>
</html>

