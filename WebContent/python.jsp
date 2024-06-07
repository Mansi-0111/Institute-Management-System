<%@include file="Header.jsp"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
var orderId = $("#orderId").val();	
var options = {
        "key": "rzp_test_rEARbPmOMhB9x5", // Enter the Key ID generated from the Dashboard
        "amount": "950000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
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
	$("#amountId").val(9500);
	$("#pageType").val(4);
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
			<h3 class="display-4 text-white text-uppercase">Python</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Python</p>
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
      				

                <div class="row" style="padding-left: 120px;height: 2430px;padding-top:30px;">

                    <div class="col-lg-10">

                        <div class="course-content p-6 bg-white ">

                            <center><h2 class="h1" style="color: #223a66;">About <span class="h1">Python Course</span></h2></center>
 							
 							<div style="margin-top: 35px;margin-bottom: -22px;">Python is an interpreted high-level, general-purpose programming language. 
 							Its design philosophy emphasizes code readability with its use of significant indentation. Its language constructs and 
 							object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.</div>

                            
                            
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

                                    <div><a href="#python-programming" style="color: #44425A;">Python Syllabus</a></div>
	
                                     

                                </div>

                                <div id="abc">

                                    <div id="python-programming" class="course-description pt-2">

                                        <h4 class="alert-dark p-2  fs-16 rounded ps-3" data-bs-toggle="collapse"  data-bs-target="#collapseOne" style="background-color: #f2f1f8;font-size:20px;">Python</h4>

                                       <div class="ps-3">

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Introduction to
                Python (PPT)</strong>

        </li>

        <li>Introduction to Python</li>

        <li>Anatomy of Python</li>

        <li>How does Python work?</li>

        <li>A career in Python Technologies and Job Rules</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Fundamentals of
                Python</strong>

        </li>

        <li>print() and input() Functions</li>

        <li>Variables, Datatypes & Operators</li>

        <li>Type Casting Constructors</li>

        <li>id() and type() Functions</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Datatype in
                Detail</strong>

        </li>

        <li>String Formatting & Manipulation</li>

        <li>Collection Datatypes with Its Methods</li>

        <li>The mutability of list & tuple</li>

        <li>Shallow & Deep Copy</li>

        <li>Type Casting and del Keyword</li>

    </ul>

    

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Looping</strong>

        </li>

        <li>Types of Loops</li>

        <li>range() Function</li>

        <li>Control Statements</li>

        <li>List Comprehension</li>

        <li>Nested Loop</li>

    </ul>
    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Array &
                Sorting</strong>

        </li>

        <li>1D & 2D Array with List</li>

        <li>Sorting Collection Datatypes</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Object Oriented
                Programming (OOP)</strong>

        </li>

        <li>Class & Object</li>

        <li>Self & del Keyword</li>

        <li>Constructor and Destructor</li>

        <li>Encapsulation</li>

        <li>Nested Function</li>

        <li>Reflection Enabling Functions</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Inheritance &
                Polymorphism</strong>

        </li>

        <li>Types of Inheritance</li>

        <li>Method Overloading & Method Overriding</li>

        <li>issubclass() and super()</li>

        <li>Built-in Dunder Methods</li>

        <li>Operator Overloading</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Exception
                Handling</strong>

        </li>

        <li>try ... except</li>

        <li>try ... except ... else</li>

        <li>try ... except ... finally</li>

        <li>try ... except ... else ... finally</li>

        <li>Custom exception</li>

        <li>raise & assert keyword</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>File
                Handling</strong>

        </li>

        <li>Modes of Opening File</li>

        <li>I/O Operation with File</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Working with
                Modules</strong>

        </li>

        <li>DateTime module</li>

        <li>time module</li>

        <li>math module</li>

        <li>random module</li>

        <li>uuid module</li>

    </ul>

    

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Regular Expression
                (RegEx)</strong>

        </li>

        <li>re module</li>

        <li>Getting Specific Pattern-wise Data</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Command Line
                Argument (CLA)</strong>

        </li>

        <li>sys module</li>

        <li>sys.argv</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>Pip - Package
                Manager & Database Interaction (with MySql)</strong>

        </li>

        <li>What is SQL?</li>

        <li>SQL Queries</li>

        <li>Intro to XAMPP (phpMyAdmin)</li>

        <li>CRUD Operation with XAMPP (phpMyAdmin)</li>

        <li>Downloading and Installing Package</li>

        <li>MySQL-connector module</li>

        <li>CRUD Operation with Python’s MySQL.connector</li>

    </ul>

    <ul class="course-points my-0">

        <li class="fw-bold text-dark bullet-heading"><strong>GUI with
                Tkinter</strong>

        </li>

        <li>Tkinter module</li>

        <li>Tkinter widgets</li>

        <li>Tkinter geometry</li>

        <li>Binding functions</li>

        <li>Mouse clicking events</li>

        <li>messagebox()</li>

        <li>Types of the pop-up box</li>

        <li>PhotoImage()</li>

        <li>pillow library</li>

        <li>Display image using pillow library</li>

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









 
 
 
 
 
 
 
 
 
 
 
 
 