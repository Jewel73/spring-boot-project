<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><b><i>Student Form Show:</i></b></h1><hr>

<form:form action="studentProcess" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			
			<br><br>
			Last Name: <form:input path="lastName"/>
			<br><br>
			
	<input type="submit"/>
	</form:form>
	
 


</body>
</html>