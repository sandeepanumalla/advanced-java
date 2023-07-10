package com.example.sumandproducts;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class S2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest1(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest1(req, resp);
    }

    void processRequest1(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");
            out.println("</head>");
            out.println("<body>");
            String n1 = request.getParameter("n1");
            String n2 = request.getParameter("n2");

            int nn1 = Integer.parseInt(n1);
            int nn2 = Integer.parseInt(n2);

            int p = nn1 + nn2;

            int sum = (int)request.getAttribute("sum");
            out.println("<h1>");
            out.print("<h1> the sum is " + sum);
            out.print("the product is " + p + "</h1>");
            out.println("</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
