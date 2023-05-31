package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Admin_dto;
import dao.Admin_dao;

@WebServlet("/signup")
public class Admin_Signup extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	String e_id=req.getParameter("e_id");
	String e_name=req.getParameter("e_name");
	String phno=req.getParameter("phno");
	long Phno=Long.parseLong(phno);
	String e_pwd=req.getParameter("e_pwd");
	String c_pwd=req.getParameter("c_pwd");

	Admin_dto admin_dto=new Admin_dto();
	if(e_pwd.equals(c_pwd)) {
	admin_dto.setE_id(e_id);
	admin_dto.setE_name(e_name);
	admin_dto.setPhno(Phno);
	admin_dto.setE_pwd(e_pwd);
	}
	else {
		resp.getWriter().print("<p>Wrong password</p>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("admin_signup.html");
		dispatcher.include(req, resp);
	}
	
	Admin_dao admin_dao=new Admin_dao();
	admin_dao.Admin_Acc(admin_dto);
	resp.getWriter().print("<p>Your account is created</p>");
	RequestDispatcher dispatcher=req.getRequestDispatcher("admin_login.html");
	dispatcher.include(req, resp);
}
}
