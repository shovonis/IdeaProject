<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
Name: <c:out value="${param.name}" default="NO Name Provided"/><br>
Age : <c:out value="${param.age}"/><br>
<c:forEach var="test" items="${paramValues.food}">
    <c:out value="${test}"/>
</c:forEach>
</body>
</html>