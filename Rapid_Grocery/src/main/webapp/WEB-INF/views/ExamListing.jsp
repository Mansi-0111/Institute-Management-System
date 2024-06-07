
<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9c5d;border-radius: 0;color: white;">
                <h3 class="card-title">Question-Answer</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>

		<tr>
			<th>Question ID</th>
			<th>Faculty Id:</th>
			<th>Course:</th>
			<th>Question</th>
			<th>Option1</th>
			<th>Option2</th>
			<th>Option3</th>
			<th>Option4</th>
			<th>Correct Answer</th>
			<th>Action</th>
		</tr>
			</thead>
			<tbody>
		<c:forEach items="${examqas}" var="examqa">
		<tr data-widget="expandable-table" aria-expanded="false">
		
			
				<td><c:out value="${examqa.exam_qa_Id}"/></td>
				<%-- <td><c:out value="${examqa.user_master_Id}"/></td> --%>
						<td>
							<c:forEach items="${faculty}" var="faculty">
								<c:if test="${faculty.user_master_Id eq examqa.user_master_Id}">
									<c:out value="${faculty.user_Fname}"/>
									
								</c:if>
							</c:forEach>
						</td>
						
						<td>
							<c:forEach items="${courses}" var="course">
								<c:if test="${course.course_Id eq examqa.course_Id}">
									<c:out value="${course.course_Name }"/>
									
								</c:if>
							</c:forEach>
						</td>
						
				
				<td><c:out value="${examqa.exam_Question}"/></td>
				<td><c:out value="${examqa.optionE1}"/></td>
				<td><c:out value="${examqa.optionE2}"/></td>
				<td><c:out value="${examqa.optionE3}"/></td>
				<td><c:out value="${examqa.optionE4}"/></td>
				<td><c:out value="${examqa.correctAns}"/></td>
				
				
				<td align="center"><a href="editexamqa?exam_qa_Id=${examqa.exam_qa_Id}"><span class='fas'>&#xf044;</span></a> |
				 <a href="deleteexamqa?exam_qa_Id=${examqa.exam_qa_Id}"><span class='fas'>&#xf2ed;</span></a></td>
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