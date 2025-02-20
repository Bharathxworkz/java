<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User List</title>
</head>
<body>
<form action="getUser" >


<h1>View Profile</h1>

<!-- Display the list of users -->
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Alter Email</th>
            <th>Contact</th>
            <th>Alter Contact Number</th>
            <th>Dob</th>
            <th>Place</th>
            <th>State</th>
            <th>District</th>
            <th>Password</th>
            <th>ConfirmPassword</th>
            <th>CreatedBy</th>
            <th>CreatedDate</th>
            <th>UpdatedBy</th>
            <th>UpdatedDate</th>
            <th>FileName</th>
            <th>Content Type</th>
        </tr>
    </thead>
    <tbody>
            <tr>
                <td>${dto.id}</td>
                <td>${dto.getFName()}</td>
                <td>${dto.getLName()}</td>
                <td>${dto.getEmail()}</td>
                <td>${dto.getAlterEmail()}</td>
                <td>${dto.getContactNumber()}</td>
                <td>${dto.getAlterContactNumber()}</td>
                <td>${dto.getDateOfBirth()}</td>
                <td>${dto.getPlace()}</td>
                <td>${dto.getState()}</td>
                <td>${dto.getDistrict()}</td>
                <td>${dto.getPassword()}</td>
                <td>${dto.getConfirmPassword()}</td>
                <td>${dto.getCratedBy()}</td>
                <td>${dto.getCreatedTime()}</td>
                <td>${dto.getUpdatedBy()}</td>
                <td>${dto.getUpdatedTime()}</td>
                <td>${dto.getFileName()}</td>
                <td>${dto.getContentType()}</td>

            </tr>
    </tbody>
</table>

</body>
</html>