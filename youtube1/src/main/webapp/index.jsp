<%@ page contentType="text/html; charset=UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<h1>First JSP page</h1>
<%@ include file="header.jsp" %>
<%--<%@ include file="jstl.jsp" %>--%>

<%--this is declarative tag--%>
<%!
    int a = 12;
    int b = 10;
    String name = "techsoft india";
    public int doSum() {
        return a + b;
    }
%>

<%--this is scriptlet tag--%>
<%
    out.println(a);
    out.println("<br>");
    out.println(b);
%>

<%--this is expression tag--%>
<h1>The sum is <%=doSum()%></h1>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>