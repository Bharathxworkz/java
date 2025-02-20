<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<html>
<head>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 20px;
            background-color: #f3f4f6;
            color: #333;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
            background-color: #ffffff;
            border: 1px solid #ddd;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 12px;
        }

        th {
            background-color: #1e90ff;
            color: #fff;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f8f9fa;
        }

        tr:nth-child(odd) {
            background-color: #ffffff;
        }

        tr:hover {
            background-color: #e2e6ea;
        }

        a {
            text-decoration: none;
            color: white;
            display: inline-flex;
            justify-content: center;
            align-items: center;
            width: 30px;
            height: 30px;
            border-radius: 50%;
            margin-right: 10px;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }

        a.delete-icon {
            background-color: #dc3545;
        }

        a.delete-icon:hover {
            background-color: #bd2130;
            transform: scale(1.1);
        }

        a.edit-icon {
            background-color: #28a745;
        }

        a.edit-icon:hover {
            background-color: #218838;
            transform: scale(1.1);
        }

        a i {
            font-size: 14px;
        }

        caption {
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 10px;
            color: #1e90ff;
        }
    </style>
    <!-- Include Font Awesome for icons -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
</head>
<body>
    <form action="getallusers" method="get">
        <table>
            <caption>User Details</caption>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Action</th>
            </tr>
            <ref:forEach items="${ListOfUsers}" var="dto">
                <tr>
                    <td>${dto.getId()}</td>
                    <td>${dto.getFirstName()}</td>
                    <td>${dto.getLastName()}</td>
                    <td>${dto.getAge()}</td>
                    <td>
                        <a href="fetchUser?id=${dto.getId()}" class="edit-icon">
                            <i class="fas fa-edit"></i>
                        </a>
                        <a href="delete/${dto.getId()}" class="delete-icon">
                            <i class="fas fa-trash-alt"></i>
                        </a>
                    </td>
                </tr>
            </ref:forEach>
        </table>
    </form>
</body>
</html>
