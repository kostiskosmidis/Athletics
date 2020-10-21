<%-- 
    Document   : Teamjsp
    Created on : 19-Oct-2020, 13:47:22
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
                <c:forEach items="${teams}" var="t">
                    <tr>
                        <td>${t.tid}</td>
                        <td>${t.sport}</td>
                           
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
