<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
</head>
<body>
<h3> ${ updateInfo } </h3>
<a href="getAllProducts">Get All Users</a>

<h3>User Details</h3>
<form action="updateProduct" method="post">
<input type ="text" hidden name="id" value=${user.getId()} >
 <label for="productName">Product Name</label>
      <input type="text" id="productName" name="productName"   value=${user.getProductName()}required><br>

      <label for="productCatagory">Proct catagory</label>
      <input type="text" id="productCatagory" name="productCatagory" value=${user.getProductCatagory()} required><br>



      <label for="productColor">product Color</label>
      <input type="text" id="productColor" name="productColor" value=${user.getProductColor()} required><br>

      <label for="productPrice">Product Price</label>
      <input type="number" id="productPrice" name="productPrice" value=${user.getProductPrice()} required><br>





      <input type="submit" value="Submit">
</form>
</body>
</html>