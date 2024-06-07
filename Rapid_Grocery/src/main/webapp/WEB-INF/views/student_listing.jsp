<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Student Table</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>
                    <tr>
					<th>Student ID:</th>
					<th>First-Name:</th>
					<th>Last-Name:</th>
					<th>Address:</th>
					<th>Gender:</th>
					<th>BirthDate:</th>
					<th>Email:</th>
					<th>Contact:</th>
					<th>Admission Date:</th>
					<th>Father name:</th>
					<th>Parent's Contact:</th>
					<th>Parent's Email:</th>
					<th>Course</th>	
					<th>Action on row</th>		
		</tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${studentregistrations}" var="studentregistration">
                    <tr data-widget="expandable-table" aria-expanded="false">
                        <td><c:out value="${studentregistration.user_master_Id}"/></td>
					    <td><c:out value="${studentregistration.user_Fname}"/></td>
						<td><c:out value="${studentregistration.user_Lname}"/></td>
						<td><c:out value="${studentregistration.user_Address}"/></td>
						<td><c:out value="${studentregistration.user_Gender}"/></td>
						<td><c:out value="${studentregistration.user_Dob}"/></td>
						<td><c:out value="${studentregistration.user_Email}"/></td>
						<td><c:out value="${studentregistration.user_Contact}"/></td>
						<%-- <td><c:out value="${studentregistration.user_Course}"/></td> --%>
						<td><c:out value="${studentregistration.user_Addmissiondate}"/></td>
						<td><c:out value="${studentregistration.user_Parentfname}"/></td>
						<td><c:out value="${studentregistration.user_ParentContact}"/></td>
						<td><c:out value="${studentregistration.user_Parentemail}"/></td>
						
						<!-- course name lavva mate -->
						<td>
							<c:forEach items="${courses}" var="course">
								<c:if test="${course.course_Id eq studentregistration.course_Id}">
									<c:out value="${course.course_Name }"/>
									
								</c:if>
							</c:forEach>
						</td>
                      <td align="center">
                      	<a href="editstudent?user_master_Id=${studentregistration.user_master_Id}"><i class='fas'>&#xf044;</i></a> |
				 <a href="deletestudent?user_master_Id=${studentregistration.user_master_Id}">	<span class='fas'>&#xf2ed;</span></a></td>
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