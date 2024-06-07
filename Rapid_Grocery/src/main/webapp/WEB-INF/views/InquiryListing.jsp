<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 18%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;  margin-left:42px;  width: 96%">
              <div class="card-header" style="background-color: #ff9c5d;border-radius: 0;color: white;">
                <h3 class="card-title">Inquiry</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>

		<tr>
		<th>Inquiry ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Query</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		</thead>
		<tbody>

		<c:forEach items="${inquirys}" var="inquiry">
			<tr>
				<td><c:out value="${inquiry.inquiryId}"/></td>
				<td><c:out value="${inquiry.inquiryName}"/></td>
				<td><c:out value="${inquiry.inquiryAdd}"/></td>
				<td><c:out value="${inquiry.inquiryQuery}"/></td>
				<td><c:out value="${inquiry.inquiryMail}"/></td>
				
				
				<td align="center"><a href="deleteinquiry?inquiryId=${inquiry.inquiryId}"><span class='fas'>&#xf2ed;</span></a></td>
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