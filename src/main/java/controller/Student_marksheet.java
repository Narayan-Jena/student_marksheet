package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Student_dao;
import dto.Student_dto;
@WebServlet("/marksheet")
public class Student_marksheet extends HttpServlet {
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	  String roll_no=req.getParameter("roll_no");
	  int Roll_no=Integer.parseInt(roll_no);
	  String dob=req.getParameter("dob");
	  
	  Student_dao dao=new Student_dao();
	  Student_dto result=dao.student_marksheet(Roll_no);
//	  resp.getWriter().print(result);
      req.setAttribute("student_data", result);
      RequestDispatcher dispatcher=req.getRequestDispatcher("student_matksheetPage.jsp");
      dispatcher.forward(req, resp);
}
}
