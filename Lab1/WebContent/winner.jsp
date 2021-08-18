<%@page import="com.pollsimulator.service.CandidateService"%>
<%@page import="com.pollsimulator.model.Candidate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Poll Result</title>
</head>
<body>

<h2>Winner!!!</h2>

<%
	List<Candidate> winners = CandidateService.showWinner();
	request.setAttribute("winners", winners);
%>

<h4>Winner: ${winners.get(0).getName()}  (Votes: ${winners.get(0).getVotes()})
<br>
    Lost:   ${winners.get(1).getName()}  (Votes: ${winners.get(1).getVotes()})</h4>
	
<a href="home.jsp">Back To Home Page!</a><br><br>
	
</body>
</html>