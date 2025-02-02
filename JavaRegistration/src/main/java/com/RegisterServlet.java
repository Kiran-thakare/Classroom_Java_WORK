package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sign")

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		String url1=(String) req.getAttribute("url");
		
		
		

		System.out.println("name :" + name + ",Email:" + email + ",Password:" + pass +",url:"+url1);

		try {
			Thread.sleep(3000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javasql", "root", "kiran@1727");
			String find = "select * from form where uname=? and email=?";
			String insert = "insert into form values(?,?,?,?)";

			PreparedStatement ps1 = con.prepareStatement(find);
			ps1.setString(1, name);
			ps1.setString(2, email);
			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {

				req.setAttribute("error", "Username Already Registered");
				RequestDispatcher rd = req.getRequestDispatcher("Signup.jsp");
				rd.forward(req, resp);
			} else {
				
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(1, 0);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setString(4, pass);

				int i = ps.executeUpdate();
				if (i > 0) {
					req.setAttribute("insert", "User Add Successfully");
					RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
					rd.forward(req, resp);
					System.out.println("insert.....");
				}
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
