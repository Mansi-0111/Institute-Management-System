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
					<h1>Feedback Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Feedback Form</li>
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
							<h3 class="card-title">Feedback</h3>
						</div>
		<form:form method="POST" action="savefeedback" modelAttribute="feedback">
	   		
			    <div class="card-body">
					<%-- <div class="form-group">
			        <form:label path="feedbackId">feedback ID:</form:label>
			        <form:input path="feedbackId" cssClass="form-control" value="${feedback.feedbackId}" readonly="true"/>
			    </div> --%>
			    	<div class="form-group">
			       	<form:label path="descriptionF">Feedback Description:</form:label>
			        <form:input path="descriptionF" cssClass="form-control" value="${feedback.descriptionF}"/>
			    </div>
			   
			    
			    <div class="form-group">
					<form:label path="feedbackRate">Feedback Rate:</form:label>
					<form:radiobutton path="feedbackRate"  value="Bad"/> Bad<br>
					<form:radiobutton path="feedbackRate" style="margin-left: 112px;" value="Good"/> Good<br>
					<form:radiobutton path="feedbackRate" style="margin-left: 112px;" value="Very good"/> Very good<br>
					<form:radiobutton path="feedbackRate" style="margin-left: 112px;" value="Excellent"/> Excellent<br>
				</div>
			  
			    <div class="form-group">
			        <form:label path="feedbackEmail">Feedback Email:</form:label>
			        <form:input path="feedbackEmail" cssClass="form-control" value="${feedback.feedbackEmail}"/>
			    </div>
			    
			  
        	
        		<div class="form-group" style="margin-left: 200px;margin-right:200px;">
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