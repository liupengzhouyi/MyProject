<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-23
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    ${requestScope.returnInformation.object}
</h1>

<c:forEach var="item" items="${requestScope.returnInformation.object}">
    <h2>
        ${item.waiter_id}
    </h2>
</c:forEach>
</body>
</html>
