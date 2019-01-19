import java.sql.*;
import java.util.ArrayList;
import java.util.TreeSet;

//Driver drv = new com.mysql.cj.jdbc.Driver(); ?????

public class SqlApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String userName = "root";
		String password = "";
		String connectUrl = "jdbc:mysql://localhost/test";
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection(connectUrl, userName, password)) {
			// System.out.println("We're connected");
			Statement stm = connection.createStatement();
//		         stm.executeUpdate("CREATE TABLE `worker` (`id` MEDIUMINT NOT NULL AUTO_INCREMENT,`first name` VARCHAR(30) NOT NULL,"
//		         		+ "`last name` VARCHAR(30) NOT NULL,`position` VARCHAR(30) NOT NULL, PRIMARY KEY(`id`));");
		         
		         
		         ArrayList<Worker> arr = new ArrayList<>();
		         TreeSet<Worker> tree = new TreeSet<>();
		         for(int i = 0;i<5;i++) {
		        	 tree.add(Worker.getRandomWorker());
		         }
		         for(Worker w:tree) {
		        	 arr.add(w);
		         }              	
      			for (int i = 0; i<10; i++) {
      			String fn =	arr.get(i).getFirstName();
      			String ln = arr.get(i).getLastName();
      			String p = arr.get(i).getPosition();
				String insrtSQL = "INSERT INTO worker(`first name`,`last name`,`position`) VALUES ('" + arr.get(i).getFirstName()
						+ "','" +  arr.get(i).getLastName() + "','" +  arr.get(i).getPosition() + "');";
				System.out.println(insrtSQL);
				stm.executeUpdate(insrtSQL);
				
			//	 stm.executeUpdate("DROP TABLE `worker`;");
	}

		}
	}
}


//ResultSet rs = stm.executeQuery("SELECT * FROM tbl_books");
//while (rs.next()) {
//    String str = rs.getString("b_author") + ":" + rs.getString(5);
//    System.out.println("Author:" + str);
//}