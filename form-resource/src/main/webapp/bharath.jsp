<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Page</title>
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
    <h2>Welcome to the User Registration Page</h2>
    <form action="register" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required>

        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" required>

        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" required>

        <label for="gender">Gender:</label>
        <div class="radio-group">
            <label><input type="radio" name="gender" value="Male" required> Male</label>
            <label><input type="radio" name="gender" value="Female" required> Female</label>
            <label><input type="radio" name="gender" value="Other" required> Other</label>
        </div>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required>

        <label for="city">City:</label>
        <input type="text" id="city" name="city" required>

        <label for="state">State:</label>
        <input type="text" id="state" name="state" required>

        <label for="zipCode">Zip Code:</label>
        <input type="text" id="zipCode" name="zipCode" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>

        <label for="securityQuestion">Security Question:</label>
        <select name="securityQuestion" id="securityQuestion" class="select">
            <option value="Birth City">Birth City</option>
            <option value="Mother's Maiden Name">Mother's Maiden Name</option>
            <option value="First Pet's Name">First Pet's Name</option>
        </select>

        <label for="securityAnswer">Security Answer:</label>
        <input type="text" id="securityAnswer" name="securityAnswer" required>

        <label for="captcha">Captcha:</label>
        <input type="text" id="captcha" name="captcha" required>

        <input type="submit" value="Register">
    </form>
</body>
</html>
