

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Los retos registrados son</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Presupuesto</th>

            </tr>
            <c:forEach var="reto" items="${listaRetos}">
                <tr>
                    <td><c:out value="${reto.idReto}"/></td>
                    <td><c:out value="${reto.nombreReto}"/></td>
                    <td><c:out value="${reto.descripcion}"/></td>
                    <td><c:out value="${reto.presupuesto}"/></td>


                    <c:url value="/AsignarRetoEquipoShow" var="urlRemoveReto">
                        <c:param name="idRetoForm" value="${reto.idReto}"></c:param>
                        <c:param name="idEquipoForm" value="${idEquipo}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlRemoveReto}"/>'>Asignar equipo</a></td>
                </tr>

            </c:forEach>
        </table>
    </body>
</html>
