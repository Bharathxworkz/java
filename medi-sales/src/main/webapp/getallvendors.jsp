<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<html>
<head>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #2C3E50; /* Updated Background Color */
            color: #fff;
            display: flex;
            flex-direction: column;
            align-items: center;
            height: 100vh;
        }

        .container {
            margin-top: 100px;
            background: lightcyan;
            margin-bottom: 100px;
            width: 100%;
            max-width: 1200px;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            color: #fff; /* Ensured Text Stays White */
        }


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

       body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #e0f7f7, #b0e0e6);
            min-height: 150vh;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .header, .footer {
            position: fixed;
            width: 100%;
            background: darkcyan;
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 12px 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .header { top: 0; }
        .footer { bottom: 0; }

        .nav-links a {
            color: white;
            text-decoration: none;
            margin-left: 20px;
            font-size: 16px;
        }

        .nav-links a:hover { color: #f0f8ff; }

        h2 {
                    text-align: center; /* Centers the heading */
                    color: cadetblue; /* Sets the color to black */
                    font-size: 2em; /* Makes the heading larger */
                    margin-bottom: 20px; /* Adds some space below the heading */
                }

    </style>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
</head>
<body>
    <header class="header">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo" height="50">
        <nav class="nav-links">
            <a href="signup">Sign UP</a>
            <a href="raksha">Home</a>
        </nav>
    </header>

    <div class="container">
    <h2>STOCK DETAILS</h2>
                    <table>
                        <tr>
                            <th>Sl No </th><th>Vendor Name</th><th>Contact Number</th><th>Email</th><th>GstInNumber</th>
                            <th>Address</th>
                        </tr>
                        <ref:forEach items="${listOfVendors}" var="dto" varStatus="status">
                            <tr>
                                <td>${status.index + 1}</td>
                                <td>${dto.getVendorName()}</td>
                                <td>${dto.getContactNumber()}</td>
                                <td>${dto.getEmail()}</td>
                                <td>${dto.getGstin()}rs</td>
                                <td>${dto.getAddress()}</td>

                            </tr>
                        </ref:forEach>
                    </table>
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