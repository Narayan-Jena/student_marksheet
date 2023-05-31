package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admin_dao;
import dao.Student_dao;
import dto.Admin_dto;
import dto.Student_dto;
@WebServlet("/remove")
public class Student_remove extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String roll_no=req.getParameter("roll_no");
		int Roll_no=Integer.parseInt(roll_no);
		String password=req.getParameter("password");

		String E_id=(String) req.getSession().getAttribute("e_id");


		
		Student_dao dao=new Student_dao();
		Admin_dao  dao2=new Admin_dao();
		
		Admin_dto res2=dao2.Admin_login(E_id);
		
			if(password.equals(res2.getE_pwd())) {
				  dao.student_remove(Roll_no);
				  resp.getWriter().println("<h1>Data remove complited</h1>");
					RequestDispatcher dispatche=req.getRequestDispatcher("menu.html");
					dispatche.include(req, resp);
			     }
			else {
				resp.getWriter().println("<h1>Enter proper password</h1>");
				RequestDispatcher dispatche=req.getRequestDispatcher("menu.html");
				dispatche.include(req, resp);
			     }
	}

}
