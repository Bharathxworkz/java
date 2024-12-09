<%@ page language="java" contentType="text/html;charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>



<html>
<head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
}

form {
    width: 50%;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border: 1px solid #ddd;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
h2 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }


input[type="text"], input[type="email"], input[type="number"], input[type="password"] {
    width: 100%;
    height: 40px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

input[type="submit"], input[type="reset"] {
    width: 100%;
    height: 40px;
    padding: 10px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: #fff;
}

input[type="reset"] {
    background-color: #ccc;
    color: #333;
}
</style>
</head>
<body>

<h2>Register</h2>
<form action="login" method="post">
First Name:
<br>
<input type="text" name="firstName">
<br>
<br>
Last Name:
<br>
<input type="text" name="lastName">
<br>
<br>
Email:
<br>
<input type="email" name="email">
<br>
<br>
Phone:
<br>
<input type="number" name="phone">
<br>
<br>
Address:
<br>
<input type="text" name="address">
<br>
<br>
City:
<br>
<input type="text" name="city">
<br>
<br>
State:
<br>
<input type="text" name="state">
<br>
<br>
Zip:
<br>
<input type="text" name="zip">
<br>
<br>
Country:
<br>
<input type="text"  name="country">
6<br>
Username:
<br>
<input type="text" name="username">
<br>
<br>
Password:
<br>
<input type="password"  name="password">
<br>
<br>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
</body>
</html>