<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Vendor Registration - Marg ERP Cloud</title>
  <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
  <style>
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
          width: auto;
          border-radius: 8px;
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

     .container {
         width: 60%;
         margin: 100px auto 100px auto; /* Top margin prevents content from being hidden under the fixed header */
         background-color: rgba(255, 255, 255, 0.9);
         padding: 40px;
         box-shadow: 0 8px 15px rgba(0, 0, 0, 0.1);
         border-radius: 8px;
     }

     h1 {
         text-align: center;
         margin-bottom: 30px;
         color: #333;
         font-size: 28px;
     }

     .form-group {
         margin-bottom: 15px;
         display: flex;
         flex-direction: column;
         position: relative;
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
         padding-right: 40px;
     }

     .form-group input:focus,
     .form-group select:focus {
         border-color: #4CAF50;
         outline: none;
     }

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

     .form-section {
         background: #fff;
         border-radius: 10px;
         box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
         padding: 20px;
         width: 100%;
         max-width: 700px;
     }

     .form-section h1 {
         text-align: center;
         margin-bottom: 20px;
         color: #333;
     }

     .form-group i {
         color: #007bff;
         font-size: 18px;
         margin-left: 10px;
     }

     .form-section button {
         width: 100%;
         padding: 10px;
         background-color: #007bff;
         color: #fff;
         font-size: 14px;
         border: none;
         border-radius: 5px;
         cursor: pointer;
         transition: background-color 0.3s ease;
     }

     .form-section button:disabled {
         background-color: #b0d5f0;
         cursor: not-allowed;
     }

     .form-section button:hover:not(:disabled) {
         background-color: #0056b3;
     }

     .error-message {
         color: red;
         font-size: 15px;
     }
  </style>
</head>
<body>

  <header class="header">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
    <nav class="nav-links">
      <a href="signin">Sign In</a>
      <a href="index">LogOut</a>
    </nav>
  </header>

  <div class="container">
    <div class="form-section">
      <h1>Vendor Registration</h1>
     <form action="${pageContext.request.contextPath}/addvendoroo" method="post">
        <!-- Vendor Name -->
        <div class="error-message" style="color: red;">${vendorNameError}</div>
        <i class="fas fa-user"></i>
        <div id="vendorNameError" class="error-message"></div>
        <div class="form-group">
          <input type="text" id="vendorName" name="vendorName" value="${dto.vendorName}" placeholder="Vendor Name" required>
        </div>

        <!-- Contact Number -->
        <div class="error-message" style="color: red;">${contactNumberError}</div>
        <i class="fas fa-phone"></i>
        <div id="contactNumberError" class="error-message"></div>
        <div class="form-group">
          <input type="tel" id="contactNumber" name="contactNumber" onblur="checkPhoneNumber()" value="${dto.contactNumber}" placeholder="Contact Number" required>
        </div>

        <!-- Email -->
        <div class="error-message" style="color: red;">${emailError}</div>
        <i class="fas fa-envelope"></i>
        <div id="emailError" class="error-message"></div>
        <div class="form-group">
          <input type="email" id="email" name="email" onblur="checkEmail()" value="${dto.email}" placeholder="Email" required>
        </div>

        <!-- GSTIN Number -->
        <div class="error-message" style="color: red;">${gstinError}</div>
        <i class="fas fa-id-card"></i>
        <div id="gstinError" class="error-message"></div>
        <div class="form-group">
          <input type="text" id="gstin" name="gstin" value="${dto.gstin}" placeholder="GSTIN Number" required>
        </div>

        <!-- Address -->
        <div class="error-message" style="color: red;">${addressError}</div>
        <i class="fas fa-map-marker-alt"></i>
        <div id="addressError" class="error-message"></div>
        <div class="form-group">
          <textarea id="address" name="address" placeholder="Address" required>${dto.address}</textarea>
        </div>
          <input type="hidden" id="distributorid" name="medisalesId" value="${add}" >
        <button id="registerButton" type="submit" disabled>Register</button>
      </form>
    </div>
  </div>

  <footer class="footer">
    <div>
      <a href="https://wa.me" target="_blank">WhatsApp</a>
      <a href="https://linkedin.com" target="_blank">LinkedIn</a>
    </div>
  </footer>

  <script>
    let validationStatus = {
      vendorName: false,
      contactNumber: false,
      email: false,
      gstin: false,
      address: false
    };

    document.getElementById("vendorName").addEventListener("blur", validateVendorName);
    document.getElementById("contactNumber").addEventListener("blur", validateContactNumber);
    document.getElementById("email").addEventListener("blur", validateEmail);
    document.getElementById("gstin").addEventListener("blur", validateGSTIN);
    document.getElementById("address").addEventListener("blur", validateAddress);

    function validateVendorName() {
      const value = document.getElementById("vendorName").value;
      if (!value || value.length < 3 || value.length > 50) {
        document.getElementById("vendorNameError").innerText = "Vendor Name should be between 3 and 50 characters.";
        validationStatus.vendorName = false;
      } else {
        document.getElementById("vendorNameError").innerText = "";
        validationStatus.vendorName = true;
      }
      toggleRegisterButton();
    }

    function validateContactNumber() {
      const value = document.getElementById("contactNumber").value;
      if (!value || value.length !== 10 || !/^\d+$/.test(value)) {
        document.getElementById("contactNumberError").innerText = "Contact Number should be 10 digits.";
        validationStatus.contactNumber = false;
      } else {
        document.getElementById("contactNumberError").innerText = "";
        validationStatus.contactNumber = true;
      }
      toggleRegisterButton();
    }

    function validateEmail() {
      const value = document.getElementById("email").value;
      const regex = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/;
      if (!regex.test(value)) {
        document.getElementById("emailError").innerText = "Please enter a valid email address.";
        validationStatus.email = false;
      } else {
        document.getElementById("emailError").innerText = "";
        validationStatus.email = true;
      }
      toggleRegisterButton();
    }

    function validateGSTIN() {
      const value = document.getElementById("gstin").value;
      const regex = /^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$/;
      if (!regex.test(value)) {
        document.getElementById("gstinError").innerText = "Please enter a valid GSTIN number.";
        validationStatus.gstin = false;
      } else {
        document.getElementById("gstinError").innerText = "";
        validationStatus.gstin = true;
      }
      toggleRegisterButton();
    }

    function validateAddress() {
      const value = document.getElementById("address").value;
      if (!value || value.trim().length < 10) {
        document.getElementById("addressError").innerText = "Address must be at least 10 characters long.";
        validationStatus.address = false;
      } else {
        document.getElementById("addressError").innerText = "";
        validationStatus.address = true;
      }
      toggleRegisterButton();
    }

    function toggleRegisterButton() {
      const isValid = Object.values(validationStatus).every(status => status === true);
      document.getElementById("registerButton").disabled = !isValid;
    }

    function validateForm() {
      const isValid = Object.values(validationStatus).every(status => status === true);
      return isValid; // prevent form submission if not valid
    }
  </script>
</body>
</html>