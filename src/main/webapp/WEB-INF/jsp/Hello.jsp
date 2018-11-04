<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 04.11.2018
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
Hello, this is jsp!!!



<c:forEach items="${users}" var="user">

    <c:if test="${user.age > 18}">
    <p>${user}</p>

    </c:if>

</c:forEach>



</body>
</html>
