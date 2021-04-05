
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
<body style="background-color: #f8ede3">
        <h1>Ejemplo de Uso de FORMS en JSTL y JSP</h1>
        <div class="content">
            <form:form cssClass="navbar-form " method="post" commandName="cliente">
                <form:errors path="*" element="div" cssClass="alert alert-danger" />
                <div class="input-group">
                <form:label path="nombre" cssClass="input-group-addon">Nombre Cliente: </form:label>
                <form:input path="nombre" cssClass="form-control"></form:input>            
                </div>
                <form:errors path="nombre" /><br>
                 <div class="input-group" >
                <form:label path="direccion" cssClass="input-group-addon">Dirección del Cliente: </form:label>
                <form:input path="direccion" cssClass="form-control"></form:input>
                 </div>
                 <br>             
                 <div class="input-group" >
                <form:label path="correo" cssClass="input-group-addon">Correo Cliente: </form:label>
                <form:input path="correo" cssClass="form-control"></form:input>
                </div>
                <br>            
                <div class="input-group" >
                <form:label path="telefono" cssClass="input-group-addon">Teléfono Cliente: </form:label>
                <form:input path="telefono" cssClass="form-control"></form:input>
                </div><br>
                <div class="input-group" >
                <form:label path="salario" cssClass="input-group-addon">salario: </form:label>
                <form:input path="salario" cssClass="form-control"></form:input>
                </div><br>
                <form:button name="Enviar" class="btn btn-danger btn-lg">Enviar</form:button>
                <a class="btn btn-primary btn-lg" href="index.htm"  role="button" >Regresar...</a>

             </form:form>
            </div>
        
    </body>
</html>
