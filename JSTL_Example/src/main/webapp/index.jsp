<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSPL Example</title>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">This is JSTL Example</a>
<h2><c:out value="${2 + 12}"></c:out></h2>
</body>
</html>