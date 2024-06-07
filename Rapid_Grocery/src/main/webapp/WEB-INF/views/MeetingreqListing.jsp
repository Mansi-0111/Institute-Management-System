
<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9c5d;border-radius: 0;color: white;">
                <h3 class="card-title">Meeting link</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>

		<tr>
			<th>Meeting ID</th>
			<th>Link</th>
			<th>Date-Time</th>
			<th>Course Name</th>
			<th>Actions</th>
		</tr>
			</thead>
			<tbody>
		<c:forEach items="${meetingreqs}" var="meetingreq">
		<tr data-widget="expandable-table" aria-expanded="false">
		
			
				<td><c:out value="${meetingreq.meeting_Req_id}"/></td>
				<td><c:out value="${meetingreq.meeting_Link}"/></td>
				<td><c:out value="${meetingreq.meeting_Date_time}"/></td>
				<%-- <td><c:out value="${meetingreq.course_ID}"/></td> --%>
							<td>
							<c:forEach items="${courses}" var="course">
								<c:if test="${course.course_Id eq meetingreq.course_ID}">
									<c:out value="${course.course_Name }"/>
									
								</c:if>
							</c:forEach>
						</td>
				
				<td align="center">
				 <a href="deletemeetingreq?meeting_Req_id=${meetingreq.meeting_Req_id}"><span class='fas'>&#xf2ed;</span></a></td>
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