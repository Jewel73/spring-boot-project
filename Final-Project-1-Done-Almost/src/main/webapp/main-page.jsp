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

<nav class="navbar navbar-expand-sm bg-dark text-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">All Books 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="addData">Add Book</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Edit Book</a>
    </li>
  </ul>
</nav>

	<div class="container">
		<c:choose>
			<c:when test="${mode == 'BOOK_VIEW'}">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>ID</th>
							<th>Book Name</th>
							<th>Author</th>
							<th>Parchase Date</th>
							<th>Edit</th>
							
						</tr>
					</thead>
					
					<tbody>
						
							<c:forEach var="book" items="${books}">
							<tr>
								<td>${book.id }</td>
								<td>${book.book_name }</td>
								<td>${book.author }</td>
								<td>${book.parchase_date}</td>
								<td><a href="editpage?id=${book.id}">Edit</a></td>
							</tr>
							</c:forEach>
						
					</tbody>
				</table>
			</c:when>
			
			<c:when test="${mode=='EDIT_VIEW' || mode=='ADD_DATA' }">
				<form action="/save" method="post">
					<input type="hidden" class="form-control" value=${book.id } name="id">
					  <div class="form-group">
					    <label for="book_name">Book Name:</label>
					    <input type="text" class="form-control" value=${book.book_name } name="book_name">
					  </div>
					  <div class="form-group">
					    <label for="author">Author:</label>
					    <input type="text" class="form-control" value=${book.author }  name="author">
					  </div>
					  
					  <div class="form-group">
					    <label for="parchase_date">Parchase Date:</label>
					    <input type="date" class="form-control" value=${book.parchase_date }  name="parchase_date">
					  </div>
					  
					  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</c:when>
		</c:choose>
	</div>



</body>
</html>
