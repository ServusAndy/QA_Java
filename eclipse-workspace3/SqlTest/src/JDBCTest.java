import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
 
class JDBCTest {
 
    private static final String url = "jdbc:mysql://localhost/db_book";
 
    private static final String user = "root";
 
    private static final String password = "";
 
    public static void main(String args[]) {
        try {
			Connection con = DriverManager.getConnection(url, user, password);
          //  System.out.println("Success");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_books");
            while (rs.next()) {
//                String str = rs.getString("b_author") + ":" + rs.getString(5);
            	String str = rs.getString(1)+"  Title: "+ rs.getString(2) + "  Author: " + rs.getString(3)+
            			"  ID: "+rs.getString(4)+ "  Price: " + rs.getString(5);
                System.out.println("Book: " + str);
            }
            
        } catch (Exception e) {
        	
            e.printStackTrace();
        }
        
    }
}