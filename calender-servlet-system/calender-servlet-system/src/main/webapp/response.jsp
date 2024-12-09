<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Form</title>
<style>
body {
background-color: pink;
}

    h1 {
        font-size: 36px;
        font-weight: bold;
        color: black;
        animation: rotate 8s infinite;
    }

    @keyframes rotate {
        0% {
            transform: rotate(0deg);
        }
        25% {
            transform: rotate(90deg);
        }
        50% {
            transform: rotate(180deg);
        }
        75% {
            transform: rotate(270deg);
        }
        100% {
            transform: rotate(360deg);
        }
    }
</style>
</head>
<body>
<h1>Thank you ${ key } for registering!!!</h1>
</body>
</html>

