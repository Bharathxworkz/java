<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Forgot Password</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .form-container {
      background: white;
      padding: 20px 30px;
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      width: 350px;
      text-align: center;
    }

    .form-container h2 {
      margin-bottom: 20px;
      color: #333;
    }

    .form-container label {
      display: block;
      text-align: left;
      margin-bottom: 5px;
      font-weight: bold;
      color: #555;
    }

    .form-container input[type="email"],
    .form-container input[type="password"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .form-container input[type="submit"],
    .form-container input[type="button"] {
      width: 48%;
      padding: 10px;
      margin-top: 10px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }

    .form-container input[type="submit"] {
      background-color: #28a745;
      color: white;
    }

    .form-container input[type="submit"]:hover {
      background-color: #218838;
    }

    .form-container input[type="button"] {
      background-color: #dc3545;
      color: white;
    }

    .form-container input[type="button"]:hover {
      background-color: #c82333;
    }
  </style>
</head>
<body>
  <div class="form-container">
    <h2>Forgot Password</h2>
    <br>
    <h3 class="form-row" style="color: red; text-align: center;">${notfound}</h3>

    <form action="resetPassword" mathod="get">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>

      <label for="new-password">New Password:</label>
      <input type="password" id="new-password" name="newPassword" required>

      <label for="confirm-password">Confirm Password:</label>
      <input type="password" id="confirm-password" name="confirmPassword" required>

      <input type="submit" value="Reset Password">
      <input type="button" value="Back" onclick="window.history.back();">
    </form>
  </div>
</body>
</html>