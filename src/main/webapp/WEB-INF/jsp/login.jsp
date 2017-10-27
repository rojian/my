<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/18
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是一个微信公众号测试！<br>
<form action="security" method="get">
    signature:<input type="text" name="signature"><br>
    timestamp:<input type="text" name="timestamp"><br>
    nonce:<input type="text" name="nonce"><br>
    echostr:<input type="text" name="echostr"><br>
    <input type="submit" value="确定">
</form>
</body>
</html>
