<%--
  Created by IntelliJ IDEA.
  User: anuma
  Date: 19-07-2023
  Time: 05:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
<%--<h2>hello</h2>--%>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h2 class="text-center">Employee Registration Form</h2>
                <form method="post" action="${pageContext.request.contextPath}/employee">
                    <div class="mb-3">
                        <label for="exampleInputEmail1"  class="form-label">First Name</label>
                        <input type="text" class="form-control" name="first_name" id="exampleInputEmail1" aria-describedby="emailHelp">
<%--                        <div id="firstnameHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Last Name</label>
                        <input type="text" class="form-control" name="last_name" id="exampleInputEmail1" aria-describedby="emailHelp">
<%--                        <div id="lastnameHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">User Name</label>
                        <input type="text" class="form-control" name="user_name" id="exampleInputEmail1" aria-describedby="emailHelp">
<%--                        <div id="usernameHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Password</label>
                        <input type="password" class="form-control" name="password" id="exampleInputPassword1">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Address</label>
                        <input type="text" class="form-control" name="address" id="exampleInputEmail1" aria-describedby="emailHelp">
<%--                        <div id="addressHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Contact</label>
                        <input type="text" class="form-control" name="contact" id="exampleInputEmail1" aria-describedby="emailHelp">
<%--                        <div id="addressHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
                    </div>
<%--                    <div class="mb-3 form-check">--%>
<%--                        <input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
<%--                        <label class="form-check-label" for="exampleCheck1">Check me out</label>--%>
<%--                    </div>--%>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
