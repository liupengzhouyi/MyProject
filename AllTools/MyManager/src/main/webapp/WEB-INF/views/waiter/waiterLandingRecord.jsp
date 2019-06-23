<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-23
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取服务员的登陆记录</title>
</head>
<body>

    <h1>
        查询服务员登陆记录
    </h1>

    <form action="/WaiterLanding/getWaiterLandingRecord" method="post">
        <table border="1">
            <tr>
                <th>
                    请确认服务员的ID
                </th>
                <td>
                    <input type="password" name="waiter_id">
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
