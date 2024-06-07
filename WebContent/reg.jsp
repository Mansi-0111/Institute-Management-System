<%@include file="Header.jsp"%>
<style>
body, html {
	/* height: 100%; */
	font-family: Arial, Helvetica, sans-serif;
}

/* Add styles to the form container */
.containerAppointment {
/* 	position: absolute; */
	right: 0;
	margin: 20px;
/* 	max-width: 300px; */
	padding: 16px;
	background-color:  rgb(29 47 97 / 27%);
}

</style>

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

<body>


<section class="contact-form-wrap section banner text-white">
      <div class="containerAppointment" style="background-color: #F2F1F8; border-radius: 6px;padding-left: 65px; margin-left:245px;max-width: 1021px;" >
      
           <form action="SignUp" id="SignUpForm" method="post"  id="contact-form" style="margin-left: -248px;margin-right: -173px;" autocomplete="off">
           
           <input type="hidden" name="amount" id="amountId">
						<div style="padding-left: 18px;">

							<div class="text-center mb-5">
								<h2 class="text-uppercase mb-3 "
									style="letter-spacing: 2px; color: #44425A;!important;">
									<span>SIGNUP TO PERFECT!</span></h2>
							</div>
           
           <div class="row justify-content-center">
           
           <div class="col-md-4">
          
                      
                        <div class="form-group">
								<label style="color:black;">Firstname<span class="required"></span></label>
								 <input type="text" class="form-control" name ="user_fname" required="required"
									placeholder="firstname" id="name" onkeyup="checkdataname('name',this.value);"
									style="height: 44px;border:0;">
								 <span id="nameError" style="color: red; display: none;"></span>
							</div>
					
							<div class="form-group">
								<label style="color:black;">Lastname<span class="required"></span></label> 
								<input type="text" class="form-control" name ="user_lname" required="required"
									placeholder="lastname" id="lname" onkeyup="checkdataname('lname',this.value);"
									style="height: 44px;border:0;">
							 <span id="lnameError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label style="color:black;">Address<span class="required"></span></label>
								<textarea name="user_address" class="form-control border-0 py-3 px-4" rows="5"  required="required"
									placeholder="Address" id="address" onkeyup="checkdataaddress('address',this.value);"
									style="height: 127px;border:0;"></textarea>
									<span id="addressError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label style="color:black;">Gender<span class="required"></span></label>
								 <input type="radio" name="user_gender" value="Male" required="required"><span style="color:black;">Male</span>
								 <input type="radio" name="user_gender" value="Female"><span style="color:black;">Female</span>
							</div>
							<div class="form-group">
								<label style="color:black;">Birthdate<span class="required"></span></label> <input type="date" class="form-control" name ="user_dob"
									placeholder="Birthdate" id="dob" required="required"
									style="height: 44px;border:0;">
							</div>
							<div class="form-group">
								<label style="color:black;">Email<span class="required"></span></label> <input type="email" required="required" class="form-control" name="user_email"
									placeholder="Email"  id="email" onkeyup="checkdataemail('email',this.value);"
									style="height: 44px;border:0;">
							 <span id="emailError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label style="color:black;">Contact<span class="required"></span></label> <input type="text" required="required" class="form-control" name ="user_contact"
									placeholder="Contact" id="contact" onkeyup="checkdatacontact('contact',this.value);"
									style="height: 44px;border:0;">
								 <span id="contactError" style="color: red; display: none;"></span>
							</div>
           </div>
           
           <div class="col-md-4">
                           <div class="form-group">
								<label style="color:black;">Password<span class="required"></span></label> <input type="password" name ="user_password" required="required"
									class="form-control" placeholder="Password" id="password" onkeyup="checkdatapassword('password',this.value);"
									style="height: 44px;border:0;">
							 <span id="passwordError" style="color: red; display: none;"></span>
							</div>
							<div class="form-group">
								<label style="color:black;">Confirm Password<span class="required"></span></label> <input type="password"  required="required"
									class="form-control" placeholder="Confirm Password" id="confirmpassword" onkeyup="checkdataconfirm('confirmpassword',this.value);"
									style="height: 44px;border:0;">
							<span id="confirmpasswordError" style="color: red; display: none;"></span>
							</div>
							

							<div class="form-group">
								<label style="color:black;">Course<span class="required"></span></label>
								 <select class="custom-select px-4" name="course_id"
									style="height: 44px;border:0;" required="required">
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
								<label style="color:black;">Registration Fee</label> <input type="text" 
									class="form-control" value="500Rs." readonly="readonly"
									style="height: 44px;border:0;">
							
							</div>
							<fieldset style="color:black;">
								<legend style="color:black;">Guardian's Details</legend>
								<div class="form-group">
									<label style="color:black;">Name<span class="required"></span></label> <input type="text" class="form-control" name="user_parentfname"
										placeholder="firstname" id="parentname" required="required" onkeyup="checkdataname('parentname',this.value);"
										style="height: 44px;border:0;">
								<span id="parentnameError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<label style="color:black;">Contact<span class="required"></span></label> <input type="text" class="form-control" name="user_parentcontact"
										placeholder="contact" id="parentcontact" required="required" onkeyup="checkdatacontact('parentcontact',this.value);"
										style="height: 44px;border:0;">
								<span id="parentcontactError" style="color: red; display: none;"></span>
								</div>
								<div class="form-group">
									<label style="color:black;">email<span class="required"></span></label> <input type="email" class="form-control" name ="user_parentemail"
										placeholder="email" id="parentemail" required="required" onkeyup="checkdataemail('parentemail',this.value);"
										style="height: 44px;border:0;">
								<span id="parentemailError" style="color: red; display: none;"></span>
								</div>
							</fieldset>

							
                        
                        
						
           				
           		</div>
           </div>
           <div class="row">
        	
						
					<!-- <div class="mx-auto">
						<button type="submit" class="m-auto btn btn-main btn-round-full " style="margin-left: 153px;">Make Appoinment</button>
					</div> -->
					<div class="mx-auto">
							
							<%if(null == request.getAttribute("orderId")){
                                        %>
	                                        <button class="btn btn-primary btn-sm mt-4" id="sendMessageButton"  href="#" style="padding: 12px;width:132px;font-size: 18px;" onclick="payment();">Apply Now</button>
                                        <% } else {%>
                                        	<input type="hidden" name="orderId" id="orderId" value="<%=request.getAttribute("orderId").toString()%>">
                                        	<input type="hidden" name="orderAmount" id="orderAmount" value="<%=request.getAttribute("amount").toString()%>">
                                            <button class="btn btn-primary btn-sm mt-4"  href="#" style="padding: 7px;width:150px;font-size: 17px;" onclick="makePayment();">Make Payment</button>
                                        <% }%>
							
								<!-- <button class="btn btn-primary py-2 px-5" type="button" onclick="payment();"
									id="sendMessageButton">Sign Up</button> -->
							</div>
			</div>      						
				
             </div>         
            </form>
            
            
					
         </div>
</section>


		</body>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>

