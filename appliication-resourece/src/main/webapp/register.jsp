<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Information Form</title>
    <style>
        body {
            background-color: teal;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: flex-start;
            height: 100vh;
            overflow: auto;
        }
        .container {
            background: #fff;
            border-radius: 10px;
            padding: 20px 30px;
            margin: 20px;
            width: 100%;
            max-width: 500px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="number"],
        input[type="email"],
        input[type="date"],
        select,
        textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        .gender-options {
            display: flex;
            flex-direction: column;
            margin-bottom: 15px;
        }
        .gender-options input {
            margin-right: 5px;
        }
        textarea {
            resize: none;
        }
        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>User Information Form</h1>
        <form action="login" method="post">
            <label for="fname">First Name:</label>
            <input type="text" id="fname" name="fname" required>

            <label for="lname">Last Name:</label>
            <input type="text" id="lname" name="lname" required>

            <label for="adhar">Aadhaar Number:</label>
            <input type="number" id="adhar" name="adhar" required>

            <label>Gender:</label>
            <div class="gender-options">
                <label><input type="radio" name="gender" value="male" required> Male</label>
                <label><input type="radio" name="gender" value="female" required> Female</label>
                <label><input type="radio" name="gender" value="other" required> Other</label>
            </div>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>

            <label for="phone">Phone Number:</label>
            <input type="number" id="phone" name="phone" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="qualification">Highest Qualification:</label>
            <select id="qualification" name="qualification" required>
                <option value="">Select</option>
                <option value="highschool">High School</option>
                <option value="intermediate">Intermediate</option>
                <option value="bachelor">Bachelor's</option>
                <option value="master">Master's</option>
                <option value="other">Other</option>
            </select>

            <label for="marital">Marital Status:</label>
            <select id="marital" name="marital" required>
                <option value="">Select</option>
                <option value="single">Single</option>
                <option value="married">Married</option>
                <option value="divorced">Divorced</option>
                <option value="widowed">Widowed</option>
            </select>

            <label for="job">Current Job Title:</label>
            <input type="text" id="job" name="job">

            <label for="experience">Years of Experience:</label>
            <input type="number" id="experience" name="experience" min="0">

            <label for="address">Address:</label>
            <textarea id="address" name="address" rows="4" cols="50" required></textarea>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
