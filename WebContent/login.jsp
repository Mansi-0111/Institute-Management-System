<%@include file="Header.jsp"%>



<div class="container-fluid page-header" style="margin-bottom: 90px;height:230px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Login</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Login</p>
			</div>
		</div>
	</div>
</div>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<style>
#btn {
	padding-bottom: 5px;
	padding-left: 40px;
	padding-right: 40px;
	border-radius: 0;
	padding-top: 5px;
	background-color: #ff8b3d;
	border: #ff8b3d;
}
</style>

<section id="main-content"
	style="padding-left: 20%; margin-bottom: -5%;">
	<div class="row" style="padding-left: 199px;">
		<div class="col-lg-8">
			<div class="card"
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px; height: 580px; margin-left: -61px; width: 730px;">
				<div class="card-body"
					style="background-color: #F2F1F8; border-radius: 6px; padding: 30px;">

					<form action="loginCheck" method="post">
						<div style="padding-left: 18px;">

							<div class="text-center mb-5">
								<h3 class="text-uppercase mb-3 "
									style="letter-spacing: 2px; color: #44425A;!important;">SIGN
									IN TO START LEARNING</h3>
							</div>

							<div class="form-group">
								<label>Username</label> 
								<input type="email" name="userName" id="email" onblur="checkdataemail('email',this.value);"
									class="form-control" placeholder="Email"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
									<span id="emailError" style="display: none;color:red;font-size: 14px; font-family: sans-serif;">Enter Email Id.</span>
								<span id="emailError" style="color: red; display: none;"></span>
							</div>

							<div class="form-group">
								<label>Password</label> <input type="password" onblur="passwordRequired()"
									name="userPassword" class="form-control" placeholder="Password"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
									<span id="pswError"  style="display: none;color:red;font-size: 14px; font-family: sans-serif;">Enter Password.</span>
							</div>
							<div>
								<label> <input type="checkbox" name="remember">
									Remember me
								</label>

							</div>
							<!-- <div style="padding-left: 40%; padding-top: 6%;">
			<button type="submit" id="btn" class="btn btn-success m-b-10 m-l-5">SIGN IN</button>
			</div> -->
							<div class="text-center">
								<button class="btn btn-primary py-3 px-5" type="submit"
									id="sendMessageButton">SIGN IN</button>
							</div>
							<div>
								<p class="forgotpsd" style="padding-top: 25px; font-size: 16px;">
									<a href="forgotpsd.jsp" style="color: black;">Forgot
										Password?</a> <a href="studentreg.jsp"
										style="color: black; padding-left: 351px; font-size: 16px;">Register
										Here!</a>
								</p>
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

