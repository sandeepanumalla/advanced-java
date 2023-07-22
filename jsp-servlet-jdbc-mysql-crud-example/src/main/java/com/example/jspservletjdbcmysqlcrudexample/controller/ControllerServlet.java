package com.example.jspservletjdbcmysqlcrudexample.controller;

import com.example.jspservletjdbcmysqlcrudexample.dao.JDBCConnection;
import com.example.jspservletjdbcmysqlcrudexample.dao.UserDao;
import com.example.jspservletjdbcmysqlcrudexample.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControllerServlet extends HttpServlet {

    private UserDao userDao;
    private Connection connection;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();
        List<Integer> list = new ArrayList<>();
        try {
            switch (action) {
                case "/new":
                    showNewForm(req, resp);
                    break;
                case "/edit":
                    showEditForm(req, resp);
                    break;
                case "/insert":
                    addUser(req, resp);
                    break;
                case "/update":
                    updateUser(req, resp);
                    break;
                case "/delete":
                    deleteUser(req, resp);
                    break;
                default:
                    listUser(req, resp);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException();
        }

    }

    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String userId = req.getParameter("id");
            userDao.deleteUser(userId);
            resp.sendRedirect(req.getContextPath() + "/list");
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse resp) {
                try{
                    String id = request.getParameter("id");
                    String name = request.getParameter("name");
                    String email = request.getParameter("email");
                    String country = request.getParameter("country");
                    User newUser = User.builder()
                            .id(Long.parseLong(id))
                            .name(name)
                            .email(email)
                            .country(country)
                            .build();
                    userDao.updateUser(newUser);
                    resp.sendRedirect(request.getContextPath() + "/list");
                } catch (SQLException | IOException e) {
                    throw new RuntimeException(e);
                }
            }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String userId = req.getParameter("id");
            User user = userDao.findById(userId);
            req.setAttribute("user", user);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("user-form.jsp");
            requestDispatcher.forward(req, resp);
        } catch ( ServletException | IOException ioException) {
            throw new RuntimeException();
        }

    }


    private void showNewForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("user-form.jsp");
            requestDispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void listUser(HttpServletRequest req, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<User> listUser = userDao.getAllUsers();
        req.setAttribute("listUser", listUser);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("users-list.jsp");
        requestDispatcher.forward(req, response);
    }

    protected void addUser(HttpServletRequest request, HttpServletResponse response) {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");
            User newUser = User.builder()
                    .name(name)
                    .email(email)
                    .country(country)
                    .build();
            userDao.saveUser(newUser);
            response.sendRedirect(request.getContextPath() + "/list");
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void init() throws ServletException {
        connection = JDBCConnection.getConnection();
        userDao = new UserDao(connection);
    }
}
