<%--
  Created by IntelliJ IDEA.
  User: ksx
  Date: 28.04.2022
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>zadanie 4</title>
</head>
<body>
<%--WYŚWIETLA COOKIE JEŚLI NIE UMARŁY W SERVLECIE cookie.setMaxAge(10000)--%>
<p>${cookie.foo.name}</p>
<p>${cookie.foo.value}</p>
</body>
</html>
