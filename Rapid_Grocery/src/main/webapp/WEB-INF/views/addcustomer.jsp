<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Service Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Service Form</li>
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
				<div class="col-md-6">
					<!-- general form elements -->
					<div class="card card-primary">
						<div class="card-header">
							<h3 class="card-title">Service</h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->
						<form:form method="POST" action="saveCustomer" modelAttribute="customerBean">
							<div class="card-body">
								<div class="form-group">
									<form:label path="c_id">Customer ID:</form:label>
									<form:input path="c_id" cssClass="form-control"/>
								</div>
								<div class="form-group">
									<form:label path="c_name">Customer Name:</form:label> 
									<form:input path="c_name" cssClass="form-control" value="${customer.c_name}" />
								</div>
								<div class="form-group">
									<form:label path="c_address">Customer address:</form:label> 
									<form:input path="c_address" cssClass="form-control" value="${customer.c_address}" />
								</div>
								<div class="form-group">
									<form:label path="c_contact">Customer contact number:</form:label> 
									<form:input path="c_contact" cssClass="form-control" value="${customer.c_contact}" />
								</div>
								<div class="form-group">
									<form:label path="c_email">Customer email id:</form:label> 
									<form:input path="c_email" cssClass="form-control" value="${customer.c_email}" />
								</div>
							</div>
							<div class="card-footer">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>

						</form:form>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>

<%@ include file="footer.jsp"%>