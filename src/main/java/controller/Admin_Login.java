package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Admin_dao;
import dto.Admin_dto;
@WebServlet("/login")
public class Admin_Login extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	String e_id=req.getParameter("e_id");
	String e_pwd=req.getParameter("e_pwd");
	
	Admin_dao admin_dao=new Admin_dao();
	Admin_dto res=admin_dao.Admin_login(e_id);
	if(res != null) {
		if(e_pwd.equals(res.getE_pwd())) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("menu.html");
			dispatcher.include(req, resp);
		     }
		else {
			resp.getWriter().println("<h1>Enter proper password</h1>");
			RequestDispatcher dispatche=req.getRequestDispatcher("admin_login.html");
			dispatche.include(req, resp);
		     }
	}
	else {
		resp.getWriter().println("<h1>Wrong Emp_id</h1>");
		RequestDispatcher dispatche=req.getRequestDispatcher("admin_login.html");
		dispatche.include(req, resp);
	}
	HttpSession session=req.getSession();
	   session.setAttribute("e_id", e_id);
	   session.setAttribute("password", e_pwd);
	
}
}
