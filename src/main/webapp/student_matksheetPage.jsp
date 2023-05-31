<%@page import="dto.Student_dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./style.css" />
<link rel="stylesheet" href="print.css" media="print">
</head>
<body>
<%Student_dto d=(Student_dto)request.getAttribute("student_data"); %>
<div class="print">
   <div class="personal_detail" >
    <img src="beg.jfif" alt="Background Image" class="bg"/>
      <img src="ABCD.png" class="logo">
      <h2 class="heading">Student Marksheet</h2>
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
      
      <table class="tab2">
          <tr>
           <td colspan="4" class="table_head">Marks Awarded</td>
         </tr>
         <tr>
           <th>Subject</th>
           <th>OMR Mark</th>
           <th>Subjective Mark</th>
           <th>Total</th>
         </tr>
         <tr>
           <td>FLO</td>
           <td><%=d.getFlo_omr()%></td>
           <td><%=d.getFlo_sub()%></td>
           <td><%=d.getFlo_omr()+d.getFlo_sub()%></td>
         </tr>
         <tr>
           <td>SLE</td>
           <td><%=d.getSle_omr()%></td>
           <td><%=d.getSle_sub()%></td>
           <td><%=d.getSle_omr()+d.getSle_sub()%></td>
         </tr>
         <tr>
           <td>TLH</td>
           <td><%=d.getTlh_omr()%></td>
           <td><%=d.getTlh_sub()%></td>
           <td><%=d.getTlh_omr()+d.getTlh_sub()%></td>
         </tr>
         <tr>
           <td>MTH</td>
           <td><%=d.getMth_omr()%></td>
           <td><%=d.getMth_sub()%></td>
           <td><%=d.getMth_omr()+d.getMth_sub()%></td>
         </tr>
         <tr>
           <td>GSC</td>
           <td><%=d.getGsc_omr()%></td>
           <td><%=d.getGsc_sub()%></td>
           <td><%=d.getGsc_omr()+d.getGsc_sub()%></td>
         </tr>
         <tr>
           <td>SSC</td>
           <td><%=d.getSsc_omr()%></td>
           <td><%=d.getSsc_sub()%></td>
           <td><%=d.getSsc_omr()+d.getSsc_sub()%></td>
         </tr>
      </table>
      <%int total,per; %>
      <%  total=d.getFlo_omr()+d.getFlo_sub()+
              d.getSle_omr()+d.getSle_sub()+
              d.getTlh_omr()+d.getTlh_sub()+
              d.getMth_omr()+d.getMth_sub()+
              d.getGsc_omr()+d.getGsc_sub()+
              d.getSsc_omr()+d.getSsc_sub();%>
      <%per=(total/600)*100; %>        
      <table class="tab3">
         <tr>
           <td colspan="2" class="table_head">Final Result</td>
         </tr>
         <tr>
           <td>Grand Total</td>
           <td><%= total %>
          </td>
         </tr>
         <tr>
           <td>Result Grade</td>
           <%if(per>=90){%>
           <td>A</td>
           <%}else if(per>=70){%>
           <td>B</td>
           <%}else if(per>=60){%>
           <td>C</td>
           <%}else if(per>=50){%>
           <td>D</td>
           <%}else if(per>=30){%>
           <td>F</td>
           <%}%>
         </tr>
      </table>
      
   </div>
   <script>
   function printCert(divName) {
	     const printContents = document.querySelector(".print").innerHTML;
	     console.log(printContents);
	     const originalContents = document.body.innerHTML;

	     document.body.innerHTML = printContents;

	     window.print();

	     document.body.innerHTML = originalContents;
	}
   </script>
</div>
   <button onclick="printCert()">Download</button>

</body>
</html>