

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
                <th>Id</th>
                <th>Nombre</th>
                <th>email</th>
                <th>Telefono</th>


            </tr>
            <c:forEach var="equipo" items="${list}">
                <tr>
                    <td><c:out value="${equipo.idEquipo}"/></td>
                    <td><c:out value="${equipo.nombreEquipo}"/></td>
                    <td><c:out value="${equipo.emailEquipo}"/></td>
                    <td><c:out value="${equipo.telefonoEquipo}"/></td>
                </c:forEach>
        </table>
    </body>
</html>
