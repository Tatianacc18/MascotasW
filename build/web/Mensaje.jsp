<%-- 
    Document   : Mensaje
    Created on : 13/10/2023, 1:11:55 p. m.
    Author     : Atati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
              <link href="css/estilopp.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            if(request.getParameter("men") != null){
                out.print(request.getParameter("men"));
            }
        %>
        <form action="consulta.jsp" method="post">
        
            <input class="boton" type="submit" value="Regresar">
        </form>
    </body>
</html>
