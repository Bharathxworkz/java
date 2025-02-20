<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Sidebar Menu</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            margin: 0;
            display: flex;
            flex-direction: column;
            background-image:url("https://img.freepik.com/free-photo/copy-space-tablets-with-pills-desk_23-2148551010.jpg?ga=GA1.1.1027079804.1737700376&semt=ais_hybrid");
            background-size: cover, contain; /* First image covers, second adjusts */
                        background-repeat: no-repeat, no-repeat;
                        background-attachment: fixed, fixed;
                        background-position: top left, bottom right;
                        background-color: rgba(0, 0, 0, 0.5); /* Fallback color */
                        color: #333;

        }

        /* Header Styling */
        .header {
           background-color: darkcyan;
                          color: white;
                          padding: 10px 20px;
                          display: flex;
                          justify-content: space-between;
                          align-items: center;
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
    </style>
</head>
<body>
    <header class="header">
        <div class="logo">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        </div>
        <nav class="nav-links">
              <img height="35px" width="35px" src="view/${dto.getFileName()}" class="circle-image">
                            <h2>Hello ${ fName } </h2>
                            <a href="update?id=${dto.getId()}">Update Profile</a>
                            <a href="viewprofile?id=${dto.getId()}">View Profile</a>
            <a href="signup">Sign UP</a>
            <a href="index">Home</a>
        </nav>
    </header>

    <div class="sidebar" id="sidebar">
    <br>
    <div class="toggle-btn" onclick="toggleSidebar()">
                <i class="fas fa-bars"></i> Menu
            </div>
        <ul>
            <li><i class="fas fa-user"></i> <a href="createstock">Create Stock</a></li>
            <li><i class="fas fa-calendar"></i> <a href="getallStocks">View Stock</a></li>
             <li><i class="fas fa-user"></i> <a href="vendorr">VendorSalesBill</a></li>
            <li><i class="fas fa-sign-out-alt"></i> <a href="index">LogOut</a></li>
        </ul>

    </div>

    <div class="main-content">
        <h2>${add}</h2>
    </div>


    <footer class="footer">
        <div>
            <a href="https://wa.me" target="_blank">WhatsApp</a>
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
        </div>
    </footer>

    <script>
        function toggleSidebar() {
            const sidebar = document.getElementById('sidebar');
            sidebar.classList.toggle('collapsed');
        }


    </script>
</body>
</html>