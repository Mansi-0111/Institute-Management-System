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
					<h1>Fee Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Fee Form</li>
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
							<h3 class="card-title">Fee</h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->


 						<form:form method="POST" action="savefee" modelAttribute="fee" autocomplete="off">
 						<div class="card-body">
								
								
								<div class="form-group">
			    				<form:label path="user_master_Id">Student Id:<span class="required"></span></form:label>
           		       			<form:select  cssClass="form-control" path="user_master_Id" value="">
                	   			<c:forEach items="${students}" var="student">
								<form:option value="${student.user_master_Id}" label="">${student.user_Fname}</form:option>                   		
                   				</c:forEach>
                  		 		</form:select>
                  		 		</div>
                  		 		
								<div class="form-group">
									 <form:label path="fee_Amount">Amount<span class="required"></span></form:label>
			        				 <form:input path="fee_Amount" cssClass="form-control" value="${fee.fee_Amount}" required="required"/>
								</div>
								
								<div class="form-group">
			    				<form:label path="course_Name">Course:</form:label>
           		       			<form:select  cssClass="form-control" path="course_Name" value="" required="required">
                	   			<form:option value="C&C++">C&C++</form:option>
									<form:option value="Java">Java</form:option>
									<form:option value="Advance java">Advance Java</form:option>
									<form:option value="Python">Python</form:option>
									<form:option value="PHP">PHP</form:option>
									<form:option value="Android">Android</form:option>
									<form:option value="iOS">iOS</form:option>
									<form:option value="Photoshop">Photoshop</form:option>
									<form:option value="Figma">Figma</form:option>
									<form:option value="Corel draw">Corel DRAW</form:option>
									<form:option value="illustrator">illustrator</form:option>
									<form:option value="Html/css/js">HTML/CSS/JavaScript</form:option>
									<form:option value="jQuery">JQuery</form:option>
									<form:option value="node.jS">Node.jS</form:option>
									<form:option value="angular.jS">Angular.JS</form:option>
                  		 		</form:select>
                  		 		</div>
                  		 		
                  		 		<div class="form-group">
									<form:label path="payment_Date">Date:<span class="required"></span></form:label>
									<form:input path="payment_Date"  type="date" cssClass="form-control" required="required" value="${fee.payment_Date}"/>
								</div>
			      				<div class="form-group" style="margin-left: 200px;margin-right: 200px;">
									<input type="submit" class="btn" style="width:70px;" value="Submit"/>
									<input type="button" class="btn" style="width:70px;" value="Cancel"/>
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

