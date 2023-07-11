<%--
  User: anuma
  Date: 10-07-2023
  Time: 17:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body style="background-size: cover;">
<div class="container">
    <div class="row">
        <div class="col m6 offset-m3">
        <div class="card">
            <div class="card-content">
                <h3 class="center-align">Register here !!</h3>
                <h5 id="msg" class="center-align"></h5>
                <div class="form center-align">
                    <form id="myform" action="${pageContext.request.contextPath}/Register" method="post">
                        <input type="text" name="user_name" placeholder="Enter user name">
                        <input type="password" name="user_password" placeholder="Enter user password">
                        <input type="email" name="user_email" placeholder="Enter user email">
                        <div class="file-field input-field">
                            <div class="btn blue">
                                <span>File</span>
                                <input type="file" name="image">
                            </div>
                            <div class="file-path-wrapper">
                                <input class="file-path validate" type="text">
                            </div>
                        </div>
                        <button type="submit" class="btn light-blue accent-3">Submit</button>
                    </form>
                </div>
                <div id="myloader" class="loader center-align" style="margin-top: 10px; display: none">
                    <div class="preloader-wrapper big active">
                        <div class="spinner-layer spinner-blue">
                            <div class="circle-clipper left">
                                <div class="circle"></div>
                            </div><div class="gap-patch">
                            <div class="circle"></div>
                        </div><div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                        </div>

                        <div class="spinner-layer spinner-red">
                            <div class="circle-clipper left">
                                <div class="circle"></div>
                            </div><div class="gap-patch">
                            <div class="circle"></div>
                        </div><div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                        </div>

                        <div class="spinner-layer spinner-yellow">
                            <div class="circle-clipper left">
                                <div class="circle"></div>
                            </div><div class="gap-patch">
                            <div class="circle"></div>
                        </div><div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                        </div>

                        <div class="spinner-layer spinner-green">
                            <div class="circle-clipper left">
                                <div class="circle"></div>
                            </div><div class="gap-patch">
                            <div class="circle"></div>
                        </div><div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                        </div>
                    </div>
                    <h5>please wait...</h5>
                    </div>

                </div>

            </div>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>

<script>
    $(document).ready(()=> {
        console.log("page is ready...");


        $("#myform").on('submit', function (event) {
            event.preventDefault();
            // let f = $(this).serialize();
            let f = new FormData(this);
            console.log(f);

            $("#myloader").show();
            $("#myform").hide();

            $.ajax({
                url: "Register",
                data: f,
                type: 'POST',
                success: function (data, textStatus, jqXHR) {
                    console.log(data);
                    console.log("success.........");
                    $("#myloader").hide();
                    $("#myform").show();
                    if(data.trim() === 'done') {
                        $("#msg").html("Successfully Registered");
                        $("#msg").addClass("green-text");
                    } else {
                        $("#msg").html("Something went wrong on server....");
                        $("#msg").addClass("red-text");
                    }
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log("err thrown ");
                    console.log(errorThrown);

                    $("#myloader").hide();
                    $("#myform").show();
                },
                processData: false,
                contentType: false
            })

        });
    })


</script>
</body>
</html>
