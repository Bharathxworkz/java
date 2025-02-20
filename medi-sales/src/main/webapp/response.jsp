<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="US-ASCII">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Success</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('https://img.freepik.com/premium-vector/healthcare-medical-science-background-free-vector_480348-52.jpg?w=2000');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-position: center;
            color: #333;
            height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .header {
            background-color: rgba(0, 90, 141, 0.8); /* Dark Blue */
            color: white;
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1000;
        }

        .header img {
            height: 50px;
        }

        .header .nav-links {
            display: flex;
            gap: 20px;
        }

        .header .nav-links a {
            color: white;
            text-decoration: none;
            font-size: 16px;
        }

        .container {
            width: 50%;
            margin: 120px auto 100px auto;
            background-color: rgba(255, 255, 255, 0.95);
            padding: 40px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.2);
            border-radius: 8px;
            text-align: center;
        }

        h2 {
            color: #283593; /* Dark Blue */
            padding: 20px 30px;
            font-size: 24px;
            font-weight: bold;
        }

        .footer {
            background-color: rgba(0, 90, 141, 0.8);
            color: white;
            padding: 15px 20px;
            display: flex;
            justify-content: center;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        .footer a {
            color: white;
            text-decoration: none;
            margin-right: 15px;
            font-size: 14px;
        }

        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="header">
        <div class="logo">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        </div>
        <div class="nav-links">
            <a href="#">Home</a>
            <a href="#">About</a>
            <a href="#">Contact</a>
        </div>
    </div>

    <div class="container">
        <h2>Thank you ${name} for Registering!</h2>
    </div>

    <div class="footer">
        <a href="#">Privacy Policy</a>
        <a href="#">Terms of Service</a>
    </div>

</body>
</html>
