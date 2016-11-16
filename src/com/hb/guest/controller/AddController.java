package com.hb.guest.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;


@WebServlet("/guest/add.do")
public class AddController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("./add.jsp").forward(request, response);
		//현재디렉토리에서 add.jsp를 찾으려 함
		//"/guest/add.do"의 현재디렉토리 : /guest
		//상대경로 다른 폴더 ./../guest2/add.jsp
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getParameter("sabun"));
		//동일 주소가 서로 다른 일을 하게 됨
		GuestDao dao = new GuestDao();
		GuestDto dto = new GuestDto();
		int sabun= Integer.parseInt(req.getParameter("sabun"));
		int pay = Integer.parseInt(req.getParameter("pay"));
		dto.setSabun(sabun);
		dto.setName(req.getParameter("name"));
		dto.setPay(pay);
		String url="./list.do";
		try {
			dao.insertOne(dto);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			url = "./add.do";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.sendRedirect(url);
		
	}
	
	//doget은 페이지를 위임하면서 dopost는 페이지를 갱신할 수 있음
	//페이지 표시는 doget, form은 dopost

}
