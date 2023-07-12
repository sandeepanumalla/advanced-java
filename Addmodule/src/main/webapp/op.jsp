<%--
  Created by IntelliJ IDEA.
  User: anuma
  Date: 12-07-2023
  Time: 07:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error_ex.jsp" %>
<html>
<head>
    <title>JSP Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <%
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");

        //converting string to Integer...
        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        int div = 0;
//        try {
           div = nn1 / nn2;
//        } catch (ArithmeticException e) {

//        }
    %>
    <div class="container p-3 text-center">
        <h1 class="text-center">Result is <%=div%></h1>
        <a class="btn btn-outline-primary text-center" href="index.html">Home Page</a>
    </div>
</body>
</html>
