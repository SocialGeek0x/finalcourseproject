

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
        <h3>El reto ha sido añadido al registro</h3>
        <p>Identificador: ${reto.idReto}</p>
        <p>nombre ${reto.nombreReto}</p>
        <p>descripcion ${reto.descripcion}</p>
        <p>presupuesto ${reto.presupuesto}</p>

    </body>
</html>
