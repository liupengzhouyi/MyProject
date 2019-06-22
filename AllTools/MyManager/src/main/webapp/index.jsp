<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-21
  Time: 00:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="user/login">测试SpringMVC环境配置</a>

<a href="user/find?uuid=12KJB12312RFVG2">测试Spring环境配置</a>

<form action="user/find" method="post">
    <input type="text" name="uuid_ii" />
    <input type="submit" value="提交">
</form>

<a href="baseOperation/userRegistration">用户注册</a>

<a href="baseOperation/userLanding">用户登陆</a>

<a href="waiterOperation/registration">服务员注册</a>


</body>
</html>
