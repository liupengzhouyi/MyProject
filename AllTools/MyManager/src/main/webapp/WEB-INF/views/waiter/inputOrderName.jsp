<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-23
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务员修改用户名</title>
</head>
<body>
    <h1>
        服务员修改用户名
    </h1>

    <form action="/waiter/verifyIDAndPassword" method="post">
        <table>
            <tr>
                <th>
                    请输入服务员用户ID
                </th>
                <td>
                    <input type="text" name="waiter_id">
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
