<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <!-- Bootstrap CSS -->
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
    #submitBtn {
                background-color: gray;
                color: white;
                border: none;
                padding: 10px 20px;
                cursor: not-allowed;
            }
            #submitBtn.enabled {
                background-color: green;
                cursor: pointer;
            }
            </style>
</head>
<body>
    <!-- Header Section -->
    <header class="bg-light shadow-sm">
        <div class="container d-flex justify-content-between align-items-center py-3">
            <div class="d-flex align-items-center">
                <img src="data:image/png;base64,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" alt="Logo" style="height: 50px;">
                <a href="home.html" class="btn btn-link fs-4 ms-3">Home</a>
            </div>
            <nav>
                <a href="signin" class="btn btn-primary">
                    <i class="bi bi-person"></i> Sign In
                </a>
            </nav>
        </div>
    </header>

   <div class="container mt-5">
        <div>
                                          <h5 class="text-center" style=" color: red;">${saveError}</h5>
                                           <div>
           <h2 class="text-center mb-4">Registration Form</h2>
           <div class="row justify-content-center">
               <div class="col-md-8">
                   <form id="registrationForm" action="user" method="post">
                   <div>
                                      <h5 class="text-center" style="font-size: 12px; color: red;">${fname}</h5>
                                       <div>
                       <div class="mb-3">
                           <label for="firstName" class="form-label">First Name</label>
                           <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter your first name" required value= ${dto.getFirstName()} >
                       </div>
                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${lname}</h5>
                       <div>
                       <div class="mb-3">
                           <label for="lastName" class="form-label">Last Name</label>
                           <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter your last name" value= ${dto.LastName()}>
                       </div>
                       <div>
                                          <h5 class="text-center" style="font-size: 12px; color: red;">${emailError}</h5>
                                          <span id="emailAjaxError" style="font-size: 12px; color: red;"></span><br>
                                           <div>
                       <div class="mb-3">
                           <label for="email" class="form-label">Email</label>
                           <input type="email" class="form-control" id="email" name="email" onblur="checkEmail()" placeholder="Enter your email"  required value= ${dto.Email()}>
                       </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${altEmailError}</h5>
                       <div>
                                           <div class="mb-3">
                                               <label for="alternateEmail" class="form-label">Alternate Email</label>
                                               <input type="email" class="form-control" id="alternateEmail"name="alternateEmail" placeholder="Enter your alternate email" value= ${dto.getAlternateEmail()} >
                                           </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${contactError}</h5>
                                                                <span id="contactAjaxError" style="font-size: 12px; color: red;"></span><br>

                       <div>
                                           <div class="mb-3">
                                               <label for="contact" class="form-label">Contact Number</label>
                                               <input type="tel" class="form-control" id="contact" name="contact"  onblur="checkPhNo" placeholder="Enter your contact number" required value= ${dto.getContact()}>
                                           </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${altContactError}</h5>
                       <div>
                                           <div class="mb-3">
                                               <label for="alternateContact" class="form-label">Alternate Contact Number</label>
                                               <input type="tel" class="form-control" id="alternateContact" name="alternateContact"  placeholder="Enter your alternate contact number" value= ${dto.getAlternateContact()}>
                                           </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${dobError}</h5>
                       <div>
                                           <div class="mb-3">
                                               <label for="dateOdBirth" class="form-label">Date of Birth</label>
                                               <input type="date" class="form-control" id="dateOdBirth"  name="dateOdBirth" value= ${dto.getDateOdBirth()}>
                                           </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${placeError}</h5>
                       <div>
                                           <div class="mb-3">
                                               <label for="place" class="form-label">Place</label>
                                               <input type="text" class="form-control" id="place" name="place"  placeholder="Enter your place" value= ${dto.getPlace()}>
                                           </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${stateError}</h5>
                       <div>
                       <div class="mb-3">
                           <label for="state" class="form-label">State</label>
                           <select class="form-control" id="state" name="state" value= ${dto.getState()}>
                               <option value="">Select State</option>
                               <option value="Karnataka">Karnataka</option>
                               <option value="Maharashtra">Maharashtra</option>
                               <option value="Kerala">Kerala</option>
                           </select>
                       </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${districtError}</h5>
                       <div>
                       <div class="mb-3">
                           <label for="district" class="form-label">District</label>
                           <select class="form-control" id="district" name="district" value= ${dto.District()}>
                               <option value="">Select District</option>
                           </select>
                       </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${passwordError}</h5>
                       <div>
                       <div class="mb-3">
                           <label for="password" class="form-label">Password</label>
                           <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                       </div>

                       <div>
                      <h5 class="text-center" style="font-size: 12px; color: red;">${confirmPasswordError}</h5>
                       <div>
                       <div class="mb-3">
                           <label for="confirmPassword" class="form-label">Confirm Password</label>
                           <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Re-enter your password">
                       </div>

                       <div id="passwordError" class="text-danger mb-3" style="display: none;">
                           Passwords do not match.
                       </div>
                           <div id="passwordRequirementError" style="display: none; color: red;">Password must contain at least one letter and one number.</div>
                       <button type="submit" class="btn btn-primary w-100" id="submitBtn">Register</button>
                   </form>
               </div>
           </div>
       </div>

    <!-- Footer Section -->
    <footer class="bg-light mt-5">
        <div class="container py-3 d-flex justify-content-between align-items-center">
            <div class="d-flex align-items-center">
                <img src="data:image/png;base64,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" alt="Footer Logo" style="height: 40px;">
                <div class="ms-3">
                    <a href="https://www.facebook.com/xworkzdevelopmentcenter" class="btn btn-link">
                        <i class="bi bi-facebook"></i>
                    </a>
                    <a href="https://x.com/i/flow/login?redirect_after_login=%2Fodc_x" class="btn btn-link">
                        <i class="bi bi-twitter"></i>
                    </a>
                    <a href="https://www.instagram.com/xworkzraj/" class="btn btn-link">
                        <i class="bi bi-instagram"></i>
                    </a>
                </div>
            </div>
            <p class="mb-0"> devloped by Bharath L @2025 .</p>
        </div>
    </footer>

    <script>
        const stateDistrictMap = {
            Karnataka: ["Bangalore", "Mysore", "Mangalore"],
            Maharashtra: ["Mumbai", "Pune", "Nagpur"],
            Kerala: ["Thiruvananthapuram", "Kochi", "Kozhikode"]
        };

        const stateSelect = document.getElementById('state');
        const districtSelect = document.getElementById('district');

        stateSelect.addEventListener('change', () => {
            const state = stateSelect.value;
            districtSelect.innerHTML = '<option value="">Select District</option>'; // Reset districts

            if (state && stateDistrictMap[state]) {
                stateDistrictMap[state].forEach(district => {
                    const option = document.createElement('option');
                    option.value = district;
                    option.textContent = district;
                    districtSelect.appendChild(option);
                });
            }
        });
    </script>
   <script>
       const form = document.getElementById('registrationForm');
       const password = document.getElementById('password');
       const confirmPassword = document.getElementById('confirmPassword');
       const passwordError = document.getElementById('passwordError');
       const passwordRequirementError = document.getElementById('passwordRequirementError');

       form.addEventListener('submit', (e) => {
           if (password.value !== confirmPassword.value) {
               e.preventDefault();
               passwordError.style.display = 'block';
           } else {
               passwordError.style.display = 'none';
           }

           const passwordRegex = /^(?=.*[a-zA-Z])(?=.*\d)/;
           if (!passwordRegex.test(password.value)) {
               e.preventDefault();
               passwordRequirementError.style.display = 'block';
           } else {
               passwordRequirementError.style.display = 'none';
           }
       });




       const checkEmail= async ()=>{
       const email= document.getElementById("email").value
       console.log(email)
       const response = await axios("http://localhost:8080/new-year/api/checkEmail/"+ email)
       if(response.data=="Email Exists"){
       document.getElementById("emailAjaxError").innerHTML=response.data
       }
       else{
       document.getElementById("emailAjaxError").innerHTML=""
       }
       }
       </script>
       <script>
       const checkPhNo= async ()=>{
              const contact= document.getElementById("contact").value
              console.log(contact)
              const response = await axios("http://localhost:8080/new-year/api/checkEmail/"+ contact)
              if(response.data=="checkContactExists"){
              document.getElementById("contactAjaxError").innerHTML=response.data
              }
              else{
              document.getElementById("contactAjaxError").innerHTML=""
              }
              }
   </script>
  <script>
          const requiredFields = document.querySelectorAll('.required');
          const submitBtn = document.getElementById('submitBtn');

          function checkFields() {
              let allValid = true;

              requiredFields.forEach(field => {
                  if (!field.checkValidity() || field.value.trim() === '') {
                      allValid = false;
                  }
              });

              if (allValid) {
                  submitBtn.disabled = false;
                  submitBtn.classList.add('enabled');
              } else {
                  submitBtn.disabled = true;
                  submitBtn.classList.remove('enabled');
              }
          }

          requiredFields.forEach(field => {
              field.addEventListener('input', checkFields);
          });
      </script>

    <!-- Bootstrap JS and Icons -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
</body>
</html>
