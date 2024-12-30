<%@ page language="java" contentType="text/html; charset=US-ASCII"
  pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %>


<!DOCTYPE html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            color: #333;
            margin-top: 50px;
        }
        form {
            width: 40%;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        label {
            font-size: 1.1em;
            margin-bottom: 8px;
            display: block;
            color: #333;
        }
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 12px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 4px;
            width: 100%;
            margin-top: 10px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<h3> ${ updateInfo } </h3>
<html>
<body>
<a href="getAllUser">Get  all User</a><br>
<h1>Tax Filing Form</h1>
<form action="updateUser" method="post">
 <input type ="text" hidden name="id" value=${taxUser.getId()} >

    <label for="fName"> First Name:</label>
    <input type="text" name="fName" value=${taxUser.getFName()} required><br>

    <label for="lName"> Last Name:</label>
    <input type="text" name="lName" value=${taxUser.getLName()} required><br>

   <label for="pNumber">Phone Number:</label>
     <input type="number" name="pNumber" value=${taxUser.getPNumber()} required><br>

    <label for="income">Annual Income </label>
    <input type="number" name="income"  value=${taxUser.getIncome()} required><br>



    <input type="submit" value="Submit Tax Form">
</form>
</body>
</html>
