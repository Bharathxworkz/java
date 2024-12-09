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

<h3> ${updatedInfo}</h3>
<body>

<h2>Register</h2>
<form action="updateUser" method="post">
 <input type="text" hidden name="id" value=${userInfo.getId()}>
First Name:
<br>
<input type="text" name="firstName" value=${userInfo.getFirstName()}>
<br>
<br>
Last Name:
<br>
<input type="text" name="lastName"  value=${userInfo.getLastName()}>
<br>
<br>
Email:
<br>
<input type="email" name="email" value=${userInfo.getEmail()}>
<br>
<br>
Phone:
<br>
<input type="number" name="phone" value=${userInfo.getPhone()}>
<br>
<br>
Address:
<br>
<input type="text" name="address" value=${userInfo.getAddress()}>
<br>
<br>
City:
<br>
<input type="text" name="city" value=${userInfo.getCity()}>
<br>
<br>
State:
<br>
<input type="text" name="state" value=${userInfo.getState()}>
<br>
<br>
Zip:
<br>
<input type="text" name="zip" value=${userInfo.getZip()}>
<br>
<br>
Country:
<br>
<input type="text"  name="country" value=${userInfo.getCountry()}>
6<br>
Username:
<br>
<input type="text" name="username" value=${userInfo.getUserName()}>
<br>
<br>
Password:
<br>
<input type="password"  name="password" value=${userInfo.getPassword()}>
<br>
<br>
<input type="submit" value="Update">
<input type="reset" value="Reset">
</form>

</body>
<a href="getalluserlist">getalluser</a>
</html>
