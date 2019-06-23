<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-23
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找服务员信息</title>
</head>
<body>

    <form action="/waiter/findWaiterByID" method="post">
        <table>
            <tr>
                <th>
                    要查询的服务员ID
                </th>
                <td>
                    <input type="text" name="waiter_id">
                </td>
            </tr>
            <tr>
                <th>
                    <input type="reset" value="重置">
                </th>
                <th>
                    <input type="submit" value="提交">
                </th>
            </tr>
        </table>
    </form>

</body>
</html>
