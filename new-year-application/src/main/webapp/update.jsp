<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Form</title>
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
        .time-container {
                    position: fixed;
                    top: 10px;
                    right: 10px;
                    color: white;
                    font-size: 16px;
                    background-color: rgba(0, 0, 0, 0.5);
                    padding: 10px;
                    border-radius: 5px;
        }
        .circle-image{
            border-radius :50%;
            width:35px;
            height:35px;
        }
    </style>
</head>

<body>
<!-- Header Section -->
    <header class="header">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
            <nav class="nav-links">
                <img height="35px" width="35px" src="view/${dto.getFileName()}" class="circle-image">
                <h2>Hello ${fName} </h2>
            </nav>
        </header>

    <div class="container">
        <h1>Update Page</h1>

        <form action="updateProfile" method="post" enctype="multipart/form-data">
        <h3>${success}</h3>
        Id
        <input type="text" id="id" name="id" value="${dto.getId()}" readOnly>
            <div class="form-row">
                <div class="form-group">
                    <label for="fName">First Name</label>
                    <input type="text" id="fName" name="fName" value="${dto.getFName()}">
                </div>
                <div class="form-group">
                    <label for="lName">Last Name</label>
                    <input type="text" id="lName" name="lName" value="${dto.getLName()}" placeholder="Enter your Last Name">
                </div>
            </div>


            <div class="form-row">

                <div class="form-group">
                    <label for="contactNumber">Contact Number</label>
                    <input type="tel" id="contactNumber" name="contactNumber" value="${dto.getContactNumber()}" placeholder="Enter your Contact Number" required>
                </div>
                <div class="form-group">
                    <label for="alterContactNumber">Alternate Contact Number</label>
                    <input type="tel" id="alterContactNumber" name="alterContactNumber"  value="${dto.getAlterContactNumber()}" placeholder="Enter your Alternate Contact Number">
                </div>
            </div>


            <div class="form-row">

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

            <div id="error-message"></div>
            <label for="chhosefile">Choose File</label><br>
            <input type="file" name="file" /> </br>
            <br>
            <button type="submit">Update</button>
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

    </script>
</body>
</html>
