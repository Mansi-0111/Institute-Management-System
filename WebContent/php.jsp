<%@include file="Header.jsp"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
var orderId = $("#orderId").val();	
var options = {
        "key": "rzp_test_rEARbPmOMhB9x5", // Enter the Key ID generated from the Dashboard
        "amount": "750000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
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
	$("#amountId").val(7500);
	$("#pageType").val(5);
	$("#paymentOnline").submit();
}
function makePayment(){
    var rzp1 = new Razorpay(options);
    rzp1.open();
    e.preventDefault();
}
</script>
 
<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
	<div class="container">
		<div class="d-flex flex-column justify-content-center"
			style="min-height: 300px">
			<h3 class="display-4 text-white text-uppercase">PHP</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">PHP</p>
			</div>
		</div>
	</div>
</div>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




        <section class="gray-bg py-10 course-main">
		<form action="onlinePayment" method="post" id="paymentOnline">
        	<input type="hidden" name="amount" id="amountId">
        	<input type="hidden" name="pageType" id="pageType">
        </form>
            <div class="container-fluid container-xxl">
            <div class="col-md-8 shadow-lg p-3 mb-5 bg-light rounded border   my-2" style="color:black;margin-left: 240px;">
      				

                <div class="row" style="padding-left: 120px;height: 1730px;padding-top:30px;">

                    <div class="col-lg-10">

                        <div class="course-content p-6 bg-white ">

                            <center><h2 class="h1" style="color: #223a66;">About <span class="h1">PHP Course</span></h2></center>
 							
 							<div style="margin-top: 35px;margin-bottom: -22px;">PHP is a general-purpose scripting language geared 
 							towards web development. Danish-Canadian programmer Rasmus Lerdorf created it in 1994. The PHP Group now 
 							produces the PHP reference implementation.</div>

                            
                            
                            <div class="d-flex mt-5 mb-3">

                                <div class="border p-2 px-3 course-duration rounded text-center d-flex">

                                    <p class="fw-normal mb-0 me-2">Course Duration <strong class="text-dark">12 Months</strong></p>

                                </div>

                                <div class="ms-3 border p-2 px-3 course-duration rounded text-center d-flex" style="margin-left:8px;">

                                    <p class="fw-normal me-2 mb-0">Daily Time<strong class="text-dark">2 Hours</strong></p>

                                </div>

                            </div>

                           

                            <div class="course-module" >

                                <h3 class="alert-primary p-2  fs-20 rounded ps-3 text-center" style="font-size:15px;background-color: #f2f1f8;"><a href="#one" style=" color:black;">Course Modules</a></h3>

                                <div class="course-tabs">

                                    <div><a href="#php-programming" style="color: #44425A;">PHP Syllabus</a></div>
	
                                     

                                </div>

                                <div id="abc">

                                    <div id="php-programming" class="course-description pt-2">

                                        <h4 class="alert-dark p-2  fs-16 rounded ps-3" data-bs-toggle="collapse"  data-bs-target="#collapseOne" style="background-color: #f2f1f8;font-size:20px;">PHP Development</h4>

                                       <div class="ps-3">

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Intro to PHP
                Programming</strong>

        </li>

        <li>What is PHP, and what usage of PHP</li>

        <li>intro to server & installing XAMPP</li>

        <li>echo & print function</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Fundamentals Of
                PHP</strong>

        </li>

        <li>Datatypes</li>

        <li>variables & constants</li>

        <li>introduction of operators (arithmetic, assignment)</li>

        <li>logical operator</li>

        <li>types of comments</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Control
                Structure(User Relational Operator)</strong>

        </li>

        <li>if statement</li>

        <li>if ... else</li>

        <li>ladder if ... else</li>

        <li>nested if ... else</li>

        <li>Switch case</li>

        <li>Ternary operator</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Branching &
                Looping</strong>

        </li>

        <li>while loop</li>

        <li>do ... while loop</li>

        <li>for loop</li>

        <li>nested for loop</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Array &
                Functions</strong>

        </li>

        <li>Types Of Array</li>

        <li>Number Index Array</li>

        <li>Associative Array</li>

        <li>Foreach Loop</li>

        <li>Multi-Dimensional Array</li>

        <li>Array Functions</li>

        <li>String Functions</li>

        <li>Date & Time Functions</li>

        <li>User Define Function (UDF)</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>File System
                Basic</strong>

        </li>

        <li>File Handling</li>

        <li>Commonly Used File Functions</li>

        <li>Directory Functions</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Database With
                SQL</strong>

        </li>

        <li>Introduction To Database & phpMyAdmin</li>

        <li>Make Database & Creating Tables</li>

        <li>Crud Operations</li>

        <li>Insert Update Select And Delete Query Run In MYSQL</li>

        <li>Importing / Exporting SQL File</li>

    </ul>

   

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>OOP With
                PHP</strong>

        </li>

        <li>Introduction Of Oops Concepts</li>

        <li>Creating Methods</li>

        <li>Crud With Oops ( Insert Data)</li>

        <li>Crud With Oops ( View & Delete Data)</li>

        <li>Crud With Oops ( Update Data )</li>

    </ul>

    <ul class="course-points my-0 ms-2">

        <li class="fw-bold text-dark bullet-heading"><strong>Admin Panel With
                PHP</strong>

        </li>

        <li>Convert HTML admin panel to php</li>

        <li>include(), require(), include_once() & require_once() functions</li>

        <li>table form</li>

    </ul>

   <div class="text-center course-btn" data-bs-toggle="modal" data-bs-target=".login">
                                        <%if(null == request.getAttribute("orderId")){
                                        %>
	                                        <button class="btn btn-primary btn-sm mt-4"  href="#" style="padding: 7px;width:110px;font-size: 17px;" onclick="payment();">Apply Now</button>
                                        <% } else {%>
                                        	<input type="hidden" name="orderId" id="orderId" value="<%=request.getAttribute("orderId").toString()%>">
                                        	<input type="hidden" name="orderAmount" id="orderAmount" value="<%=request.getAttribute("amount").toString()%>">
                                            <button class="btn btn-primary btn-sm mt-4"  href="#" style="padding: 7px;width:150px;font-size: 17px;" onclick="makePayment();">Make Payment</button>
                                        <% }%>
                                       <!-- <a href="studentreg.jsp"  style="color:black;padding-left: 351px;font-size: 16px;">Apply for full course!</a> -->
                                        </div>

</div>

</div>

                            </div>

                           

                        </div>

                    </div>
				</div>
                   
                </div>
</div>
            </div>

        </section>

		</body>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>









 
 
 
 
 
 
 
 
 
 
 
 
 