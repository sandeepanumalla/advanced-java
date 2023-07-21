package com.example.jspservletjdbcmysqlcrudexample.dao;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getConnection() {
        Connection connection;
        connection = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String password = "your_password";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("mysql connection successful");

        } catch (  SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
