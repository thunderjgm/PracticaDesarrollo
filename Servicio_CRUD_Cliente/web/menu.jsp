<%-- 
    Document   : menu
    Created on : 16/03/2019, 11:26:48 AM
    Author     : Juan Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession objsesion = request.getSession(false);
    String User = (String) objsesion.getAttribute("User");
    if(User.equals("")){
        response.sendRedirect("validacion.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola usuario <%out.println(User);             %> ..... acceso correcto</h1>
    </body>
</html>
