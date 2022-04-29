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
    <title>zadanie 3</title>
</head>
<body>
<%-- plus w tym kodzie nie zdaziała dlatego trzeba robić concat  --%>
<%-- Wywołanie na stronie third.jsp?a=5&b=7   --%>
<p>${empty param.a or empty param.b ? "empty": param.a.concat(", ").concat(param.b)}</p>

</body>
</html>
