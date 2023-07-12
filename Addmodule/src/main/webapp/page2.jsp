<%--
  Created by IntelliJ IDEA.
  User: anuma
  Date: 12-07-2023
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div style="background: red">
    <h1>Hey there this is page two</h1>
    <%
      response.sendRedirect("page3.jsp");
    %>
  </div>
</body>
</html>
