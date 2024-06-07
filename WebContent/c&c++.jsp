<%@include file="Header.jsp"%>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
var orderId = $("#orderId").val();	
var options = {
        "key": "rzp_test_rEARbPmOMhB9x5", // Enter the Key ID generated from the Dashboard
        "amount": "900000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
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
	$("#amountId").val(9000);
	$("#pageType").val(1);
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
			<h3 class="display-4 text-white text-uppercase">C&C++</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">C&C++</p>
			</div>
		</div>
	</div>
</div>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




        <section class="gray-bg py-10 course-main">
        <form action="onlinePayment" method="post" id="paymentOnline" >
        	<input type="hidden" name="amount" id="amountId" value="9000">
        	<input type="hidden" name="pageType" id="pageType">
        </form>

            <div class="container-fluid container-xxl">
            <div class="col-md-8 shadow-lg p-3 mb-5 bg-light rounded border   my-2" style="color:black;margin-left: 240px;">
      				

                <div class="row" style="padding-left: 120px;height: 1770px;padding-top:30px;">

                    <div class="col-lg-10">

                        <div class="course-content p-6 bg-white ">

                            <center><h2 class="h1" style="color: #223a66;">About <span class="h1">C&C++ Course</span></h2></center>

                            
                            <div class="d-flex mt-5 mb-3">

                                <div class="border p-2 px-3 course-duration rounded text-center d-flex">

                                    <p class="fw-normal mb-0 me-2">Course Duration <strong class="text-dark">3 Months</strong></p>

                                </div>

                                <div class="ms-3 border p-2 px-3 course-duration rounded text-center d-flex" style="margin-left:8px;">

                                    <p class="fw-normal me-2 mb-0">Daily Time<strong class="text-dark">2 Hours</strong></p>

                                </div>

                            </div>
		
                            <div class="course-module" >

                                <h3 class="alert-primary p-2  fs-20 rounded ps-3 text-center" style="font-size:15px;background-color: #f2f1f8;"><a href="#one" style=" color:black;">Course Modules</a></h3>

                                <div class="course-tabs">

                                    <div><a href="#c-programming" style="color: #44425A;">C Programming Syllabus</a></div>
	
                                    <div><a href="#cplus-programming" style="color: #44425A;">C++ Programming Syllabus</a></div> 

                                </div>

                                <div id="abc">

                                    <div id="c-programming" class="course-description pt-2">

                                        <h4 class="alert-dark p-2  fs-16 rounded ps-3" data-bs-toggle="collapse"  data-bs-target="#collapseOne" style="background-color: #f2f1f8;font-size:20px;">C Programming Syllabus</h4>

                                        <div class="ps-3">

                                            <p>The students in the C language will learn the languages functions, methods and routines. With this training, any student can easily run a C program.</p>

                                            <ul class="course-points my-0">

                                                <li class="fw-bold text-dark bullet-heading"><strong>C Programming Course Module</strong>

                                                </li>

                                                <li>Intro. Of C.</li>

                                                <li>History & Structure Of C.</li>

                                                <li>Compile And Run Command.</li>

                                                <li>Variable & Data Type.</li>

                                                <li>Constant & Operator.</li>

                                                <li>Decision Making & Control Statement.</li>

                                                <li>Local & Global Variable.</li>

                                                <li>Loops (While, Do While & For).</li>

                                                <li>Array( 1D & 2D And Multi Dimensional).</li>

                                                <li>String & String Function.</li>

                                                <li>Function & Pointers.</li>

                                                <li>General Expenses Entry.</li>

                                                <li>Pointer To Arrays.</li>

                                                <li>Pointer To Functions.</li>

                                                <li>Dynamic Memory Allocation.</li>

                                                <li>File Handling & Management.</li>

                                                <li>Header File.</li>

                                                <li>Maths, Date & Times Function.</li>

                                                <li>Operations On Bits.</li>

                                                <li>Console Input & Output Function.</li>

                                            </ul>

                                                                                    </div>

                                       

                                    <div id="cplus-programming" class="course-description pt-2">

                                        <h4 class="alert-dark p-2  fs-16 rounded ps-3" data-bs-toggle="collapse" data-bs-target="#collapseOne" style="background-color: #f2f1f8;font-size:20px;">C++ Programming Syllabus</h4>

                                        <div class="ps-3">

                                            <p>The C language is an object-oriented programming language that was written in the initial 1970s period through the American computer expert Brian Kerninghan and Canadian scientists Dennis Ritchie. That is why it is also referred to as the K & R language taking the last name of the writer’s last name initials. They also played a dynamic role in designing the UNIX operating system. It is a basic language that is a requirement for any computer programmer.</p>

                                            <ul class="course-points my-0">

                                                <li class="fw-bold text-dark bullet-heading"><strong>C++ Programming Course Module</strong>

                                                </li>

                                                <li>Info. Of OOP.</li>

                                                <li>History & Structure Of C.</li>

                                                <li>Declaration Of Variable And Data Types.</li>

                                                <li>C++ Character Function.</li>

                                                <li>Storage Classes (Auto, Exter & Stat).</li>

                                                <li>Control Statement And Array.</li>

                                                <li>Info. Of Class And Object.</li>

                                                <li>Inheritance & Polymorphism.</li>

                                                <li>Data Hiding & Encapsulation.</li>

                                                <li>Overloading & Reusability.</li>

                                                <li>Constructor & Destructor.</li><li>Member & Friend Function.</li>

                                                <li>Inline & Virtual Function.</li>

                                                <li>Type Conversion In Class Hierarchies.</li>

                                                <li>How to Create News Paperwork.</li>

                                                <li>Abstract Classes & Concrete Classes.</li>

                                                <li>Memory Management Operator.</li>

                                                <li>Command Line Argument.</li>

                                                <li>File Management.</li>

                                                <li>Exception Handling.</li>

                                                <li>Manipulating Bits.</li>

                                                <li>Templates.</li>

                                            </ul>

                                           

                                        <div class="text-center course-btn" data-bs-toggle="modal" data-bs-target=".login">
                                        <%if(null == request.getAttribute("orderId")){
                                        %>
	                                        <button class="btn btn-primary btn-sm mt-4"  href="#" style="padding: 7px;width:110px;font-size: 17px;" onclick="payment();">Apply Now</button>
                                        <% } else {%>
                                        	<input type="hidden" name="orderId" id="orderId" value="<%=request.getAttribute("orderId").toString()%>">
                                        	<input type="hidden" name="orderAmount" id="orderAmount" value="<%=request.getAttribute("amount").toString()%>">
                                            <button class="btn btn-primary btn-sm mt-7"  href="#" style="padding: 7px;width:150px;font-size: 17px;" onclick="makePayment();">Make Payment</button>
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
            </div>

        </section>

		</body>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>









 
 
 
 
 
 
 
 
 
 
 
 
 