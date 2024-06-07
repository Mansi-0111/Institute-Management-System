 <%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Faculty</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>
                    <tr>
			<th>Faculty ID</th>
			<th>First-Name</th>
			<th>Last-Name</th>
			<th>Address</th>
			<th>Gender</th>
			<th>Contact</th>
			<th>Email</th>
			<th>BirthDate</th>
			<th>Qualification</th>
			<th>Action</th>
			</tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${facultyregistrations}" var="facultyregistration">
                    <tr data-widget="expandable-table" aria-expanded="false">
                      <td><c:out value="${facultyregistration.user_master_Id}"/></td>
				<td><c:out value="${facultyregistration.user_Fname}"/></td>
				<td><c:out value="${facultyregistration.user_Lname}"/></td>
				<td><c:out value="${facultyregistration.user_Address}"/></td>
				<td><c:out value="${facultyregistration.user_Gender}"/></td>
				<td><c:out value="${facultyregistration.user_Contact}"/></td>
				<td><c:out value="${facultyregistration.user_Email}"/></td>
				<td><c:out value="${facultyregistration.user_Dob}"/></td>
				<td><c:out value="${facultyregistration.user_Qualification}"/></td>
				
                 <td align="center"><a href="editfaculty?user_master_Id=${facultyregistration.user_master_Id}"><span class='fas'>&#xf044;</span></a> |
				 <a href="deletefaculty?user_master_Id=${facultyregistration.user_master_Id}"><span class='fas'>&#xf2ed;</span></a></td>
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