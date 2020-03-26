<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">Jewel</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="products">All Order</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="form">Add New Order</a>
    </li>
    
  </ul>
</nav>
		
		<div>
		<table borser="1" style="margin: 0 auto; ">
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Customer ID</th>
					<th>Product Name</th>
					<th>Product Price</th>
					<th>Delivery Date</th>
					<th>Action</th>
					
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="product" items="${products}">
					<tr>
						<td>${product.product_id }</td>
						<td>${product.customer_id}</td>
						<td>${product.product_name }</td>
						<td>${product.price}</td>
						<td>${product.delivery_date }</td>
						<td>
						<a href="/edit?product_id=${product.product_id}">Edit</a> &nbsp; 
						<a href="/delete?product_id=${product.product_id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	

</body>
</html>
