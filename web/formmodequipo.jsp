

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
        <form method="GET" action="ModEquipo">

            <input type="hidden" name="idEquipoForm" value="${param.idEquipo}"/></p><hr>
        <p>Nombre<br>
            <input type="text" name="nombreequipoform" value="${param.nombreEquipo}"required/></p><hr>
        <p>email<br>
            <input type="text" name="emailequipoform" value="${param.emailEquipo}"required/></p><hr>
        <p>Teléfono<br>
            <input type="number" name="telefonoequipoform" value="${param.telefonoEquipo}"required/></p><hr>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
