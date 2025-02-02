package controller;

import java.io.IOException;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/update")
public class UserEditOrDelete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String action = req.getParameter("action");

		System.out.println(id);
		UserDao dao = new UserDao();

		if (action.equals("delete")) {
			int i = dao.userDelete(id);
			if (i > 0) {
				req.getRequestDispatcher("display").forward(req, resp);
			}
		} else if (action.equals("edit")) {

			User u = dao.findUserById(id);
			if (u != null) {
				req.setAttribute("user", u);
				req.getRequestDispatcher("index.jsp").forward(req, resp);

			}
		}
	}
}
