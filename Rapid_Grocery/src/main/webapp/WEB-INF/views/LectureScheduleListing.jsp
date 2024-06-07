
<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<div class="row" style="margin-left: 21%;margin-top: 2%;margin-right: 1%">
          <div class="col-12">
            <div class="card" style="border-radius:0;    width: 100%">
              <div class="card-header" style="background-color: #ff9d5c;border-radius: 0;color: white;">
                <h3 class="card-title">Lecture Schedule</h3>
              </div>
              <!-- ./card-header -->
              <div class="card-body" style="    scroll-behavior: auto;
    overflow-x: scroll;
    height: 400px;
    width: 100%;">
                <table class="table table-bordered table-hover">
                  <thead>

		<tr>
			<th>Time_Slot</th>
			<th>Today</th>
			<th>Tomorrow</th>
			
		</tr>
			</thead>
			<tbody>
			
		
			
		<c:forEach items="${lacturedata}" var="lectureschedule">
		<tr data-widget="expandable-table" aria-expanded="false">
		
		<c:forEach begin="0" end="${lacturedata.size()-2}" varStatus="loop">
			<td><c:out value="	${lectureschedule[loop.index]}"/></td>
		</c:forEach>
			
			
		 	
			</tr>	
			</c:forEach>
			
<%-- 				<td><c:out value="${lectureschedule.lectureschedule_Id}"/></td>
				<td><c:out value="${lectureschedule.monday_L}"/></td>
				<td><c:out value="${lectureschedule.tuesday_L}"/></td>
				<td><c:out value="${lectureschedule.wednesday_L}"/></td>
				<td><c:out value="${lectureschedule.thursday_L}"/></td>
				<td><c:out value="${lectureschedule.friday_L}"/></td>
				<td><c:out value="${lectureschedule.saturday_L}"/></td>
				<td><c:out value="${lectureschedule.lectureschedule_Fromdate}"/></td>
				<td><c:out value="${lectureschedule.lectureschedule_Todate}"/></td>
				<td><c:out value="${lectureschedule.lectureschedule_Isactive}"/></td>
				
				 --%>
			<%-- 	<td align="center"><a href="editlectureschedule?lectureschedule_Id=${lectureschedule.lectureschedule_Id}"><span class='fas'>&#xf044;</span></a> |
				 <a href="deletelectureschedule?lectureschedule_Id=${lectureschedule.lectureschedule_Id}"><span class='fas'>&#xf2ed;</span></a></td>
			</tr>

		</c:forEach> --%>
		</tbody>
	</table>

              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
        </div>
<%@ include file="footer.jsp"%>