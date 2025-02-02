package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConn {

	private static final String URL = "jdbc:mysql://localhost:3306/javasql";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kiran@1727";

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
