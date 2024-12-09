<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
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
<form action="getalluserslist" method="get">
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
<th>Action</th>
</tr>
<ref:forEach items="${userlist}" var="dto">
<tr>
<td>${ dto.getId() }</td>
<td>${ dto.getEventType() }</td>
<td>${ dto.getReasonForEvent() }</td>
<td>${ dto.getName() }</td>
<td>${ dto.getStartDate() }</td>
<td>${ dto.getEndDate() }</td>
<td>${ dto.getAllDayEvent() }</td>
<td>${ dto.getDescription() }</td>
<td> <a href="delete?id=${ dto.getId() }">Delete</a>
&nbsp <a href="fetchUser?id=${ dto.getId() }">Edit</a></td>
</tr>
</ref:forEach>
</table>
</body>
</html>