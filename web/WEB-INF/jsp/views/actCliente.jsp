<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="cabecera.jsp" %>
        <div class="content">
            <div class="card border-info">
                <div class="card header bg-info">
                    <h1>Modificar Clientes</h1>                    
                </div>
                <div class="carb body">
                    <form action="" method="post">

                        <label  Class="input-group-addon">Digite el Nombre: </label>
                        <input type="text" name="nombre" Class="form-control"
                               value='<c:out value="${cli[0].nombre}"></c:out>' />
                        <label  Class="input-group-addon">Digite la Dirección: </label>
                        <input type="text" name="direccion" Class="form-control" 
                               value='<c:out value="${cli[0].direccion}"></c:out>' />
                        
                        <label name="correo" Class="input-group-addon">Digite el e-Mail: </label>
                        <input type="text" name="correo" Class="form-control"
                               value="<c:out value="${cli[0].correo}"></c:out>" />
                        
                        <label name="telefono" Class="input-group-addon">Digite el Teléfono: </label>
                        <input type="text" name="telefono" Class="form-control"
                               value="<c:out value="${cli[0].telefono}"></c:out>" />
                        
                        <label name="salario" Class="input-group-addon">Digite el salario: </label>
                        <input type="text" name="salario"  Class="form-control" 
                               value="<c:out value="${cli[0].salario}"></c:out>"/>

                        <input type="submit" name="btnEnviar" value="Actualizar_datos" class="btn btn-primary btn-md" />
                        <input type="reset" value="Limpiar..." class="btn btn-primary btn-md"/>
                        <a href="formCliente.htm" class="btn btn-primary btn-md">Regresar<a/>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="footer" >
        <p>SENA 2021 @ Derechos Reservado </p>
    </div>
    </body>
</html>
