<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Online-Exam Result</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>
               <tr>
			<th>OnlineExam ID</th>
			<th>Total Marks</th>
			<th>Obtain Marks</th>
			<th>Date</th>
			<th>Course</th>
			<th>Student Name</th>
			
			
		</tr>

                  </thead>
                  <tbody>
                 	<c:forEach items="${onlineexams}" var="onlineexam">
                    <tr data-widget="expandable-table" aria-expanded="false">
                    <td><c:out value="${onlineexam.onlineexam_Id}"/></td>
				<td><c:out value="${onlineexam.total_Marks}"/></td>
				<td><c:out value="${onlineexam.obtain_Marks}"/></td>
				<td><c:out value="${onlineexam.exam_Date}"/></td>
				<%-- <td><c:out value="${onlineexam.course_Id}"/></td>
			   	<td><c:out value="${onlineexam.user_master_Id}"/></td> --%>
			   	<td>
							<c:forEach items="${courses}" var="course">
								<c:if test="${course.course_Id eq onlineexam.course_Id}">
									<c:out value="${course.course_Name }"/>
									
								</c:if>
							</c:forEach>
						</td>
						<td>
							<c:forEach items="${students}" var="student">
								<c:if test="${student.user_master_Id eq onlineexam.user_master_Id}">
									<c:out value="${student.user_Fname}"/>
									
								</c:if>
							</c:forEach>
						</td>
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