
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
        <table>

            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>descripcion/th>
                <th>presupuesto/th>

            </tr>
            <c:forEach var="reto" items="${retos}">
                <tr>
                    <td><c:out value="${reto.idReto}"/></td>
                    <td><c:out value="${reto.nombreReto}"/></td>
                    <td><c:out value="${reto.descripcion}"/></td>
                    <td><c:out value="${reto.presupuesto}"/></td>

                    <c:url value="/RemoveReto" var="urlRemoveReto">
                        <c:param name="idRetoform" value="${reto.idReto}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlRemoveReto}"/>'>Eliminar reto</a></td>

                    <c:url value="/formmodreto.jsp" var="urlModReto">
                        <c:param name="idReto" value="${reto.idReto}"></c:param>
                        <c:param name="nombreretoform" value="${reto.nombreReto}"></c:param>
                        <c:param name="descripcionform" value="${reto.descripcion}"></c:param>
                        <c:param name="presupuestform" value="${reto.presupuesto}"></c:param>

                    </c:url>
                    <td><a href='<c:out value="${urlModReto}"/>'>Modificar Reto</a></td>

                    <c:url value="/ShowEquiposReto" var="urlshowequiposreto">
                        <c:param name="idRetoform" value="${reto.idReto}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlshowequiposreto}"/>'> Equipos del Reto</a></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>