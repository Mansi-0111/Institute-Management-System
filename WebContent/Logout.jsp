<%@include file="Header.jsp"%>

<%
session.setAttribute("loggerInfo", "");
session.setAttribute("loggerInfo", null);
response.sendRedirect("index.jsp");

%>
<div style="margin-top: 125px;">
	<%@include file="Footer.jsp"%>
</div>
