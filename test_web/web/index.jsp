<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: rifatul.islam
  Date: 5/14/14
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Home page
<a href="test.html">Test </a> <br>

<h2>A Simple Form</h2>

<form action="form_response.jsp">
    name:<input type="text" name="name"/> <br>
    age :<input type="text" name="age"/> <br>
    first-food :<input type="text" name="food"/> <br>
    second-food :<input type="text" name="food"/> <br>
    <input type="submit">

</form>
</body>
</html>