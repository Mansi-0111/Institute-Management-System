<%@include file="Header.jsp"%>

<%
	if (null == loggerInfo) {
		response.sendRedirect("login1.jsp");
	}
%>

<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">Assignment</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Assignment</p>
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
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px; height: 430px; margin-left: -61px; width: 600px;">
				<div class="card-body"
					style="background-color: #F2F1F8; border-radius: 6px; padding: 30px;">

					<form method="post" enctype="multipart/form-data"
						action="uploadFileController" autocomplete="off">
						<div style="padding-left: 18px;">

							<div class="text-center mb-5">
								<h3 class="text-uppercase mb-3 "
									style="letter-spacing: 2px; color: #44425A;!important;">Submit your work!</h3>
							</div>
							<div class="form-group">
								<label>Course</label> <select class="custom-select px-4"
									style="border-radius: 6px; margin-left: -12px; height: 48px; width: 533px; box-sizing: border-box; border: 0;">
									<option value="1">C&C++</option>
									<option value="2">Java</option>
									<option value="3">Advance Java</option>
									<option value="4">Python</option>
									<option value="5">PHP</option>
									<option value="6">Android</option>
									<option value="7">iOS</option>
									<option value="8">Photoshop</option>
									<option value="9">Figma</option>
									<option value="10">Corel DRAW</option>
									<option value="11">illustrator</option>
									<option value="12">HTML/CSS/JavaScript</option>
									<option value="13">JQuery</option>
									<option value="14">Node.jS</option>
									<option value="15">Angular.JS</option>
								</select>
							</div>

							<div class="form-group">
								<label>Attach file</label> <input type="file" name="file"
									class="form-control"
									style="border-radius: 6px; height: 48px; width: 533px; padding: 24px; margin-left: -12px; box-sizing: border-box; border: 0; padding-top: 10px;">
							</div>
						</div>
						<%String msg = (String)request.getAttribute("message"); %>
						<%if(null != msg){ %>
							<span style="color:green;"><%=msg%></span>
						<%} %>
						
						<div style="padding-left: 183px; padding-top: 10px;">
							<button type="submit" class="btn btn-primary"
								style="width: 100px;">Submit</button>
							<button type="button" class="btn btn-primary"
								style="width: 100px;">Cancel</button>
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

