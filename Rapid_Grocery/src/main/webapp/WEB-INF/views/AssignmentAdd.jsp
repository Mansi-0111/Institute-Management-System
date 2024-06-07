<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<style>
	.btn{
		background-color: #ff9d5c;
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
					<h1>Assignment Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Assignment Form</li>
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
							<h3 class="card-title">Assignment</h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->


						
 						<form:form method="POST" action="saveuploadassignment" modelAttribute="assignment" autocomplete="off">
 						<div class="card-body">
 							<c:if test="${assignment.assignment_Id gt 0}">
								<div class="form-group">
									<form:label path="assignment_Id">Assignment ID:</form:label>
			       		 			<form:input path="assignment_Id" cssClass="form-control" value="${assignment.assignment_Id}" readonly="true"/>
								</div>
 							</c:if>
								
								<div class="form-group">
			    				<form:label path="user_master_Id">Faculty Id:<span class="required"></span></form:label>
           		       			<form:select  cssClass="form-control" path="user_master_Id" required="required" value="">
                	   			<c:forEach items="${students}" var="user_master">
								<form:option value="${user_master.user_master_Id}" label="">${user_master.user_Fname}</form:option>                   		
                   				</c:forEach>
                  		 		</form:select>
                  		 		</div>
                  		 		
                  		 		<div class="form-group">
			    				<form:label path="course_Id">Course:<span class="required"></span></form:label>
           		       			<form:select  cssClass="form-control" required="required" path="course_Id" value="">
                	   			<c:forEach items="${courses}" var="course">
								<form:option value="${course.course_Id}" label="">${course.course_Name}</form:option>                   		
                   				</c:forEach>
                  		 		</form:select>
                  		 		</div>
								
								<div class="form-group">
									<form:label path="assignment_Email">Email:<span class="required"></span></form:label>
			        				<form:input path="assignment_Email" cssClass="form-control" required="required" id="email" onkeyup="checkdataemail('email',this.value);" value="${assignment.assignment_Email}"/>
								<span id="emailError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="assignment_Submissiondate">Assignment upload Date:<span class="required"></span></form:label>
			        				<form:input path="assignment_Submissiondate" type="date" required="required" cssClass="form-control" value="${assignment.assignment_Submissiondate}"/>
								</div>
								
								<div class="form-group">
									<form:label path="assignment_Que">Question:</span></form:label>
			        				<form:textarea path="assignment_Que"  rows="20"  style="height: 140px;" cssClass="form-control" value="${assignment.assignment_Que}"/>
								</div>
								
										
			      				<div class="form-group" style="margin-left: 170px;margin-right: 170px;">
									<input type="submit" class="btn" value="Submit"/>
									<input type="reset" class="btn" value="Reset"/>
				  					<input type="button" class="btn" value="Cancel">
								</div>
						</div>
							
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>

<%@ include file="footer.jsp"%>
<%-- <c:if test="${!empty studentregistrations}">
		<h2>List Students</h2>
	<table align="left" border="1">
		<tr>
			<th>Student ID:</th>
			<th>Student First-Name:</th>
			<th>Student Last-Name:</th>
			<th>Student Address:</th>
			<th>Student Gender:</th>
			<th>Student BirthDate:</th>
			<th>Student Email:</th>
			<th>Student Contact:</th>
			<th>Student Course:</th>
			<th>Admission Date:</th>
			<th>Student Password:</th>
			<th>Student Father name:</th>
			<th>Student Last name:</th>
			<th>Parent's Contact:</th>
			<th>Parent's Email:</th>		
		</tr>

		<c:forEach items="${studentregistrations}" var="studentregistration">
			<tr>
				<td><c:out value="${studentregistration.user_master_Id}"/></td>
				<td><c:out value="${studentregistration.user_Fname}"/></td>
				<td><c:out value="${studentregistration.user_Lname}"/></td>
				<td><c:out value="${studentregistration.user_Address}"/></td>
				<td><c:out value="${studentregistration.user_Gender}"/></td>
				<td><c:out value="${studentregistration.user_Dob}"/></td>
				<td><c:out value="${studentregistration.user_Email}"/></td>
				<td><c:out value="${studentregistration.user_Contact}"/></td>
				<td><c:out value="${studentregistration.user_Course}"/></td>
				<td><c:out value="${studentregistration.user_Addmissiondate}"/></td>
				<td><c:out value="${studentregistration.user_Password}"/></td>
				<td><c:out value="${studentregistration.user_Parentfname}"/></td>
				<td><c:out value="${studentregistration.user_Parentlname}"/></td>
				<td><c:out value="${studentregistration.user_ParentContact}"/></td>
				<td><c:out value="${studentregistration.user_Parentemail}"/></td>
				
				<td align="center"><a href="editstudent.html?user_master_Id=${studentregistration.user_master_Id}">Edit</a> |
				 <a href="deletestudent.html?user_master_Id=${studentregistration.user_master_Id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if> --%>

