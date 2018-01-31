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
    <form action="/addUserlike" method="post" id="registForm">
        <input type="hidden" name="mark" value="regist"/>
       用户名： <input type="text" name="userName" id="userName"/>
         爱好： <input type="text" name="userLike" id="userLike"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
