package application.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
	
    // DB connection parameters
    
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String DB = "sql_course";
    private static final String USER = "root";
    private static final String PASSWORD = "aelita";
    private static final boolean SSL = false;
     
    // -------------------------------------
     
    public static Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(URL+"/"+DB+(SSL ? "" : "?useSSL=false"), USER, PASSWORD);
    }

}
