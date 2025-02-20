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

     .form-row {
         display: flex;
         justify-content: space-between;
         gap: 40px;
         margin-bottom: 25px;
     }

     .form-row .form-group {
         flex: 1;
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

     .form-group {
         display: flex;
         flex-direction: column;
         align-items: flex-start;
         margin-bottom: 15px;
         border: 1px solid #ccc;
         border-radius: 5px;
         padding: 8px;
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

     .signin-link {
         text-align: center;
         margin-top: 10px;
         font-size: 14px;
     }

     .signin-link a {
         color: #007bff;
         text-decoration: none;
     }

     .signin-link a:hover {
         text-decoration: underline;
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
      <h1>Sign Up</h1>
      <form action="save" method="post" onsubmit="return validateForm()">
        <div class="error-message" style="color: red;">${companyNameError}</div>

        <i class="fas fa-building"></i>
        <div id="companyNameError" class="error-message"></div>
        <div class="form-group">

          <input type="text" id="companyName" name="companyName" value="${dto.companyName}" placeholder="Company Name" required>
        </div>

        <div class="error-message" style="color: red;">${contactPersonError}</div>

         <i class="fas fa-id-card"></i>
         <div id="contactPersonError" class="error-message"></div>
        <div class="form-group">

          <input type="text" id="contactPerson" name="contactPerson" value="${dto.contactPerson}" placeholder="Contact Person" required>
        </div>

        <div class="error-message" style="color: red;">${businessTypeError}</div>

        <i class="fas fa-briefcase"></i>
        <div id="businessTypeError" class="error-message"></div>
        <div class="form-group">

          <select id="businessType" name="businessType" required>
            <option value="dto.getBusinessType()">Select Business Type...</option>
            <option value="retail">Retail</option>
            <option value="wholesale">Wholesale</option>
          </select>
        </div>

        <span id="contactAjaxError" style="color: red;"></span>
        <div class="error-message" style="color: red;">${mobilePersonError}</div>

        <i class="fas fa-phone"></i>
        <div id="mobileError" class="error-message"></div>
        <div class="form-group">

          <input type="tel" id="mobile" name="mobile" onblur="checkPhoneNumber()" value="${dto.mobile}" placeholder="Registered Mobile" required>
        </div>

        <span id="emailAjaxError" style="color: red;"></span>
        <div class="error-message" "color:red;">${emailError}</div>

                  <i class="fas fa-envelope"></i>
        <div id="emailError" class="error-message"></div>
        <div class="form-group">
          <input type="email" id="email" name="email" onblur="checkEmail()" value="${dto.email}" placeholder="Registered Email" required>
        </div>

        <div class="error-message" style="color: red; ">${address1Error}</div>

         <i class="fas fa-map-marker-alt"></i>
         <div id="address1Error" class="error-message"></div>

        <div class="form-group">
          <input type="text" id="address1" name="address1" value="${dto.address1}" placeholder="Address 1" required>
        </div>

        <div class="error-message" style="color: red;">${address2Error}</div>

        <i class="fas fa-map-marker-alt"></i>
        <div id="address2Error" class="error-message"></div>
        <div class="form-group">

          <input type="text" id="address2" name="address2" value="${dto.address2}" placeholder="Address 2">
        </div>

        <div class="error-message" style="color: red; text-align: center;">${pincodeError}</div>

        <i class="fas fa-map-pin"></i>
        <div id="pincodeError" class="error-message"></div>
        <div class="form-group">

          <input type="text" id="pincode" name="pincode" value="${dto.pincode}" placeholder="Pincode" required>
        </div>

        <div class="error-message" style="color: red; text-align: center;">${referralError}</div>

         <i class="fas fa-gift"></i>
         <div id="referralError" class="error-message"></div>
        <div class="form-group">

          <input type="text" id="referral" name="referral" value="${dto.referral}" placeholder="Referral (Optional)">
        </div>

        <div class="error-message" style="color: red;">${passwordError}</div>

        <i class="fas fa-lock"></i>
        <div id="passwordError" class="error-message"></div>
        <div class="form-group">

          <input type="password" id="password" name="password" placeholder="Password" required>
        </div>

        <div class="error-message" style="color: red;">${confirmPasswordError}</div>

         <i class="fas fa-lock"></i>
         <div id="confirmPasswordError" class="error-message"></div>
        <div class="form-group">

          <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Confirm Password" required>
        </div>

        <button id="signupButton" type="submit" disabled>Sign Up</button>
      </form>

      <div class="signin-link">
        Already have an account? <a href="signin">Sign In</a>
      </div>
    </div>
  </div>

  <footer class="footer">
    <div>
      <a href="https://wa.me" target="_blank">WhatsApp</a>
      <a href="https://linkedin.com" target="_blank">LinkedIn</a>
    </div>

  </footer>

  <script>

  const checkEmail=async()=> {
                 const email=document.getElementById("email").value
                 console.log(email)
                 const response=await axios("http://localhost:8080/medi-sales/api/checkEmail/"+email)
                 if(response.data==="Email Exist"){
                 document.getElementById("emailAjaxError").innerHTML=response.data
                     }else{
                     document.getElementById("emailAjaxError").innerHTML=""

                     }
                     }

                const checkPhoneNumber=async()=> {
                  const mobile=document.getElementById("mobile").value
                            console.log(mobile)
                            const response=await axios("http://localhost:8080/medi-sales/api/checkPhoneNumber/"+mobile)
                            if(response.data==="PhoneNumber Exist"){
                            document.getElementById("contactAjaxError").innerHTML=response.data
                                }else{
                                document.getElementById("contactAjaxError").innerHTML=""

                                }
                                }
    let validationStatus = {
      companyName: false,
      contactPerson: false,
      businessType: false,
      mobile: false,
      email: false,
      address1: false,
      address2: true, // optional field so true by default
      pincode: false,
      password: false,
      confirmPassword: false
    };

    document.getElementById("companyName").addEventListener("blur", validateCompanyName);
    document.getElementById("contactPerson").addEventListener("blur", validateContactPerson);
    document.getElementById("businessType").addEventListener("change", validateBusinessType);
    document.getElementById("mobile").addEventListener("blur", validateMobile);
    document.getElementById("email").addEventListener("blur", validateEmail);
    document.getElementById("address1").addEventListener("blur", validateAddress1);
    document.getElementById("address2").addEventListener("blur", validateAddress2);
    document.getElementById("pincode").addEventListener("blur", validatePincode);
    document.getElementById("referral").addEventListener("blur", validateReferral);
    document.getElementById("password").addEventListener("blur", validatePassword);
    document.getElementById("confirmPassword").addEventListener("blur", validateConfirmPassword);

    function validateCompanyName() {
      const value = document.getElementById("companyName").value;
      if (!value || value.length < 3 || value.length > 20) {
           document.getElementById("companyNameError").innerText = "Company Name should be between 3 and 20 characters.";
           validationStatus.companyName = false;
      } else {
        document.getElementById("companyNameError").innerText = "";
        validationStatus.companyName = true;
      }
      toggleSignupButton();
    }

    function validateContactPerson() {
      const value = document.getElementById("contactPerson").value;
      if (!value || value.trim().length < 3) {
        document.getElementById("contactPersonError").innerText = "Contact Person must be at least 3 characters long.";
        validationStatus.contactPerson = false;
      } else {
        document.getElementById("contactPersonError").innerText = "";
        validationStatus.contactPerson = true;
      }
      toggleSignupButton();
    }


    function validateBusinessType() {
      const value = document.getElementById("businessType").value;
      if (!value) {
        document.getElementById("businessTypeError").innerText = "Please select a business type.";
        validationStatus.businessType = false;
      } else {
        document.getElementById("businessTypeError").innerText = "";
        validationStatus.businessType = true;
      }
      toggleSignupButton();
    }

    function validateMobile() {
      const value = document.getElementById("mobile").value;
      if (!value || value.length !== 10 || !/^\d+$/.test(value)) {
        document.getElementById("mobileError").innerText = "Mobile number should be 10 digits.";
        validationStatus.mobile = false;
      } else {
        document.getElementById("mobileError").innerText = "";
        validationStatus.mobile = true;
      }
      toggleSignupButton();
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
      toggleSignupButton();
    }

    document.getElementById("address1").addEventListener("blur", validateAddress1);
    document.getElementById("address2").addEventListener("blur", validateAddress2);


    function validateAddress1() {
          const value = document.getElementById("address1").value;
          if (value.trim() && value.length < 3) {  // If value is entered and less than 3 characters
            document.getElementById("address1Error").innerText = "Address 1 must be at least 3 characters long.";
            validationStatus.address1 = false;
          } else {
            document.getElementById("address1Error").innerText = "";
            validationStatus.address1 = true;
          }
          toggleSignupButton();
        }

    function validateAddress2() {
      const value = document.getElementById("address2").value;
      if (value.trim() && value.length < 3) {  // If value is entered and less than 3 characters
        document.getElementById("address2Error").innerText = "Address 2 must be at least 3 characters long.";
        validationStatus.address2 = false;
      } else {
        document.getElementById("address2Error").innerText = "";
        validationStatus.address2 = true;
      }
      toggleSignupButton();
    }

    function validatePincode() {
      const value = document.getElementById("pincode").value;
      if (!value || value.length !== 6 || !/^\d+$/.test(value)) {
        document.getElementById("pincodeError").innerText = "Pincode should be 6 digits.";
        validationStatus.pincode = false;
      } else {
        document.getElementById("pincodeError").innerText = "";
        validationStatus.pincode = true;
      }
      toggleSignupButton();
    }

    function validateReferral() {
      validationStatus.referral = true; // Referral is optional.
      toggleSignupButton();
    }

    function validatePassword() {
      const value = document.getElementById("password").value;
      if (value.length < 6) {
        document.getElementById("passwordError").innerText = "Password should be at least 6 characters.";
        validationStatus.password = false;
      } else {
        document.getElementById("passwordError").innerText = "";
        validationStatus.password = true;
      }
      toggleSignupButton();
    }

    function validateConfirmPassword() {
      const password = document.getElementById("password").value;
      const confirmPassword = document.getElementById("confirmPassword").value;
      if (confirmPassword !== password) {
        document.getElementById("confirmPasswordError").innerText = "Passwords do not match.";
        validationStatus.confirmPassword = false;
      } else {
        document.getElementById("confirmPasswordError").innerText = "";
        validationStatus.confirmPassword = true;
      }
      toggleSignupButton();
    }

    function toggleSignupButton() {
      const isValid = Object.values(validationStatus).every(status => status === true);
      document.getElementById("signupButton").disabled = !isValid;
    }

    function validateForm() {
      const isValid = Object.values(validationStatus).every(status => status === true);
      return isValid; // prevent form submission if not valid
    }


  </script>
</body>
</html>