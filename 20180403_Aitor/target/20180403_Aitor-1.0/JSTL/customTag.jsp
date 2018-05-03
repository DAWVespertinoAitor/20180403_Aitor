<%-- 
    Document   : customTag
    Created on : 01-may-2018, 21:06:48
    Author     : aitor
--%>

<%@ taglib prefix="mt" uri="/WEB-INF/tlds/MarcasTagLib" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Muestra el largo de una cadena</p>
        <mt:long>
            <p>eey</p>
        </mt:long>
            <p>Genera un número aleatorio</p>
        <mt:rnd rango="20"/>
        <p>Genera un formulario de datos personales</p>
        <mt:form tipo="personal"/>
        <p>Genera un formulario de datos de usuario
        <mt:form tipo="usuario"/>
        <p>Realiza una suma.</p>
        <mt:suma num1="2" num2="2"/>
        
        
    </body>
</html>
