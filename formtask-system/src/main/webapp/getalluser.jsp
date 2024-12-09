<%@ page language="java" contentType="text/html;charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref"%>
<html>
<head>
<style>
table {
  width: 80%; /* Changed from 100% to 80% */
  border-collapse: collapse;
  border-spacing: 0;
  margin-bottom: 20px;
  margin-left: auto; /* Added to center the table */
  margin-right: auto; /* Added to center the table */
}

th, td {
  padding: 10px;
  border: 1px solid #ddd;
  text-align: left;
}

th {
  background-color: white;
}

tr:nth-child(even) {
  background-color: pink;
}

tr:hover {
  background-color: gray;
}

caption {
  font-size: 18px;
  font-weight: bold;
  margin-bottom: 10px;
}
</style>
</head>
<body>
<form action="getalluserlist" method="get">
</form>
<table>
<caption>User Informations</caption>
<tr>
<th>Id</th>
<th>Firstname</th>
<th>LastName</th>
<th>Email</th>
<th>phone</th>
<th>Address</th>
<th>city</th>
<th>state</th>
<th>zip</th>
<th>country</th>
<th>userName</th>
<th>password</th>
</tr>

<ref:forEach items="${user}" var="formDto">
<tr>
<td>${formDto.getId()}</td>
<td>${formDto.getFirstName()}</td>
<td>${formDto.getLastName()}</td>
<td>${formDto.getEmail()}</td>
<td>${formDto.getPhone()}</td>
<td>${formDto.getAddress()}</td>
<td>${formDto.getCity()}</td>
<td>${formDto.getState()}</td>
<td>${formDto.getZip()}</td>
<td>${formDto.getCountry()}</td>
<td>${formDto.getUserName()}</td>
<td>${formDto.getPassword()}</td>
<td>
  <a href="fetchUser?id=${formDto.getId()}" class="edit-icon">&#128394;</a> &nbsp;
  <a href="delete?id=${formDto.getId()}" class="delete-icon">&#128465;</a>
</td>

</ref:forEach>
</table>

</body>
</html>







