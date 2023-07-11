package com.example.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>This is Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        String name = req.getParameter("user_name");
        out.println("<h1>Hello, " + name + " welcome back to my servlet1... </h1>");
//        out.println("<a href='servlet2?user_name=" + name + "'>click here to go to Servlet2</a>");
        out.println("" +
                "<form action='servlet2'>" +
                "<input type='hidden' name='user_name' value='"+name+"'>" +
                "<button >Go to second servlet</button>" +
                "" +
                "" +
                "</form>");
        out.println("<h1>Thank you</h1>");
        out.println("</body>");
        out.println("<html>");
    }
}
