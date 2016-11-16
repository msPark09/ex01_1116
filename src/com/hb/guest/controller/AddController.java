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
		//������丮���� add.jsp�� ã���� ��
		//"/guest/add.do"�� ������丮 : /guest
		//����� �ٸ� ���� ./../guest2/add.jsp
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getParameter("sabun"));
		//���� �ּҰ� ���� �ٸ� ���� �ϰ� ��
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
	
	//doget�� �������� �����ϸ鼭 dopost�� �������� ������ �� ����
	//������ ǥ�ô� doget, form�� dopost

}
