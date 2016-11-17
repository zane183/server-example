package com.netease.server.example.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRedirect extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1461380034957782240L;

	@Override
	public void init() throws ServletException {
		System.out.println("init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.sendRedirect("redirectExample");
	}
}
