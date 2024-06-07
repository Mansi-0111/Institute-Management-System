<%@include file="Header.jsp"%>

<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
        <div class="container">
            <div class="d-flex flex-column justify-content-center" style="min-height: 300px">
                <h3 class="display-4 text-white text-uppercase">Couses</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="index.jsp">Home</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                    <p class="m-0 text-uppercase">Courses</p>
                </div>
            </div>
        </div>
    </div>


<!-- Category Start --> 
    <div class="container-fluid py-5" style="margin-top: -132px;">
        <div class="container pt-5 pb-3">
            <div class="text-center mb-5" style="margin-top:66px;">
                <h5 class="text-primary text-uppercase mb-3" style="letter-spacing: 5px;">Subjects</h5>
                <h1>Explore Top Subjects</h1>
            </div>
            <div class="row" style="margin-top:-38px;">
                <div class="col-lg-4 col-md-6 mb-4" >
                    <div class="cat-item position-relative overflow-hidden rounded mb-2" style="margin-top:50px;">
                        <img class="img-fluid" src="img/cat-1.jpg" alt="">
                        <a class="cat-overlay text-white text-decoration-none" href="programming.jsp">
                            <h4 class="text-white font-weight-medium">Programming</h4>
                            <span>7 Courses</span>
                        </a>
                    </div>
                </div>
               
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="cat-item position-relative overflow-hidden rounded mb-2" style="margin-top:50px;">
                        <img class="img-fluid" src="img/cat-4.jpg" alt="">
                        <a class="cat-overlay text-white text-decoration-none" href="graphic.jsp">
                            <h4 class="text-white font-weight-medium">Graphic Design</h4>
                            <span>4 Courses</span>
                        </a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="cat-item position-relative overflow-hidden rounded mb-2" style="margin-top:50px;">
                        <img class="img-fluid" src="img/cat-5.jpg" alt="">
                        <a class="cat-overlay text-white text-decoration-none" href="web.jsp">
                            <h4 class="text-white font-weight-medium">Web Technology</h4>
                            <span>4 Courses</span>
                        </a>
                    </div>
                </div>
               
            </div>
        </div>
    </div>
    <!-- Category Start -->
    

<%@include file="Footer.jsp"%>