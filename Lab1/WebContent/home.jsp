<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%
	if ((String) session.getAttribute("message") != null) {
	%>
	<script type="text/javascript">
		var msg = '<%=(String) session.getAttribute("message")%>';
		alert(msg)
	</script> 
	<%
		session.invalidate();
	}
%>
<a href="registerCandidate.jsp">Add Candidate</a><br><br>
<a href="vote.jsp">Vote</a><br><br>
<a href="winner.jsp">Poll Result</a><br><br>
<a href="summary.jsp">Voting Summary</a><br><br>
</body>
</html>