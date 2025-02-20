<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Details</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f3f4f6;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            background-color: #ffffff;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        caption {
            font-size: 1.5rem;
            font-weight: bold;
            margin-bottom: 10px;
            color: #1e90ff;
            text-align: center;
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #1e90ff;
            color: white;
            font-size: 14px;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        td {
            font-size: 14px;
            color: #333;
        }

        .edit-icon, .delete-icon {
            text-decoration: none;
            font-size: 16px;
            color: #1e90ff;
            transition: color 0.3s ease;
        }

        .delete-icon {
            color: #ff4d4d;
        }

        .edit-icon:hover {
            color: #0077cc;
        }

        .delete-icon:hover {
            color: #ff1a1a;
        }
    </style>
</head>
<body>
    <form action="getallusers" method="get">
        <table>
            <caption>Customer Details</caption>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone Number</th>
                <th>Age</th>
                <th>Address</th>
                <th>Actions</th>
            </tr>
            <ref:forEach items="${ListOfUsers}" var="dto">
                <tr>
                    <td>${dto.getId()}</td>
                    <td>${dto.getFirstName()}</td>
                    <td>${dto.getLastName()}</td>
                    <td>${dto.getPhoneNumber()}</td>
                    <td>${dto.getAge()}</td>
                    <td>${dto.getAddress()}</td>
                    <td>
                        <a href="fetchUser?id=${dto.getId()}" class="edit-icon">&#128394;</a> &nbsp;
                        <a href="delete?id=${dto.getId()}" class="delete-icon">&#128465;</a>
                    </td>
                </tr>
            </ref:forEach>
        </table>
    </form>
</body>
</html>
