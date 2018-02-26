<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
<c:if test="${!empty userList}">
    <c:forEach var="user" items="${userList}">
        id：${user.id} &nbsp;&nbsp;uid：${user.uid} &nbsp;&nbsp;name：${user.loginname} &nbsp;&nbsp;<br>
    </c:forEach>
</c:if>
</body>
</html>