package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/log")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");

		if (name.equals("admin") && pass.equals("admin")) {
			HttpSession session=req.getSession();
			session.setAttribute("name", name);
			req.getRequestDispatcher("home.jsp").forward(req, resp);

		} else {
			req.getRequestDispatcher("index.jsp").forward(req, resp);

		}
	}
}
