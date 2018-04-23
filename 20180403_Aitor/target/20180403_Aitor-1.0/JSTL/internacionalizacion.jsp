<%-- 
    Document   : internacionalizacion
    Created on : 17-nov-2017, 16:58:01
    Author     : Daw2
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Escoger Idioma</title>
        <link rel="stylesheet" type="text/css" href="../CSS/estilos.css">
    </head>
    <body>
        <h1>Menu de idiomas</h1>
        <form action="ListaIdiomas" method="POST">
            <table>
                <tr>
                    <td><label for="idioma">Elige un idioma</label></td>
                    <td>
                        <select id="idioma"  name="idioma">
                            <c:forEach var="listaFor" items="${codigo}">
                                <option value="${listaFor}">${listaFor.getDisplayName()}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Enviar"/></td>
                    <td><input type="button" value="Menu Principal" onclick="history.back()"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
