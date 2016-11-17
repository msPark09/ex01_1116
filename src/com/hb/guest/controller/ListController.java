package com.hb.guest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@WebServlet("/guest/list.do")
public class ListController extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GuestDao dao = new GuestDao();

		// int a = dao.selectAll();
//		System.out.println(a);
		ArrayList<GuestDto> list = null;
		try {
			list = dao.selectAll();
//			for(int i=0;i<list.size();i++){
//				//System.out.println((Integer)list.get(i));
////				HashMap map = (HashMap)list.get(i);
////				System.out.println(map.get("sabun")+", ");
////				System.out.println(map.get("name")+", ");
////				System.out.println(map.get("nalja")+", ");
////				System.out.println(map.get("pay")+", ");
//				GuestDto dto = (GuestDto)list.get(i);
//				System.out.println(dto.getSabun());
//				System.out.println(dto.getName());
//				System.out.println(dto.getNalja());
//				System.out.println(dto.getPay());
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/guest/list.jsp").forward(request, response);
	}

}
