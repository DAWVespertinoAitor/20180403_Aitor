<%-- 
    Document   : visualizarIdioma
    Created on : 17-nov-2017, 17:36:38
    Author     : Daw2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Traduccion</title>
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css">
    </head>
    <body>

        <div class="columnasCentradas">
            <c:set var="idioma" value="${escogido}"/>
            <c:set var="fechaActual" value="${requestScope.fechaHoy}"/>
            <c:set var="numero" value="12345.56789"/>

            <h2>Hora en ese país</h2>

            <fmt:bundle basename="idiomas/pruebas">
                <p>Zona horaria: <fmt:message key="${idioma}"/></p>
                <fmt:message key="${idioma}" var="zona"/>
                <h3>Hora real en ese país = <fmt:formatDate timeZone="${zona}" value="${fechaActual}" type="time"/><br/></h3>
                <fmt:setLocale value ="${escogido}"/>    
                <p><fmt:formatDate timeZone="${zona}" value="${fechaActual}" type="date"/></p>
                <p><fmt:formatDate timeZone="${zona}" value="${fechaActual}" type="both"/></p>
                <p><fmt:formatDate timeZone="${zona}" value="${fechaActual}" type="both" dateStyle="short" timeStyle="short"/></p>
                <p><fmt:formatDate timeZone="${zona}" value="${fechaActual}" type="both" dateStyle="medium" timeStyle="medium"/></p>
                <p><fmt:formatDate timeZone="${zona}" value="${fechaActual}" type="both" dateStyle="long" timeStyle="long"/></p>

            </fmt:bundle>
            <h2>Traduccion</h2>
            <fmt:bundle basename="idiomas/${idioma}">
                <h3>Saludo = <fmt:message  key = "hola"/><br/></h3>
                <h3>Despedida = <fmt:message key = "adios"/></h3>
            </fmt:bundle>
            <h2>Formato de numeros: <c:out value="${numero}"/></h2>
            <fmt:setLocale value ="${escogido}"/>    
            <p><fmt:formatNumber value="${numero}" type="currency"/></p>
            <p><fmt:formatNumber value="${numero}" type="number" maxIntegerDigits="5"/></p>
            <p><fmt:formatNumber value="${numero}" type="number" maxFractionDigits="3"/></p>
            <p><fmt:formatNumber value="${numero}" type="number" groupingUsed="false"/></p>
            <p><fmt:formatNumber value="${numero}" type="percent" maxIntegerDigits="5"/></p>
            <p><fmt:formatNumber value="${numero}" type="percent" minIntegerDigits="10"/></p>
            <p><fmt:formatNumber value="${numero}" type="percent" maxFractionDigits="3"/></p>
            <a href="index.html">Menu principal</a><br><br>
        </div><br><br><br>
    </body>
</html>
