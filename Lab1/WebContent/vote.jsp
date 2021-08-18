<%@page import="com.pollsimulator.service.CandidateService"%>
<%@page import="com.pollsimulator.model.Candidate"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vote</title>
</head>
<body>
<%  

List<Candidate> candidateList = CandidateService.getAllCandidates();
request.setAttribute("candidateList", candidateList); 

%>	
<form action="VoteServlet" method="post">

<label>Student ID: </label> 		
<input type="text" name="id" id="id"/><br><br>		
	
<c:forEach items="${candidateList}" var="item">
    <input type="radio" name="name" value="${item.getName()}">${item.getName()}<br>
</c:forEach> 
<br><br><br>			
<input type="submit" value="Vote">

</form>
</body>
</html>