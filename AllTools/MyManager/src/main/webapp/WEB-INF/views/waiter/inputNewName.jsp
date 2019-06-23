<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-23
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入新的名字</title>
</head>
<body>

    <h1>
        服务员修改用户名
    </h1>


    <form action="/waiter/resetName" method="post">

        <table border="1">
            <tr>
                <th>
                    请输入新的用户名
                </th>
                <td>
                    <input type="text" name="waiter_name">
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
