package utils;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.testng.Assert.fail;

public class MySQLClient {

    public static Connection connectDataBase(String host) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(host);
        } catch(Exception e) {
            e.printStackTrace();
            fail("Connection to Data Base failed");
        }
        return connection;
    }
/*
    public static int selectId(String userId)
    "SELECT FROM"*/

    public static void main(String[] args) {
        connectDataBase("127.0.0.1");
    }
}