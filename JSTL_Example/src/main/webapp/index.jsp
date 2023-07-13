<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSPL Example</title>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1>
    <%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">This is JSTL Example</a>
<c:set var="i" value="123"></c:set>
<h2><c:out value="${i}"></c:out></h2>
<%--<c:remove var="i"></c:remove>--%>
<h3><c:out value="${i}">this is default value</c:out></h3>
    <c:if test="${3 > 2}">
        <h1>yes</h1>
    </c:if>

<c:forEach var="i" begin="0" end="10">
    <c:if test="${i % 2 == 0}">
        <h2><c:out value="${i}"></c:out> is even number</h2>
    </c:if>
</c:forEach>

<c:set var="i" value="-12"></c:set>
    <c:choose>
        <c:when test="${i > 0}">
            <h1>this is my case first</h1>
            <h2>Number is positive</h2>
        </c:when>
        <c:when test="${i < 0}">
            <h1>this is my 2nd case</h1>
            <h2>Number is negative</h2>
        </c:when>
        <c:otherwise>
            <h1>this is my default case... Number is zero</h1>
        </c:otherwise>
    </c:choose>

    <c:url var="myurl" value="https://www.google.com/search">
        <c:param name="q" value="learn code with durgesh servlet"></c:param>
    </c:url>

<%--    <c:redirect url=""></c:redirect>--%>
</body>
</html>