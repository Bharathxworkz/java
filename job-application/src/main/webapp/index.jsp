<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Job Application Form</title>
    <style>

        body {
            font-family: Arial, sans-serif;
            background-color:aqua;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }


        .form-container {
            background-color: #ffffff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 6px 10px rgba(0, 0, 0, 0.15);
            width: 400px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
            font-size: 22px;
            color: #333333;
        }


        .container {
            display: flex;
            flex-direction: column;
            gap: 10px;
            margin-top: 20px;
        }


        .container a {
            display: block;
            text-decoration: none;
            font-size: 16px;
            font-weight: bold;
            color: #ffffff;
            background-color: #007BFF;
            padding: 12px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            text-align: center;
        }

        .container a:hover {
            background-color: brown;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Job Application</h2>
        <form action="user" method="post">
            <div class="container">
                <a href="registration.jsp">Registration Form</a>
                <a href="searchById.jsp">Search Applicants by ID</a>
                <a href="getuserbyname.jsp">Search Applicants by Name</a>
                <a href="getAllUsers">View All Applicants</a>
            </div>
        </form>
    </div>
</body>
</html>
