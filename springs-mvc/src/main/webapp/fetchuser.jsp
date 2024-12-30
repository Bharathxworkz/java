<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
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
            flex-direction: column;
        }

        h3 {
            color: #1e90ff;
            margin-bottom: 20px;
        }

        form {
            background-color: #ffffff;
            padding: 20px 40px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 300px;
            margin-top: 20px;
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

        input[type="submit"],
        input[type="reset"] {
            width: 48%;
            background-color: #1e90ff;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }

        input[type="reset"] {
            background-color: #f44336;
        }

        input[type="submit"]:hover {
            background-color: #0077cc;
            transform: scale(1.05);
        }

        input[type="reset"]:hover {
            background-color: #d32f2f;
            transform: scale(1.05);
        }

        .button-group {
            display: flex;
            justify-content: space-between;
        }

        a {
            color: #1e90ff;
            text-decoration: none;
            margin-top: 10px;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h3>${updateInfo}</h3>
    <a href="getallusers">Get All Users</a>

    <h3>User Details</h3>
    <form action="updateuser" method="post">
        <input type="hidden" name="id" value="${user.getId()}">
        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName" value="${user.getFirstName()}">

        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName" value="${user.getLastName()}">

        <label for="phoneNo">Phone No</label>
        <input type="text" id= "phoneNo" name="phoneNo" value="${user.getPhoneNo()}">

        <label for="age">Age</label>
        <input type="number" id="age" name="age" value="${user.getAge()}">

        <div class="button-group">
            <input type="submit" value="Update">
            <input type="reset" value="Reset">
        </div>
    </form>
</body>
</html>
