<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div>
 <section class="section" style="margin-left: 20%;">
        <div class="container-fluid">
          <!-- ========== title-wrapper start ========== -->
          <div class="title-wrapper pt-30">
            <div class="row align-items-center">
              <div class="col-md-6">
                <div class="title mb-30">
                  <h2>Perfect Dashboard</h2>
                </div>
              </div>
              <!-- end col -->
              <div class="col-md-6">
                <div class="breadcrumb-wrapper mb-30">
                  <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                      <li class="breadcrumb-item">
                        <a href="#0">Dashboard</a>
                      </li>
                      <li class="breadcrumb-item active" aria-current="page">
                        Classess
                      </li>
                    </ol>
                  </nav>
                </div>
              </div>
              <!-- end col -->
            </div>
            <!-- end row -->
          </div>
          <!-- ========== title-wrapper end ========== -->
          
          
          <div class="row">
          
           <div class="col-xl-3 col-lg-4 col-sm-6"style="border:1px solid; background-color:#ffc107; margin-left:30px; color:white; border:none; border-color:ffc107;" >
              <div class="icon-card mb-30" >
                <div class="icon purple">
                  <i class="lni lni-user"></i>
<!--                   lni lni-cart-full  -->
                </div>
                <div class="content" style="padding:22px;">
                  <h6 class="mb-10">Total Users</h6>
                  <h3 class="text-bold mb-10">${userCount}</h3>
                  
                </div>
              </div>
             
              <!-- End Icon Cart -->
            </div>
           
            <!-- End Col -->
            <div class="col-xl-3 col-lg-4 col-sm-6" style="border:1px solid;  border-color:ffc107; margin-left:30px;  color:white; background-color:#dc3545; border:none;">
              <div class="icon-card mb-30" >
                <div class="icon success">
                  <i class="lni lni-users"></i>
                </div>
                <div class="content" style="padding:22px;">
                  <h6 class="mb-10">Total Student</h6>
                  <h3 class="text-bold mb-10">${studentCount}</h3>
                  
                </div>
              </div>
              <!-- End Icon Cart -->
            </div>
            <!-- End Col -->
            <div class="col-xl-3 col-lg-4 col-sm-6" style="border:1px solid;color:white;margin-left:30px;   background-color:#198754; border:none;">
              <div class="icon-card mb-30" >
                <div class="icon primary">
                  <i class="lni lni-list"></i>
                </div>
                <div class="content" style="padding:22px;">
                  <h6 class="mb-10">Total Staff</h6>
                  <h3 class="text-bold mb-10">${staffCount}</h3>
                  
                </div>
              </div>
              <!-- End Icon Cart -->
            </div>
            <!-- End Col -->
         
            <!-- End Col -->
          </div>
          <!-- End Row -->
          
          
          
          <div class="row">
               <div class="col-xl-3 col-lg-4 col-sm-6" style="border:1px solid; color:white; margin-top:30px;margin-left:30px;  background-color:#ffc107; border:none" >
              <div class="icon-card mb-30" >
                <div class="icon orange">
                  <i class="lni lni-timer"></i>
                </div>
                <div class="content" style="padding:22px;">
                  <h6 class="mb-10">Total Faculty</h6>
                  <h3 class="text-bold mb-10">${facultyCount}</h3>
                 
                </div>
              </div>
              <!-- End Icon Cart -->
            </div>
            <!-- End Col -->
            <div class="col-xl-3 col-lg-4 col-sm-6" style="border:1px solid;  border-color:ffc107; margin-top:30px;margin-left:30px;  color:white; background-color:#dc3545; border:none;">
              <div class="icon-card mb-30" >
                <div class="icon success">
                  <i class="lni lni-users"></i>
                </div>
                <div class="content" style="padding:22px;">
                  <h6 class="mb-10">Total Feedback</h6>
                  <h3 class="text-bold mb-10">${feedbackCount}</h3>
                  
                </div>
              </div>
              <!-- End Icon Cart -->
            </div>
            <!-- End Col -->
            <div class="col-xl-3 col-lg-4 col-sm-6" style="border:1px solid;color:white;margin-left:30px; margin-top:30px; background-color:#198754; border:none;">
              <div class="icon-card mb-30" >
                <div class="icon primary">
                  <i class="lni lni-list"></i>
                </div>
                <div class="content" style="padding:22px;">
                  <h6 class="mb-10">Total Inquiry</h6>
                  <h3 class="text-bold mb-10">${inquiryCount}</h3>
                  
                </div>
              </div>
              <!-- End Icon Cart -->
            </div>
            <!-- End Col -->
          
          </div>
          <!-- End Row -->
          
          
          
          
          
          
          
          
          
          
          
          
        </div>
        <!-- end container -->
      </section>
 </div>    
 <div style="margin-top:350px;"> 
 <%@ include file="footer.jsp"%>
 </div>