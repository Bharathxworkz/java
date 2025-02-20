<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<html>
<head>
    <style>
      /* General Styles */
      body {
          font-family: 'Poppins', sans-serif;
          margin: 0;
          padding: 0;
          background: linear-gradient(135deg, #e0f7f7, #b0e0e6);
          min-height: 100vh;
          display: flex;
          flex-direction: column;
      }

      /* Header */
      .header {
          background-color: darkcyan;
          color: white;
          padding: 10px 20px;
          display: flex;
          justify-content: space-between;
          align-items: center;
          position: fixed;
          top: 0;
          width: 100%;
          z-index: 10;
      }

      .header img {
          height: 50px;
      }

      .nav-links a {
          color: white;
          text-decoration: none;
          margin-left: 20px;
          font-size: 16px;
      }

      .nav-links a:hover {
          color: #f0f8ff;
      }

      /* Main Content */
      .container {
          margin: 120px auto 40px;
          background: rgba(255, 255, 255, 0.95);
          width: 90%;
          max-width: 1200px;
          padding: 20px;
          border-radius: 8px;
          box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
          color: #333;
          text-align: center;
      }

      /* Table Styling */
      table {
          width: 100%;
          border-collapse: collapse;
          margin-top: 20px;
          background: #f0f8ff;
          color: #333;
          font-size: 14px;
      }

      th, td {
          border: 1px solid #ddd;
          text-align: left;
          padding: 8px;
      }

      th {
          background-color: #87cefa;
          color: #333;
      }

      tr:nth-child(even) {
          background-color: #e0f7fa;
      }

      tr:nth-child(odd) {
          background-color: #f0f8ff;
      }

      tr:hover {
          background-color: #b0e0e6;
      }

      /* Action Icons */
      .edit-icon, .delete-icon {
          text-decoration: none;
          font-size: 18px;
          margin: 0 5px;
      }

      .edit-icon {
          color: #2E86C1;
      }

      .delete-icon {
          color: #E74C3C;
      }

      .edit-icon:hover, .delete-icon:hover {
          opacity: 0.7;
      }

      /* Footer */
      .footer {
          background-color: darkcyan;
          color: white;
          padding: 10px 20px;
          display: flex;
          justify-content: space-between;
          align-items: center;
          position: fixed;
          bottom: 0;
          width: 100%;
          text-align: center;
          z-index: 10;
      }

      .footer a {
          color: white;
          text-decoration: none;
          margin-right: 10px;
      }

      .footer a:hover {
          text-decoration: underline;
      }

      /* Responsive Design */
      @media (max-width: 768px) {
          .container {
              width: 95%;
              padding: 15px;
          }

          table {
              font-size: 12px;
          }

          .header, .footer {
              flex-direction: column;
              text-align: center;
          }

          .nav-links {
              margin-top: 10px;
          }
      }

    </style>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
</head>
<body>
    <header class="header">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo" height="50">
        <nav class="nav-links">
            <a href="signup">Sign UP</a>
            <a href="index">Home</a>
        </nav>
    </header>

    <div class="container">
    <h2>AVAILABLE STOCKS</h2>
        <table>
            <tr>
                <th>Product Company</th><th>Product Name</th><th>HSN</th><th>MRP</th>
                <th>Pack</th><th>Batch Number</th><th>Mfg Date</th><th>Expiry Date</th><th>Qty</th>
                <th>Rate</th><th>Discount</th><th>GST</th><th>Total Amount</th><th>Action</th>
            </tr>
            <ref:forEach items="${listOfStocks}" var="dto">
                <tr>

                    <td>${dto.getProductCompany()}</td>
                    <td>${dto.getProductName()}</td>
                    <td>${dto.getHsn()}</td>
                    <td>${dto.getMrp()} Rs</td>
                    <td>${dto.getPack()}</td>
                    <td>${dto.getBatchNumber()}</td>
                    <td>${dto.getMfgDate()}</td>
                    <td>${dto.getExpiryDate()}</td>
                    <td>${dto.getQty()}</td>
                    <td>${dto.getRate()} Rs</td>
                    <td>${dto.getDiscount()} %</td>
                    <td>${dto.getGst()}</td>
                    <td>${dto.getAmount()} Rs</td>

                    <td>
                        <a href="fetchstocks?id=${dto.id}" class="edit-icon">
                            <i class="fas fa-edit"></i>
                        </a>
                        <a href="delete/${dto.id}" class="delete-icon">
                            <i class="fas fa-trash-alt"></i>
                        </a>
                    </td>
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