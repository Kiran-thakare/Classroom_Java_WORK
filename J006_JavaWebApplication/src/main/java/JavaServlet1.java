import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ser1")
public class JavaServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		String [] hobby = req.getParameterValues("hobby");

		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("Email:" + email);
		System.out.println("Contact:" + contact);
		System.out.println("Gender:" + gender);
		
		if(hobby!=null) {
			System.out.println("Hobbies:");
		} 
		for(String h:hobby) {
			System.out.println(h);
		}
	}
}
