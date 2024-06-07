<%@include file="Header.jsp"%>

<div class="container-fluid page-header"
	style="margin-bottom: 90px; height: 250px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Contact us</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Contact</p>
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
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px; height: 600px; margin-left: -61px; width: 600px;">
				<div class="card-body"
					style="background-color: #F2F1F8; border-radius: 6px; padding: 30px;">

					<form action="UpdateProfile" method="post">
						<div style="padding-left: 18px;">

							<div class="text-center mb-5">
								<h3 class="text-uppercase mb-3 "
									style="letter-spacing: 2px; color: #44425A;!important;">My Profile</h3>
							</div>
							<input type="hidden" id="userId" name="userId"  value="<%=loggerInfo.getUser_master_id()%>">
							<div class="form-group">
								<label>Name</label> <input type="text" value="<%=loggerInfo.getUserName()%>"
									class="form-control border-0 p-4" name="userName"
									placeholder="Your name" readonly="readonly" required="required" />
							</div>
							<label>Address</label>
							<div class="form-group">
								<input type="text" class="form-control border-0 p-4"
									name="userAddress" placeholder="Your address"  value="<%=loggerInfo.getUserAddress()%>"
									required="required" />
							</div>
							<label>Email</label>
							<div class="form-group">
								<input type="email" class="form-control border-0 p-4"  value="<%=loggerInfo.getUserEmail()%>"
									name="userEmail" readonly="readonly" placeholder="Your email" required="required" />
							</div>

							<label>Contact Number</label>
							<div class="form-group">
								<input type="text" class="form-control border-0 p-4"  value="<%=loggerInfo.getUserContact()%>"
									name="userContact" placeholder="Your email" required="required" />
							</div>

							<div style="padding-left: 183px; padding-top: 10px;";>
								<button class="btn btn-primary  py-3" type="submit">Update Profile</button>
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

