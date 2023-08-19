<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3 pb-3 pt-4">
<form action="${pageContext.request.contextPath }/handle-product" method="post">
<input type="hidden" value="${product.id }" name="id" />
    <label for="title">Update Product Details</label>
  <div class="form-group">
    <label for="exampleInputEmail1">Product Name</label>
    <input type="text" class="form-control" id="name" value="${product.name }" placeholder="Enter Product Name" name="name">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Description</label>
    <input type="text" class="form-control" id="description" name="description" value="${product.description }" placeholder="Add Discription">
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">Price</label>
    <input type="text" class="form-control" id="price" name="price" value="${product.price }" placeholder="Enter Product Price">
  </div>  
  <div class="container text-center">
  <a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-primary">Update</button>
  </div>
</form>
</div>
</body>
</html>