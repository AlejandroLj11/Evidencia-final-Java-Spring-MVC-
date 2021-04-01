<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="cabecera.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Consultar Clientes...</h1>
<div class="content">
    <form:form cssClass="navbar-form" method="post" commandName="cliente">
        <form:errors path="*" element="div" cssClass="alert alert-danger"/>
        <div class="card border-info">
            <div class="card card-header bg-info">
                <label class="input-group-addon">Consulta de los clientes</label>
            </div>
            <div class="card card-body">
                <div class="input-group">
                    <form:label path="nombre" cssClass="input-group-addon">Nombre Cliente:</form:label>
                    <form:input path="nombre" cssClass="form-control"></form:input>
                </div>
                <div style="margin:0 40px;">
                <form:button name="Enviar" class="btn btn-primary btn-lg">Enviar</form:button>
                <a class="btn btn-primary btn-lg" href="index.htm" role="buton">Regresar..</a>
                </div>
            </div>
        </div>
    </form:form>
</div>
    </body>
</html>
