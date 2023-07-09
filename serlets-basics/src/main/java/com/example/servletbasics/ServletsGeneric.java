package com.example.servletbasics;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class ServletsGeneric extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("the generic servlets has initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("the generic servlets inside service ");
    }
}
