<%-- <%@include file="Header.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
var orderId = $("#orderId").val();	
var options = {
        "key": "rzp_test_rEARbPmOMhB9x5", // Enter the Key ID generated from the Dashboard
        "amount": "50000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
        "currency": "INR",
        "name": "Online Payment",
        "description": "Online Transaction",
        "image": "https://example.com/your_logo",
        "order_id": orderId, //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
        "callback_url": "http://localhost:8084/Perfect_template/",
        "prefill": {
            "name": "Perfect Classess",
            "email": "perfect@gmail.com",
            "contact": "9898767654"
        },
        "notes": {
            "address": "Razorpay Corporate Office"
        },
        "theme": {
            "color": "#3399cc"
        }
    };

function payment(){
	$("#amountId").val(50000);
	$("#paymentOnline").submit();
}
function makePayment(){
    var rzp1 = new Razorpay(options);
    rzp1.open();
    e.preventDefault();
    $("#SignUpForm").submit();
}

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

    $('#examschedule_Date').attr('min', maxDate);
});
</script>



<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">SIGN UP</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">SIGN UP</p>
			</div>
		</div>
	</div>
</div>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- 
<script type="text/javascript">
$(document).ready(function() {
	$("#SignUpForm").validate();
});
</script> -->

<body>
<section id="main-content"
	style="padding-left: 20%; margin-bottom: -5%;">
	<div class="row" style="padding-left: 199px;">
		<div class="col-lg-8">
			<div class="card"
				style="border-radius: 8px; color: black; margin-top: -42px; border-radius: 6px; height: 1000px; margin-left: -61px; width: 730px;">
				<div class="card-body"
					style="background-color: #F2F1F8; border-radius: 6px; padding: 30px;scroll-behaviour:auto;overflow-y:scroll;height:500px;">
					
					<form action="SignUp" id="SignUpForm" method="post">
	        			<input type="hidden" name="amount" id="amountId">
						<div style="padding-left: 18px;">

							<div class="text-center mb-5">
								<h3 class="text-uppercase mb-3 "
									style="letter-spacing: 2px; color: #44425A;!important;">SIGN
									UP TO PERFECT!</h3>
							</div>

							<div class="form-group">
								<label>Firstname<span class="required"></span></label>
								 <input type="text" class="form-control" name ="user_fname" required="required"
									placeholder="firstname" id="name" onkeyup="checkdataname('name',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;" >
								 <span id="nameError" style="color: red; display: none;"></span>
							</div>
					
							<div class="form-group">
								<label>Lastname<span class="required"></span></label> 
								<input type="text" class="form-control" name ="user_lname" required="required"
									placeholder="lastname" id="lname" onkeyup="checkdataname('lname',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
							 <span id="lnameError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label>Address<span class="required"></span></label>
								<textarea name="user_address" class="form-control" required="required"
									placeholder="Address" id="address" onkeyup="checkdataaddress('address',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;"
									rows="8" cols="30"></textarea>
									<span id="addressError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label>Gender<span class="required"></span></label>
								 <input type="radio" name="user_gender" value="Male" required="required">Male 
								 <input type="radio" name="user_gender" value="Female">Female
							</div>
							<div class="form-group">
								<label>Birthdate<span class="required"></span></label> <input type="date" class="form-control" name ="user_dob"
									placeholder="Birthdate" id="dob" required="required"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
							</div>
							<div class="form-group">
								<label>Email<span class="required"></span></label> <input type="email" required="required" class="form-control" name="user_email"
									placeholder="Email"  id="email" onkeyup="checkdataemail('email',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
							 <span id="emailError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label>Contact<span class="required"></span></label> <input type="text" required="required" class="form-control" name ="user_contact"
									placeholder="Contact" id="contact" onkeyup="checkdatacontact('contact',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
								 <span id="contactError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label>Password<span class="required"></span></label> <input type="password" name ="user_password" required="required"
									class="form-control" placeholder="Password" id="password" onkeyup="checkdatapassword('password',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
							 <span id="passwordError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label>Confirm Password<span class="required"></span></label> <input type="password"  required="required"
									class="form-control" placeholder="Confirm Password" id="confirmpassword" onkeyup="checkdataconfirm('confirmpassword',this.value);"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
							<span id="confirmpasswordError" style="color: red; display: none;"></span>
							</div>
							

							<div class="form-group">
								<label>Course<span class="required"></span></label>
								 <select class="custom-select px-4" name="course_id"
									style="border-radius: 6px; height: 48px;width: 634px; box-sizing: border-box;" required="required">
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
									<option value="15">JQuery</option>
									<option value="16">Node.jS</option>
									<option value="17">Angular.JS</option>
								</select>
							</div>
								<div class="form-group">
								<label>Registration Fee</label> <input type="text" 
									class="form-control" value="500Rs." readonly="readonly"
									style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
							
							</div>
							<fieldset>
								<legend>Guardian's Details</legend>
								<div class="form-group">
									<label>Name<span class="required"></span></label> <input type="text" class="form-control" name="user_parentfname"
										placeholder="firstname" id="parentname" required="required" onkeyup="checkdataname('parentname',this.value);"
										style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
								<span id="parentnameError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<label>Contact<span class="required"></span></label> <input type="text" class="form-control" name="user_parentcontact"
										placeholder="contact" id="parentcontact" required="required" onkeyup="checkdatacontact('parentcontact',this.value);"
										style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
								<span id="parentcontactError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<label>email<span class="required"></span></label> <input type="email" class="form-control" name ="user_parentemail"
										placeholder="email" id="parentemail" required="required" onkeyup="checkdataemail('parentemail',this.value);"
										style="border-radius: 6px; height: 48px; width: 634px; padding: 24px; box-sizing: border-box; border: 0;">
								<span id="parentemailError" style="color: red; display: none;"></span>
								</div>
							</fieldset>

							<div class="text-center" style="margin: 25px;">
							
							<%if(null == request.getAttribute("orderId")){
                                        %>
	                                        <button class="btn btn-primary btn-sm mt-4" id="sendMessageButton"  href="#" style="padding: 7px;width:110px;font-size: 17px;" onclick="payment();">Apply Now</button>
                                        <% } else {%>
                                        	<input type="hidden" name="orderId" id="orderId" value="<%=request.getAttribute("orderId").toString()%>">
                                        	<input type="hidden" name="orderAmount" id="orderAmount" value="<%=request.getAttribute("amount").toString()%>">
                                            <button class="btn btn-primary btn-sm mt-4"  href="#" style="padding: 7px;width:150px;font-size: 17px;" onclick="makePayment();">Make Payment</button>
                                        <% }%>
							
								<!-- <button class="btn btn-primary py-2 px-5" type="button" onclick="payment();"
									id="sendMessageButton">Sign Up</button> -->
							</div>
						</div>
					</form>
					
					
				

				</div>
			</div>
		</div>
	</div>
	
	
</section>

		</body>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>

 --%>