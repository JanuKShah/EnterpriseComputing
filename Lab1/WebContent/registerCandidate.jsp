<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Candidate</title>
</head>
<body>

<form method = "post" action="RegisterCandidateServlet">

	<label>ID: </label> 		
	<input type="text" name="id"/><br><br>		
		
	<label>Name: </label>
	<input type="text" name="name"/><br><br><br>
			
	<input type="submit" value="Register Candidate">			
		
</form>
</body>
</html>