<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
</head>
<body>
<h3> ${ updateInfo } </h3>
<a href="getAllUsers">Get All Users</a>

<h3>User Details</h3>
<form action="updateuser" method="post">
<input type ="text" hidden name="id" value=${user.getId()} >
<label for="firstName">First Name</label>
      <input type="text" id="firstName" name="firstName" value=${user.getFirstName()} required><br>

      <label for="lastName">Last Name</label>
      <input type="text" id="lastName" name="lastName" value=${user.getLastName()} required><br>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" value=${user.getEmail()} required><br>

      <label for="city">City</label>
      <input type="text" id="city" name="city"  value=${user.getCity()} required><br>

      <label for="phoneNumber">Phone Number</label>
      <input type="number" id="phoneNumber" name="phoneNumber"  value=${user.getPhoneNumber()} required><br>

      <label for="adhaar">Adhaar Number</label>
      <input type="number" id="adhaar" name="adhaar" value=${user.getAdhaar()} required><br>

      <label for="age">Age</label>
      <input type="number" id="age" name="age" value=${user.getAge() } required><br>

      <input type="submit" value="Submit">
</form>
</body>
</html>