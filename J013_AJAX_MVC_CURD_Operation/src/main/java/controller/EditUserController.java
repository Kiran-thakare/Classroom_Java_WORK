package controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/edit")
public class EditUserController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String action = req.getParameter("action");
		UserDao dao = new UserDao();
		PrintWriter pw = resp.getWriter();

		if (action.equals("edit")) {

			User u = dao.userSerchById(id);
			Gson json = new Gson();

			pw.append(json.toJson(u));

		} else if (action.equals("delete")) {
			int i=dao.deleteUser(id);
			if(i>0) {
				System.out.println("User Record Deleted SuccessFully...!!!");
			}
		}

	}
}
