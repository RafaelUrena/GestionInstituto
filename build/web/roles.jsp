<%-- 
    Document   : roles
    Created on : 16-oct-2018, 13:45:45
    Author     : rafa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Roles</title>
    </head>
    <body>
        <h4>Indica tu Rol</h4>
        
        <p>Usuario conectado: <% out.print(String.valueOf(session.getAttribute("userconnect")));%> </p>
        
        <div class="roles">
            
            <select name="roles">
                <option>Director</option>
                <option>Jefe de Departamento</option>
                <option>Editor del Aula</option>
                <option>Profesor</option>
            </select>
            
            <input type="button" value="Aceptar" name="aceptar" />
        </div>
    </body>
</html>
