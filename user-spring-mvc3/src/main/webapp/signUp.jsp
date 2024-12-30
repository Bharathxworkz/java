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
      <label for="productName">Product Name</label>
      <input type="text" id="productName" name="productName" required><br>

      <label for="productCatagory">Proct catagory</label>
      <input type="text" id="productCatagory" name="productCatagory" required><br>



      <label for="productColor">product Color</label>
      <input type="text" id="productColor" name="productColor" required><br>

      <label for="productPrice">Product Price</label>
      <input type="number" id="productPrice" name="productPrice" required><br>





      <input type="submit" value="Submit">
    </form>
  </div>
</body>
</html>
