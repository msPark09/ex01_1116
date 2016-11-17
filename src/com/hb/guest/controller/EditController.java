package com.hb.guest.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;

@WebServlet("/guest/edit.do")
public class EditController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get으로 받으면 수정폼

		int sabun = Integer.parseInt(request.getParameter("idx").trim());
		GuestDao dao = new GuestDao();
		try {
			GuestDto dto = dao.selectOne(sabun);
			request.setAttribute("bean", dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("title", "수정");
		request.setAttribute("action", "action=\"edit.do\"");
		request.getRequestDispatcher("/WEB-INF/guest/add.jsp").forward(request,
				response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// post로 받으면 입력!
		String[] params = new String[3];
		params[0] = req.getParameter("sabun");
		params[1] = req.getParameter("name");
		params[2] = req.getParameter("pay");

		for (int i = 0; i < params.length; i++) {
			params[i] = params[i].trim();
		}
		String url = "./list.do";
		try {
			int sabun = Integer.parseInt(params[0]);
			String name = params[1];
			int pay = Integer.parseInt(params[2]);
			
			GuestDto dto = new GuestDto();
			dto.setSabun(sabun);
			dto.setName(name);
			dto.setPay(pay);
			GuestDao dao = new GuestDao();
			dao.updateOne(dto);
			
		} catch (Exception e) {
			//에러처리(edit폼으로 이동)
			url = "./edit.do?idx=" + params[0];
		}
		resp.sendRedirect(url);
	}
}
