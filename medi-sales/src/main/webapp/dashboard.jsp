<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Sidebar Menu</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #e0f7f7, #b0e0e6);
            margin: 0;
            display: flex;
            flex-direction: column;
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

        .header .logo img {
            height: 50px;
        }

        .nav-links {
            display: flex;
            gap: 20px;
        }

        .nav-links a {
            color: white;
            text-decoration: none;
            font-size: 16px;
            transition: color 0.3s ease;
        }

        .nav-links a:hover {
            color: #f0f8ff;
        }

        /* Sidebar Styling */
        .sidebar {
            width: 250px;
            height: 100vh;
            background: #111827;
            color: white;
            transition: width 0.3s ease;
            overflow: hidden;
            position: fixed;
            top: 60px;
            left: 0;
        }

        .sidebar.collapsed {
            width: 70px;
        }

        .sidebar ul {
            list-style: none;
            padding: 0;
        }

        .sidebar ul li {
            padding: 15px;
            display: flex;
            align-items: center;
            cursor: pointer;
            transition: background 0.3s;
        }

        .sidebar ul li:hover {
            background: #1f2937;
        }

        .sidebar ul li i {
            width: 30px;
            text-align: center;
        }

        .sidebar ul li a {
            text-decoration: none;
            color: white;
            flex-grow: 1;
            white-space: nowrap;
            transition: opacity 0.3s ease;
        }

        .sidebar.collapsed ul li a {
            opacity: 0;
            pointer-events: none;
        }

        .toggle-btn {
            text-align: center;
            padding: 10px;
            cursor: pointer;
            background: #1f2937;
        }

        .main-content {
            margin-left: 250px;
            padding: 80px 20px 20px;
            transition: margin-left 0.3s ease;
            flex-grow: 1;
        }

        .sidebar.collapsed + .main-content {
            margin-left: 70px;
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
        .circle-image{
                             border-radius :50%;
                             width:35px;
                             height:35px;
                 }
    </style>
</head>
<body>
    <header class="header">
        <div class="logo">

            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        </div>
        <nav class="nav-links">
            <img height="35px" width="35px" src="view/${dto.getFileName()}" class="circle-image">
            <h3>Hello ${fName} </h3>
            <h3><a href="update?id=${dto.getId()}">Update Profile</a></h3>
            <h3><a href="viewprofile?id=${dto.getId()}">View Profile</a></h3>
            <br>
        </nav>
    </header>

    <div class="sidebar" id="sidebar">
    <br>
    <div class="toggle-btn" onclick="toggleSidebar()">
                <i class="fas fa-bars"></i> Details
            </div>
        <ul>
            <li><i class="fas fa-user"></i> <a href="addvendor/${dto.id}">Add Vendor</a></li>
            <li><i class="fas fa-user"></i> <a href="getallvendors/${dto.id}">View vendors</a></li>
            <li><i class="fas fa-calendar"></i> <a href="vendorr/${dto.id}">Vendor Purchase Bill</a></li>
            <li><i class="fas fa-user"></i> <a href="addretailer/${dto.id}">Add Retailer</a></li>
            <li><i class="fas fa-user"></i> <a href="getallretailerss/${dto.id}">view Retailers</a></li>
            <li><i class="fas fa-sign-out-alt"></i> <a href="index">LogOut</a></li>

        </ul>

    </div>

    <div class="main-content">
        <h2>DISTRIBUTOR STOCK MANAGEMENT</h2>
        <div>
        <h3>${success}</h3>
        </div>
    </div>

    <footer class="footer">
        <div>
            <a href="https://wa.me" target="_blank">WhatsApp</a>
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
        </div>
        <div id="current-date-time"></div>
    </footer>

    <script>
        function toggleSidebar() {
            const sidebar = document.getElementById('sidebar');
            sidebar.classList.toggle('collapsed');
        }

        function updateDateTime() {
            const now = new Date();
            document.getElementById("current-date-time").innerText = now.toLocaleString();
        }
        setInterval(updateDateTime, 1000);
    </script>
</body>
</html>