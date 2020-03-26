	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="POST" action="process" modelAttribute="student">
		Student Name: <form:input path="name"/><br>
		Student Roll: <form:input path="roll"/><br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>