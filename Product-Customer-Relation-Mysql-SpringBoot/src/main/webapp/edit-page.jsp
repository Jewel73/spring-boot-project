<!DOCTYPE html>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  <style>
  
  	input[type=text] {
  border: 2px solid red;
  border-radius: 4px;
}
  </style>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">Jewel</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="/products">All Order</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="form">Add New Order</a>
    </li>
    
  </ul>
</nav>

			<form:form method="POST" action="process" modelAttribute="product">
			
			<form:input type="hidden" path="product_id"/><br>
			<label>Customer ID:</label> <form:input path="customer_id"/><br>
			<label>Product Name:</label> <form:input path="product_name"/><br>
			<label>Product Price:</label> <form:input path="price"/><br>
			<label>Delivery Date</label><form:input type="date" path="delivery_date"/><br>
			<input type="submit"  value="UPDATE" />
			
		</form:form>


</body>
</html>
