package com.hb.guest.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;

@WebServlet("/guest/detail.do")
public class DetailContoller extends HttpServlet {
	
	private GuestDto dto;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String param = request.getParameter("idx");
		int sabun = Integer.parseInt(param);
		
		GuestDao dao = null;
		
		try {
			dao = new GuestDao();
			dto = dao.selectOne(sabun);
			request.setAttribute("bean", dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		request.getRequestDispatcher("/WEB-INF/guest/detail.jsp").forward(request, response);
	}
}
