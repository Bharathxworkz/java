<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Include Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: aqua;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border: 1px solid #ddd;
        }

        th, td {
            text-align: center;
            padding: 12px;
            font-size: 14px;
        }

        th {
            background-color: #98C064;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            text-decoration: none;
            padding: 6px 12px;
            font-size: 12px;
            border-radius: 4px;
        }

        a:hover {
            opacity: 0.8;
        }

        .delete-icon {
            color: black;
            font-size: 16px;
            padding: 6px;
        }

        .delete-icon:hover {
            color: red;
        }

        .edit-icon {
            color: black;
            font-size: 16px;
            padding: 6px;
            transform: rotate(0deg);
        }
        .edit-icon:hover {
            color: blue;
        }
    </style>
</head>
<body>

    <form action="getAllUsers"></form>
    <h2 style="text-align: center;">Applicants Details</h2>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone No</th>
            <th>Position</th>
            <th>Experience in Years</th>
            <th>Action</th>
        </tr>
        <c:forEach var="dto" items="${jobDto}">
            <tr>
                <td>${dto.getUserid()}</td>
                <td>${dto.getName()}</td>
                <td>${dto.getEmail()}</td>
                <td>${dto.getPhoneNo()}</td>
                <td>${dto.getPosition()}</td>
                <td>${dto.getExperience()}</td>
                <td>
                    <!-- Delete Icon -->
                    <a href="delete?userid=${dto.getUserid()}" class="delete-icon">
                        <i class="bi bi-trash"></i>
                    </a>
                    &nbsp;
                    <!-- Edit Icon -->
                    <a href="fetchUser?id=${dto.getUserid()}" class="edit-icon">
                        <i class="bi bi-pencil"></i>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
