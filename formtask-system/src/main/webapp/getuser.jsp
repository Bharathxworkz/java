<%@ page language="java" contentType="text/html;charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<form action="getuser" method="get">
Enter SL.NO<input type="text" name="id"></br>
<input type="submit" value="search">
</form>
<table>
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

<td> ${ user.getId() }</td>
<td> ${ user.getFirstName() }</td>
<td> ${ user.getLastName() }</td>
<td> ${ user.getEmail() }</td>
<td> ${ user.getPhone() }</td>
<td> ${ user.getAddress() }</td>
<td> ${ user.getCity() }</td>
<td> ${ user.getState() }</td>
<td> ${ user.getZip() }</td>
<td> ${ user.getCountry() }</td>
<td> ${ user.getUserName() }</td>
<td> ${ user.getPassword() }</td>
</table>
</body>
</html>



