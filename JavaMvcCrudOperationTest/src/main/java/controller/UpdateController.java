package controller;

import java.io.IOException;

import dao.JavaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/modify")
public class UpdateController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		Student st = new Student();
		st.setId(id);
		st.setUname(name);
		st.setEmail(email);
		st.setPass(pass);

		JavaDao dao = new JavaDao();

		int i = dao.updateUser(st);

		if (i > 0) {
			req.setAttribute("update", "Update Student");
			req.getRequestDispatcher("display").forward(req, resp);
		}else {
			req.setAttribute("err", "Check info for Update Student");
			req.getRequestDispatcher("Update.jsp").forward(req, resp);
		}

	}

}
