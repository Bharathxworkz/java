<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %>

<html>
<head>
<body>
<form action="getTaxUser">
Enter SL.NO<input type="text" name="id"></br>
<input type="submit" value="search">
</form>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<table>
<tr>
<th>Id</th>
<th>First name</th>
<th>Last name</th>
<th>Phone Number</th>
<th>Income</th>
</tr>
<tr>
<td>${taxUser.getId()}</td>
<td>${taxUser.getFName()}</td>
<td>${taxUser.getLName()}</td>
<td>${taxUser.getPNumber()}</td>
<td>${taxUser.getIncome()}</td>
</tr>
</html>