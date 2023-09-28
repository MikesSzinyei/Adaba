package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb {
    
    public static Connection connectDB() {
        Connection con = null;
        try {
           con = tryConnectDB();
        } catch (SQLException e) {
            System.err.println("Hiba! Az SQL kapcsolat sikertelen!");
            System.err.println(e.getMessage());
        }
        return con;
    }
    
    public static Connection tryConnectDB() throws SQLException {
        String url="jdbc:mariadb://localhost:3306/adaba";
        Connection con = DriverManager.getConnection(url, "adaba", "titok");
        return con;
    }
}
