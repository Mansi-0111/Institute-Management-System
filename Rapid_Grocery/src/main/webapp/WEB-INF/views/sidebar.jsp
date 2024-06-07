<%@page import="com.admin.bean.LoggerInfo"%>
<%
	LoggerInfo info = (LoggerInfo)session.getAttribute("loggerInfo");
%>



<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <div style="margin-left: 39px;margin-top: 10px;margin-bottom: -13%;">
        <a href="#">
          	<h1><span style="color: #ff6600;">P</span><span style="color:white;">ERFECT</span></h1>
        </a>
    </div>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="assets/images/rajusir.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block" style="color:white;">Rajesh Sodvadiya</a>
        </div>
      </div>
      

      <!-- SidebarSearch Form -->
      <div class="form-inline">
        <div class="input-group" data-widget="sidebar-search">
          <input class="form-control form-control-sidebar" type="search" placeholder="Search" aria-label="Search">
          <div class="input-group-append">
            <button class="btn btn-sidebar">
              <i class="fas fa-search fa-fw"></i>
            </button>
          </div>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <!-- <li class="nav-item menu-open" >
            <a href="#" class="nav-link active" style="background-color: #ff9d5c;">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Dashboard
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            
          </li>
          -->
          
         
	       <%if(info.getUser_type_id() == 1 ) {%>   
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Student
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <!-- <a href="student" class="nav-link"> -->
                 <a href="addstudent" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Student</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="studentregistrations" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Student List</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Faculty
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addfaculty" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Faculty</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="facultyregistrations" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Faculty List</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Staff
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addstaff" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Staff</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="staffregistrations" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Staff List</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Assignment
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="adduploadassignment" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Assignment</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="assignments" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Assignment List</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Exam-Schedule
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addexamschedule" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Exam-Schedule</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="examschedules" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Exam-Schedule</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Fee
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addfee" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Fee</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="fees" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Fee</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Result
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="onlineexams" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Result List</p>
                </a>
              </li>
            </ul>
          </li>
          
          
          
           <!-- <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Salary
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addsalary" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Salary</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="salarys" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Salary List</p>
                </a>
              </li>
            </ul>
          </li> -->
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Exam Question
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="addexamqa" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Exam Question</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="examqas" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Exam question Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Feedback
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="feedbacks" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Feedback Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Inquiry
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
               <li class="nav-item">
                <a href="inquirys" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Inquiry Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Meeting Request
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="addmeetingreq" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Meeting Request</p>
                </a>
              </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="meetingreqs" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Meeting Request Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Lecture-Schedule
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
            <li class="nav-item">
                <!-- <a href="student" class="nav-link"> -->
                 <a href="addlectureschedule" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Lecture schedule</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="lectureschedules" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Lecture Schedule</p>
                </a>
              </li>
            </ul>
          </li>          
          <%} %>
          
          <%if(info.getUser_type_id() == 2 ) {%>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Student
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <!-- <a href="student" class="nav-link"> -->
                 <a href="addstudent" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Student</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="studentregistrations" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Student List</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Exam-Schedule
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addexamschedule" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Exam-Schedule</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="examschedules" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Exam-Schedule</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Fee
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addfee" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Fee</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="fees" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Fee</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Result
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="onlineexams" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Result List</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Inquiry
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
               <li class="nav-item">
                <a href="inquirys" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Inquiry Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Meeting Request
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="addmeetingreq" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Meeting Request</p>
                </a>
              </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="meetingreqs" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Meeting Request Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Lecture-Schedule
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="lectureschedules" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Lecture Schedule</p>
                </a>
              </li>
            </ul>
          </li>          
          <%} %>
          
          <%if(info.getUser_type_id() == 4 ) {%>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Student
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="studentregistrations" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Student List</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                 Assignment
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                 <a href="addassignment" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Assignment</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="assignments" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Assignment List</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                Exam-Schedule
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="examschedules" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Exam-Schedule List</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                Result
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="onlineexams" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Result List</p>
                </a>
              </li>
            </ul>
          </li>
          
          
          
           
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                Exam Question
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="addexamqa" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Exam Question</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="examqas" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Exam question List</p>
                </a>
              </li>
            </ul>
          </li>
        
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                Meeting Request
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="meetingreqs" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Meeting Request Listing</p>
                </a>
              </li>
            </ul>
          </li>
          
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-chart-pie"></i>
              <p>
                Lecture-Schedule
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
            <li class="nav-item">
                <!-- <a href="student" class="nav-link"> -->
                 <a href="addlectureschedule" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Add Lecture schedule</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="lectureschedules" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Lecture Schedule</p>
                </a>
              </li>
            </ul>
          </li>
          
          <%} %>
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>