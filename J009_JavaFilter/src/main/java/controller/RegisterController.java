package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegisterController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		PrintWriter out = resp.getWriter();
		out.write("<h1>" + name + "</h1>");
		out.write("<h1>" + email + "</h1>");
		out.write("<h1>" + pass + "</h1>");
	}
}
