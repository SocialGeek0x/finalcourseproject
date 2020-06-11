<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>La empresa ha sido añadido al registro</h3>

        <p>Nombre: ${empresa.nombreEmpresa}</p>
        <p>cif: ${empresa.cifEmpresa} </p>
        <p>sector: ${empresa.sectorEmpresa} </p>
        <p>Telefono: ${empresa.telefonoEmpresa}</p>
    </body>
</html>
