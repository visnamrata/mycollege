
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%  
           String n =  request.getParameter("calculate");
           Date d = new Date();
           int hour = d.getHours();
           if( hour>=4 && hour<12)
               out.print("Good Morning");           
           else if( hour>=12 && hour<17)
               out.print("Good Afternoon");
           if( hour>=17 && hour<20)
               out.print("Good Evening");           
        %>  
    </body>
</html>
