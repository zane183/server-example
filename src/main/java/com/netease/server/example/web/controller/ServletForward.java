package com.netease.server.example.web.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletForward extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -370563469678006521L;

	@Override
	public void init() throws ServletException {
		System.out.println("init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/forwardExample");
		rd = this.getServletContext().getNamedDispatcher(
				"ServletForwardExample");
		rd = this.getServletContext().getRequestDispatcher("/forwardExample");
		rd.forward(req, resp);
	}
}
