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
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
                        font-family: 'Poppins', sans-serif;
                        background: linear-gradient(135deg, #e0f7f7, #b0e0e6);
                        display: flex;
                        flex-direction: column;

        }
/* Header Styling */
        .header {
            background: darkcyan;
            color: white;
            padding: 12px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            position: sticky;
            top: 0;
            width: 100%;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
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
            transition: color 0.3s ease;
        }

        .header .nav-links a:hover {
            color: #f0f8ff;
        }

        /* Footer Styling */
        .footer {
            background: darkcyan;
            color: white;
            padding: 12px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            position: fixed;
            bottom: 0;
            width: 100%;
            box-shadow: 0 -4px 8px rgba(0, 0, 0, 0.1);
        }

        .footer a {
            color: white;
            text-decoration: none;
            font-size: 14px;
            transition: color 0.3s ease;
        }

        .footer a:hover {
            text-decoration: underline;
            color: #f0f8ff;
        }


        /* Form Container */
        .container {
            width: 90%;
            max-width: 400px;
            border-radius: 5px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 10px;
            margin-top: 80px;
             margin-bottom: 80px;
             text-align: center;
             background-color:white;
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
            padding: 6px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            width: 70%;
            max-width: 350px;
        }

        input[type="email"]::placeholder,
        input[type="text"]::placeholder {
            color: #999;
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
            width: 30%;
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
    <header class="header">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
            <nav class="nav-links">
              <a href="signup">Sign UP</a>
              <a href="raksha">Home</a>
            </nav>
          </header>

    <!-- Forgot Password Form Container -->
    <div class="container">
        <span>${valid}</span>
        <form action="reset" method="post" class="form">
        <br>
            <h2>OTP GENERATION</h2>

            <!-- Email Field -->

            <input type="email" id="email" name="email" value="${email}" required placeholder="Enter your email">
            <span id="message"></span>

            <!-- OTP Send Button -->
            <input type="button" onclick="otpSent()" value="Send OTP" /><br>

            <input type="text" id="otp" name="otp" required placeholder="Enter otp">

            <input type="submit" value="Verify">

            <!-- Back Button -->
            <div class="back-link">
                <a href="javascript:history.back()">Back</a>
            </div>
        </form>
    </div>

    <!-- Footer Section -->
   <footer class="footer">
          <div>
            <a href="https://wa.me" target="_blank">WhatsApp</a>
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
          </div>
          <div id="current-date-time"></div>
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
            const response = await axios("http://localhost:8080/medi-sales/api/sendOtp/" + email);
            console.log(response);
            document.getElementById("message").innerHTML = response.data;
        }

         function updateDateTime() {
                            const now = new Date();
                            document.getElementById("current-date-time").innerText = now.toLocaleString();
                            }
                            setInterval(updateDateTime, 1000);
    </script>

</body>

</html>