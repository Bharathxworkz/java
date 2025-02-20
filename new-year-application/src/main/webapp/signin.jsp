<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <style>
        /* General Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
        }

        .header {
                    background-color: #4CAF50;
                    color: white;
                    padding: 10px 20px;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
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
                .footer {
                    background-color: #4CAF50;
                    color: white;
                    padding: 10px 20px;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                    position: fixed;
                    bottom: 0;
                    width: 100%;
                }
                .footer a {
                    color: white;
                    text-decoration: none;
                    margin-right: 10px;
                }
        /* Main Content */
        main {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 30px;
        }

        .form-container {
            background: white;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }

        .form-container h2 {
            margin-bottom: 20px;
            color: #343a40;
        }

        .form-container input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ced4da;
            border-radius: 5px;
            font-size: 14px;
        }

        .form-container input:focus {
            border-color: #007bff;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }

        .form-container button {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .form-container button:hover {
            background-color: #0056b3;
        }

        .form-container a {
            display: block;
            margin-top: 10px;
            font-size: 14px;
            color: #007bff;
            text-decoration: none;
            transition: color 0.3s;
        }

        .form-container a:hover {
            color: #0056b3;
            text-decoration: underline;
        }



        /* Right-side Date and Time */
        .time-container {
            position: fixed;
            top: 10px;
            right: 10px;
            color: white;
            font-size: 16px;
            background-color: rgba(0, 0, 0, 0.5);
            padding: 10px;
            border-radius: 5px;
        }

        /* Centered Container for Sign In Form */
        .container {
            width: 100%;
            max-width: 400px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        .form {
            display: flex;
            flex-direction: column;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        input[type="email"],
        input[type="password"] {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="email"]:focus,
        input[type="password"]:focus {
            border-color: #4caf50;
            outline: none;
        }

        button[type="submit"] {
            padding: 10px;
            background-color: #4caf50;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }

        button[type="submit"]:hover {
            background-color: #45a049;
        }

        .forgot-password {
            text-align: center;
            margin-top: 10px;
        }

        .forgot-password a {
            color: #4caf50;
            text-decoration: none;
        }

        .forgot-password a:hover {
            text-decoration: underline;
        }

        .back-link {
            text-align: center;
            margin-top: 15px;
        }

        .back-link a {
            color: #333;
            text-decoration: none;
        }

        .back-link a:hover {
            text-decoration: underline;
        }

    </style>
</head>
<body>
    <!-- Header Section -->
    <header class="header">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
            <nav class="nav-links">

                <a href="SignUp">Sign Up</a>
                <a href="raksha">Log out</a>
            </nav>
        </header>

    <!-- Main Content -->
    <main>
        <div class="container">
        <h3 class="form-row" style="color: red; text-align: center;">${notfound}</h3>
            <form action="login" method="POST" class="form">
                <h2>Sign In</h2>

                <!-- Email Field -->
                <label for="email">Email</label>
                <input type="email" id="email" name="email" value="${dto.getEmail()}" required placeholder="Enter your email">

                <!-- Password Field -->
                <label for="password">Password</label>
                <input type="password" id="password" name="password" value="${dto.getPassword()}" required placeholder="Enter your password">

                <!-- Sign In Button -->
                <button type="submit">Sign In</button>

                <!-- Forgot Password Link -->
                <div class="forgot-password">
                    <a href="otp">Forgot Password</a>
                </div>

                <!-- Back Button -->
                <div class="back-link">
                    <a href="raksha">Back</a>
                </div>
            </form>
        </div>
    </main>



    <!-- Footer Section with Social Media Links -->
    <footer class="footer">
            <div>
                <a href="https://wa.me" target="_blank">WhatsApp</a>
                <a href="https://linkedin.com" target="_blank">LinkedIn</a>
            </div>
            <div id="current-date-time"></div>
        </footer>

    <script>
        // Function to update current date and time
        function updateDateTime() {
            const now = new Date();
            const dateTime = now.toLocaleString(); // Format the date and time
            document.getElementById('time-date').innerHTML = Date & Time: ${dateTime};
            document.getElementById('datetime').innerHTML = Date & Time: ${dateTime};
        }

        function updateDateTime() {
                    const now = new Date();
                    document.getElementById("current-date-time").innerText = now.toLocaleString();
                }

                setInterval(updateDateTime, 1000);
    </script>
</body>
</html>