package dao;

import com.example.jspservletjdbcmysqlcrudexample.dao.JDBCConnection;
import com.example.jspservletjdbcmysqlcrudexample.dao.UserDao;
import com.example.jspservletjdbcmysqlcrudexample.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDaoTest {

    Connection connection = null;
    UserDao userDao;
    @BeforeEach
    void setUp() {
         connection = JDBCConnection.getConnection();
         userDao = new UserDao(connection);
    }


    @Test
    public void getAllUsersTest() throws SQLException {
        List<User> listOfUsers = userDao.getAllUsers();
        System.out.println(listOfUsers);
        Assertions.assertEquals(listOfUsers.size(), 0);
    }

    @Test
    public void saveUserTest() throws SQLException {
        int initialSize = userDao.getAllUsers().size();
        User user = User.builder()
                .name("sandeep")
                .email("sandeep@gmail.com")
                .country("India")
                .build();
        userDao.saveUser(user);
        Assertions.assertEquals(initialSize + 1, userDao.getAllUsers().size());
    }

    @Test
    public void updateUserTest() {

    }

    @Test
    public void deleteUserTest() {

    }
}
