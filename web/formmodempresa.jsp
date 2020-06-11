
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
        <form method="GET" action="ModEmpresa">

            <input type="hidden" name="idempresaform" value="${param.idempresaform}"/></p><hr>
        <p>Nombre<br>
            <input type="text" name="nombreempresaform" value="${param.nombreEmpresa}"required/></p><hr>
        <p>Cif<br>
            <input type="text" name="cifempresaform" value="${param.cifEmpresa}"required/></p><hr>
        <p>Sector<br>
            <input type="text" name="sectorempresaform" value="${param.sectorEmpresa}"required/></p><hr>
        <p>Teléfono<br>
            <input type="number" name="telefonoempresaform" value="${param.telefonoEmpresa}"required/></p><hr>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
