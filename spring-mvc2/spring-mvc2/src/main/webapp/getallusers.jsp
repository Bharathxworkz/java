<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<html>
<head>
</head>
<body>
<form action="getallusers" method="get">
<table>
<caption>Customer Details</caption>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Phone Number</th>
<th>Age</th>
<th>Address</th>
</tr>
<ref:forEach items="${ListOfUsers}" var="dto">
<tr>
<td>${ dto.getId() }</td>
<td>${ dto.getFirstName() }</td>
<td>${ dto.getLastName() }</td>
<td>${ dto.getPhoneNumber() }</td>
<td>${ dto.getAge() }</td>
<td>${ dto.getAddress() }</td>
<td>
  <a href="fetchUser?id=${ dto.getId() }" class="edit-icon">&#128394;</a> &nbsp;
  <a href="delete?id=${ dto.getId() }" class="delete-icon">&#128465;</a>
</td>
</tr>
</ref:forEach>
</table>
</body>
</html>