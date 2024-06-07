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
				<div class="col-sm-6 " style="max-width:80%; !important;">
					<h1>Staff Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Staff Form</li>
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
				<div class="col-md-6" style="margin-left: 200px;">
					<!-- general form elements -->
					<div class="card card-primary" style="border-radius:0;width:600px;">
						<div class="card-header" style="border-radius:0;background-color: #ff9d5c;">
							<h3 class="card-title">Staff</h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->


							
 						<form:form method="POST" action="savestaff" modelAttribute="staffregistration" autocomplete="off">
 						<div class="card-body">
 						<c:if test="${staffregistration.user_master_Id gt 0}">
								<div class="form-group">
									<form:label path="user_master_Id">Staff ID:</form:label>
			        				<form:input path="user_master_Id" cssClass="form-control" value="${staffregistration.user_master_Id}" readonly="true"/>
								</div>
						</c:if>
								<div class="form-group">
									<form:label path="user_Fname">First-Name:<span class="required"></span></form:label>
			        				<form:input path="user_Fname" cssClass="form-control" required="required" id="name" onkeyup="checkdataname('name',this.value);" value="${staffregistration.user_Fname}"/>
									<span id="nameError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="user_Lname">Last-Name:<span class="required"></span></form:label>
			        				<form:input path="user_Lname" cssClass="form-control" required="required" id="lname" onkeyup="checkdataname('lname',this.value);" value="${staffregistration.user_Lname}" />
									<span id="lnameError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="user_Address">Address:<span class="required"></span></form:label>
			        				<form:textarea path="user_Address" cssClass="form-control" required="required" id="address" onkeyup="checkdataaddress('address',this.value);" value="${staffregistration.user_Address}" />
									<span id="addressError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="user_Gender">Gender:<span class="required"></span></form:label>
			        				<form:radiobutton path="user_Gender"  value="Male" required="required"/>Male
			        				<form:radiobutton path="user_Gender"   value="Female"/>Female
			        			</div>
								<div class="form-group">
									 <form:label path="user_Contact">Contact:<span class="required"></span></form:label>
			        				 <form:input path="user_Contact" cssClass="form-control" required="required" id="contact" onkeyup="checkdatacontact('contact',this.value);" value="${staffregistration.user_Contact}"/>
								<span id="contactError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="user_Email">Email:<span class="required"></span></form:label>
			       					<form:input path="user_Email" cssClass="form-control" required="required" id="email" onkeyup="checkdataemail('email',this.value);" value="${staffregistration.user_Email}" />  
								<span id="fnameError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="user_Dob">BirthDate:<span class="required"></span></form:label>
			       					<form:input path="user_Dob"  type="date" required="required" cssClass="form-control" value="${staffregistration.user_Dob}"/>
								</div>
								<div class="form-group">
									<form:label path="user_Qualification">Qualification:<span class="required"></span></form:label>
			       					<form:input path="user_Qualification" cssClass="form-control" required="required" value="${staffregistration.user_Qualification}"/>	
			       				</div>
								<div class="form-group">
									 <form:label path="user_Password">Password:<span class="required"></span></form:label>
			        				 <form:password path="user_Password" id="password" cssClass="form-control" onkeyup="checkdatapassword('password',this.value);" value="${staffregistration.user_Password}"/>  
								<span id="passwordError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<form:label path="" >Confirm Password:<span class="required"></span></form:label>
									<form:input path="" type="password" cssClass="form-control" required="required" id="confirmpassword" onkeyup="checkdataconfirm('confirmpassword',this.value);" />
								<span id="confirmpasswordError" style="color: red; display: none;"></span>
								</div>
								
									<%-- <div class="form-group">
									<form:label path="user_type_Id">User Type:</form:label>
           		       				<form:select cssClass="form-control" path="user_type_Id" value="">
                	   				<c:forEach items="${userTypes}" var="userType">
									<form:option value="${userType.user_type_Id}" label="">${userType.user_type_Name}</form:option>                   		
                   					</c:forEach>
                  		 			</form:select>
									</div> --%>
									
									
								
			      				<div class="form-group" style="margin-left: 170px;margin-right: 170px;">
									<input type="submit" class="btn" style="width:70px;" value="Submit"/>
									<input type="reset" class="btn" style="width:70px;" value="Reset"/>
				  					<input type="button" class="btn" style="width:70px;" value="Cancel">
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

