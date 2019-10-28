<%--
  Created by IntelliJ IDEA.
  User: tmx
  Date: 2019/10/28
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.requset.contextPath}/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <button type="button" id="submitBut">提交</button>
</form>

<script>
    $(function () {
        $('#submitBut').click(function () {
            alert('');
        })
    })

</script>
</body>
</html>
