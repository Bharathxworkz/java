<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<style>
tr:nth-child(even) {
  background-color: rgba(150, 212, 212, 0.4);
}

th:nth-child(even),td:nth-child(even) {
  background-color: rgba(150, 212, 212, 0.4);
}
</style>
</head>
<body>
<form action="getuser" method="get">
Enter Sl.No <input type = "text" name="id"><br>
<input type = "submit" value="Search">
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