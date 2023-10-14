<%-- 
    Document   : Felino
    Created on : 13/10/2023, 1:01:20 p. m.
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
        <form action="svCanino" method="post">
        <h1>Registro Felino</h1>
        <br/><br/>
        <select name="animal">
                <option value="1">Canino</option>
                <option value="2">Felino</option>
        </select>
        <br/><br/>
        <label id ="subtitulo1">Nombre: </label>
        <input type="text" class="entrada" name="nombreAn">
        <br/><br/>
        <label id ="subtitulo2">Raza: </label>
        <input type="text" class="entrada" name="razaAn">
        <br/><br/>
        <label id ="subtitulo3">Color: </label>
        <input type="text" class="entrada" name="colorAn"> 
        <br/><br/>
        <label id ="subtitulo4">Edad: </label>
        <input type="text" class="entrada" name="edadAn"> 
        <br/><br/>
        <label id ="subtitulo5">Taxoplasmosis: </label>
        <input type="text" class="entrada" name="cualAn"> 
        <br/><br/>
        <button type="submit">Guardar datos </button>
        </form>
    </body>
</html>
