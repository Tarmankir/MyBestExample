package sql;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.testng.Assert.fail;

public class MySQLClient {

    public static Connection connectDataBase(String host) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306" + "/" + "test_base" + "?autoReconnect=true",
                    "root", "School593");
        } catch(Exception e) {
            e.printStackTrace();
            fail("Connection to Data Base failed");
        }
        return connection;
    }

    public static void main(String[] args) {
        connectDataBase("localhost");
    }
}