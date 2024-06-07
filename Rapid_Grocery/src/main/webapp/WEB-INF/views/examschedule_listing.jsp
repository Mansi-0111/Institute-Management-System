<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Exam-Schedule</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>
                  <tr>
			<th>ExamSchedule ID</th>
			<th>Date</th>
			<th>Course</th>
			<th>Faculty Name</th>
				 </tr>
                  </thead>
                  <tbody>
                 		<c:forEach items="${examschedules}" var="examschedule">
                    <tr data-widget="expandable-table" aria-expanded="false">
                    
                      <td><c:out value="${examschedule.examschedule_Id}"/></td>
					  <td><c:out value="${examschedule.examschedule_Date}"/></td>
					  <td>
							<c:forEach items="${courses}" var="course">
								<c:if test="${course.course_Id eq examschedule.course_Id}">
									<c:out value="${course.course_Name }"/>
									
								</c:if>
							</c:forEach>
						</td>
						<td>
							<c:forEach items="${faculty}" var="faculty">
								<c:if test="${faculty.user_master_Id eq examschedule.user_master_Id}">
									<c:out value="${faculty.user_Fname}"/>
									
								</c:if>
							</c:forEach>
						</td>
					 <%-- <td><c:out value="${examschedule.course_Id}"/></td> --%> 
			   		  <%--  <td><c:out value="${examschedule.user_master_Id}"/></td> --%>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
        </div>
<%@ include file="footer.jsp"%>