<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link href='<c:url value="public/css/estilos.css" />' rel="stylesheet" />
    </head>
    <body style="background-color: #f8ede3">
    <nav>
        <h1 style="text-align: center; background-color: #a2b29f;">Conectar JSP - JSTL - JDBC</h1>
        <ul style="background-color: #bdd2b6">
            <li style="float:right;"><a href="index.htm">Inicio</a></li>
            <li><a href="formCliente.htm">Cliente</a></li>
            <li><a href="consultar_Cliente.htm">Consultar Clientes</a></li>
            <li><a class="active" href="listar_Cliente.htm">Acerca de</a></li>
        </ul>
    </nav>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
        
    </body>
</html>
