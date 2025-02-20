<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User List</title>
    <style>
    table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
                background: #f0f8ff; /* Light blue color */
                color: #333; /* Darker text for better readability */
                font-size: 14px; /* Smaller font size */
            }

            th, td {
                border: 1px solid #ddd;
                text-align: left;
                padding: 6px; /* Reduced padding to make the table smaller */
            }

            th {
                background-color: #87cefa; /* Light sky blue for header */
                color: #333; /* Dark text for header */
            }

            tr:nth-child(even) {
                background-color: #e0f7fa; /* Light teal for even rows */
            }

            tr:nth-child(odd) {
                background-color: #f0f8ff; /* Lighter blue for odd rows */
            }

            tr:hover {
                background-color: #b0e0e6; /* Slightly darker blue on hover */
            }
            h2 {
                                text-align: center; /* Centers the heading */
                                color: cadetblue; /* Sets the color to black */
                                font-size: 2em; /* Makes the heading larger */
                                margin-bottom: 20px; /* Adds some space below the heading */
                            }

               /* Header Styling */
                       .header {
                           background: darkcyan;
                                      color: white;
                                      padding: 12px 20px;
                                      display: flex;
                                      align-items: center;
                                      justify-content: space-between;
                                      width: 100%;
                                      position: fixed;
                                      top: 0;
                                      left: 0;
                                      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                                      z-index: 1000;
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

            </style>
</head>
<body>
<header class="header">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo" height="50">
        <nav class="nav-links">
            <a href="signup">Sign UP</a>
            <a href="raksha">Home</a>
        </nav>
    </header>
<form action="getUser" >
<br>
<br>
<br>
<br>

<h2>View Profile</h2>

<!-- Display the list of users -->
<table border="1">
    <thead>
        <tr>

            <th>Company Name</th>
            <th>Contact Person</th>
            <th>Business Type</th>
            <th>Mobile</th>
            <th>Email</th>
            <th>Address1</th>
            <th>Address2</th>
            <th>Pincode</th>
            <th>Referral</th>
            <th>FileName</th>
            <th>Content Type</th>
        </tr>
    </thead>
    <tbody>
            <tr>

                <td>${dto.getCompanyName()}</td>
                <td>${dto.getContactPerson()}</td>
                <td>${dto.getBusinessType()}</td>
                <td>${dto.getMobile()}</td>
                <td>${dto.getEmail()}</td>
                <td>${dto.getAddress1()}</td>
                <td>${dto.getAddress2()}</td>
                <td>${dto.getPincode()}</td>
                <td>${dto.getReferral()}</td>
                <td>${dto.getFileName()}</td>
                <td>${dto.getContentType()}</td>

            </tr>
    </tbody>
</table>
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