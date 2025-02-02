package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addpro")

public class AddProduct extends HttpServlet {
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pname=req.getParameter("proname");
		String pprize=req.getParameter("prize");
		String pqty=req.getParameter("qty");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran","root","kiran@1727");
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, pname);
			ps.setString(3, pprize);
			ps.setString(4, pqty);
			
			int i=ps.executeUpdate();
			
			if(i>0) {
				 req.setAttribute("Success", "Product Add Succesfully");
				 req.getRequestDispatcher("Home.jsp").forward(req, resp);
			}else {
				req.setAttribute("error", "Invalid");
				 req.getRequestDispatcher("ProductAdd.jsp").forward(req, resp);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
