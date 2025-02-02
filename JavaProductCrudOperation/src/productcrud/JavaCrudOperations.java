package productcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaCrudOperations {

	private static final String URL = "jdbc:mysql://localhost:3306/Product";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kiran@1727";

	Connection con = null;

	public JavaCrudOperations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addProduct(String pName, int price, int qty) {

		try {
			PreparedStatement ps1 = con.prepareStatement("select * from product where pname=?");
			ps1.setString(1, pName);
			ResultSet rs = ps1.executeQuery();
			if (rs.next()) {
				System.out.println("Product Already Exists");
			} else {

				try {
					PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, pName);
					ps.setInt(3, price);
					ps.setInt(4, qty);

					int affectRow = ps.executeUpdate();
					if (affectRow > 0) {
						System.out.println("Insert Data !!!!!!");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public void viewProduct() {

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from product");

			if (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteProduct(String pName) {

		try {
			PreparedStatement ps = con.prepareStatement("delete from product where pname=?");
			ps.setString(1, pName);
			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("Delete row");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateProduct(String pName, int qty) {

		try {
			PreparedStatement ps = con.prepareStatement("select * from product where pname=? and quantity>=?");
			ps.setString(1, pName);
			ps.setInt(2, qty);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int currentQuantity = rs.getInt("quantity");
				int newQuantity = currentQuantity - qty;

				PreparedStatement updatePs = con.prepareStatement("UPDATE product SET quantity=? WHERE pname=?");
				updatePs.setInt(1, newQuantity);
				updatePs.setString(2, pName);
				updatePs.executeUpdate();

				System.out.println("Issued " + qty + " of product: " + pName + ". New quantity is: " + newQuantity);
			}
			else {
				System.out.println("Product Out Of Stock");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
