<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>

<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Assignment</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead><tr>
			<th>Assignment ID</th>
			<th>Master Id:</th>
			<th>Email</th>
			<th>Submission Date</th>
			<th>PDF</th>
			
		</tr>
                  </thead>
                  <tbody>
                 		<c:forEach items="${assignments}" var="assignment">
                    <tr data-widget="expandable-table" aria-expanded="false">
                    
                       <td><c:out value="${assignment.assignment_Id}"/></td>
                        <td><c:out value="${assignment.user_master_Id}"/></td>
					   <td><c:out value="${assignment.assignment_Email}"/></td>
				       <td><c:out value="${assignment.assignment_Submissiondate}"/></td>
				       <td><a href="file://///D:\Project_File\<c:out value="${assignment.assignment_Pdf}"/>" download><c:out value="${assignment.assignment_Pdf}"/></a></td>
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