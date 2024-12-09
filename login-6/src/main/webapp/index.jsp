<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>10 Forms</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            margin-bottom: 40px;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 8px;
        }
        h2 {
            margin-bottom: 15px;
        }
        input, select, textarea, button {
            margin-top: 10px;
            display: block;
            width: 100%;
            max-width: 300px;
            padding: 10px;
            font-size: 14px;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

    <h2>Contact Form</h2>
    <form action="user" method="get">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Your full name">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Your email">
        <label for="message">Message:</label>
        <textarea id="message" name="message" placeholder="Your message"></textarea>
        <button type="submit">Submit</button>
    </form>


</body>
</html>
