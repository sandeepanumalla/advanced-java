<%--
  Created by IntelliJ IDEA.
  User: anuma
  Date: 21-07-2023
  Time: 07:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <nav  class="navbar navbar-light bg-orange">
        <div class="container-fluid">
            <span class="navbar-brand mb-0 h1">User Management</span>
        </div>
    </nav>
    <div class="container">
        <div class="d-flex justify-content-center">
            <h1>List of Users</h1>
<%--            testing jstl below--%>
<%--            <c:set var="i" value="2"></c:set>--%>
<%--            <h2><c:out value="${i}"></c:out></h2>--%>
        </div>
        <hr>
        <div class="d-flex justify-items-center margin-bottom:1rem ">
            <a href="<%=request.getContextPath()%>/new" class="btn btn-success">
                Add New User
<%--                <%request.getContextPath();%>--%>
            </a>
        </div>
        <div class="table-responsive">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Country</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listUser}" var="user">
                    <tr>
                        <th scope="row"><c:out value="${user.id}"></c:out></th>
                        <td><c:out value="${user.name}"></c:out></td>
                        <td><c:out value="${user.email}"></c:out></td>
                        <td><c:out value="${user.country}"></c:out></td>
<%--                        <td>--%>
<%--                            <a href="edit?id=<c:out value='${user.id}'>Edit</c:out>"></a>--%>
<%--                            &nbsp; &nbsp;--%>
<%--                            <a href="delete?id=<c:out value='${user.id}'>Delete</c:out>"></a>--%>
<%--                        </td>--%>
                        <td><a href="edit?id=<c:out value='${user.id}'/>">Edit</a>
                            &nbsp;&nbsp;&nbsp;&nbsp; <a
                                    href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</body>
</html>
