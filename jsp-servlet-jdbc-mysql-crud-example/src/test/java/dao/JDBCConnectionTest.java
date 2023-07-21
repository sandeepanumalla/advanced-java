package dao;

import com.example.jspservletjdbcmysqlcrudexample.dao.JDBCConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;


public class JDBCConnectionTest {

    private final PrintStream standard = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    public void helloWorld() {
        String s = "hey";
        Assertions.assertEquals(s, "hey");
    }

    @Test
    public void connectionTest() {
        Connection con = JDBCConnection.getConnection();
//        Assertions.assertEquals("mysql connection successful", outputStreamCaptor
//                .toString().trim());
    }
}
