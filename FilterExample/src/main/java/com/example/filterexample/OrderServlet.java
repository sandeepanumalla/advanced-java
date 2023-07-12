package com.example.filterexample;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class OrderServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        resp.setContentType("text/html;charset=UTF-8");
////        PrintWriter out = resp.getWriter();
////        out.println("<!DOCTYPE html>");
////        out.println("<html lang=\"en\">");
////        out.println("<head>");
////        out.println("    <meta charset=\"UTF-8\">");
////        out.println("    <title>OrderServlet</title>");
////        out.println("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
////        out.println("</head>");
////        out.println("<body>");
////        out.println("<h1> Servlet OrderServlet at " + req.getContextPath() + " </h1>");
////        out.println("</body>");
////        out.println("</html>");
//
//    }
//}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class OrderServlet extends HttpServlet {
        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("    <meta charset=\"UTF-8\">");
            out.println("    <title>OrderServlet</title>");
            out.println("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Servlet OrderServlet at " + req.getContextPath() + " </h1>");
            out.println("</body>");
            out.println("</html>");
        }
}
