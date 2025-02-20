<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Registration Form</title>
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
            width: 100%;
            max-width: 500px;
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
            display: block;
            margin-bottom: 8px;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
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

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #0077cc;
            transform: scale(1.05);
        }

        a {
            display: inline-block;
            margin-top: 10px;
            text-align: center;
            color: #1e90ff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h3>${updateInfo}</h3>
   <button> <a href="getallusers">Get All Users</a></button>

    <form action="updateUser" method="post">
        <h2>Customer Registration Form</h2>
        <input type="hidden" name="id" value="${customer.getId()}">

        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName" value="${customer.getFirstName()}">

        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName" value="${customer.getLastName()}">

        <label for="phoneNumber">Phone Number</label>
        <input type="number" id="phoneNumber" name="phoneNumber" value="${customer.getPhoneNumber()}">

        <label for="age">Age</label>
        <input type="number" id="age" name="age" value="${customer.getAge()}">

        <label for="address">Address</label>
        <input type="text" id="address" name="address" value="${customer.getAddress()}">

        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>
</body>
</html>
