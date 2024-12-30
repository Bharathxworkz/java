<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f3f4f6;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #ffffff;
            padding: 20px 40px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 300px;
        }

        h2 {
            text-align: center;
            color: #1e90ff;
            margin-bottom: 20px;
        }

        label {
            font-size: 14px;
            font-weight: bold;
            color: #333;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #1e90ff;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }

        input[type="submit"]:hover {
            background-color: #0077cc;
            transform: scale(1.05);
        }
    </style>
</head>
<body>
<form action="signup" method="post">
<br>
First Name
<br>
<input type="text" name="firstName" required>
<br>
<br>
Last Name
<br>
<input type="text" name="lastName" required>
<br>
<br>
Phone Number
<br>
<input type="number" name="phoneNumber" required>
<br>
<br>
Age
<br>
<input type="number" name="age" required>
<br>
<br>
Address
<br>
<input type="text" name="address" required>
<br>
<br>
<input type="submit" value="Submit">
<br>
</body>
</html>