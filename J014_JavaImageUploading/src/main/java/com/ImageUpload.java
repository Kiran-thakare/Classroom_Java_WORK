package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig
public class ImageUpload extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		Part part = req.getPart("file");

		/*get File name*/
		String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		
		/*Set Unique name*/
		String filenametoStore = System.currentTimeMillis() + "_" + filename;
		
		/*get Path on Image server*/
		String path = req.getServletContext().getRealPath("") + File.separator + "img";
		System.out.println(path);

		File file = new File(path);

		if (!file.exists()) {
			file.mkdir();
		}
		
		part.write(path+File.separator+filenametoStore);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasql","root","kiran@1727");
			PreparedStatement ps=con.prepareStatement("insert into imgUpload values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setString(3, filenametoStore);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data inserted");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
