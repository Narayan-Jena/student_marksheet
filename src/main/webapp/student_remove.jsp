<%@page import="dto.Student_dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Student_dto d=(Student_dto)request.getAttribute("student_data"); %>
   <form action="abc" method="post">
    <img src="beg.jfif" alt="Background Image" class="bg"/>
      <img src="ABCD.png" class="logo">
      <h2 class="heading">Student Remove</h2>
      <table class="tab1">
         <tr>
           <td colspan="2" class="table_head">Personal Detail</td>
         </tr>
         <tr>
           <td>Roll No.</td>
           <td><%=d.getRoll_no()%></td>
         </tr>
         <tr>
           <td>Candidate's Name.</td>
           <td><%=d.getCandidate_name()%></td>
         </tr>
         <tr>
           <td>Father's Name.</td>
           <td><%=d.getFather_name()%></td>
         </tr>
         <tr>
           <td>Mother's Name.</td>
           <td><%=d.getMother_name()%></td>
         </tr>
         <tr>
           <td>Date Of Birth</td>
           <td><%=d.getDob()%></td>
         </tr>
         <tr>
           <td>Name of the School</td>
           <td><%=d.getSchool()%></td>
         </tr>
      </table>
      <button>Remove</button>
   </form>   
</body>
</html>