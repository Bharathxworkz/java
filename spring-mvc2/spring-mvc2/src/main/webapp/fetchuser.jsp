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
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 500px;
        }

        h2 {
            text-align: center;
            color: #1e90ff;
            margin-bottom: 20px;
        }

        label {
            font-size: 10px;
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

        input[type="submit"],
        input[type="reset"] {
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
<h3> ${ updateInfo } </h3>
<a href="getallusers">Get All Users</a>

<form action="updateUser" method="post">
<h3>Customer Registration Form
<input type ="text" hidden name="id" value=${customer.getId()} >
<br>
First Name
<br>
<input type="text" name="firstName" value=${customer.getFirstName()} >
<br>
<br>
Last Name
<br>
<input type="text" name="lastName" value=${customer.getLastName()} >
<br>
<br>
Phone Number
<br>
<input type="number" name="phoneNumber" value=${customer.getPhoneNumber()}>
<br>
<br>
Age
<br>
<input type="number" name="age" value=${customer.getAge()}>
<br>
<br>
Address
<br>
<input type="text" name="address" value=${customer.getAddress()}>
<br>
<br>
<input type="submit" value="Submit">
<br>
<br>
<input type="reset" value="Reset">
<br>
</body>
</html>