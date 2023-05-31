package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Admin_dao;
import dao.Student_dao;
import dto.Admin_dto;
//@WebServlet("/menu")
public class Menu extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String roll_no=req.getParameter("roll_no");
		int Roll_no=Integer.parseInt(roll_no);
		String password=req.getParameter("password");
		
//		HttpSession session=req.getSession();
//		   session.setAttribute("Roll_no", Roll_no);
//		   session.setAttribute("Password", password);
//	    RequestDispatcher dispatcher=req.getRequestDispatcher("student_remove");
//		      dispatcher.forward(req, resp);   
	}
}
