<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User App</title>
    <style>
        body {
            background-image: url('https://png.pngtree.com/thumb_back/fh260/background/20230519/pngtree-landscape-jpg-wallpapers-free-download-image_2573540.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: 90px 150px%;
            font-family: Arial, sans-serif;
            color: white;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 10px 0;
        }
        header h2 {
            margin: 0;
            color: white;
        }
        nav {
            margin-top: 10px;
        }
        nav a {
            margin-right: 20px;
            text-decoration: none;
            color: white;
            font-size: 16px;
        }
        nav a:hover {
            color: #007BFF;
        }
        form {
            display: inline;
            margin-left: 20px;
        }
        form input {
            padding: 5px;
        }
        form button {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
        }
        form button:hover {
            background-color: #45a049;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 18px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        a:hover {
            background-color: #0056b3;
        }
        main {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <header>
        <h2>User App</h2>
        <nav>
            <a href="User.jsp" target="_blank">Register</a>
            <a href="getAlluser">getAlluser</a>

                <button type="submit">Search</button>
        </nav>
    </header>
</body>
</html>
