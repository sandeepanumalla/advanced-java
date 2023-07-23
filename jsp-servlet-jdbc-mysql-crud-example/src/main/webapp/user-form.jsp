<%--
  Created by IntelliJ IDEA.
  User: anuma
  Date: 21-07-2023
  Time: 07:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav  class="navbar navbar-light bg-orange">
    <div class="container-fluid">
        <span class="navbar-brand mb-0 h1">User Management</span>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="card mx-auto col-md-7 col-sm-10" >
        <div class="card-body">
            <c:if test="${user != null}">
                <form action="<%=request.getContextPath()%>/update" method="post">
            </c:if>
            <c:if test="${user == null}">
                <form action="<%=request.getContextPath()%>/insert" method="post">
            </c:if>

                <caption>
                    <h2>
                        <c:if test="${user != null}">Update User</c:if>
                    </h2>
                    <h2>
                        <c:if test="${user == null}">Add New User</c:if>
                    </h2>
                </caption>
                <c:if test="${user != null}">
                    <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                </c:if>

                <fieldset class="form-group">
                    <label>User Name</label>
                    <input type="text" value="<c:out value='${user.name}' />" class="form-control" name="name" required="required">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Email</label>
                    <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Country</label>
                    <input type="text" value="<c:out value='${user.country}' />" class="form-control" name="country">
                </fieldset>

                <div class="d-flex justify-content-center">
                    <button type="submit" class=" btn btn-success">Save</button>
                </div>
            </form>
        </div>
    </div>
    </div>
</div>
</body>
</html>
