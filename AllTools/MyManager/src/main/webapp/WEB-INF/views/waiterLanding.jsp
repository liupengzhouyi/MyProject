<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-23
  Time: 00:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务员登陆</title>
</head>
<body>
<form action="" method="post">
    <table>
        <tr>
            <th>
                请输入服务员用户名
            </th>
            <td>
                <input type="text" name="user_name">
            </td>
        </tr>
        <tr>
            <th>
                请输入密码
            </th>
            <td>
                <input type="password" name="user_password">
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
