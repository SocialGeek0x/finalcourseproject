

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
        <article>
            <h1>Los empresas registradas son</h1>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>CIf</th>
                    <th>Sector</th>
                </tr>
                <c:forEach var="empresa" items="${empresas}">
                    <tr>
                        <td><c:out value="${empresa.idEmpresa}"/></td>
                        <td><c:out value="${empresa.nombreEmpresa}"/></td>
                        <td><c:out value="${empresa.cifEmpresa}"/></td>
                        <td><c:out value="${empresa.sectorEmpresa}"/></td>
                        <td><c:out value="${empresa.telefonoEmpresa}"/></td>

                        <c:url value="/FormAddReto.jsp" var="urlAddReto">
                            <c:param name="id" value="${empresa.idEmpresa}"></c:param>
                        </c:url>
                        <td><a href='<c:out value="${urlAddReto}"/>'>Añadir reto</a></td>
                    </tr>

                </c:forEach>
            </table>

        </article>
    </body>
</html>
