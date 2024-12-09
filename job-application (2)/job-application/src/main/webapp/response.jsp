<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-image: url('fetch.png');
        }
    h2 {
            text-align: center;
            color: white;
        }
        <style>
                    table {
                        width: 50%;
                        border-collapse: collapse;
                        margin: 20px auto;
                        font-family: Arial, sans-serif;
                    }
                    th, td {
                        border: 1px solid #ddd;
                        text-align: center;
                        padding: 8px;
                    }
                    th {
                        background-color: #f4f4f4;
                    }
                     div {
                               margin-top: 500px;
                              text-align: center;
                                    }

                     .styled-button {
                               display: inline-block;
                               text-decoration: none;
                               background-color: #007BFF;
                               color: white;
                               font-size: 14px;
                               font-weight: bold;
                               padding: 10px 20px;
                               border-radius: 5px;
                               border: none;
                               cursor: pointer;
                            }

                     .styled-button:hover {
                              background-color: #0056b3;
                          }
                </style>
    </style>
</head>
<body>
   <br> <h2>Job application successfully sent ${key} confirmation message send to this mail
   ${email}</h2></br>

<div>
   <a href="getAllUsers" class="styled-button">Click here to Get All applicants</a>
</div>
</body>

</html>
