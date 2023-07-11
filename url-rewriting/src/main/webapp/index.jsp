<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
    <form action="servlet1" method="get">
        <label style="font-size: 30px">Name: <input name="user_name" type="text"></label>
        <input type="submit">
    </form>
</body>
</html>