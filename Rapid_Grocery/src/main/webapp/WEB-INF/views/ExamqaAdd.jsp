<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<style>
	.btn{
		background-color: #ff9c5d;
    	border-radius: 0;
    	border: #007bff;
    	color: white;
	}
</style>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Exam Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Exam Form</li>
					</ol>
				</div>
			</div>
		</div>
		<!-- /.container-fluid -->
	</section>



	<section class="content">
		<div class="container-fluid">
			<div class="row">
				<!-- left column -->
				<div class="col-md-6" style="margin-left: 160px;">
					<!-- general form elements -->
					<div class="card card-primary" style="border-radius:0;width:600px;">
						<div class="card-header" style="border-radius:0;background-color: #ff9d5c;">
							<h3 class="card-title">Exam</h3>
						</div>
		<form:form method="POST" action="saveexamqa" modelAttribute="examqa" autocomplete="off">
	   		<div class="card-body">
	   		<c:if test="${examqa.exam_qa_Id gt 0}">
								<div class="form-group">			
									<form:label path="exam_qa_Id">Exam ID:</form:label>
									<form:input path="exam_qa_Id" cssClass="form-control" value="${examqa.exam_qa_Id}" readonly="true"/>
								</div>
							</c:if>
								<div class="form-group">
			    				<form:label path="course_Id">Course:<span class="required"></span></form:label>
           		       			<form:select  cssClass="form-control" required="required" path="course_Id" value="">
                	   			<c:forEach items="${courses}" var="course">
								<form:option value="${course.course_Id}" label="">${course.course_Name}</form:option>                   		
                   				</c:forEach>
                  		 		</form:select>
                  		 		</div>
                  		 		
                  		 		<div class="form-group">
			    				<form:label path="user_master_Id">Faculty:<span class="required"></span></form:label>
           		       			<form:select  cssClass="form-control" required="required" path="user_master_Id" value="">
                	   			<c:forEach items="${faculty}" var="faculty">
								<form:option value="${faculty.user_master_Id}" label="">${faculty.user_Fname}</form:option>                   		
                   				</c:forEach>
                  		 		</form:select>
                  		 		</div>
								
								<div class="form-group">
									<form:label path="exam_Question"> Question:<span class="required"></span></form:label> 
									<form:input path="exam_Question" cssClass="form-control" required="required" value="${examqa.exam_Question}" />
								</div>
								
								<div class="form-group">
									<form:label path="optionE1">Option1:<span class="required"></span></form:label> 
									<form:input path="optionE1" cssClass="form-control" required="required" value="${examqa.optionE1}" />
								</div><div class="form-group">
									<form:label path="optionE2">Option2:<span class="required"></span></form:label> 
									<form:input path="optionE2" cssClass="form-control" required="required" value="${examqa.optionE2}" />
								</div><div class="form-group">
									<form:label path="optionE3">Option3:<span class="required"></span></form:label> 
									<form:input path="optionE3" cssClass="form-control" required="required" value="${examqa.optionE3}" />
								</div><div class="form-group">
									<form:label path="optionE4">Option4:<span class="required"></span></form:label> 
									<form:input path="optionE4" cssClass="form-control" required="required" value="${examqa.optionE4}" />
								</div><div class="form-group">
									<form:label path="correctAns">Correct Answer:<span class="required"></span></form:label> 
									<form:input path="correctAns" cssClass="form-control" required="required" value="${examqa.correctAns}" />
								</div>
								<div class="form-group" style="margin-left: 190px;margin-right: 190px;">
								<button type="submit" style="width:150px;" class="btn">Save</button>
							</div>
								
	   		
		</form:form>
		</div>
				</div>
			</div>
		</div>
	</section>
</div>
<%@ include file="footer.jsp"%>
		<%-- 
		<c:if test="${!empty examqas}">
		<h2>List Que-Ans</h2>
	<table align="left" border="1">
		<tr>
			<th>Que ID</th>
			<th>Question</th>
			<th>Option1</th>
			<th>Option2</th>
			<th>Option3</th>
			<th>Option4</th>
			<th>Correct Answer</th>
			<th>Answer</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${examqas}" var="examqa">
			<tr>
				<td><c:out value="${examqa.exam_qa_Id}"/></td>
				<td><c:out value="${examqa.exam_Question}"/></td>
				<td><c:out value="${examqa.optionE1}"/></td>
				<td><c:out value="${examqa.optionE2}"/></td>
				<td><c:out value="${examqa.optionE3}"/></td>
				<td><c:out value="${examqa.optionE4}"/></td>
				<td><c:out value="${examqa.correctAns}"/></td>
				<td><c:out value="${examqa.exam_Answer}"/></td>
				
				
				<td align="center"><a href="editexamqa.html?exam_qa_Id=${examqa.exam_qa_Id}">Edit</a> | <a href="deleteexamqa.html?exam_qa_Id=${examqa.exam_qa_Id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html> --%>