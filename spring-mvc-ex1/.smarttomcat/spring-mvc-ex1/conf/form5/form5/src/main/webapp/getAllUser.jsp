<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page import="java.util.List"%>
       <%@ page isELIgnored="false" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>

<html>
<head>
<body>
<h2>Tax User Details</h2>
<form action="getAllUser"   method="get">


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
             background-color: pink;
           }
           h2 {
                       text-align: center;
                       color: red;
                       margin-top: 50px;
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
<th>Action</th>
</tr>
<ref:forEach items="${taxUser}" var="dto">
<tr>
<td>${dto.getId()}</td>
<td>${dto.getFName()}</td>
<td>${dto.getLName()}</td>
<td>${dto.getPNumber()}</td>
<td>${dto.getIncome()}</td>
<td><a href="delete?id=${dto.getId()}">Delete</a>
 &nbsp <a href="fetchUser?id=${ dto.getId() }">Edit</a></td>

</tr>
</ref:forEach>
</body>
</html>