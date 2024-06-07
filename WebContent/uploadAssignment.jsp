<%@include file="Header.jsp"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>



<div class="container-fluid page-header" style="margin-bottom: 90px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Assignment</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Assignment</p>
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
					style="background-color: #F2F1F8; border-radius: 6px;scroll-behaviour:auto;overflow-y:scroll; padding: 30px;">
					<div class="text-center mb-5">
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; color:#44425A;!important;">submit your work here!</h3>
            </div>
		<div class="form-group" >
					<div style=" padding-top: 10px;">
					<%-- <table class="table table-bordered table-hover" border="1" cellspacing="0" cellpadding="0" style="width: 100%;">
						<thead>
						<tr>
							<td>Question1</td>
							<td>Question2</td>
							
						</tr>
						</thead>
						
						<tbody>
							<tr>
								<td><%=request.getAttribute("assignment_que1").toString() %></td>
								<td><%=request.getAttribute("assignment_que2").toString() %></td>
								
							 </tr>	
						</tbody>
						
					</table> --%>
					<table class="table table-bordered table-hover" border="1" cellspacing="0" cellpadding="0" style="width: 100%;">
						<thead>
						<tr>
							<td>Questions</td>
							<td>Course Id</td>
							<td>Action</td>
						</tr>
						</thead>
						<%-- <c:set var="linkNumber" value="1"></c:set> --%>
						<c:forEach items="${Question}" var="Question">
						<tbody>
							<tr>
								<td>${Question.que}</td>
								<td>
									${Question.courseName} 								
								</td>
								<td>	
									<a href="assignment.jsp" class="btn btn-primary">Submit<a>
								</td>
							 </tr>	
						</tbody>
						<%-- <c:set var="linkNumber" value="${linkNumber + 1}"></c:set> --%>
						</c:forEach>
						
					</table>
					
							
						</div>
				</div>
			</div>
		</div>
	</div>
</section>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>

