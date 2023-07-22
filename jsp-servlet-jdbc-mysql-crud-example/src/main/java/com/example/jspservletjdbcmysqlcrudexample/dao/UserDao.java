package com.example.jspservletjdbcmysqlcrudexample.dao;

import com.example.jspservletjdbcmysqlcrudexample.model.User;
import jdk.jshell.spi.SPIResolutionException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private final Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public void saveUser(User user) throws SQLException {
        try {
            String query = "INSERT INTO demo.users" +
                    "(name, email, country) VALUES " +
                    "(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(String id) throws SQLException {
        try {
            String query = "DELETE FROM demo.users WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateUser(User user) throws SQLException {
        try {
            String query = "UPDATE demo.users SET name = ?, email = ?, country = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setString(4, String.valueOf(user.getId()));
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> getAllUsers() throws SQLException {
        ResultSet resultSet = null;
        List<User> users = new ArrayList<>();
        try {
            String query = "SELECT * FROM demo.users";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.println(preparedStatement);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                User user = User.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .email(resultSet.getString("email"))
                        .country(resultSet.getString("country"))
                        .build();
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public User findById(String id) {
        User user = null;
        try {
            String query = "SELECT * from demo.users where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = User.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .email(resultSet.getString("email"))
                        .country(resultSet.getString("country"))
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
