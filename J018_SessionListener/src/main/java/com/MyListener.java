package com;

import org.apache.catalina.SessionEvent;
import org.apache.catalina.SessionListener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {

	int cUser = 0;
	int tUser = 0;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		cUser++;
		tUser++;

		ServletContext cx = se.getSession().getServletContext();
		cx.setAttribute("cUser", cUser);
		cx.setAttribute("tUser", tUser);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		cUser--;
		ServletContext cx = se.getSession().getServletContext();
		cx.setAttribute("cUser", cUser);
	}
}
