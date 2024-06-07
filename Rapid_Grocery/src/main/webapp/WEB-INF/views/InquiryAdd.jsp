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
					<h1>Inquiry Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Inquiry Form</li>
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
							<h3 class="card-title">Inquiry</h3>
						</div>
		<form:form method="POST" action="saveinquiry" modelAttribute="inquiry">
	   		<div class="card-body">
					<%-- <div class="form-group">
			        <form:label path="inquiryId">Inquiry ID:</form:label>
			        <form:input path="inquiryId" cssClass="form-control" value="${inquiry.inquiryId}" readonly="true"/>
			   </div> --%>
			   
			    <div class="form-group">
			       <form:label path="inquiryName">Your Name:</form:label>
			       <form:input path="inquiryName" cssClass="form-control" value="${inquiry.inquiryName}"/>
			    </div>
			    
			    <div class="form-group">
			        <form:label path="inquiryAdd">Your Address:</form:label>
			        <form:input path="inquiryAdd" cssClass="form-control" value="${inquiry.inquiryAdd}"/>
			   </div>
			   
			   	<div class="form-group">
			        <form:label path="inquiryQuery">Your Query:</form:label>
			        <form:input path="inquiryQuery" cssClass="form-control" value="${inquiry.inquiryQuery}"/>
			    </div>
			    
			    <div class="form-group">
			        <form:label path="inquiryMail">Your Mail:</form:label>
			        <form:input path="inquiryMail" cssClass="form-control" value="${inquiry.inquiryMail}"/>
			    </div>
			    
			    <div class="form-group" style="margin-left: 200px;margin-right: 200px;">
					<button type="submit" class="btn" style="width:70px;">Save</button>
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