package Filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.Validation;

@WebFilter("/reg")
public class JavaFilter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String name = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		RequestDispatcher rd = req.getRequestDispatcher("Registration.jsp");

		if (name.equals("") || name == null) {
			req.setAttribute("nameErr", "Fill Name");
			rd.forward(req, response);
			return;

		} else if (!Validation.nameValidation(name)) {
			req.setAttribute("nameErr", "Enter Only Alphabet..!!");
			rd.forward(req, response);
			return;
		}

		if (email.equals("") || email == null) {
			req.setAttribute("emailErr", "Enter Email ");
			rd.forward(req, response);

		} else if (!Validation.emailValidation(email)) {
			req.setAttribute("emailErr", "Email is not valid...!!");
			rd.forward(req, response);
			return;
		}
		if (pass.equals("") || pass == null) {
			req.setAttribute("passErr", "Enter Password");
			rd.forward(req, response);
			return;

		} else if (!Validation.passValidation(pass)) {
			req.setAttribute("passErr", "Atleast 1 Uppercase 1 Sign(@!$%)!!");
			rd.forward(req, response);
			return;
		}

		System.out.println("pre Runing....");
		chain.doFilter(req, response);
		System.out.println("post Runing....");

	}
}
