package com.example.servletbasics;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
//    private String username = "";
//    private String password = "";
    String br = "</br>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String confirmPassword = req.getParameter("user_confirm_password");
        String mobile = req.getParameter("user_mobile");
        System.out.printf("%s %s %s %s",username, password, confirmPassword, mobile);
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        if(checkAllParametersIfEmpty(username, password, mobile, confirmPassword)) {
            pw.println("Some fields are empty.<br>");
            pw.println("<a href=\"register-form.html\">Click here</a> to retry again.");


        }
        else if(!passwordEquals(password, confirmPassword)) {
            pw.println("Some fields are empty.<br>");
            pw.println("<a href=\"register-form.html\">Click here</a> to retry again.");


        } else {
            pw.println("<h2>welcome to register servlet</h2>");

            pw.println("<p>Name: "+username+"</p>");

            pw.println("<p>Email: "+email+"</p>");

            pw.println("<p>Mobile: "+mobile+"</p>");


        }
    }

    protected boolean passwordEquals(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    protected boolean checkAllParametersIfEmpty(String username, String mobile, String password, String confirmPassword) {
        return password == null || confirmPassword == null || mobile == null || username == null;
    }
}
