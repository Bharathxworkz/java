<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
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
        .circle-image{
                     border-radius :50%;
                     width:35px;
                     height:35px;
         }

    </style>
</head>
<body>
    <!-- Header Section -->
    <header class="header">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
            <nav class="nav-links">
                <img height="35px" width="35px" src="view/${dto.getFileName()}" class="circle-image">
                <h2>Hello ${ fName } </h2>
                <a href="update?id=${dto.getId()}">Update Profile</a>
                <a href="viewprofile">View Profile</a>
            </nav>
        </header>


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