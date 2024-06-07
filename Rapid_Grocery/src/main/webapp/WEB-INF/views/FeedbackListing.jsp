<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9c5d;border-radius: 0;color: white;">
                <h3 class="card-title">Feedback</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>

		<tr>
		<th>Feedback ID</th>
			<th>Description</th>
			<th>Rate</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		</thead>
		<tbody>

		<c:forEach items="${feedbacks}" var="feedback">
			<tr>
				<td><c:out value="${feedback.feedbackId}"/></td>
				<td><c:out value="${feedback.descriptionF}"/></td>
				<td><c:out value="${feedback.feedbackRate}"/></td>
				<td><c:out value="${feedback.feedbackEmail}"/></td>
				
				
				<td align="center"> 
				 <a href="deletefeedback?feedbackId=${feedback.feedbackId}"><span class='fas'>&#xf2ed;</span></a></td>
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