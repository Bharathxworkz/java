<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
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
    <form action="getallusers" method="get">
        <table>
            <tr>
                <th>Id</th>
                <th>Event Type</th>
                <th>Reason For Event</th>
                <th>Name</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th>All Day Event</th>
                <th>Description</th>
                <th>Action</th>
            </tr>
            <ref:forEach items="${userlist}" var="dto">
                <tr>
                    <td>${dto.getId()}</td>
                    <td>${dto.getEventType()}</td>
                    <td>${dto.getReasonForEvent()}</td>
                    <td>${dto.getName()}</td>
                    <td>${dto.getStartDate()}</td>
                    <td>${dto.getEndDate()}</td>
                    <td>${dto.getAllDayEvent()}</td>
                    <td>${dto.getDescription()}</td>
                    <td>
                        <a href="delete?id=${dto.getId()}" class="delete">
                            <i class="fas fa-trash-alt"></i>
                        </a>
                        <a href="fetchUser?id=${dto.getId()}" class="edit">
                            <i class="fas fa-edit"></i>
                        </a>
                    </td>
                </tr>
            </ref:forEach>
        </table>
    </form>
</body>
</html>
