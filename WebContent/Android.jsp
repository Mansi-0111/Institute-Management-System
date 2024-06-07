<%@include file="Header.jsp"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
var orderId = $("#orderId").val();	
var options = {
        "key": "rzp_test_rEARbPmOMhB9x5", // Enter the Key ID generated from the Dashboard
        "amount": "1950000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
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
	$("#amountId").val(19500);
	$("#pageType").val(6);
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
			<h3 class="display-4 text-white text-uppercase">Android</h3>
			<div class="d-inline-flex text-white">
				<p class="m-0 text-uppercase">
					<a class="text-white" href="index.jsp">Home</a>
				</p>
				<i class="fa fa-angle-double-right pt-1 px-3"></i>
				<p class="m-0 text-uppercase">Android</p>
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
      				

                <div class="row" style="padding-left: 120px;height:1830px;padding-top:30px;">

                    <div class="col-lg-10">

                        <div class="course-content p-6 bg-white ">

                            <center><h2 class="h1" style="color: #223a66;">About <span class="h1">Android Course</span></h2></center>
 							<div style="margin-top: 35px;margin-bottom: -22px;">Developing Android Apps is the foundation of our advanced 
 							Android curriculum. This course blends theory and practice to help you build great apps correctly. In this course,
 							 you’ll work with instructors step-by-step to build a cloud-connected Android app and learn best practices of 
 							 mobile development, and Android development in particular.</div>

                            
                            
                            <div class="d-flex mt-5 mb-3">

                                <div class="border p-2 px-3 course-duration rounded text-center d-flex">

                                    <p class="fw-normal mb-0 me-2">Course Duration <strong class="text-dark">18 Months</strong></p>

                                </div>

                                <div class="ms-3 border p-2 px-3 course-duration rounded text-center d-flex" style="margin-left:8px;">

                                    <p class="fw-normal me-2 mb-0">Daily Time<strong class="text-dark">2 Hours</strong></p>

                                </div>

                            </div>

                           

                            <div class="course-module" >

                                <h3 class="alert-primary p-2  fs-20 rounded ps-3 text-center" style="font-size:15px;background-color: #f2f1f8;"><a href="#one" style=" color:black;">Course Modules</a></h3>

                                <div class="course-tabs">

                                    <div><a href="#android-programming" style="color: #44425A;">Android Course Syllabus</a></div>
	
                                     

                                </div>

                                <div id="abc">

                                    <div id="android-programming" class="course-description pt-2">

                                        <h4 class="alert-dark p-2  fs-16 rounded ps-3" data-bs-toggle="collapse"  data-bs-target="#collapseOne" style="background-color: #f2f1f8;font-size:20px;">Android</h4>

                                        <div class="ps-3">

    <ul class="course-points">

        <li class="fw-bold text-dark bullet-heading"><strong>Application development</strong></li>

        <li>App Development Using Java.</li>

        <li>Introduction & Core Building Block.</li>

        <li>UI Widgets like Textview, ImageView, Toast, ImageButton, Checkbox, and RadioButton.</li>

        <li>Spinner and Dialog (Alert Dialog, Custom Dialog, Rating Dialog)</li>

        <li>Listview, Webview, and Gridview.</li>

        <li>Intent(Implicit and Explicit Intent).</li>

        <li>How to Create Multiple Activity with Passing Data.</li>

        <li>How to Create Splash Screen and Toolbar.</li>

        <li>Advanced View(Carview, Circleimageview, and Library integration).</li>

        <li>Image Loader Library(Glide, Piccaso, and Universal).</li>

        <li>Menu(Options Menu) & Shared Preference.</li>

        <li>Image Access (Camera & Gallery).</li>

        <li>Recycler view with Model Class.</li>

    </ul>

    
    <ul class="course-points">

        <li class="fw-bold text-dark bullet-heading"><strong>Advance Android</strong></li>

        <li>App Internet Check and Gps Check.</li>

        <li>Advance Dialog(Datepicker and Timepicker dialog).</li>

        <li>Fragment(Static fragment and Dynamic fragment).</li>

        <li>Simple Viewpager(Image Slider).</li>

        <li>Tab layout(Viewpager with fragment).</li>

        <li>Navigation Drawer(Default and Custom Navigation Drawer).</li>

        <li>SQLite Database(Crud Operation).</li>

        <li>External Database.</li>

        <li>API Calling(JSON Parsing, Volley library, Get and Post Method).</li>

        <li>Retrofit(API Calling Get & Post Method with Gson).</li>

        <li>Firebase(Firebase Auth, Firebase Database, Firebase Storage).</li>

        <li>Runtime Permission.</li>

        <li>Social Media Integration(Facebook login and Gmail login).</li>

        <li>Apk Generate(Build Apk, SignApk, Create js file, Create Bundle).</li>

    </ul>

    <ul class="course-points">

        <li class="fw-bold text-dark bullet-heading">Kotlin</span>

        </li>

        <li>Introduction of Kotlin (Overview and Importance).</li>

        <li>Data type, Constant & Variable.</li>

        <li>Control Structure & Looping.</li>

        <li>Function (Create a Function).</li>

        <li>Class and Object</li>

        <li>Android View.</li>

        <li>All Events (Click Event, Long ClickEvent).</li>

        <li>Recycler view with Model Class.</li>

        <li>SQLite Database (Crud Operation).</li>

        <li>Retrofit (Get and Post Method with Gson)</li>

    </ul>

    <ul class="course-points">

        <li class="fw-bold text-dark bullet-heading">UI / UX Design</li>

        <li>Adobe Figma</li>

        <li>Introduction of Figma</li>

        <li>Select, Rectangle, Ellipse, Line, Polygon & Text tools.</li>

        <li>Pen Tool, Artboard Tool, Zoom Tool Appearance Option.</li>

        <li>Clipping Mask, Repeat Grid, Scrolling Option Working with Assets and Layer, Grouping and Ungrouping</li>

        <li>Using Adobe Figma Kits & Plugins.</li>

        <li>Sharing your Adobe Figma Designs.</li>

        <li>Viewing Design on Mobile.</li>

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
            </div>

        </section>

		</body>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>









 
 
 
 
 
 
 
 
 
 
 
 
 