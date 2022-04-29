<%--
  Created by IntelliJ IDEA.
  User: ksx
  Date: 28.04.2022
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>jsp1.jsp</title>
</head>
<body>
    <c:out value="${userRole}" default="guest" />
</body>
</html>
