<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ page isELIgnored="false" %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password</title>
    <!-- Bootstrap CSS link -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        /* Body styling for vertical centering */
        body {
            height: 100vh;
            margin: 0;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            background-color: #f4f4f4;
        }

        /* Centering the Reset Password Form */
        .reset-password-container {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-grow: 1;
        }

        .card {
            width: 100%;
            max-width: 400px;
            border-radius: 10px;
            box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.1);
        }

        /* Navbar styling */
        .navbar .nav-link {
            color: #fff !important;
            transition: color 0.3s ease;
        }

        .navbar .nav-link:hover {
            color: #f39c12 !important;
        }

        /* Social media icons */
        .social-icons i {
            font-size: 30px;
            margin-right: 15px;
            transition: color 0.3s ease;
        }

        .social-icons i:hover {
            color: #f39c12;
        }

        /* Footer styling */
        .footer {
            width: 100%;
            padding: 20px 0;
            background-color: #f8f9fa;
            text-align: center;
        }

        /* Button styling */
        .form-row button {
            width: 48%;
            margin-right: 2%;
        }

        .form-row button:last-child {
            margin-right: 0;
        }

        .btn-custom {
            background-color: #3498db;
            color: white;
        }

        .btn-custom:hover {
            background-color: #2980b9;
        }

        /* Error message styling */
        .error-message {
            color: red;
            font-size: 0.875rem;
            display: none;
        }
    </style>

    <script>
        function validatePassword() {
            var password = document.getElementById("newPassword").value;
            var confirmPassword = document.getElementById("confirmPassword").value;
            var errorMessage = document.getElementById("error-message");

            if (password !== confirmPassword) {
                errorMessage.style.display = "block";
                return false;
            } else {
                errorMessage.style.display = "none";
            }
            return true;
        }
    </script>
</head>

<body>

    <!-- Header Section -->
    <header class="navbar navbar-expand-lg navbar-light fixed-top bg-dark">
        <div class="container">
            <!-- Navbar links -->
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="bi bi-house-door-fill"></i> Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="bi bi-person-plus-fill"></i> Sign Up</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="bi bi-box-arrow-in-right"></i> Sign In</a>
                    </li>
                </ul>
            </div>
        </div>
    </header>

    <!-- Reset Password Form Section -->
    <div class="reset-password-container">
        <div class="card">
            <div class="card-body">
              <h5 class="text-center" style="font-size: 0.9rem; color: red;">${notfound}</h5>

                <h3 class="card-title text-center mb-4">Reset Password</h3>
                <form action="resetPassword" method="get" onsubmit="return validatePassword()">
                    <!-- Email -->
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required value="${dt.getEmail()}">
                    </div>

                    <!-- New Password -->
                    <div class="mb-3">
                        <label for="newPassword" class="form-label">New Password</label>
                        <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter your new password" required>
                    </div>


                    <!-- Confirm Password -->
                    <div class="mb-3">
                        <label for="confirmPassword" class="form-label">Confirm Password</label>
                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm your new password" required>
                    </div>
                     <!-- Error Message for Password Mismatch -->
                                        <div id="error-message" class="error-message">
                                            Passwords do not match.
                                        </div>


                    <!-- Submit and Back Button in Same Row -->
                    <div class="form-row d-flex justify-content-between">
                        <button type="submit" class="btn btn-custom">Reset Password</button>
                        <button type="button" class="btn btn-secondary" onclick="window.history.back();">Back</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <!-- Footer Section -->
    <footer class="footer">
        <!-- Social Media Icons -->
        <div class="social-icons">
            <a href="#" class="text-dark"><i class="bi bi-facebook"></i></a>
            <a href="#" class="text-dark"><i class="bi bi-twitter"></i></a>
            <a href="#" class="text-dark"><i class="bi bi-instagram"></i></a>
            <a href="#" class="text-dark"><i class="bi bi-linkedin"></i></a>
        </div>

        <!-- Copyright -->
        <p class="mb-0">Developer Bharath L @2025.</p>
    </footer>

    <!-- Bootstrap JS and Icons -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.js"></script>
</body>

</html>
