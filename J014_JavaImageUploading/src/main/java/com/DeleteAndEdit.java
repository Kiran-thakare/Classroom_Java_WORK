package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class DeleteAndEdit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.valueOf(req.getParameter("uid"));
		String action = req.getParameter("action");
		System.out.println(id + "" + action);

		if (action.equals("delete")) {
			Connection con = Dbconnection.getConnection();

			PreparedStatement ps;
			try {
				ps = con.prepareStatement("delete from imgUpload where id=?");
				ps.setInt(1, id);
				int i = ps.executeUpdate();

				req.setAttribute("del", i);
				req.getRequestDispatcher("index.jsp").forward(req, resp);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (action.equals("edit")) {
			Connection con = Dbconnection.getConnection();

			try {
				PreparedStatement ps = con.prepareStatement("select * from imgUpload where id=? ");
				ps.setInt(1, id);

				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					int id1 = rs.getInt(1);
					String name = rs.getString(2);
					String img = rs.getString(3); // You might want to send an image path, not the image itself

					// Store in request for JSP access
					req.setAttribute("id", id1);
					req.setAttribute("name", name);
					req.setAttribute("image", img);

					req.setAttribute("result", rs);
					req.getRequestDispatcher("updateImg.jsp").forward(req, resp);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
