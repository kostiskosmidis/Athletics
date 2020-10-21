<%-- 
    Document   : index
    Created on : 18-Oct-2020, 21:10:17
    Author     : kostis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
         
            <li>
                <a href="AthleteServlet">Athletes (Servlets + JSPs)</a>
            </li>
             <li>
                <a href="TeamServlet">Teams (Servlets + JSPs)</a>
            </li>
        </ul>
        
        <h2>Create New Team</h2>
            <form action="${pageContext.request.contextPath}/TeamServlet" method="POST" style="margin-top: 5em">
                Sport : <input type="text" name="sport"/> <br/>
                <input type="submit" value="Submit"/><br/>
            </form>
                
                
                <h2>Create New Athlete</h2>
               <form action="${pageContext.request.contextPath}/AthleteServlet" method="POST" style="margin-top: 5em">
                Athlete Name : <input type="text" name="athlete_name"/> <br/>
                Age : <input type="text" name="age"/> <br/>
                Height : <input type="text" name="height"/> <br/>
                Weight : <input type="text" name="weight"/> <br/>
                DoB : <input type="text" name="dob"/> <br/>
                Team: <input type="text" name="team"/> <br/>
                <input type="submit" value="Submit"/><br/>
            </form>
    </body>
</html>
