<%--
  Created by IntelliJ IDEA.
  User: longchao
  Date: 2017/7/17
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/addUser" method="post" id="registForm">
        <input type="hidden" name="mark" value="regist"/>
        <br>用户名： <input type="text" name="loginname" id="loginname"/></br>
        <br>密  码： &nbsp<input type="password" name="loginpass" id="loginpass"/></br>
        <br>邮  箱： &nbsp<input type="text" name="email" id="email"></br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
