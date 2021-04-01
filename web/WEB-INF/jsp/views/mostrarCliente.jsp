<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
            <h1>Coneccion a Bases de Datos MYSql</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregarCliente.htm" class="btn btn-primary">Agregar Cliente</a>
                </div>
                <div class="card-body ">
                    <table class="table table-bordered table-striped table-hover">
                        <thead>
                            <th>id</th>
                            <th>nombre</th>
                            <th>direccion</th>
                            <th>correo</th>
                            <th>telefono</th>
                            <th>Salario</th>                  
                        </thead>
                        <tbody>
                            <c:forEach items="${cliente}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id}"></c:out></td>
                                <td><c:out value="${dato.nombre}"></c:out></td>
                                <td><c:out value="${dato.direccion}"></c:out></td>
                                <td><c:out value="${dato.correo}"></c:out></td>
                                <td><c:out value="${dato.telefono}"></c:out></td>
                                <td><c:out value="${dato.salario}"></c:out></td>
                                <td>
                                    <a href="actCliente.htm?id=${dato.id}" class="btn btn-warning">Editar</a> 
                                    <a href="borrarCliente.htm?id=${dato.id}" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="footer" >
            <p>SENA 2021 @ Derechos Reservado </p>
        </div>

    </body>
</html>
