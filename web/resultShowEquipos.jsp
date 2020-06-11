

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mostrar equipos</title>
    </head>
    <body>
        <h1>Los equipos registrados son</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="equipo" items="${listaEquipos}">
                <tr>

                    <td><c:out value="${equipo.nombreEquipo}"/></td>
                    <td><c:out value="${equipo.emailEquipo}"/></td>
                    <td><c:out value="${equipo.telefonoEquipo}"/></td>

                    <c:url value="/AsignarRetoEquipo" var="urlRemoveReto">
                        <c:param name="idEquipoform" value="${equipo.idEquipo}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlRemoveReto}"/>'>Asignar reto</a></td>

                    <c:url value="/RemoveEquipo" var="urlRemoveEquipo">
                        <c:param name="idEquipoForm" value="${equipo.idEquipo}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlRemoveEquipo}"/>'>Eliminar</a></td>

                    <c:url value="/formmodequipo.jsp" var="urlModEquipo">
                        <c:param name="idEquipo" value="${equipo.idEquipo}"></c:param>
                        <c:param name="nombreequipoform" value="${equipo.nombreEquipo}"></c:param>
                        <c:param name="emailequipoform" value="${equipo.emailEquipo}"></c:param>
                        <c:param name="telefonoequipoform" value="${equipo.telefonoEquipo}"></c:param>

                    </c:url>
                    <td><a href='<c:out value="${urlModEquipo}"/>'>Modificar Equipo</a></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
