<%--
  Created by IntelliJ IDEA.
  User: ksx
  Date: 28.04.2022
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Dotyczy Mvc14</title>
</head>
<body>
<table>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.title}, ${book.author}, ${book.isbn}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
