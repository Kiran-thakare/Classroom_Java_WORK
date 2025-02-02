import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conn.JavaConn;
import model.Products;

public class ProductStock {

	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("***Console Screen Product Details**");
			System.out.println("1.Add Stock");
			System.out.println("2.View Stock");
			System.out.println("3.Search Stock");
			System.out.println("4.Edit Stock");
			System.out.println("5.Delete Stock");
			System.out.println("6.Exit");
			System.out.print("Enter Choice:");
			choice = new Scanner(System.in).nextInt();

			switch (choice) {

			case 1:
				addStock();
				break;
			case 2:
				viewStock();
				break;
			case 3:
				searchStock();
				break;
			case 4:
				editStock();
				break;
			case 5:
				deleteStock();
				break;
			case 6:
				exit();

			}
		} while (choice != 6);

	}

	private static void exit() {
		System.out.println();
		System.out.println("Thank You For Vist");
		System.out.println();
	}

	private static void addStock() {

		Scanner input = new Scanner(System.in);

		System.out.print("Product Name:");
		String name = input.nextLine();

		System.out.print("Product Price:");
		int price = input.nextInt();

		System.out.print("Product Quantity:");
		int quan = input.nextInt();
		input.nextLine();

		System.out.print("Product Company :");
		String com = input.nextLine();

		Products p = new Products();
		p.setName(name);
		p.setPrice(price);
		p.setQuantity(quan);
		p.setCompany(com);

		Connection con = JavaConn.getConnection();

		String sql = "insert into stock(product_name,product_price,product_quantity,product_company)values(?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getQuantity());
			pstmt.setString(4, p.getCompany());

			int affectedRow = pstmt.executeUpdate();
			if (affectedRow > 0) {
				System.out.println(affectedRow + "Row(s)Affected");

			} else {
				System.out.println("Error..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void viewStock() {
		Connection con = JavaConn.getConnection();

		String sql = "select * from stock";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt("product_id");
				String name = rs.getString("product_name");
				int price = rs.getInt("product_price");
				int quan = rs.getInt("product_quantity");
				String company = rs.getString("product_company");

				System.out.println("Product_Id :" + id + ", Product_Name:" + name + ",Product_Price:" + price
						+ ", Product_Quantity:" + quan + ", product_company :" + company);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

	private static void deleteStock() {

		Scanner sc = new Scanner(System.in);

		viewStock();

		System.out.print("Which Record Your Mind For Delete :");
		int id = sc.nextInt();

		Products p = new Products();
		p.setId(id);

		Connection con = JavaConn.getConnection();

		String sql = "Delete From stock where product_id=? ";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, p.getId());

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

	private static void editStock() {

		Scanner input = new Scanner(System.in);

		System.out.print("Product Name:");
		String name = input.nextLine();

		System.out.print("Product Price:");
		int price = input.nextInt();

		System.out.print("Product Quantity:");
		int quan = input.nextInt();
		input.nextLine();

		System.out.print("Product Company :");
		String com = input.nextLine();

		System.out.print("Product id:");
		int id = input.nextInt();

		Products p = new Products();
		p.setName(name);
		p.setPrice(price);
		p.setQuantity(quan);
		p.setCompany(com);
		p.setId(id);

		Connection con = JavaConn.getConnection();

		String sql = "update stock set product_name=?,product_price=?,product_quantity=?,product_company=? where product_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setInt(2, p.getPrice());
			ps.setInt(2, p.getPrice());
			ps.setString(4, p.getCompany());
			ps.setInt(5, p.getId());

			int affectrow = ps.executeUpdate();
			if (affectrow > 0) {
				System.out.println(affectrow + " Row(s) Affected");
			} else {
				System.out.println("Error...");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	private static void searchStock() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Which Record Your Mind For Search :");
		int id = sc.nextInt();

		Products p = new Products();
		p.setId(id);

		Connection con = JavaConn.getConnection();
		String sql = "select * From stock where product_id= ? ";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, p.getId());

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int id1 = rs.getInt("product_id");
				String name = rs.getString("product_name");
				int price = rs.getInt("product_price");
				int quan = rs.getInt("product_quantity");
				String company = rs.getString("product_company");

				System.out.println("Product_Id :" + id1 + ", Product_Name:" + name + ",Product_Price:" + price
						+ ", Product_Quantity:" + quan + ", product_company :" + company);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
