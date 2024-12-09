<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Amazon Sign-In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 400px;
            margin: 100px auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #131921;
        }
        .input-field {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .btn {
            width: 100%;
            padding: 10px;
            background-color: #ff9900;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #e68900;
        }
        .footer {
            text-align: center;
            margin-top: 20px;
        }
        .footer a {
            color: #007185;
            text-decoration: none;
        }
        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Sign-In</h2>
        <form action="user" method="post">
            <label for="email">Email or mobile phone number:</label><br>
            <input type="email" id="email" name="email" class="input-field" placeholder="Enter email or mobile number" required><br>

            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" class="input-field" placeholder="Enter password" required><br>

            <button type="submit" class="btn">Sign-In</button>
        </form>

        <div class="footer">
            <a href="#">Forgot your password?</a><br>
            <a href="#">Create your Amazon account</a>
        </div>
    </div>

</body>
</html>
