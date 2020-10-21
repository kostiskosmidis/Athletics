<%-- 
    Document   : Athletejsp
    Created on : 18-Oct-2020, 21:08:45
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table border="1">
                <c:forEach items="${athletes}" var="a">
                    <tr>
                        <td>${a.aid}</td>
                        <td>${a.athlete_name}</td>
                           
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
