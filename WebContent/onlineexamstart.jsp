<%@include file="Header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	if (null == loggerInfo) {
		response.sendRedirect("login1.jsp");
	}
%>
<script>
function getScore(){
	var total = $("#total").val();
	var score = 0;
	for(var i=1; i < parseInt(total); i++){
		var temp = "Que"+i;
		var queVal = $('input[name="'+temp+'"]:checked').val();
		var ans = $("#Ans"+i).val();
		if(queVal == ans){
			score = parseInt(score) + 1;
		}
	}
	$("#scoreData").val(score);
	$("#courseIdData").val($("#courseId").val());
	$("#onlineexamresultId").submit();
}
</script>

<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
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
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px;  margin-left: -61px;  ">
				<div class="card-body"
					style="background-color: #F2F1F8; border-radius: 6px; padding: 30px;height:400px;overflow-y: auto;"">
					<form method="post" action="onlineexamresult" id="onlineexamresultId" autocomplete="off"> 
						<input type="hidden" id="courseIdData" name="courseId">						
						<input type="hidden" value="" id="scoreData" name="score">						
					</form>
					<form>
						<div style="padding-left: 18px;">
							<div class="text-center mb-2">
								<h3 class="text-uppercase mb-3 "
									style="letter-spacing: 2px; color: #44425A;!important;">Exam
									Start</h3>
							</div>
						</div>
						<hr>
						<div style="padding-left: 18px;"  >
						<c:set var="count" value="1"></c:set>
						<c:set var="courseId" value="1"></c:set>
							<c:forEach items="${OnlineExam}" var="question">
								<div  class="row" style="margin-bottom: -7%;">
									<div class="col-md-12">
										<label>${count} : ${question.exam_Question}</label> <br>
									</div>
									<div class="col-md-6">
										<input type="radio" value="1" name="Que${count}" style="width: 7%;">${question.optionE1}
										</div>
									<div class="col-md-6">
										<input type="radio" value="2" name="Que${count}" style="width: 7%;">${question.optionE2}<br>
										</div>
									<div class="col-md-6">
										<input type="radio" value="3" name="Que${count}" style="width: 7%;">${question.optionE3}
										</div>
									<div class="col-md-6">
										<input type="radio" value="4" name="Que${count}" style="width: 7%;">${question.optionE4}
									</div>
									<input type="hidden" id="Ans${count}" value="${question.correctAns}" id="">
									<c:set var="count" value="${count+1}"></c:set>
									<c:set var="courseId" value="${question.course_Id}"></c:set>
								</div>
								<br>
								<hr>
							</c:forEach>	
							<input type="hidden" value="${courseId}" id="courseId" name="courseId">						
							<input type="hidden" value="${count}" id="total">						
							<input type="hidden" value="" id="score" name="score">						
							<div class="text-center" style="padding:25px;">
								<button class="btn btn-primary py-2 px-4" type="button" onclick="getScore()"
									id="sendMessageButton">Finish</button>
							</div>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>
</section>

<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>

