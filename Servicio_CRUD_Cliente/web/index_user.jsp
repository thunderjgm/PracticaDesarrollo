<%-- 
    Document   : index_user
    Created on : 16/03/2019, 04:06:41 PM
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
<html lang="en">
    
<head>
	<meta charset="UTF-8">
	<title>KiiMOVil</title>
	<link rel="stylesheet" href="estilos.css">
	<link rel="stylesheet" href="slider.css">
	<link rel="stylesheet" href="animate.css">
	<link rel="stylesheet" href="secciones.css">
	
</head>
<body>
<header>
<!--MENU-->
	<div class="ancho">
		<div class="logo">
			<p><a href="index.html">KiiMOVil</a></p>
		</div>
		<nav>
			<ul>
				<li><a href="index.html">INICIO</a></li>
                <li><a href="validacion.jsp">Iniciar sesión</a></li>
				<li><a href="add.jsp">Registrarse</a></li>				
				<li><h1>Hola usuario <% out.println(User);%></h1></li>
			</ul>
		</nav>
	</div>
</header>
<div class="ancho-letras">
	<div class="letras-slider">
		<h1 class="animated zoomIn"></h1>
	</div>
</div>
<div id="particles-js"></div>
<section class="wap">
	<section class="bienvenidos"> 
		<h2>Noticias</h2>
	</section>
	<section class="contenedor-columnas">
		<div class="columnasx3">
			<img src="imagenes/1.jpg" alt="">
			<h4>La caída masiva de WhatsApp “regala” tres millones de usuarios nuevos a Telegram</h4>
			<p>WhatsApp estuvo caído parte del día de ayer, con problemas para el envío de imágenes y notas de voz, y en ocasiones de conexión. En la acera contraria, Telegram recibía a tres millones de nuevos usuarios.</p>
		</div>
		<div class="columnasx3">
			<img src="imagenes/2.jpg" alt="">
			<h4>Si 48 megapíxeles ya parecen muchos, Qualcomm anticipa soporte para cámaras de 100 y hasta 192 megapíxeles</h4>
			<p>Qualcomm acaba de realizar unas declaraciones que encienden la batalla fotográfica en el móvil: sus procesadores ya soportan 192 megapíxeles y hay móviles con más de 100 megapíxeles en pruebas.</p>
		</div>
		<div class="columnasx3">
			<img src="imagenes/3.jpg" alt="">
			<h4>Gboard se actualiza en iOS para integrar el traductor de Google en el teclado</h4>
			<p>Ahora podrás chatear con cualquier persona con independencia del idioma que hable.</p>
		</div>
		
	</section>
</section>
<section class="banner-1">
	<h3>¿Deseas publicitar con nosotros?<a href="#">Contactanos</a></h3>
</section>
<script src="particles.js"></script>
<script src="app.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="alto.js"></script>
</body>
</html>
