
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
            <c:url value="/FormAddReto.jsp" var="urlAddReto">
                <c:param name="idEmpresa" value="${idEmpresa}"></c:param>
            </c:url>
            <h1>
                Los retos registrados para el empresa con identificador ${idEmpresa}
                <button><a href='<c:out value="${urlAddReto}"/>'>Añadir reto</a></button>
            </h1>


            <table>
                <tr>
                    <th>Id</th>
                    <th>nombre</th>
                    <th>descripcion</th>
                    <th>presupuesto</th>


                </tr>
                <c:forEach var="reto" items="${lista}">
                    <tr>
                        <td><c:out value="${reto.idReto}"/></td>
                        <td><c:out value="${reto.nombreReto}"/></td>
                        <td><c:out value="${reto.descripcion}"/></td>




                    </tr>

                </c:forEach>
            </table>
        </article>
    </body>
</html>
