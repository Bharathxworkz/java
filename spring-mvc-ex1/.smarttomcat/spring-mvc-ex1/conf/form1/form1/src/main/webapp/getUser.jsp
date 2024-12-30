
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <form action="getUser">
    Enter SL no<input type="text" name="id"></br>
    <input type="submit"value="search">
    </form>
    <style>
    table,th,td{
    border:1px solid black;
    border-collapse:collapse;
    }
    </style>
</head>
<body>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
<th>Phone Number</th>
<th>Adhaar</th>
</tr>
<tr>
<td>${user.getId()}</td>
<td>${user.getFirstName()}</td>
<td>${user.getLastName()}</td>
<td>${user.getAge()}</td>
<td>${user.getPhoneNumber()}</td>
<td>${user.getAdhaar()}</td>

</tr>

</table>

</body>
</html>