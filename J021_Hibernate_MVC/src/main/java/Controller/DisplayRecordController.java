package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Dao.JavaDao;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")

public class DisplayRecordController extends HttpServlet {
     
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		JavaDao dao=new JavaDao();
		
	   List<Student> view=dao.showStudents();
	   
	   req.setAttribute("show", view);
	   req.getRequestDispatcher("DisplayRecords.jsp").forward(req, resp);
	}
}
