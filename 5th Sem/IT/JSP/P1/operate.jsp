
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%  
           String n =  request.getParameter("n");
           out.print("Input Given: "+n+"<br>");           
        %>  
        <c:forEach var = "i" begin = "1" end ="${param.n}">
            <c:forEach var = "j" begin = "1" end ="${i}">
                ${j}
            </c:forEach>
         <br>
        </c:forEach>
    </body>
</html>
