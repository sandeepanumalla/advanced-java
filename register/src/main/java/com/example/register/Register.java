package com.example.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@MultipartConfig
public class Register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    void processRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
//
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet S1</title>");
//            out.println("</head>");
//            out.println("<body>");
            String username = request.getParameter("user_name");
            String password = request.getParameter("user_password");
            String email = request.getParameter("user_email");
            Part part = request.getPart("image");
            String imageName = part.getSubmittedFileName();
//            out.println(imageName);

            try {
                Thread.sleep(3000);
                Connection con = JDBCConnection.getConnection();
                String query = "insert into user(name, password, email, imageName) values(?, ?, ?, ?)";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, imageName);
                preparedStatement.executeUpdate();

                InputStream is = part.getInputStream();
                byte[] data = new byte[is.available()];

                is.read(data);

                String path = request.getServletContext().getRealPath("/") + "img" + File.separator + imageName;
                System.out.println(path);
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(data);
                fos.close();
                out.println("done");
            } catch (SQLException | InterruptedException | FileNotFoundException e) {
                throw new RuntimeException(e);
            }
//            out.println(username);
//            out.println(password);
//            out.println(email);

//            out.println("</body>");
//            out.println("</html>");
        } catch (IOException | ServletException e) {
            throw new RuntimeException(e);
        }
    }

    boolean nullCheck(String username, String password, String email) {
        return username != null && password != null && email != null;
    }
}
