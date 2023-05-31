package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student_dto;
import dao.Student_dao;

@WebServlet("/student_data")
public class Student_data extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
//    	super.doPost(req, resp);
    	 String roll_no=req.getParameter("roll_no");
    	 int Roll_no=Integer.parseInt(roll_no);
    	 String candidate_name=req.getParameter("candidate_name");
    	 String father_name=req.getParameter("father_name");
    	 String mother_name=req.getParameter("mother_name");
    	 String dob=req.getParameter("dob");
    	 String school=req.getParameter("school");
    	 String curent_date=req.getParameter("curent_date");
    	 String flo_omr=req.getParameter("flo_omr");
    	 int Flo_omr=Integer.parseInt(flo_omr);
    	 String flo_sub=req.getParameter("flo_sub");
    	 int Flo_sub=Integer.parseInt(flo_sub);
    	 String sle_omr=req.getParameter("sle_omr");
    	 int Sle_omr=Integer.parseInt(sle_omr);
    	 String sle_sub=req.getParameter("sle_sub");
    	 int Sle_sub=Integer.parseInt(sle_sub);
    	 String tlh_omr=req.getParameter("tlh_omr");
    	 int Tlh_omr=Integer.parseInt(tlh_omr);
    	 String tlh_sub=req.getParameter("tlh_sub");
    	 int Tlh_sub=Integer.parseInt(tlh_sub);
    	 String mth_omr=req.getParameter("mth_omr");
    	 int Mth_omr=Integer.parseInt(mth_omr);
    	 String mth_sub=req.getParameter("mth_sub");
    	 int Mth_sub=Integer.parseInt(mth_sub);
    	 String gsc_omr=req.getParameter("gsc_omr");
    	 int Gsc_omr=Integer.parseInt(gsc_omr);
    	 String gsc_sub=req.getParameter("gsc_sub");
    	 int Gsc_sub=Integer.parseInt(gsc_sub);
    	 String ssc_omr=req.getParameter("ssc_omr");
    	 int Ssc_omr=Integer.parseInt(ssc_omr);
    	 String ssc_sub=req.getParameter("ssc_sub");
    	 int Ssc_sub=Integer.parseInt(ssc_sub);
    	 
    	 Student_dto dto=new Student_dto();
    	 
    	 dto.setRoll_no(Roll_no);
    	 dto.setCandidate_name(candidate_name);
    	 dto.setFather_name(father_name);
    	 dto.setMother_name(mother_name);
    	 dto.setDob(dob);
    	 dto.setSchool(school);
    	 dto.setCurent_date(curent_date);
    	 dto.setFlo_omr(Flo_omr);
    	 dto.setFlo_sub(Flo_sub);
    	 dto.setSle_omr(Sle_omr);
    	 dto.setSle_sub(Sle_sub);
    	 dto.setTlh_omr(Tlh_omr);
    	 dto.setTlh_sub(Tlh_sub);
    	 dto.setMth_omr(Mth_omr);
    	 dto.setMth_sub(Mth_sub);
    	 dto.setGsc_omr(Gsc_omr);
    	 dto.setGsc_sub(Gsc_sub);
    	 dto.setSsc_omr(Ssc_sub);
    	 dto.setSsc_sub(Ssc_sub);
    	 
    	 Student_dao dao=new Student_dao();
    	 dao.student_data(dto);
    	 resp.sendRedirect("student_data.html");
    }
}
