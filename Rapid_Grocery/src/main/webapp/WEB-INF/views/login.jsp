<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Dashboard</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="assets/plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Tempusdominus Bootstrap 4 -->
<link rel="stylesheet"
	href="assets/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
<!-- iCheck -->
<link rel="stylesheet"
	href="assets/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- JQVMap -->
<link rel="stylesheet" href="assets/plugins/jqvmap/jqvmap.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="assets/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="assets/plugins/daterangepicker/daterangepicker.css">
<!-- summernote -->
<link rel="stylesheet"
	href="assets/plugins/summernote/summernote-bs4.min.css">
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper" style="margin-left: 0px; !important;">
			<!-- Content Header (Page header) -->

		
			
			<section id="main-content" style="padding-left: 20%;margin-bottom: -5%;">
				<div class="row" style=" padding-left:199px;">
					<div class="col-lg-8" style="padding-top: 50px;">
						<div class="card"  style=" border-radius: 0px;color:black; ">
							<div class="card-body">
								
	<form:form action="/checklogin" method="POST" modelAttribute="loginBean" name="sentMessage" id="contactForm" novalidate="novalidate" autocomplete="off">
							
							
		<div style="padding-left: 18px; ">
		<div class="text-center mb-5" >
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; border-radius: 0px; line-height: 1.5; color:white;background-color: #ff9d5c;; margin-left: -38px; margin-right: -4%; margin-top: -5%;">Sign In</h3>
            </div>
            
		
		<div class="form-group">
		<form:label path="user_Email">Enter Email Id</form:label>
		<form:input path="user_Email" type="email" cssClass="form-control" placeholder="Email" style="border-radius: 6px; height: calc(1.5em + 0.75rem + 2px); box-sizing: border-box;" required="required" />
		
		</div>
		
		<div class="form-group">
		<form:label path="user_Password">Enter Password</form:label>
		<form:input path="user_Password" type="password" cssClass="form-control" placeholder="Enter Password" id="pass" style="border-radius: 6px; height: calc(1.5em + 0.75rem + 2px); box-sizing: border-box;" required="required" />
		

		</div>
		<div>
			<p class="forgotpsd"><a href="#">Forgot Password?</a></p>	
		</div>
			<div style="padding-left: 29%;">
<!-- 				<a href="Dashboard.jsp"  class="btn btn-success m-b-10 m-l-5" style="font-size: 23px; width: 100px; margin-left: 42px; background-color: #007BFF;">Login</a> -->
			<button type="submit" class="btn btn-success m-b-10 m-l-5" style="font-size: 23px;border: none; border-radius: 0; width: 100px; margin-left: 42px; background-color: #ff9d5c;;">Login</button>
			</div>
			<!-- <div>
			<p class="register">Not a member?<a href="StuReg.jsp" >Register here!</a></p>
			</div> -->
			</div>
</form:form>
	
							</div>
						</div>
					</div>
				</div>
			</section>	
			
		</div>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="assets/plugins/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="assets/plugins/jquery-ui/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button)
	</script>
	<!-- Bootstrap 4 -->
	<script src="assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- ChartJS -->
	<script src="assets/plugins/chart.js/Chart.min.js"></script>
	<!-- Sparkline -->
	<script src="assets/plugins/sparklines/sparkline.js"></script>
	<!-- JQVMap -->
	<script src="assets/plugins/jqvmap/jquery.vmap.min.js"></script>
	<script src="assets/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
	<!-- jQuery Knob Chart -->
	<script src="assets/plugins/jquery-knob/jquery.knob.min.js"></script>
	<!-- daterangepicker -->
	<script src="assets/plugins/moment/moment.min.js"></script>
	<script src="assets/plugins/daterangepicker/daterangepicker.js"></script>
	<!-- Tempusdominus Bootstrap 4 -->
	<script
		src="assets/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
	<!-- Summernote -->
	<script src="assets/plugins/summernote/summernote-bs4.min.js"></script>
	<!-- overlayScrollbars -->
	<script
		src="plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
	<!-- AdminLTE App -->
	<script src="assets/dist/js/adminlte.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="assets/dist/js/demo.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="assets/dist/js/pages/dashboard.js"></script>
</body>
</html>
