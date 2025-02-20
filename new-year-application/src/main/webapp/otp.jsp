<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <style>
    /* General Styles */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        flex-direction: column;
    }

    /* Header Styles */
    header {
        background-color: black;
        width: 100%;
        padding: 10px 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        position: sticky;
        top: 0;
        left: 0;
        z-index: 1000;
    }

    header .logo {
        display: flex;
        align-items: center;
    }

    header .logo img {
        width: 50px;
        height: auto;
        margin-right: 10px;
    }

    header .nav-links {
        display: flex;
    }

    header .nav-links a {
        color: white;
        text-decoration: none;
        margin-left: 20px;
        font-size: 18px;
        transition: color 0.3s ease;
    }

    header .nav-links a:hover {
        color: #4caf50;
    }

    /* Form Container */
    .container {
        width: 90%;
        max-width: 400px;
        background: linear-gradient(to bottom, #ffffff, #e8f5e9);
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        padding: 20px;
        margin-top: 100px; /* Adjusted for header */
        text-align: center;
    }

    /* Form Styles */
    .form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        font-size: 22px;
        color: #333;
    }

    /* Input Fields */
    input[type="email"], input[type="text"] {
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 16px;
        width: 100%;
        max-width: 350px;
    }

    input[type="email"]::placeholder,
    input[type="text"]::placeholder {
        color: #999;
        font-style: italic;
    }

    input[type="email"]:focus,
    input[type="text"]:focus {
        border-color: #4caf50;
        outline: none;
        box-shadow: 0 0 5px rgba(76, 175, 80, 0.3);
    }

    /* Buttons */
    input[type="button"], input[type="submit"] {
        padding: 10px;
        background-color: #4caf50;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
        width: 100%;
        max-width: 350px;
        transition: background-color 0.3s ease;
    }

    input[type="button"]:hover,
    input[type="submit"]:hover {
        background-color: #45a049;
    }

    /* Back Button */
    .back-link {
        text-align: center;
        margin-top: 15px;
    }

    .back-link a {
        color: #333;
        text-decoration: none;
        font-weight: bold;
        transition: color 0.3s ease;
    }

    .back-link a:hover {
        color: #4caf50;
        text-decoration: underline;
    }

    /* Footer Styles */
    footer {
        background-color: black;
        width: 100%;
        padding: 10px 20px;
        text-align: center;
        position: fixed;
        bottom: 0;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    footer .footer-left {
        display: flex;
        align-items: center;
        gap: 10px;
    }

    footer .footer-text {
        color: white;
        font-size: 14px;
    }

    footer .date-time {
        color: white;
        font-size: 14px;
    }

    /* Responsive Design */
    @media (max-width: 600px) {
        header {
            flex-direction: column;
        }

        header .nav-links {
            margin-top: 10px;
            justify-content: center;
        }

        .container {
            margin-top: 120px;
        }

        footer {
            flex-direction: column;
            gap: 10px;
        }
    }

    </style>
</head>

<body>

    <!-- Header Section -->
    <header>
        <div class="logo">
            <img src="https://avatars.githubusercontent.com/u/48981565?v=4" alt="Logo">
            <a href="index.jsp" style="color: white; text-decoration: none; font-size: 18px;">Home</a>
        </div>
        <div class="nav-links">
            <a href="sign-in.jsp">Sign In</a>
            <a href="signUp.jsp">Sign Up</a>
        </div>
    </header>

    <!-- Forgot Password Form Container -->
    <div class="container">
        <span>${valid}</span>
        <form action="reset" method="post" class="form">
            <h2>OTP Generation</h2>

            <!-- Email Field -->
            <label for="email">Email</label>
            <input type="email" id="email" name="email" value="${email}" required placeholder="Enter your email">
            <span id="message"></span>

            <!-- OTP Send Button -->
            <input type="button" onclick="otpSent()" value="Send OTP" /><br></br>

            <input type="text" id="otp" name="otp" required placeholder="Enter otp">

            <input type="submit" value="Verify">

            <!-- Back Button -->
            <div class="back-link">
                <a href="javascript:history.back()">Back</a>
            </div>
        </form>
    </div>

    <!-- Footer Section -->
    <footer>
         <div class="footer-left">
                    <img src="https://png.pngtree.com/element_our/sm/20180626/sm_5b321c9cb2d25.jpg" alt="Footer Logo 1" width="40" height="40">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Instagram_logo_2022.svg/1000px-Instagram_logo_2022.svg.png" alt="Instagram Logo" width="40" height="40">
                </div>
        <div class="date-time" id="dateTime">
            <!-- Date and time will appear here -->
        </div>
    </footer>

    <script>
        // JavaScript function to update the date and time in the footer
        function updateDateTime() {
            const now = new Date();
            const options = { year: 'numeric', month: 'long', day: 'numeric', hour: '2-digit', minute: '2-digit', second: '2-digit' };
            const dateTimeString = now.toLocaleString('en-US', options);
            document.getElementById("dateTime").textContent = dateTimeString;
        }

        // Update the time every second
        setInterval(updateDateTime, 1000);

        // Initial call to display the current date and time
        updateDateTime();

        const otpSent = async () => {
            const email = document.getElementById("email").value;
            console.log(email);
            const response = await axios("http://localhost:8080/new-year-application/api/sendOtp/" + email);
            console.log(response);
            document.getElementById("message").innerHTML = response.data;
        }
    </script>

</body>

</html>