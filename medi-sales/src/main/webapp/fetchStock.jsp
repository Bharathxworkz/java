
<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>
    <style>
        /* Basic Styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('https://img.freepik.com/premium-vector/healthcare-medical-science-background-free-vector_480348-52.jpg?w=2000');
            background-size: cover, contain;
            background-repeat: no-repeat, no-repeat;
            background-attachment: fixed, fixed;
            background-position: top left, bottom right;
            background-color: rgba(0, 0, 0, 0.5);
            color: #333;
            overflow-y: auto;
            height: 100vh;
        }

        /* Header */
        .header {
           background-color: darkcyan;
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

        /* Main Content */
        .container {
            width: 60%;
            margin: 100px auto 100px auto; /* Top margin prevents content from being hidden under the fixed header */
            background-color: rgba(255, 255, 255, 0.9);
            padding: 40px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #333;
            font-size: 28px;
        }

        /* Form Layout */
        .form-group {
            display: flex;
            flex-direction: column;
            margin-bottom: 15px;
        }

        .form-group label {
            font-size: 16px;
            font-weight: bold;
            color: #333;
            margin-bottom: 8px;
        }

        .form-group input,
        .form-group select {
            width: 100%;
            padding: 12px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 6px;
            transition: border 0.3s ease-in-out;
        }

        .form-group input:focus,
        .form-group select:focus {
            border-color: #4CAF50;
            outline: none;
        }

        /* Submit Button */
        .form-group button {
            width: 100%;
            padding: 10px;
            background-color: #283593;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .form-group button:hover {
            background-color: #1c276f;
        }

        /* Footer */
        .footer {
            background-color: darkcyan;
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

        .footer a:hover {
            text-decoration: underline;
        }

        /* Error Message */
        .error-message {
            color: red;
            font-size: 15px;
        }

    </style>
</head>
<body>

    <!-- Header -->
    <div class="header">
        <div class="header-left">Product Management</div>
        <div class="nav-links">
            <a href="#">Home</a>
            <a href="#">About Us</a>
            <a href="#">Logout</a>
        </div>
    </div>

    <!-- Main Content -->
    <div class="container">
        <h1>Upadate Stock</h1>
        <form action="updateStock" method="post">
                <input type="hidden" name="id" value="${stock.getId()}">
          <h1>${updateInfo}</h1>
            <div class="form-group">
                <label for="product_company">Product Company</label>
                <input type="text" id="product_company" name="productCompany" value=${stock.getProductCompany()}>
            </div>
            <div class="form-group">
                            <label for="product_name">Product Name</label>
                            <input type="text" id="product_name" name="productName" value=${stock.getProductName()} >
            </div>

            <div class="form-group">
                <label for="mrp">MRP</label>
                <input type="number" id="mrp" name="mrp" value=${stock.getMrp()} required>
            </div>
            <div class="form-group">
                <label for="pack">Pack</label>
                <input type="number" id="pack" name="pack" value=${stock.getPack()}  required>
            </div>

            <div class="form-group">
                <label for="mfg_date">Manufacturing Date</label>
                <input type="date" id="mfg_date" name="mfgDate" value=${stock.getMfgDate()} required>
            </div>
            <div class="form-group">
                <label for="expiry_date">Expiry Date</label>
                <input type="date" id="expiry_date" name="expiryDate" value=${stock.getExpiryDate()}  required>
            </div>
            <div class="form-group">
                <label for="qty">Quantity</label>
                <input type="number" id="qty" name="qty" value=${stock.getQty()}  required>
            </div>
            <div class="form-group">
                <label for="rate">Rate</label>
                <input type="number" id="rate" name="rate" value=${stock.getRate()} required>
            </div>
            <div class="form-group">
                <label for="discount">Discount</label>
                <input type="number" id="discount" name="discount" value=${stock.getDiscount()} required>
            </div>
            <div class="form-group">
                            <label for="gst">GST</label>
                            <input type="number" id="gst" name="gst" value=${stock.getGst()} required>
                        </div>
            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>

    <!-- Footer -->
    <div class="footer">
        © 2025 Product Management System
    </div>

</body>
</html>
