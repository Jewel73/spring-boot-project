<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
</head>
<body>
	<form:form action="processform" modelAttribute="customer">
		First Name: <form:input path="firstName"/> <br><br>
		Last Name: <form:input path="lastName"/><br><br>
		
		Country: <form:select path="city">
			<form:option value="Dhaka"></form:option>
			<form:option value="Comilla"></form:option>
			<form:option value="Barishal"></form:option>
			<form:option value="Sylhet"></form:option>
			
		
		</form:select>
		<input type="submit"/>
		
		
	</form:form>
</body>
</html>