package Controller;

import java.io.IOException;

import Dao.JavaDao;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class RegistrationController extends HttpServlet {
     
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Student st=new Student();
		st.setName(name);
		st.setEmail(email);
		st.setPass(pass);
		
		JavaDao dao=new JavaDao();
		int i=dao.addStudent(st);
		if(i>0) {
			req.setAttribute("insert", "Registration Succesfully");
			req.getRequestDispatcher("Signup.jsp").forward(req, resp);
		}
		
		
	}
}
