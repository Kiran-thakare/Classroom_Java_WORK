package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.User;

@WebServlet("/register")
@MultipartConfig
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int uid = 0;
		if(!id.equals("")) {
			 uid = Integer.parseInt(id);
		}
		
		String uname = req.getParameter("username");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String[] language = req.getParameterValues("languages");
		String country = req.getParameter("country");
		Part part = req.getPart("image");

		String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		String fileNameStore = System.currentTimeMillis() + "_" + fileName;
		String path = req.getServletContext().getRealPath("") + File.separator + "img";

		File f = new File(path);

		if (!f.exists()) {
			f.mkdir();
		}
		part.write(path + File.separator + fileNameStore);

		String lang = "";
		for (String l : language) {
			lang += l + ",";
		}

		System.out.println(
				uname + " " + email + " " + phone + " " + gender + " " + country + " " + fileName + " " + lang);
		System.out.println(fileNameStore);
		System.out.println(path);

		User user = new User();
		user.setId(uid);
		user.setUsername(uname);
		user.setEmail(email);
		user.setPhone(phone);
		user.setGender(gender);
		user.setCountry(country);
		user.setLanguage(lang);
		user.setImage(fileNameStore);

		UserDao dao = new UserDao();

		int i = dao.userRegister(user);
		if (i > 0) {
			req.getRequestDispatcher("index.jsp").forward(req, resp);

		}

	}
}
