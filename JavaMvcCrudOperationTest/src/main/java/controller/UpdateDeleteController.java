package controller;

import java.io.IOException;

import dao.JavaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/update")
public class UpdateDeleteController extends HttpServlet {
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("uid"));
		String action=req.getParameter("action");
		
		if(action.equals("delete")) {
			
			JavaDao dao=new JavaDao();
			int i=dao.deleteUser(id);
			
			if(i>0) {
				req.getRequestDispatcher("display").forward(req, resp);
				
			}
		}else if(action.equals("update")) {
			 
			JavaDao dao=new JavaDao();
			
			Student st=dao.getStudentById(id);
			
			System.out.println(st.getId());
			System.out.println(st.getUname());
			
			req.setAttribute("st", st);
			req.getRequestDispatcher("Update.jsp").forward(req, resp);
			
			
			
		}
	}
}
