<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User List</title>
<style>
/* General Styles */
body {
    font-family: Arial, sans-serif;
    margin: 20px;
    background-color: #f9f9f9;
    color: #333;
}

/* Form Styles */
form {
    max-width: 100%;
    margin-bottom: 20px;
}

h1 {
    text-align: center;
    color: #0073e6;
}

/* Table Styles */
table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
    background-color: #fff;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

table thead {
    background-color: #0073e6;
    color: #fff;
}

table th,
table td {
    padding: 10px;
    text-align: left;
    border: 1px solid green;
}

table th {
    font-weight: bold;
}

table tbody tr:nth-child(odd) {
    background-color: #f2f2f2;
}

table tbody tr:hover {
    background-color: #e6f7ff;
}

/* Responsive Styles */
@media (max-width: 768px) {
    table th,
    table td {
        font-size: 12px;
        padding: 8px;
    }

    h1 {
        font-size: 24px;
    }
}

</style>
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
            <th>Alter Contact</th>
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
                <td>${dto.getId()}</td>
                <td>${dto.getFirstName()}</td>
                <td>${dto.getLastName()}</td>
                <td>${dto.getEmail()}</td>
                <td>${dto.getAlternateEmail()}</td>
                <td>${dto.getContact()}</td>
                <td>${dto.getAlternateContact()}</td>
                <td>${dto.getDateOdBirth()}</td>
                <td>${dto.getPlace()}</td>
                <td>${dto.getState()}</td>
                <td>${dto.getDistrict()}</td>
                <td>${dto.getPassword()}</td>
                <td>${dto.getConfirmPassword()}</td>
                <td>${dto.getCreatedBy()}</td>
                <td>${dto.getCreatedTime()}</td>
                <td>${dto.getUpdatedBy()}</td>
                <td>${dto.getUpdatedTime()}</td>
                <td>${dto.getFileName()}</td>
                <td>${dto.getContentType()}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>