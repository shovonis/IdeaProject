<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h1><c:out value="${message}"/></h1>
<c:if test="${userName ne null}">
   Hello :  <c:out value="${userName}"/>
</c:if>
</body>
</html>