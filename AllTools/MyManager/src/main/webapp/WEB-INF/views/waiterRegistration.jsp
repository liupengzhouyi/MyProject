<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-22
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务员注册</title>
</head>
<body>

<form action="/waiter/registration" method="post">
    <table>
        <tr>
            <th>
                请输入用户名
            </th>
            <td>
                <input type="text" name="waiter_name">
            </td>
        </tr>
        <tr>
            <th>
                请输入密码
            </th>
            <td>
                <input type="password" name="waiter_password">
            </td>
        </tr>
        <tr>
            <th>
                请确认密码
            </th>
            <td>
                <input type="password" name="waiter_confirm_password">
            </td>
        </tr>
        <tr>
            <th>
                <input type="reset" value="重置">
            </th>
            <th>
                <input type="submit" value="确认">
            </th>
        </tr>
    </table>
</form>

</body>
</html>

