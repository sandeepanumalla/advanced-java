package com.example.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
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
        out.println("<h1>Hello, " + name + " welcome back to servlet 2... </h1>");
//        out.println("<a href='servlet2?name=" + name + "'>click here to go to Servlet2</a>");
        out.println("<h1>Thank you</h1>");
        out.println("</body>");
        out.println("<html>");
    }
}
