import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import model.User;
import util.DatabaseUtil;

public class JavaRegistarationFrom {

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
			updateRecord();
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
			break;
		}

	}

	private static void deleteRecord() {

		Scanner sc = new Scanner(System.in);
		
		viewRecord();

		System.out.print("Which Record Your Mind For Delete :");
		int id = sc.nextInt();
		

		User u = new User();
		u.setId(id);

		Connection con = DatabaseUtil.getConnection();

		String sql = "Delete From Registration where id=? ";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, u.getId());

			int rowAffect = pstmt.executeUpdate();

			if (rowAffect > 0) {
				System.out.println(rowAffect + " Rows Deleted");
			} else {
				System.out.println("Error.....");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void updateRecord() {

		Scanner sc = new Scanner(System.in);

		viewRecord();

		System.out.print("Which Record Your Mind For Update :");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setAge(age);

		Connection con = DatabaseUtil.getConnection();

		String sql = "update Registration set name=?,age=? where id=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setString(1, u.getName());
			pr.setInt(2, u.getAge());
			pr.setInt(3, u.getId());

			int rowAffect = pr.executeUpdate();
			if (rowAffect > 0) {
				System.out.println(rowAffect + " Row Update ");
			} else {
				System.out.println(rowAffect + " row affected ");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void viewRecord() {

		Connection con = DatabaseUtil.getConnection();

		String sql = "select * from Registration";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");

				System.out.println("Id :" + id + ", Name:" + name + ",Email:" + email + ", Age:" + age);
			}

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

		User u = new User();
		u.setName(name);
		u.setEmail(email);
		u.setAge(age);

		Connection con = DatabaseUtil.getConnection();

		try {
			String sql = "insert into Registration(name,email,age)values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getEmail());
			pstmt.setInt(3, u.getAge());

			int rowAffect = pstmt.executeUpdate();
			if (rowAffect > 0) {
				System.out.println(rowAffect + " Row Affected ");
			} else {
				System.out.println(rowAffect + " row affected ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
