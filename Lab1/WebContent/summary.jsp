<%@page import="com.pollsimulator.service.CandidateService"%>
<%@page import="com.pollsimulator.model.Candidate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Voting Summary</title>
</head>
<body>

<%  
List<Candidate> candidates = CandidateService.getAllCandidates();  
request.setAttribute("candidates",candidates);  


%>	
<h4>	
<c:forEach items="${candidates}" var="item">
    ${item.getName()}: ${item.getVotes()}<br>
</c:forEach> 
</h4>
<a href="home.jsp">Back To Home Page!</a><br><br>
</body>
</html>