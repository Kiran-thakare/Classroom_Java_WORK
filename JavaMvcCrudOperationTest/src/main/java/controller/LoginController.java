package controller;

import java.io.IOException;

import dao.JavaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Student;

@WebServlet("/log")
public class LoginController extends HttpServlet {
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Student st =new Student();
		st.setEmail(email);
		st.setPass(pass);
		
		JavaDao dao=new JavaDao();
		
	    Student std=dao.checkUser(st);
	    
	    if(std==null) {
	    	 
	    	req.setAttribute("err", "user not Found");
	    	req.getRequestDispatcher("Login.jsp").forward(req, resp);
	    	
	    }else {
	    	
	    	HttpSession session=req.getSession();
	    	session.setAttribute("email", std.getEmail());
	    	req.getRequestDispatcher("display").forward(req, resp);
	    	
	    }
		
	}
}
