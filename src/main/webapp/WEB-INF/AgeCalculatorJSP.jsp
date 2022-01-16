<%-- 
    Document   : AgeCalculatorJSP
    Created on : Jan. 15, 2022, 10:49:02 p.m.
    Author     : caelan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>age calculator</title>
    </head>
    <body>
        
        <h1>Age Calculator</h1>
        <form action="age" method="post">
        <table>
            <tr>
                <td><label for="age">Enter your age:</label></td>
                <td><input type="number" name="age"></td>
            </tr>
            <tr>
                <td><button type="submit">Age next birthday</button></td>
            </tr>
            <tr>
                <td><span>${nextYear}</span></td>
            </tr>
        </table>
        </form>
        
    </body>
</html>
