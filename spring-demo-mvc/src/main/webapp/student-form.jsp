<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form action="studentProcess" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			
			<br><br>
			Last Name: <form:input path="lastName"/>
			<br><br>
			
			Country: <form:select path="country">
				<form:option value="Brazil"></form:option>
				<form:option value="Bangladesh"></form:option>
				<form:option value="India"></form:option>
				<form:option value="Pakistan"></form:option>
				<form:option value="Bhutan"></form:option>
			</form:select>
			<br><br>
			
		Gender: 
		<form:radiobutton path="gender" value="male"/>Male
		<form:radiobutton path="gender" value="female"/>Female
		<form:radiobutton path="gender" value="others"/>Others
		
		<br><br>
		Which Language You know?<br>
		<form:checkbox path="language" value="Java"/>Java
		<form:checkbox path="language" value="Python"/>Python
		<form:checkbox path="language" value="Ruby"/>Ruby
		<form:checkbox path="language" value="HTML"/>HTML
		<br><br>
		<%-- Country:
			<form:select path="zila">
				<form:option items="${student.getZila()}"/>
			</form:select> 
		 --%>
			<input type="submit"/>
		</form:form>
		
		
		
		
		
		
</body>
</html>