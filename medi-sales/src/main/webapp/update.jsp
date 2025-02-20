<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sign Up - Marg ERP Cloud</title>
  <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
  <style>
     body {
         font-family: 'Arial', sans-serif;
         margin: 0;
         padding: 0;
         background-image: url('https://img.freepik.com/premium-vector/healthcare-medical-science-background-free-vector_480348-52.jpg?w=2000');
         background-size: cover;
         background-repeat: no-repeat;
         background-attachment: fixed;
         background-color: rgba(0, 0, 0, 0.5);
         color: #333;
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
         border-radius: 8px;
     }

     .nav-links a {
         color: white;
         text-decoration: none;
         font-size: 16px;
         margin-right: 20px;
     }

     .container {
         width: 60%;
         margin: 100px auto;
         background-color: rgba(255, 255, 255, 0.9);
         padding: 40px;
         box-shadow: 0 8px 15px rgba(0, 0, 0, 0.1);
         border-radius: 8px;
     }

     .form-group {
         margin-bottom: 15px;
     }

     .form-group label {
         font-size: 16px;
         font-weight: bold;
         color: #333;
         margin-bottom: 8px;
         display: block;
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

     .error-message {
         color: red;
         font-size: 15px;
     }

     .footer {
         background-color: darkcyan;
         color: white;
         padding: 10px 20px;
         position: fixed;
         bottom: 0;
         width: 100%;
         text-align: center;
     }
  </style>
</head>
<body>

  <header class="header">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
    <nav class="nav-links">
      <a href="signin">Sign In</a>
      <a href="index">Log Out</a>
    </nav>
  </header>

  <div class="container">
    <h1>Sign Up</h1>

    <form action="profu" method="post" enctype="multipart/form-data">
      <div class="form-group">
        <input type="number" id="id" name="id" value="${dto.id}" placeholder="Registered Mobile" required>
      </div>

      <div class="error-message">${companyNameError}</div>
      <div class="form-group">
        <input type="text" id="companyName" name="companyName" value="${dto.companyName}" placeholder="Company Name" required>
      </div>

      <div class="error-message">${contactPersonError}</div>
      <div class="form-group">
        <input type="text" id="contactPerson" name="contactPerson" value="${dto.contactPerson}" placeholder="Contact Person" required>
      </div>

      <div class="error-message">${businessTypeError}</div>
      <div class="form-group">
        <select id="businessType" name="businessType" required>
          <option value="${dto.businessType}" selected>${dto.businessType != null ? dto.businessType : "Select Business Type..."}</option>
          <option value="retail">Retail</option>
          <option value="wholesale">Wholesale</option>
        </select>
      </div>

      <div class="error-message">${mobilePersonError}</div>
      <div class="form-group">
        <input type="tel" id="mobile" name="mobile" onblur="checkPhoneNumber()" value="${dto.mobile}" placeholder="Registered Mobile" required>
      </div>

      <div class="error-message">${emailError}</div>
      <div class="form-group">
        <input type="email" id="email" name="email" onblur="checkEmail()" value="${dto.email}" placeholder="Registered Email" required>
      </div>

      <div class="error-message">${address1Error}</div>
      <div class="form-group">
        <input type="text" id="address1" name="address1" value="${dto.address1}" placeholder="Address 1" required>
      </div>

      <div class="form-group">
        <label for="choosefile">Choose File:</label>
        <input type="file" name="file" id="choosefile">
      </div>

      <button id="signupButton" type="submit">Update</button>
    </form>
  </div>

  <footer class="footer">
    <a href="https://wa.me" target="_blank">WhatsApp</a>
    <a href="https://linkedin.com" target="_blank">LinkedIn</a>
  </footer>

  <script>
    const checkEmail = async () => {
      const email = document.getElementById("email").value;
      if (!email) return;
      try {
        const response = await axios.get(`http://localhost:8080/medi-sales/api/checkEmail/${email}`);
        document.getElementById("emailAjaxError").innerText = response.data === "Email Exist" ? response.data : "";
      } catch (error) {
        console.error("Error checking email", error);
      }
    };

    const checkPhoneNumber = async () => {
      const mobile = document.getElementById("mobile").value;
      if (!mobile) return;
      try {
        const response = await axios.get(`http://localhost:8080/medi-sales/api/checkPhoneNumber/${mobile}`);
        document.getElementById("contactAjaxError").innerText = response.data === "PhoneNumber Exist" ? response.data : "";
      } catch (error) {
        console.error("Error checking phone number", error);
      }
    };
  </script>

</body>
</html>
