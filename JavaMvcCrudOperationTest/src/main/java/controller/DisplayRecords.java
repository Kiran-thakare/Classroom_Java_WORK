package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.JavaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/display")
public class DisplayRecords extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JavaDao dao = new JavaDao();

		ArrayList<Student> user = dao.showUser();

		req.setAttribute("user", user);
		req.getRequestDispatcher("Records.jsp").forward(req, resp);

	}
}
