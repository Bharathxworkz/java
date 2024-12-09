<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        form {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <!-- Form for searching the user by ID -->
    <form action="test" method="get">
        User ID: <input type="text" name="id" required><br>
        <input type="submit" value="Search">
    </form>

    <table>
        <tr>
            <th>User ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Gender</th>
            <th>Aadhar Number</th>
            <th>Address</th>
            <th>Date of Birth</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Qualification</th>
            <th>Marital Status</th>
            <th>Current Job Title</th>
            <th>Years of Experience</th>
        </tr>
        <!-- Using getter methods for user details -->
        <tr>
            <td>${user.getUserId()}</td>
            <td>${user.getFirstName()}</td>
            <td>${user.getLastName()}</td>
            <td>${user.getGender()}</td>
            <td>${user.getAdharNumber()}</td>
            <td>${user.getAddress()}</td>
            <td>${user.getDateOfBirth()}</td>
            <td>${user.getPhoneNumber()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getQualification()}</td>
            <td>${user.getMaritalStatus()}</td>
            <td>${user.getCurrentJobTitle()}</td>
            <td>${user.getYearsOfExperience()}</td>
        </tr>
    </table>
</body>
</html>
