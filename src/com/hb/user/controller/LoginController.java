package com.hb.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hb.guest.model.GuestDao;

@WebServlet("/user/login.do")
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 로그인페이지로

		request.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 로그인 작동으로
		String url = request.getContextPath() + "/guest/list.do";
		String[] params = { request.getParameter("sabun").trim(),
				request.getParameter("name").trim() };

		int cnt = 0;
		for (String param : params) {
			cnt++;
			if (param.equals("")) {
				response.sendRedirect(request.getContextPath()
						+ "/user/login.do?errMsg" + cnt + "=NotNull");
				return;// 메서드 종료
			}
		}
		try {
			int sabun = Integer.parseInt(params[0]);
			String name = params[1];
			GuestDao dao = new GuestDao();
			boolean tf = dao.loginChk(sabun, name);
			HttpSession session;
			if (tf) {
				session = request.getSession();
				session.setAttribute("result", true);
				session.setAttribute("sabun", sabun);
			}
		} catch (NumberFormatException e) {
			response.sendRedirect(request.getContextPath()
					+ "/user/login.do?errMsg1=NumberFormatException");
			return;// 메서드 종료
		} catch (Exception e) {

		}
		response.sendRedirect(url);
	}

}
