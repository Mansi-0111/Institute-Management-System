<%@include file="Header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
	if (null == loggerInfo) {
		response.sendRedirect("login1.jsp");
	}
%>

<script>
function startExam(id){
	$("#courseId").val(id);
	$("#onlineexam").submit();
}
</script>
<div class="container-fluid page-header" style="margin-bottom: 90px;height: 250px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Online Exam</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Online Exam</p>
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
					style="background-color: #F2F1F8; border-radius: 6px; scroll-behaviour:auto;overflow-y:scroll; padding: 30px;">
					<div class="text-center mb-5">
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; color:#44425A;!important;">Exam-Schedule</h3>
            </div>
		<div class="form-group" >
					<form method="post" action="onlineexam" id="onlineexam" autocomplete="off">
						<input type="hidden" name="courseId" id="courseId">
					</form>
					<table class="table table-bordered table-hover" border="1" cellspacing="0" cellpadding="0" style="width: 100%;">
						<thead>
						<tr>
							<td>Exam Schedule Id</td>
							<td>Exam Date</td>
							<td>Course Name</td>
							<td>Action</td>
						</tr>
						</thead>
						<c:forEach items="${examSchedule}" var="schedule">
						<tbody>
						<tr>
							<td>${schedule.examScheduleId}</td>
							<td>${schedule.examDate}</td>
							<td>${schedule.courseName}</td>
							<td><button type="button" onclick="startExam(${schedule.courseId})" class="btn btn-primary py-2 px-4"
								>Start</button></td>
						</tr>	
						</tbody>
						</c:forEach>
						
					</table>
				</div>
			</div>
		</div>
	</div>
</section>

<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>

