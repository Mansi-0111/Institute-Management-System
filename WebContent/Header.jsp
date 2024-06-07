<!DOCTYPE html>
<%@page import="com.web.bean.LoggerInfo"%>
<%
LoggerInfo loggerInfo = (LoggerInfo)session.getAttribute("loggerInfo");
%>

<html lang="en">

<head>
    <meta charset="utf-8">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900" rel="stylesheet">
    <title>Institute Management System</title>
    
    <link
      href="https://fonts.googleapis.com/css2?family=Lato&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
   
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">
   
    <!-- <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> -->

    <!-- Additional CSS Files -->
    <!-- <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-grad-school.css">
    <link rel="stylesheet" href="assets/css/owl.css">
    <link rel="stylesheet" href="assets/css/lightbox.css"> -->
<!--
   
   
    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet"> 

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
    
<script type="text/javascript">
</script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="assets/js/validation.js"></script>

    
    </head>
<body>
    <!-- Topbar Start -->
    <div class="container-fluid d-none d-lg-block">
        <div class="row align-items-center py-4 px-xl-5">
            <div class="col-lg-3">
                <a href="" class="text-decoration-none">
                    <h1 class="m-0"><span class="text-primary">P</span>ERFECT</h1>
                </a>
            </div>
            <div class="col-lg-3 text-right">
                <div class="d-inline-flex align-items-center">
                    <i class="fa fa-2x fa-map-marker text-primary mr-3"></i>
                    <div class="text-left">
                        <h6 class="font-weight-semi-bold mb-1">Our Office</h6>
                        <small>A-25,Patanjali Tenament,Ratan Park Road,Ahmedabad.</small>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 text-right">
                <div class="d-inline-flex align-items-center">
                    <i class="fa fa-2x fa-envelope text-primary mr-3"></i>
                    <div class="text-left">
                        <h6 class="font-weight-semi-bold mb-1">Email Us</h6>
                        <small>perfectgrptution@gmail.com</small>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 text-right">
                <div class="d-inline-flex align-items-center">
                    <i class="fa fa-2x fa-phone text-primary mr-2"></i>
                    <div class="text-left">
                        <h6 class="font-weight-semi-bold mb-1">Call Us</h6>
                        <small>+919824156290</small>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->
    
    <!-- Navbar Start -->
    <div class="container-fluid">
        <div class="row border-top px-xl-5">
            <div class="col-lg-3 d-none d-lg-block">
                <a class="d-flex align-items-center justify-content-between bg-secondary w-100 text-decoration-none" data-toggle="collapse" href="#navbar-vertical" style="height: 67px; padding: 0 30px;">
                    <h5 class="text-primary m-0"><i class="fa fa-book mr-2"></i>Subjects</h5>
                    <i class="fa fa-angle-down text-primary"></i>
                </a>
                <nav class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0 bg-light" id="navbar-vertical" style="width: calc(100% - 30px); z-index: 9;">
                   
                        
					 <div class="navbar-nav w-100">
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link" data-toggle="dropdown">Programming<i class="fa fa-angle-down float-right mt-1"></i></a>
                        <div class="dropdown-menu position-absolute bg-secondary border-0 rounded-0 w-100 m-0">
                            <a href="c&c++.jsp" class="dropdown-item">C & C++</a>
                            <a href="java.jsp" class="dropdown-item">Java</a>
                            <a href="advancejava.jsp" class="dropdown-item">Advance Java</a>
                            <a href="python.jsp" class="dropdown-item">Python</a>
                            <a href="php.jsp" class="dropdown-item">PHP</a>
                            <a href="Android.jsp" class="dropdown-item">Android</a>
                            <a href="ios.jsp" class="dropdown-item">iOS</a>
                        </div>
                     </div>
			

                <div class="navbar-nav w-100">
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link" data-toggle="dropdown">Graphics Design<i class="fa fa-angle-down float-right mt-1"></i></a>
                        <div class="dropdown-menu position-absolute bg-secondary border-0 rounded-0 w-100 m-0">
                            <a href="photoshop.jsp" class="dropdown-item">Photoshop</a>
                            <a href="figma.jsp" class="dropdown-item">Figma</a>
                            <a href="coreldraw.jsp" class="dropdown-item">Corel Draw</a>
                            <a href="illustrator.jsp" class="dropdown-item">Illustrator</a>  
                        </div>
                </div>


                <div class="navbar-nav w-100">
                       <div class="nav-item dropdown">
                        <a href="#" class="nav-link" data-toggle="dropdown">Web Technology<i class="fa fa-angle-down float-right mt-1"></i></a>
                        <div class="dropdown-menu position-absolute bg-secondary border-0 rounded-0 w-100 m-0">
                            <a href="hcj.jsp" class="dropdown-item">HTML/CSS/JavaScript</a>
                            <a href="jquery.jsp" class="dropdown-item">jQuery</a>
                            <a href="node.jsp" class="dropdown-item">Node.js</a>
                            <a href="angular.jsp" class="dropdown-item">Angular.js</a>
                        </div>
                     </div>
				</div>
                </nav>
            </div>
            <div class="col-lg-9">
                <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
                    <a href="" class="text-decoration-none d-block d-lg-none">
                        <h1 class="m-0"><span class="text-primary">P</span>ERFECT</h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav py-0">
                            <a href="index.jsp" class="nav-item nav-link active">Home</a>
                            <a href="about.jsp" class="nav-item nav-link">About</a>
                            <a href="courses.jsp" class="nav-item nav-link">Courses</a>
                             <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">For student</a>
                                <div class="dropdown-menu rounded-0 m-0">
                                    <a href="onlineSchedule" class="dropdown-item">Online-Exam</a>
                                    <a href="assignmentUpload" class="dropdown-item">Assignment</a>
                                    <a href="result" class="dropdown-item">Exam-Result</a>
                                    <a href="LectureSchedule" class="dropdown-item">Lecture-Schedule</a>
                                     <a href="Meeting" class="dropdown-item">Parent's Meeting</a>
                                     
                                </div>
                            </div>
                            <a href="Blog.jsp" class="nav-item nav-link">Blog</a>
                            <a href="feedback.jsp" class="nav-item nav-link">Feedback</a>
                            <a href="inquiry.jsp" class="nav-item nav-link">Contact</a>
                            
                        </div>
                        <%if(null == loggerInfo){ %>
	                        <a class="btn btn-primary py-2 px-4 ml-auto d-none d-lg-block" href="login1.jsp">Login</a>
                        <%} else { %>
                           <div style="padding-left:106px;"><a class="btn btn-primary py-2 px-4 ml-auto d-none d-lg-block" href="Logout.jsp">Logout</a></div> 
                        <%} %>

                        <%if(null != loggerInfo){ %>
	                        <a class="btn btn-primary py-2 px-3 ml-auto d-none d-lg-block" href="profile.jsp">Profile<i style='font-size:15px;padding-left:3px;' class='fas'>&#xf2bd;</i></a>
	                         <%} %>
                        
                    </div>
                </nav>
            </div>
        </div>
    </div>
    <!-- Navbar End -->
    
