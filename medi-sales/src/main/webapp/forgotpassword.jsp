<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Forgot Password</title>
  <style>
     body {
         font-family: 'Poppins', sans-serif;
         background: linear-gradient(135deg, #e0f7f7, #b0e0e6);
         min-height: 100vh;
         display: flex;
         flex-direction: column;
         justify-content: space-between;
         align-items: center; /* Center horizontally */
         margin: 0;
     }

     /* Header Styling */
     .header {
         background: darkcyan;
         color: white;
         padding: 12px 20px;
         display: flex;
         justify-content: space-between;
         align-items: center;
         width: 100%;
         box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
     }

     /* Form Styling */
     .form-container {
         background: white;
         padding: 8px 15px;
         border-radius: 8px;
         box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
         width: 350px;
         text-align: center;
         display: flex;
         flex-direction: column;
         justify-content: center;
     }

     /* Footer Styling */
     .footer {
         background: darkcyan;
                  color: white;
                  padding: 12px 20px;
                  display: flex;
                  justify-content: space-between;
                  align-items: center;
                  width: 100%;
                  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
     }



    .form-container h2 {
      margin-bottom: 20px;
      color: #333;
    }

    .form-container label {
      display: block;
      text-align: left;
      margin-bottom: 5px;
      font-weight: bold;
      color: #555;
    }

    .form-container input[type="email"],
    .form-container input[type="password"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .form-container input[type="submit"],
    .form-container input[type="button"] {
      width: 48%;
      padding: 10px;
      margin-top: 10px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }

    .form-container input[type="submit"] {
      background-color: #28a745;
      color: white;
    }

    .form-container input[type="submit"]:hover {
      background-color: #218838;
    }

    .form-container input[type="button"] {
      background-color: #dc3545;
      color: white;
    }

    .form-container input[type="button"]:hover {
      background-color: #c82333;
    }
    /* Header Styling */


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

  </style>
</head>
<body>

  <header class="header">
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
          <nav class="nav-links">
            <a href="signup">Sign UP</a>
            <a href="raksha">Home</a>
          </nav>
        </header>
        <div class="form-container">
    <h2>Forgot Password</h2>

    <h3 class="form-row" style="color: red; text-align: center;">${notfound}</h3>

    <form action="resetPassword" mathod="get">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" value="${email}" required>

      <label for="new-password">New Password:</label>
      <input type="password" id="new-password" name="newPassword" required>

      <label for="confirm-password">Confirm Password:</label>
      <input type="password" id="confirm-password" name="confirmPassword" required>

      <input type="submit" value="Reset Password">
      <input type="button" value="Back" onclick="window.history.back();">
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
          function updateDateTime() {
                             const now = new Date();
                             document.getElementById("current-date-time").innerText = now.toLocaleString();
                             }
                             setInterval(updateDateTime, 1000);
         </script>

</body>
</html>