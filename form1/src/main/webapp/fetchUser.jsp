

<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %>


<!DOCTYPE html>
<head>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            color: #4CAF50;
            margin-top: 50px;
        }
        form {
            width: 50%;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        label {
            font-size: 1.1em;
            margin-bottom: 5px;
            display: block;
            color: #333;
        }
        input[type="text"],
        input[type="date"],
        input[type="email"],
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
        .form-container {
            max-width: 600px;
            margin: 0 auto;
        }
    </style>
</head>
<h3> ${ updateInfo } </h3>
<html
<body>
<a href="getAllUser">Get  all User</a><br>
    <h1>User Registration Form</h1>

   <form action="updateUser" method ="post">
   <input type ="text" hidden name="id" value=${user.getId()} >


        <label for="firstName">First Name:</label><br>
        <input type="text" id="firstName" name="firstName" value=${user.getFirstName()} required><br><br>

        <label for="LastName">Last Name:</label><br>
        <input type="text" id="lastName" name="lastName"  value=${user.getLastName()} required><br><br>



         <label for="age">Age:</label><br>
          <input type="number" id="age" name="age"  value=${user.getAge()}  required><br><br>


         <label for="phoneNumber">PhoneNumber:</label><br>
          <input type="number" id="phoneNumber" name="phoneNumber"  value=${user.getPhoneNumber()} required><br><br>

          <label for="adhaar">Adhar:</label><br>
           <input type="number" id="adhaar" name="adhaar"  value=${user.getAdhaar()} required><br><br>




        </select><br><br>


        <input type="submit" value="Submit">

    </form>
</body>
</html>