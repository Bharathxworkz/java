<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
      margin: 0;
      padding: 0;
    }

    .container {
      width: 800px;
      margin: 50px auto;
      padding: 20px;
      background-color: white;
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
      font-size: 24px;
      color: #333;
    }

    form {
      display: flex;
      flex-direction: column;
    }

    input[type="text"],
    input[type="email"],
    input[type="number"] {
      padding: 10px;
      margin: 10px 0;
      border: 1px solid #ddd;
      border-radius: 4px;
    }

    input[type="submit"] {
      padding: 12px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>User Information</h2>
    <form action="user" method="post">
      <label for="firstName">First Name</label>
      <input type="text" id="firstName" name="firstName" required><br>

      <label for="lastName">Last Name</label>
      <input type="text" id="lastName" name="lastName" required><br>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" required><br>

      <label for="city">City</label>
      <input type="text" id="city" name="city" required><br>

      <label for="phoneNumber">Phone Number</label>
      <input type="number" id="phoneNumber" name="phoneNumber" required><br>

      <label for="adhaar">Adhaar Number</label>
      <input type="number" id="adhaar" name="adhaar" required><br>

      <label for="age">Age</label>
      <input type="number" id="age" name="age" required><br>

      <input type="submit" value="Submit">
    </form>
  </div>
</body>
</html>
