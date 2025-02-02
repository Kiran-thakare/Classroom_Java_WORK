package controller;

import java.io.IOException;

import dao.JavaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/reg")
public class RegisterController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("uname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Student st=new Student();
		
		st.setUname(name);
		st.setEmail(email);
		st.setPass(pass);
		
		JavaDao dao=new JavaDao();
		
		int i=dao.registerStudent(st);
		
		if(i>0) {
			 req.setAttribute("success", "Register Succesfully");
			 req.getRequestDispatcher("Registration.jsp").forward(req, resp);
		}
	}
     
}
