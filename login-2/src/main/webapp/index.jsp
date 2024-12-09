<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form 2</title>
</head>
<body>
    <h2>Login</h2>
    <form action="user" method="post">
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>
        <input type="checkbox" id="rememberMe" name="rememberMe">
        <label for="rememberMe">Remember me</label><br><br>
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>
