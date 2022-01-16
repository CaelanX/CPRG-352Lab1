<%-- 
    Document   : arithmeticCalculator
    Created on : Jan. 16, 2022, 12:29:09 a.m.
    Author     : caelan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <table>
            <tr>
                <td><label for="num1">First Number:</label><input type="number" name="num1"></td>
            </tr>
            <tr><td><label for="num2">Second Number:</label><input type="number" name="num2"></td></tr>
            <tr><td><button type="submit" name="operator" value="add" >+</button><button name="operator" type="submit" value="sub" >-</button><button name="operator" type="submit" value="multiply" >*</button><button name="operator" value="div" type="submit">%</button></td></tr>
            <tr><td><span>${result}</span></td></tr>
            <tr><td><a href="/Calculators/age">Age Calculator<a></td></tr>
            </table>
        </form>
    </body>
</html>
