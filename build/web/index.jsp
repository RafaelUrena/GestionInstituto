<%-- 
    Document   : indes
    Created on : 10-oct-2018, 13:00:58
    Author     : rafa
--%>

<%@page import="Clases.Conexion"%>
<%@page import="Clases.Constantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="CSS/style.css" rel="stylesheet">
    </head>
    <body>
        <% 
            Conexion co = new Conexion(Constantes.bd,Constantes.user,Constantes.pass);
        %>
        <div class="login">
            
            <h3>Registro</h3>
            
            <form name="formuini" action="inicio.jsp" method="POST">
                
                <fieldset>
                    <legend>Introduzca los datos</legend>
                    <p>Usuario:&nbsp; <input type="text" name="usuario" value="" /> </p>
                    <p>Contrase&ntilde;a:&nbsp; <input type="password" name="password" value="" /> </p>

                    <input type="submit" value="Entrar" name="loggin" />
                
                </fieldset>
                
            </form>
            
        </div>
        <%
            
            

        %>
        
    </body>
</html>
