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
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/html/jquery-1.6.2.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#button_submit").click(
                function () {
                    $.ajax({
                        cache: false,
                        async: false,
                        type: "POST",
                        dataType: "json",
                        contentType: "application/json",
                        data:$("#registForm").serialize(),
                        url:"${pageContext.request.contextPath}/user/addUser",
                        success: function(data) {
                        }
                    });
                });
        });

    </script>
</head>
<body>
    <form action="" method="post" id="registForm">
        <br>用户名： <input type="text" name="loginname" id="loginname"/></br>
        <br>密  码： &nbsp<input type="password" name="loginpass" id="loginpass"/></br>
        <br>邮  箱： &nbsp<input type="text" name="email" id="email"></br>
        <input type="button" id="button_submit" value="提交">
    </form>


</body>
</html>
