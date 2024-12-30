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
             <input type="text" id="lastName" name="lastName"  value=${user.getLastName()} required><br>



             <label for="bankName">Bank name</label>
             <input type="text" id="bankName" name="bankName"  value=${user.getBankName()} required><br>

             <label for="phoneNumber">Phone Number</label>
             <input type="number" id="phoneNumber" name="phoneNumber"  value=${user.getPhoneNumber()} required><br>



             <label for="income">income</label>
             <input type="number" id="income" name="income" value=${user.getIncome()} required><br>

             <input type="submit" value="Submit">
               </form>
               </div>
             </body>
</html>