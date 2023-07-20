package com.example.registrationform.controller;

import com.example.registrationform.dao.EmployeeDao;
import com.example.registrationform.model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeeServlet extends HttpServlet {


    public EmployeeServlet() {

    }
    private final EmployeeDao employeeDao = new EmployeeDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String firstName = req.getParameter("first_name");
            String lastName = req.getParameter("last_name");
            String userName = req.getParameter("user_name");
            String password = req.getParameter("password");
            String address = req.getParameter("address");
            String contact = req.getParameter("contact");

            Employee employee = Employee.builder()
                    .firstName(firstName)
                    .lastName(lastName)
                    .userName(userName)
                    .address(address)
                    .password(password)
                    .contact(contact)
                    .build();
            employeeDao.registerEmployee(employee);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("employeeDetails.jsp");
        requestDispatcher.forward(req, resp);
    }
}
