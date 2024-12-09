<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            background-image: url('indan.jpg');
            margin: 0;
            padding: 0;
        }
        h2 {
            text-align: center;
            margin-top: 20px;
            color: black;
        }
        form {
            max-width: 600px;
            margin: 30px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="radio"], input[type="submit"] {
            width: auto;
        }
        .select {
            width: 100%;
        }
        .radio-group {
            display: flex;
            gap: 15px;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Welcome to the passport Registration Page</h2>
    <form action="register" method="post">
        <label>Register to Apply at:</label>
        <div class="radio-group">
            <label><input type="radio" name="apply" value="CPV Delhi" required> CPV Delhi</label>
            <label><input type="radio" name="apply" value="PassPort Office" required> Passport Office</label>
        </div>
        <label>Passport Office (As Per Present Residential Address):</label>
        <select name="passportOffice" class="select">
            <option>Ahmedabad</option>
            <option>Amritsar</option>
            <option>Bareilly</option>
            <option>Bhubaneshwar</option>
            <option>Mangalore</option>
            <option>Udupi</option>
            <option>Bengaluru</option>
        </select>
        <label>Given Name:</label>
        <input type="text" name="givenName">
        <label>Surname:</label>
        <input type="text" name="surName">
        <label>Date of Birth:</label>
        <input type="date" name="dob" required>
        <label>Email ID:</label>
        <input type="text" name="email" required>
        <label>Do you want your Login ID to be the same as Email ID?</label>
        <div class="radio-group">
            <label><input type="radio" name="isEmailIdSame" value="Yes" required> Yes</label>
            <label><input type="radio" name="isEmailIdSame" value="No" required> No</label>
        </div>
        <label>Login ID:</label>
        <input type="text" name="loginId" required>
        <label>Password:</label>
        <input type="text" name="password" required>
        <label>Confirm Password:</label>
        <input type="text" name="confirmPassword" required>
        <label>Hint Question:</label>
        <select name="hintQuestion" class="select">
            <option>Birth City</option>
            <option>Favorite Color</option>
            <option>Favorite Food</option>
        </select>
        <label>Hint Answer:</label>
        <input type="text" name="hintAnswer">
        <label>Captcha:</label>
        <input type="text" name="captcha">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
