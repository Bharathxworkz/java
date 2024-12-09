<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Details</title>
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
    <!-- Form for searching the customer by ID -->
    <form action="test" method="get">
        Customer ID: <input type="text" name="id" required><br>
        <input type="submit" value="Search">
    </form>

    <table>
        <tr>
            <th>ID</th>
            <th>Register To Apply At</th>
            <th>Passport Office</th>
            <th>Given Name</th>
            <th>Sur Name</th>
            <th>Date of Birth</th>
            <th>Email</th>
            <th>Is Email ID Same</th>
            <th>Login ID</th>
            <th>Password</th>
            <th>Confirm Password</th>
            <th>Hint Question</th>
            <th>Hint Answer</th>
            <th>Captcha</th>
        </tr>
        <!-- Using getter methods for customer details -->
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getRegisterToApplyAt()}</td>
            <td>${user.getPassportOffice()}</td>
            <td>${user.getGivenName()}</td>
            <td>${user.getSurName()}</td>
            <td>${user.getDob()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getIsEmailIdSame()}</td>
            <td>${user.getLoginId()}</td>
            <td>${user.getPassword()}</td>
            <td>${user.getConfirmPassword()}</td>
            <td>${user.getHintQuestion()}</td>
            <td>${user.getHintAnswer()}</td>
            <td>${user.getCaptcha()}</td>
        </tr>
    </table>
</body>
</html>
