<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<style>
/* General styling for the form */
body {
  font-family: Arial, sans-serif;
  margin: 20px;
}

form {
  margin-bottom: 20px;
}

/* Input field styling */
input[type="text"] {
  width: 300px;
  padding: 10px;
  margin: 10px 0;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 16px;
}

/* Label styling */
label {
  font-weight: bold;
  font-size: 16px;
}

/* Button styling */
input[type="submit"] {
  background-color: #009688;
  color: white;
  border: none;
  padding: 10px 20px;
  font-size: 16px;
  border-radius: 5px;
  cursor: pointer;
}

input[type="submit"]:hover {
  background-color: #00796b;
}

/* Table styling */
table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
  font-size: 18px;
  text-align: left;
}

th, td {
  border: 1px solid #ddd;
  padding: 12px;
}

tr:nth-child(even) {
  background-color: rgba(150, 212, 212, 0.4);
}

th {
  background-color: #009688;
  color: white;
}

tr:hover {
  background-color: #f1f1f1;
}
</style>
</head>
<body>
<a href="index.jsp">
<button type="submit" >Home</button>
</a>
<form action="getuserbyname" method="get">
  <label for="name">Enter Name</label><br>
  <input type="text" id="name" name="name"><br>
  <input type="submit" value="Search">
</form>

<table>
<tr>
  <th>Id</th>
  <th>Event Type</th>
  <th>Reason For Event</th>
  <th>Name</th>
  <th>Start Date</th>
  <th>End Date</th>
  <th>All Day Event</th>
  <th>Description</th>
</tr>
<tr>
  <td>${ user.getId() }</td>
  <td>${ user.getEventType() }</td>
  <td>${ user.getReasonForEvent() }</td>
  <td>${ user.getName() }</td>
  <td>${ user.getStartDate() }</td>
  <td>${ user.getEndDate() }</td>
  <td>${ user.getAllDayEvent() }</td>
  <td>${ user.getDescription() }</td>
</tr>
</table>
</body>
</html>
