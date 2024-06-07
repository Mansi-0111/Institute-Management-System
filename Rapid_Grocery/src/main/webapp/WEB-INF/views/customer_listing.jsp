<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 170%">
              <div class="card-header" style="background-color: #007bff;border-radius: 0;color: white;">
                <h3 class="card-title">Customer Table</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 300px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>
                    <tr>
                      <th>ID</th>
                      <th>Customer Name</th>
                      <th>Customer Address</th>
                      <th>Customer Contact</th>
                      <th>Customer Email</th>
                      <th>Action</th>
                    </tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${customers}" var="customer">
                    <tr data-widget="expandable-table" aria-expanded="false">
                      <td><c:out value="${customer.c_id}" /></td>
                      <td><c:out value="${customer.c_name}" /></td>
                      <td><c:out value="${customer.c_address}" /></td>
                      <td><c:out value="${customer.c_contact}" /></td>
                      <td><c:out value="${customer.c_email}" /></td>
                      <td align="center">
                      	<a href="editcustomer?c_id=${customer.c_id}">Edit</a> | <a href="deletecustomer?c_id=${customer.c_id}">Delete</a></td>
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