<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

        <style>
            table {
                width: 50%;
                border-collapse: collapse;
                margin: 20px auto;
                font-family: Arial, sans-serif;
            }
            th, td {
                border: 1px solid #ddd;
                text-align: center;
                padding: 8px;
            }
            th {
                background-color: aqua;
            }
        </style>
</head>
<body>

<form action="getuserbyname">

Enter Name: <input type="text" name="name">
<input type="submit" value="SEARCH" >
</form>

    <table>
      <tr>
        <th>id</th>
        <th>Name</th>
        <th>Email</th>
        <th>phone No</th>
        <th>Position</th>
        <th>Experience in year</th>
      </tr>
      <tr>
          <td>${dto.getUserid()}</td>
          <td> ${dto.getName() }</td>
          <td>${dto.getEmail()}</td>
          <td>${dto.getPhoneNo()}</td>
          <td>${dto.getPosition()}</td>
          <td>${dto.getExperience()}</td>
      </tr>
    </table>

</body>
</html>