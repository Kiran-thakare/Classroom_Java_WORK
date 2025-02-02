import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JavaRegistration {

	private static final String URL = "jdbc:mysql://localhost:3306/javasql";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kiran@1727";

	public static void main(String[] args) {

		System.out.println("1.Insert Record");
		System.out.println("2.Update Record");
		System.out.println("3.Delete Record");
		System.out.println("4.View Record");
		System.out.println("5.Exit");
		System.out.print("Enter Choice :");

		int choice = new Scanner(System.in).nextInt();

		switch (choice) {
		case 1:
			insertRecord();
			break;
		case 2:
			System.out.println("Which Record On Update");
			System.out.println("1.Update Name");
			System.out.println("2.Update Age");
			System.out.print("Enter Your Choice:");
			int update = new Scanner(System.in).nextInt();

			switch (update) {

			case 1:
				updateName();
				break;
			case 2:
				updateAge();
				break;
			}
			break;
		case 3:
			deleteRecord();
			break;
		case 4:
			viewRecord();
			break;
		case 5:
			break;

		default:
		}
	}

	private static void viewRecord() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String query = "select * from Registration ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");

				System.out.println("Id :" + id + ", Name:" + name + ",Email:" + email + ", Age:" + age);

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void deleteRecord() {

		Scanner sc = new Scanner(System.in);

		viewRecord();

		System.out.print("Enter Which Record Are Deleted:");
		int id = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "Delete From Registration where id=? ";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);

			int rowsAffected = stmt.executeUpdate();
			System.out.println("Deleted" + rowsAffected + " row(s).");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void insertRecord() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Email: ");
		String email = sc.next();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "insert into Registration(name,email,age)values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setInt(3, age);

			int rowsAffected = stmt.executeUpdate();
			System.out.println("Inserted " + rowsAffected + " row(s).");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void updateAge() {
		Scanner sc = new Scanner(System.in);

		viewRecord();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String age = "update Registration set age=? where id=?";
			PreparedStatement stmt = con.prepareStatement(age);
			System.out.println("Enter age:");
			int age1 = sc.nextInt();

			System.out.println("Enter id:");
			int id = sc.nextInt();

			stmt.setInt(1, age1);
			stmt.setInt(2, id);

			int rowsAffected = stmt.executeUpdate();
			System.out.println("Updated " + rowsAffected + " row(s).");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void updateName() {

		Scanner sc = new Scanner(System.in);

		viewRecord();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String age = "update Registration set name=? where id=?";
			PreparedStatement stmt = con.prepareStatement(age);
			System.out.println("Enter Name:");
			String name = sc.next();
			String Name = name;

			System.out.println("Enter id:");
			int id = sc.nextInt();

			stmt.setString(1, Name);
			stmt.setInt(2, id);

			int rowsAffected = stmt.executeUpdate();
			System.out.println("Updated " + rowsAffected + " row(s).");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
