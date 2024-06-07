<%@include file="Header.jsp"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<script>
function redirectUrl(id){
	var url = $("#url"+id).val();
	$("#meetingAttendance").submit();	
	var win = window.open(url, '_blank');
	if (win) {
	    win.focus();
	}
}
</script>

<div class="container-fluid page-header" style="margin-bottom: 90px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Parent's Meeting</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Parent's Meeting</p>
			</div>
		</div>
	</div>
</div>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<section id="main-content"
	style="padding-left: 20%; margin-bottom: -5%;">
	<form id="meetingAttendance" action="meetingAttendance">
	</form>
	<div class="row" style="padding-left: 199px;">
		<div class="col-lg-8">
			<div class="card"
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px; height: 430px; margin-left: -61px; width: 75%px;">
				<div class="card-body"
					style="background-color: #F2F1F8;  scroll-behaviour:auto;overflow-y:scroll;border-radius: 6px; padding: 30px;">
					<div class="text-center mb-5">
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; color:#44425A;!important;">Exam-Schedule</h3>
            </div>
		<div class="form-group" >
					<table class="table table-bordered table-hover" border="1" cellspacing="0" cellpadding="0" style="width: 100%;">
						<thead>
						<tr>
							<td>Topic</td>
							<td>Meeting Date</td>
							<td>Action</td>
						</tr>
						</thead>
						<c:set var="linkNumber" value="1"></c:set>
						<c:forEach items="${meetingList}" var="meetings">
						<tbody>
							<tr>
								<td>${meetings.meetingTopic}</td>
								<td>
									${meetings.meetingDate}
									<input type="hidden" value="${meetings.meetingLink}" id="url${linkNumber}">								
								</td>
								<td>	
									<button class="btn btn-primary" onclick="redirectUrl(${linkNumber})">Join</button>
								</td>
							 </tr>	
						</tbody>
						<c:set var="linkNumber" value="${linkNumber + 1}"></c:set>
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

