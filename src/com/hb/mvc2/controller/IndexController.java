package com.hb.mvc2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class IndexController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// parameter
		System.out.println(request.getParameter("id"));
		// attribute
		request.setAttribute("msg", "HELLO");

		// session
		HttpSession session = request.getSession();
		session.setAttribute("msg2", "session : javaworld");
		System.out.println(session.getAttribute("msg2"));
		request.getRequestDispatcher("/main.jsp").forward(request, response);

		// response.sendRedirect("Ex01.do");
		// responseÇÏ´Â ¼ø°£ request ±úÁü
		// response.sendRedirect("Ex01.do?id="+request.getParameter("id"));
		// response.sendRedirect("/Ex01.do?id="+request.getParameter("id"));

	}

}

