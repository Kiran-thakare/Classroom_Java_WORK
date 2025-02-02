package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.DBconn;

@WebServlet("/countries")
public class Country extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter ps = resp.getWriter();

		Connection con = DBconn.getConnection();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Country");
			String q = "<option>---select country---</option>";

			while (rs.next()) {
				q += "<option value='" + rs.getInt("country_id") + "'>" + rs.getString("country_name") + "</option>";
			}
			ps.append(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
