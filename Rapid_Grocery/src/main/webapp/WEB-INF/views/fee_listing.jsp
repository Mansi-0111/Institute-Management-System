<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Fee</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>
                <tr>
			<th>Fee ID:</th>
			<th>Student Id:</th>
			<th>Amount:</th>
			<th>Order Id:</th>
			<th>Course name:</th>
			<th>Payment Date:</th>
			
		</tr>

                  </thead>
                  <tbody>
                 			<c:forEach items="${fees}" var="fee">
                    <tr data-widget="expandable-table" aria-expanded="false">
                    
                       <td><c:out value="${fee.payment_Id}"/></td>
                        <td><c:out value="${fee.user_master_Id}"/></td>
					   <td><c:out value="${fee.fee_Amount}"/></td>
				       <td><c:out value="${fee.order_Id}"/></td>
				       <td><c:out value="${fee.course_Name}"/></td>
				       <td><c:out value="${fee.payment_Date}"/></td>
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