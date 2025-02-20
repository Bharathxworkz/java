
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page import="java.util.List"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <form action="getAllUser" method="get">

   <style>
           table {
             font-family: arial, sans-serif;
             border-collapse: collapse;
             width: 80%;
             margin-bottom:20px;
             margin-left:auto;
             margin-right:auto;
           }

           td, th {
             border: 2px solid black;

             text-align: left;
             padding: 8px;
           }

           tr:nth-child(even) {
             background-color: aqua;
           }
           h2 {
                       text-align: center;
                       color: red;
                       margin-top: 50px;
                   }
       </style>
</head>
<body>
<h2 >User Details</h2><br><br>
<table>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
<th>Phone Number</th>
<th>Adhaar</th>
<th>Action</th>
</tr>
<ref:forEach items="${user}" var="dto">
<tr>
<td>${dto.getId()}</td>
<td>${dto.getFirstName()}</td>
<td>${dto.getLastName()}</td>
<td>${dto.getAge()}</td>
<td>${dto.getPhoneNumber()}</td>
<td>${dto.getAdhaar()}</td>
<td><a href="delete?id=${dto.getId()}">Delete</a>
  &nbsp <a href="fetchUser?id=${ dto.getId() }">Edit</a></td>



</tr>
</ref:forEach>

</table>


</body>
</html>