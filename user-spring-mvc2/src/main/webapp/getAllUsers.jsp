<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page import="java.util.List"%>
        <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>

<html>
<head>
<body>
<form action="getAllUsers" method="get">
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
             background-color: brown;
           }
           h2 {
                       text-align: center;
                       color: red;
                       margin-top: 50px;
                   }
       </style>


</head>
<body>
<h2>Tax User Details</h2>
<table>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Bank Name</th>

<th>PhoneNumber</th>
<th>Income</th>

<th>Action</th>
</tr>
<ref:forEach items="${listOfUsers}" var="dto">

<tr>
<td>${dto.getId()}</td>
<td>${dto.getFirstName()}</td>
<td>${dto.getLastName()}</td>
<td>${dto.getBankName()}</td>
<td>${dto.getPhoneNumber()}</td>
<td>${dto.getIncome()}</td>

<td><a href="delete?id=${dto.getId()}">Delete</a>
 &nbsp <a href="fetchUser?id=${ dto.getId() }">Edit</a></td>
</tr>
</ref:forEach>
</table>
</body>
</html>