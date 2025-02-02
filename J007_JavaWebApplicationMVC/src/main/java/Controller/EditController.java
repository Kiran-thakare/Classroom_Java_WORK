package Controller;

import java.io.IOException;

import Dao.JavaDao;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditController extends HttpServlet {
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		JavaDao dao=new JavaDao();
		
		Student st=new Student();
		st.setId(id);
		st.setName(name);
		st.setEmail(email);
		st.setPass(pass);
		
		int i=dao.updateStudent(st);
		if(i>0) {
		req.setAttribute("update", "Update Student");
		req.getRequestDispatcher("update.jsp").forward(req, resp);
			
		}
		
		
	}
}
