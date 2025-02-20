<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Form</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f3f7;
        }
        .header {
            background-color: #4CAF50;
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
        .footer {
            background-color: #4CAF50;
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
        .container {
            width: 60%;
            margin: 80px auto 100px auto;
            background-color: #ffffff;
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
            margin-bottom: 10px;
            display: flex;
            flex-direction: column;
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
        .form-row {
            display: flex;
            justify-content: space-between;
            gap: 40px;
            margin-bottom: 25px;
        }
        .form-row .form-group {
            flex: 1;
        }
        button {
            width: 100%;
            padding: 14px;
            background-color: #4CAF50;
            color: white;
            border: none;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }
        button:hover {
            background-color: #45a049;
        }
        #error-message {
            color: red;
            font-size: 14px;
            margin-top: 10px;
        }
    </style>
</head>
<body>

    <header class="header">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        <nav class="nav-links">
            <a href="raksha">Home</a>
            <a href="signin">Sign In</a>
        </nav>
    </header>

    <div class="container">
        <h1>User Registration Form</h1>

        <form action="signup" method="post" onsubmit="return validatePassword()">
            <h5 class="form-row" style="color: red; text-align: center;">${emailregisterederror}</h5>

            <div class="form-row">
            <h5 class="form-row" style="color: red; text-align: center;">${fnameError}</h5>
            <h5 class="form-row" style="color: red; text-align: center;">${lnameError}</h5>
                <div class="form-group">
                    <label for="fName">First Name</label>
                    <input type="text" id="fName" name="fName" value="${dto.getFName()}" placeholder="Enter your First Name" required>
                </div>
                <div class="form-group">
                    <label for="lName">Last Name</label>
                    <input type="text" id="lName" name="lName" value="${dto.getLName()}" placeholder="Enter your Last Name" required>
                </div>
            </div>

      <span id="emailAjaxError" style="color: red; text-align: center;"></span><br>
            <div class="form-row">
            <h5 class="form-row" style="color: red; text-align: center;">${emailerror}</h5>
            <h5 class="form-row" style="color: red; text-align: center;">${alteremailerror}</h5>

                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email"  value="${dto.getEmail()}" onblur="checkEmail()" placeholder="Enter your Email" required>
                </div>
                <div class="form-group">
                    <label for="alterEmail">Alternate Email</label>
                    <input type="email" id="alterEmail" name="alterEmail" value="${dto.getAlterEmail()}" placeholder="Enter your Alternate Email">
                </div>
            </div>

             <span id="phoneNumberAjaxError" style="color: red; text-align: center;"></span><br>
            <div class="form-row">
            <h5 class="form-row" style="color: red; text-align: center;">${contactnumbererrod}</h5>
            <h5 class="form-row" style="color: red; text-align: center;">${altercontactnumbererror}</h5>
                <div class="form-group">
                    <label for="contactNumber">Contact Number</label>
                    <input type="tel" id="contactNumber" name="contactNumber" value="${dto.getContactNumber()}" onblur="checkPhoneNumber()" placeholder="Enter your Contact Number" required>
                </div>
                <div class="form-group">
                    <label for="alterContactNumber">Alternate Contact Number</label>
                    <input type="tel" id="alterContactNumber" name="alterContactNumber"  value="${dto.getAlterContactNumber()}" placeholder="Enter your Alternate Contact Number">
                </div>
            </div>


            <div class="form-row">
            <h5 class="form-row" style="color: red; text-align: center;">${dateofbirtherror}</h5>
             <h5 class="form-row" style="color: red; text-align: center;">${placeerror}</h5>
                <div class="form-group">
                    <label for="dateOfBirth">Date of Birth</label>
                    <input type="date" id="dateOfBirth" name="dateOfBirth" value="${dto.getDateOfBirth()}" placeholder="Select your Date of Birth" required>
                </div>
                <div class="form-group">
                    <label for="place">Place</label>
                    <input type="text" id="place" name="place" value="${dto.getPlace()}" placeholder="Enter your Place" required>
                </div>
            </div>


            <div class="form-row">
            <h5 class="form-row" style="color: red; text-align: center;">${stateerror}</h5>
            <h5 class="form-row" style="color: red; text-align: center;">${districterror}</h5>
                <div class="form-group">
                    <label for="state">State</label>
                    <select id="state" name="state" required onchange="updateDistricts()">
                        <option> ${dto.getState()} </option>
                        <option value="">Select State</option>
                        <option value="Andhra Pradesh">Andhra Pradesh</option>
                        <option value="Bihar">Bihar</option>
                        <option value="Karnataka">Karnataka</option>
                        <option value="Maharashtra">Maharashtra</option>
                        <option value="Tamil Nadu">Tamil Nadu</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="district">District</label>
                    <select id="district" name="district" required>
                        <option> ${dto.getDistrict()} </option>
                        <option value="">Select District</option>
                    </select>
                </div>
            </div>


            <div class="form-row">
            <h5 class="form-row" style="color: red; text-align: center;">${passworderror}</h5>
            <h5 class="form-row" style="color: red; text-align: center;">${confirmpassworderror}</h5>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" value="${dto.getPassword()}" placeholder="Enter your Password" required>
                </div>
                <div class="form-group">
                    <label for="confirmPassword">Confirm Password</label>
                    <input type="password" id="confirmPassword" name="confirmPassword" value="${dto.getConfirmPassword()}" placeholder="Confirm your Password" required>
                </div>
            </div>

            <div id="error-message"></div>

            <button type="submit">Submit</button>
        </form>
    </div>

    <footer class="footer">
        <div>
            <a href="https://wa.me" target="_blank">WhatsApp</a>
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
        </div>
        <div id="current-date-time"></div>
    </footer>

    <script>


        const districts = {
            "Andhra Pradesh": ["Anantapur", "Chittoor", "East Godavari", "Guntur", "Krishna"],
            "Bihar": ["Patna", "Gaya", "Bhagalpur", "Muzaffarpur", "Darbhanga"],
            "Karnataka": ["Bengaluru Rural", "Mysuru", "Hubballi", "Dakshina Kannada", "Bellary"],
            "Maharashtra": ["Mumbai", "Pune", "Nagpur", "Thane", "Nashik"],
            "Tamil Nadu": ["Chennai", "Coimbatore", "Madurai", "Salem", "Tiruchirappalli"]
        };

        function updateDistricts() {
            const state = document.getElementById("state").value;
            const districtSelect = document.getElementById("district");

            districtSelect.innerHTML = '<option value="">Select District</option>';

            if (state && districts[state]) {
                districts[state].forEach(district => {
                    const option = document.createElement("option");
                    option.value = district;
                    option.text = district;
                    districtSelect.appendChild(option);
                });
            }
        }

        function validatePassword() {
            const password = document.getElementById("password").value;
            const confirmPassword = document.getElementById("confirmPassword").value;
            const errorMessage = document.getElementById("error-message");

            if (password !== confirmPassword) {
                errorMessage.innerText = "Passwords do not match!";
                return false;
            } else {
                errorMessage.innerText = "";
                return true;
            }
        }

        function updateDateTime() {
            const now = new Date();
            document.getElementById("current-date-time").innerText = now.toLocaleString();
        }

        setInterval(updateDateTime, 1000);




    const checkEmail= async ()=> {
    const email = document.getElementById("email").value
    console.log(email)
    const response = await axios("http://localhost:8080/new-year-application/api/checkEmail/" + email)
    if(response.data==="Email Exists"){
    document.getElementById("emailAjaxError").innerHTML=response.data
    }
    else{
    document.getElementById("emailAjaxError").innerHTML=""
    }
    }


    const checkPhoneNumber= async ()=> {
        const phoneNumber = document.getElementById("contactNumber").value
        console.log(phoneNumber)
        const response = await axios("http://localhost:8080/new-year-application/api/checkPhoneNumber/" + phoneNumber)
        if(response.data==="PhoneNumber Exists"){
        document.getElementById("phoneNumberAjaxError").innerHTML=response.data
        }
        else{
        document.getElementById("phoneNumberAjaxError").innerHTML=""
        }
        }
    </script>
</body>
</html>
