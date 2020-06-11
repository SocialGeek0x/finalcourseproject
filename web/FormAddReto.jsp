

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
        <form method="POST" action="AddReto">
            <h1>Introduzca los datos para registrar un reto nuevo</h1>
            <h4>Nombre</h4><input type="text" name="nombrereto" required/><br>
            <h4>Descripcion</h4><input type="text" name="descripcion" required/>
            <h4>presupuesto</h4><input type="text" name="presupuesto" required/>

            <input type="hidden" name="idempresa" value="${param.id}"/>
            <input type="submit" value="Enviar">

        </form>

    </body>
</html>
