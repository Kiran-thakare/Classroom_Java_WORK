package controller;

import java.io.IOException;
import java.util.List;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/display")
public class UserDisplay extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserDao dao = new UserDao();
		List<User> li = dao.showUsers();

		req.setAttribute("users", li);
		req.getRequestDispatcher("userdisplay.jsp").forward(req, resp);
		
		for(User u:li) {
			System.out.println(u.getUsername()+":"+u.getPhone());
		}

	}
}
