

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
        <form method="GET" action="ModReto">

            <input type="hidden" name="idRetoForm" value="${param.idReto}"/></p><hr>
        <p>nombre<br>
            <input type="text" name="nombreretoform" value="${param.nombreReto}"required/></p><hr>
        <p>descripcion<br>
            <input type="text" name="descripcionform" value="${param.descripcion}"required/></p><hr>
        <p>presupuesto<br>
            <input type="number" name="presupuestoform" value="${param.presupuesto}"required/></p><hr>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
