<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-image:
                url('https://img.freepik.com/free-vector/futuristic-science-lab-background_23-2148505015.jpg?t=st=1737700499~exp=1737704099~hmac=f354bf7623093cb78bace26fbc112d63ff8ff846a9b140677f3aa541111a9d72&w=996');
            background-size: cover, contain; /* First image covers, second adjusts */
            background-repeat: no-repeat, no-repeat;
            background-attachment: fixed, fixed;
            background-position: top left, bottom right;
            background-color: rgba(0, 0, 0, 0.5); /* Fallback color */
            color: #333;
        }
        .header {
            background-color: darkcyan;
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
            background-color: darkcyan;
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
        .container {
            width: 60%;
            margin: 80px auto 100px auto;
            background-color: rgba(255, 255, 255, 0.9);
            padding: 40px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #333;
            font-size: 28px;
        }
        .form-group {
            margin-bottom: 10px;
            display: flex;
            flex-direction: column;
        }
        .form-group label {
            font-size: 16px;
            font-weight: bold;
            color: #333;
            margin-bottom: 8px;
        }
        .form-group input,
        .form-group select {
            width: 100%;
            padding: 12px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 6px;
            transition: border 0.3s ease-in-out;
        }
        .form-group input:focus,
        .form-group select:focus {
            border-color: #4CAF50;
            outline: none;
        }
        .form-row {
            display: flex;
            justify-content: space-between;
            gap: 40px;
            margin-bottom: 25px;
        }
        .form-row .form-group {
            flex: 1;
        }
        button {
            width: 100%;
            padding: 14px;
            background-color: #4CAF50;
            color: white;
            border: none;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }
        button:hover {
            background-color: #45a049;
        }
        #error-message {
            color: red;
            font-size: 14px;
            margin-top: 10px;
        }
    </style>
</head>
<body>

    <header class="header">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        <nav class="nav-links">
            <a href="signup">Sign Up</a>
            <a href="signin">Sign In</a>
        </nav>
    </header>

    <div class="container">
        <h1>Medi Sales Registration Form</h1>
        <!-- Add your form here -->
    </div>

    <footer class="footer">
        <div>
            <a href="https://wa.me" target="_blank">WhatsApp</a>
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
        </div>
        <div id="current-date-time"></div>
    </footer>

    <script>
        function updateDateTime() {
            const now = new Date();
            document.getElementById("current-date-time").innerText = now.toLocaleString();
        }
        setInterval(updateDateTime, 1000);
    </script>
</body>
</html>
