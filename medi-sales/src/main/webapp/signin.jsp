<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <title>Sign In</title>
    <style>
        /* General Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Body Styling */
        body {
            font-family: Arial, sans-serif;
            background-image: url('https://images.unsplash.com/photo-1580281657525-68bc07ebdf88?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjUyOXwwfDF8c2VhcmNofDJ8fG1lZGljYWwlMjBiYWNrZ3JvdW5kfGVufDB8fHx8MTY4MzEyNjk4MA&ixlib=rb-1.2.1&q=80&w=1920');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        /* Header Styling */
        header {
            background-color: darkcyan;
            color: white;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        header img {
            height: 50px;
        }

        header .nav-links {
            display: flex;
            gap: 20px;
        }

        header .nav-links a {
            color: white;
            text-decoration: none;
            font-size: 16px;
        }

        header .nav-links a:hover {
            text-decoration: underline;
        }

        /* Main Content Styling */
        main {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .form-container {
            background: darkcyan;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            width: 400px;
            text-align: center;
        }

        .form-container h2 {
            margin-bottom: 15px;
            font-size: 24px;
            color: balck;
        }

        .form-container input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 16px;
        }

        .form-container input:focus {
            border-color: #005a8d;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 90, 141, 0.5);
        }

        .form-container button {
            width: 100%;
            padding: 12px;
            background-color: #005a8d;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .form-container button:disabled {
            background-color: #ccc;
            cursor: not-allowed;
        }

        .form-container button:hover:not(:disabled) {
            background-color: #004773;
        }

        .form-container a {
            display: block;
            margin-top: 10px;
            font-size: 14px;
            color: black;
            text-decoration: none;
        }

        .form-container a:hover {
            text-decoration: underline;
        }

        /* Footer Styling */
        footer {
            background-color: rgba(0, 90, 141, 0.8);
            color: white;
            padding: 10px 20px;
            text-align: center;
        }

        footer a {
            color: white;
            text-decoration: none;
            margin: 0 10px;
        }

        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header>
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        <nav class="nav-links">
            <a href="signup">Sign Up</a>
            <a href="index">Log Out</a>
        </nav>
    </header>

    <main>
        <div class="form-container">
            <h3 style="color: red;">${notfound}</h3>
            <form action="login" method="post" id="signInForm">
                <h2>Sign In</h2>
                <span id="emailAjaxError" style="color: red;"></span>
                <input type="email" id="email" onblur="checkingEmail()" name="email" value="${dto.getEmail()}" required placeholder="Enter your email">
                <input type="password" id="password" name="password" value="${dto.getPassword()}" required placeholder="Enter your password">
                <button type="submit" id="signInButton" disabled>Sign In</button>
<a href="otp">Forgot Password</a>
                <a href="raksha">Back</a>
            </form>
        </div>
    </main>

    <footer>
        <p>&copy; 2025 Medical Portal. Connect with us:
            <a href="https://wa.me" target="_blank">WhatsApp</a> |
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
        </p>
    </footer>

   <script>
       const form = document.getElementById('signInForm');
       const inputs = form.querySelectorAll('input[required]');
       const submitButton = document.getElementById('signInButton');
       const emailError = document.getElementById('emailAjaxError');

       // Function to validate fields
       function validateFields() {
           const allFieldsFilled = Array.from(inputs).every(input => input.value.trim() !== '');
           submitButton.disabled = !allFieldsFilled || emailError.innerText !== '';
       }

       // Event listener for input fields
       inputs.forEach(input => {
           input.addEventListener('input', validateFields);
       });

       // Function to check email via AJAX
       const checkingEmail = async () => {
           const email = document.getElementById("email").value;
           const response = await axios("http://localhost:8080/medi-sales/api/checkingEmail/" + email);

           if (response.data === "Email does not exist") {
               emailError.innerHTML = "";  // No error message
           } else {
               emailError.innerHTML = response.data;  // Show error message
           }

           // Revalidate the fields after checking email
           validateFields();
       };

       // Initialize the form validation on page load
       validateFields();
   </script>

</body>
</html>
