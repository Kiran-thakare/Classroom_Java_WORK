package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Log extends HttpServlet{
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		PrintWriter pw=resp.getWriter();
		
		Cookie ck=new Cookie("uname", uname);
		resp.addCookie(ck);
		
		pw.append("<h1><a href='home'>click</a></h1>");
	}
}
