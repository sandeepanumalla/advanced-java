package com.example.registrationform.dao;

import com.example.registrationform.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        Connection connection = DaoConnection.getConnection();
        int result = 0;
        String INSERT_USERS_SQL = "INSERT INTO employee.users" +
                " (first_name, last_name, user_name, password, address, contact) VALUES " +
                "(?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUserName());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setString(6, employee.getContact());
            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
     }
}
