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

@WebServlet("/states")
public class State extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int cid = Integer.parseInt(req.getParameter("cid"));
		PrintWriter pw = resp.getWriter();
		Connection con = DBconn.getConnection();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from State where country_id=" + cid + "");
			String q = "<option>---select State---</option>";

			while (rs.next()) {
				q += "<option value='" + rs.getInt("state_id") + "'>" + rs.getString("state_name") + "</option>";
			}
			pw.append(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
