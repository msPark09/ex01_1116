package com.hb.mvc2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex01.do")
public class Ex01Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String msg = (String)request.getAttribute("msg");
		System.out.println("id : "+id+" msg : "+msg);
		//µÑ´Ù null response ÇÏ´Â ¼ø°£ ±úÁü
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("msg2"));

		request.getRequestDispatcher("ex01.jsp").forward(request, response);
	}

}
