<!DOCTYPE html>
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

        button:disabled {
            background-color: #ccc;
            color: #666;
            border: 1px solid #ddd;
            cursor: not-allowed;
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
        <h1>Product Details Form</h1>
        <form action="saving" method="post">
            <div class="form-group">
                <label for="product_company">Product Company</label>
                <input type="text" id="product_company" name="productCompany" pattern="[A-Za-z ]+" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="product_name">Product Name</label>
                <input type="text" id="product_name" name="productName"pattern="[A-Za-z0-9 ]+" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="mrp">MRP</label>
                <input type="number" id="mrp" min="1" name="mrp" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="pack">Pack</label>
                <input type="number" id="pack" min="1" name="pack" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="mfg_date">Manufacturing Date</label>
                <input type="date" id="mfg_date" name="mfgDate"required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="expiry_date">Expiry Date</label>
                <input type="date" id="expiry_date" name="expiryDate" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="qty">Quantity</label>
                <input type="number" id="qty" min="1" name="qty" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="rate">Rate</label>
                <input type="number" id="rate" min="1" name="rate" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="discount">Discount</label>
                <input type="number" id="discount" min="0" max="100" name="discount" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="gst">GST</label>
                <input type="number" id="gst" min="0" max="100" name="gst" required>
                <span class="error-message"></span>
            </div>
            <div class="form-group">
                <button type="submit" disabled>Submit</button>
            </div>
        </form>
    </div>

    <!-- Footer -->
    <div class="footer">
        © 2025 Product Management System
    </div>

    <script>
       document.addEventListener("DOMContentLoaded", function () {
               function validateTextField(input, fieldName) {
                   const errorSpan = input.nextElementSibling;
                   errorSpan.textContent = "";
                   const value = input.value.trim();
                   if (value.length > 0 && (value.length < 3 || value.length > 50)) {
                       errorSpan.textContent = `${fieldName} must be between 3 to 50 characters`;
                   }
               }

               function validateNumberField(input, fieldName, min, max) {
                   const errorSpan = input.nextElementSibling;
                   errorSpan.textContent = "";
                   const value = parseFloat(input.value);
                   if (!isNaN(value) && (value < min || value > max)) {
                       errorSpan.textContent = `${fieldName} must be between ${min} and ${max}`;
                   }
               }

               function validateDateField(input, fieldName, compareInput, compareField) {
                   const errorSpan = input.nextElementSibling;
                   errorSpan.textContent = "";
                   if (compareInput) {
                       if (input.value && compareInput.value && input.value < compareInput.value) {
                           errorSpan.textContent = `${fieldName} must be after ${compareField}`;
                       }
                   }
               }

               function checkFormValidity() {
                   const allInputs = document.querySelectorAll('input');
                   const button = document.querySelector('button[type="submit"]');
                   let isValid = true;

                   allInputs.forEach(input => {
                       if (input.nextElementSibling && input.nextElementSibling.classList.contains('error-message') &&
                           input.nextElementSibling.textContent !== "") {
                           isValid = false;
                       }
                   });

                   button.disabled = !isValid;
               }

               function setDefaultIfEmpty(input, defaultValue) {
                   if (input.value.trim() === "") {
                       input.value = defaultValue;
                   }
               }

               const productCompanyInput = document.getElementById("product_company");
               const productNameInput = document.getElementById("product_name");
               const mrpInput = document.getElementById("mrp");
               const packInput = document.getElementById("pack");
               const mfgDateInput = document.getElementById("mfg_date");
               const expiryDateInput = document.getElementById("expiry_date");
               const qtyInput = document.getElementById("qty");
               const rateInput = document.getElementById("rate");
               const discountInput = document.getElementById("discount");
               const gstInput = document.getElementById("gst");

               productCompanyInput.addEventListener("input", function () {
                   validateTextField(productCompanyInput, "Product Company");
                   checkFormValidity();
               });

               productNameInput.addEventListener("input", function () {
                   validateTextField(productNameInput, "Product Name");
                   checkFormValidity();
               });

               mrpInput.addEventListener("input", function () {
                   validateNumberField(mrpInput, "MRP", 1, 100000);
                   checkFormValidity();
               });

               packInput.addEventListener("input", function () {
                   validateNumberField(packInput, "Pack", 1, 100);
                   checkFormValidity();
               });

               expiryDateInput.addEventListener("change", function () {
                   validateDateField(expiryDateInput, "Expiry Date", mfgDateInput, "Manufacturing Date");
                   checkFormValidity();
               });

               qtyInput.addEventListener("input", function () {
                   validateNumberField(qtyInput, "Quantity", 1, 1000);
                   checkFormValidity();
               });

               rateInput.addEventListener("input", function () {
                   validateNumberField(rateInput, "Rate", 1, 10000);
                   checkFormValidity();
               });

               discountInput.addEventListener("input", function () {
                   setDefaultIfEmpty(discountInput, 0);  // Set discount to 0 if empty
                   validateNumberField(discountInput, "Discount", 0, 100);
                   checkFormValidity();
               });

               gstInput.addEventListener("input", function () {
                   setDefaultIfEmpty(gstInput, 0);  // Set GST to 0 if empty
                   validateNumberField(gstInput, "GST", 0, 28);
                   checkFormValidity();
               });
           });

    </script>

</body>
</html>
