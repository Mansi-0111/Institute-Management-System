<%@include file="Header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	if (null == loggerInfo) {
		response.sendRedirect("login1.jsp");
	}
%>

<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Exam-result</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Exam-result</p>
			</div>
		</div>
	</div>
</div>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<section id="main-content"
	style="padding-left: 20%; margin-bottom: -5%;">
	<div class="row" style="padding-left: 199px;">
		<div class="col-lg-8">
			<div class="card"
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px; height: 430px; margin-left: -61px; width: 75%px;">
				<div class="card-body"
					style="background-color: #F2F1F8; border-radius: 6px; padding: 30px;">

					<div class="text-center mb-5">
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; color:#44425A;!important;">Get your Score</h3>
            </div>
		<div class="form-group" style="    scroll-behavior: auto;
    overflow-y: scroll;
    height: 300px;
    width: 100%;">
					<table class="table table-bordered table-hover" border="1" cellspacing="0" cellpadding="0" style="width: 100%;">
						<tr>
							<!-- <td>Sr. No.</td> -->
							<td>Course Name</td>
							<td>Obtain Marks</td>
							<td>Total Marks</td>
							<td>Exam Date</td>
						</tr>
						<c:forEach items="${examResult}" var="result">
						<tr>
							<%-- <td>${result.srNo}</td> --%>
							<td>${result.courseName}</td>
							<td>${result.score}</td>
							<td>${result.totalScore}</td>
							<td>${result.examDate}</td>
						</tr>	
						</c:forEach>
				</div>		
					</table>
					
				
			</div>
		</div>
	</div>
</section>

<div style="margin-top: 150px;">
	<%@include file="Footer.jsp"%>
</div>

