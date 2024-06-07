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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script>
$(function(){
    var dtToday = new Date();
    
    var month = dtToday.getMonth() + 1;
    var day = dtToday.getDate();
    var year = dtToday.getFullYear();
    if(month < 10)
        month = '0' + month.toString();
    if(day < 10)
        day = '0' + day.toString();
    
    var maxDate = year + '-' + month + '-' + day;

    $('#meeting_Date').attr('min', maxDate);
});
</script>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Meeting Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Meeting Form</li>
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
					<div class="card card-primary" style="border-radius:0; width:600px;">
						<div class="card-header" style="border-radius:0;background-color:#ff9d5c;">
							<h3 class="card-title">Parent's Meeting </h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->


						
 						<form:form method="POST" action="savemeetingreq" modelAttribute="meetingreq" autocomplete="off">
 						<div class="card-body">
								
								<div class="form-group">
									<form:label path="meeting_Req_id">Meeting id:</form:label>
			       					<form:input path="meeting_Req_id" type="text" cssClass="form-control" />
								</div>
								<div class="form-group">
									<form:label path="meeting_Link">Link:<span class="required"></span></form:label>
			       					<form:input path="meeting_Link" type="text" required="required" cssClass="form-control" />
								</div>
								<div class="form-group">
									<form:label path="meeting_Date_time">Date:<span class="required"></span></form:label>
			       					<form:input path="meeting_Date_time" id="meeting_Date" type="date" required="required" cssClass="form-control" />
								</div>
								<div class="form-group">
			    				<form:label path="course_ID">Course:<span class="required"></span></form:label>
           		       			<form:select  cssClass="form-control" path="course_ID" required="required" value="">
                	   			<c:forEach items="${courses}" var="course">
								<form:option value="${course.course_Id}" label="">${course.course_Name}</form:option>                   		
                   				</c:forEach>
                  		 		</form:select>
                  		 		</div>
                  		 		
                  		 		<div class="form-group">
									<form:label path="topic">Topic:<span class="required"></span></form:label>
			       					<form:input path="topic" type="text" required="required" cssClass="form-control" />
								</div>
			      				<div class="form-group" style="margin-left: 250px;margin-right: 250px;">
									<input type="submit" class="btn" style="width:100px;" value="Save"/>
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

