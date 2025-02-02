package Controller;

import java.io.IOException;

import Dao.JavaDao;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateDeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int uid = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");

		JavaDao dao = new JavaDao();

		if (action.equals("delete")) {
			int i = dao.deleteStudent(uid);

			if (i > 0) {
			
				resp.sendRedirect("display");

			}

		} else if (action.equals("update")) {

			Student st = dao.getStudentById(uid);

			req.setAttribute("st", st);
			req.getRequestDispatcher("update.jsp").forward(req, resp);

		}
	}
}
