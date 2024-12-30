<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 10px;
        }

        th {
            background-color: #4caf50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
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
            transition: background-color 0.3s ease;
        }

        a.delete {
            background-color: red;
        }

        a.delete:hover {
            background-color: darkred;
        }

        a.edit {
            background-color: #4caf50;
        }

        a.edit:hover {
            background-color: #3e8e41;
        }

        a i {
            font-size: 14px;
        }
    </style>
    <!-- Include Font Awesome for icons -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
</head>
<body>
    <form action="getallusers" method="post">
        <table>
            <tr>
                <th>Id</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>phoneNumber</th>
                <th>Age</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${ListOfusers}" var="dto">
                <tr>
                    <td>${dto.id}</td>
                    <td>${dto.firstName}</td>
                    <td>${dto.lastName}</td>
                    <td>${dto.phoneNo}</td>
                    <td>${dto.age}</td>

                    <td>
                        <a href="delete?id=${dto.id}" class="delete">
                            <i class="fas fa-trash-alt"></i>
                        </a>
                        <a href="fetchUser?id=${dto.id}" class="edit">
                            <i class="fas fa-edit"></i>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
