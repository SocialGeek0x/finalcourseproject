

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
            <h3>Se han modificado los datos del equipo registrado</h3>
            <p>Identificador: ${equipo.idEquipo}</p>
            <p>Nombre: ${equipo.nombreEquipo}</p>

        </article>
    </body>
</html>
