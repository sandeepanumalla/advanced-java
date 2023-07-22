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
        Assertions.assertEquals(listOfUsers.size(), 1);
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
        try {
            String userId = "4";
            int initialSize = userDao.getAllUsers().size();
            userDao.deleteUser(userId);
//            Assertions.assertEquals(userDao.getAllUsers().size(), initialSize - 1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void findByIdTest() {
        String userId = "1";
        User user = userDao.findById(userId);
        System.out.println(user);
        Assertions.assertEquals(user.getId(), Long.parseLong(userId));
    }
}
