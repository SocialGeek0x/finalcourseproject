




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
                <th>Cif</th>
                <th>Sector</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="empresa" items="${empresas}">
                <tr>
                    <td><c:out value="${empresa.idEmpresa}"/></td>
                    <td><c:out value="${empresa.nombreEmpresa}"/></td>
                    <td><c:out value="${empresa.cifEmpresa}"/></td>
                    <td><c:out value="${empresa.sectorEmpresa}"/></td>
                    <td><c:out value="${empresa.telefonoEmpresa}"/></td>
                    <c:url value="/RemoveEmpresa" var="urlRemoveEmpresa">
                        <c:param name="idEmpresa" value="${empresa.idEmpresa}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlRemoveEmpresa}"/>'>Eliminar empresa</a></td>

                    <c:url value="/formAddReto.jsp" var="urlAddReto">
                        <c:param name="idEmpresa" value="${empresa.idEmpresa}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlAddReto}"/>'>Añadir reto</a></td>

                    <c:url value="/ShowRetosEmpresa" var="urlShowRetosEmpresa">
                        <c:param name="idEmpresa" value="${empresa.idEmpresa}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlShowRetosEmpresa}"/>'>Mostrar sus retos</a></td>

                    <c:url value="/formmodempresa.jsp" var="urlModEmpresa">
                        <c:param name="idempresaform" value="${empresa.idEmpresa}"></c:param>
                        <c:param name="nombreempresaform" value="${empresa.nombreEmpresa}"></c:param>
                        <c:param name="cifempresaform" value="${empresa.cifEmpresa}"></c:param>
                        <c:param name="sectorempresaform" value="${empresa.sectorEmpresa}"></c:param>
                        <c:param name="telefonoempresaform" value="${empresa.telefonoEmpresa}"></c:param>
                    </c:url>
                    <td><a href='<c:out value="${urlModEmpresa}"/>'>Modificar Empresa</a></td>
                </tr>

            </c:forEach>
        </table>

    </body>
</html>
