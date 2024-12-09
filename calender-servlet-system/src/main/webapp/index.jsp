<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<html>
<head>
    <style>
       body {
           font-family: Arial, sans-serif;
           margin: 0;
           padding: 0;
           background-size: 100% 100%; /* Stretches the image to cover the entire viewport */
           background-repeat: no-repeat; /* Prevents the image from repeating */
           background-attachment: fixed; /* Keeps the background fixed during scrolling */
           background-position: center; /* Centers the image alignment */
       }



        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #333;
            padding: 10px 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .navbar ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        .navbar li {
            margin: 0;
        }

        .navbar a {
            display: block;
            color: white;
            text-decoration: none;
            padding: 10px 15px;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        .navbar a:hover {
            background-color: #575757;
        }

        .navbar .active {
            background-color: #04AA6D;
        }

        .content {
            display: flex;
            justify-content: center;
            align-items: center;
            height: calc(100vh - 60px);
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <ul>
            <li><a href="signup.jsp">Sign Up</a></li>
            <li><a href="getUser.jsp">Get User By ID</a></li>
            <li><a href="getUserByName.jsp">Get User By Name</a></li>
            <li><a href="getalluserslist">Get All Users</a></li>
        </ul>
    </div>

    <div class="content">
        <h1>Welcome to the callendar event registration</h1>


    </div>
</body>
</html>
