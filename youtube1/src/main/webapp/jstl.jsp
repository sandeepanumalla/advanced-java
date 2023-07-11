    <%--
      Created by IntelliJ IDEA.
      User: anuma
      Date: 11-07-2023
      Time: 18:42
      To change this template use File | Settings | File Templates.
    --%>
    <%--<%@ page contentType="text/html;charset=UTF-8"  %>--%>
    <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page errorPage="error_page.jsp" %>
    <html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>Taglib Directive tutorial</h1>
    <%--    <hr>--%>

<%--        <c:set var="name" value="Techsoft INDIAN"></c:set>--%>

<%--        <c:out value="${name}"></c:out>--%>

<%--        <c:if test="${3 > 2}">--%>
<%--            <h2>This is true block 3 > 2</h2>--%>
<%--        </c:if>--%>

    <p:out value="${34+12}"></p:out>

    <%!
        int n1 = 20;
        int n2 = 10;
    %>

    <%
        int division = n1 / n2;
    %>

    <h1>Division is bababd <%=division%></h1>

    </body>
    </html>
