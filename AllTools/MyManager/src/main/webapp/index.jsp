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

<a href="/waiterOperation/landing">服务员登陆</a>

<a href="waiter/allWaiter">获取所有服务员</a>

<a href="/waiterOperation/findWaiterByID"> 通过服务员ID查询服务员 </a>

<a href="/waiterOperation/inputOrderPassword"> 服务员修改密码 </a>

<a href="/WaiterLanding/listWaiterLandingRecord">获取所有登陆记录</a>

<a href="/waiterOperation/selectWaiterLanding">获取服务员的登陆记录</a>



</body>
</html>
