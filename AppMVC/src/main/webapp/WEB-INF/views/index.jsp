<html>
<head>

<%@include file="./base.jsp" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
			 <h1 class="text-center mb-3">Welcome to My App</h1>
			 <table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">#id</th>
      <th scope="col">Name</th>
      <th scope="col">Discription</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${products }" var="p">
    <tr>
      <th scope="row">app${p.id }</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td>${p.price }</td>
      <td>
		<a href="delete/${p.id }" class="btn btn-outline-danger">Delete</a>
		<a href="update/${p.id }" class="btn btn-outline-success">Update</a>
      
      </td>
    </tr> 
    </c:forEach>  
  </tbody>
</table>
<div class="container text-center">
<a href="add-product" class="btn btn-outline-success">Add Product</a>
</div>
			</div>
		</div>
	</div>
</body>
</html>
