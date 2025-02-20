<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vendor Sales Bill</title>
    <style>
         /* General Body Styling */
              body {
                  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                  background-color: #f4f7fc;
                  margin: 0;
                  padding: 0;
                  display: flex;
                  flex-direction: column;
                  height: 100vh; /* Full viewport height */
                  overflow: hidden; /* Prevent scrolling */
              }

              /* Header Styling */
              .header {
                  background: darkcyan;
                  color: white;
                  padding: 12px 20px;
                  display: flex;
                  justify-content: space-between;
                  align-items: center;
                  position: fixed;
                  top: 0;
                  left: 0;
                  width: 100%;
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
                  left: 0;
                  width: 100%;
                  box-shadow: 0 -4px 8px rgba(0, 0, 0, 0.1);
                  z-index: 1000;
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

              /* Content Wrapper */
              .content-wrapper {
                  flex: 1;
                  display: flex;
                  flex-direction: column;
                  height: calc(100vh - 100px); /* Adjusts for header and footer */
                  overflow-y: auto; /* Enables scrolling only within this section */
              }

              /* Container Styling */
              .container {
                  display: flex;
                  flex-direction: column;
                  align-items: center; /* Centers horizontally */
                  justify-content: center; /* Centers vertically */
                  height: 100vh; /* Makes sure it takes the full viewport height */
              }

              /* Form Container Styling */
              .form-container {
                  display: flex;
                  flex-wrap: wrap;
                  gap: 10px;
                  justify-content: center; /* Centers form elements */
                  align-items: center;
                  padding: 15px;
                  background: #e0f7fa;
                  border-radius: 8px;
                  width: fit-content; /* Makes the form fit its content */
                  margin-bottom: 20px; /* Adds space between form and table */
              }

              .form-container select,
              .form-container input {
                  padding: 5px;
                  border: 1px solid #ccc;
                  border-radius: 4px;
                  font-size: 12px;
                  width: 90px; /* Keeps input fields compact */
              }

              .form-container button {
                  padding: 8px 15px;
                  font-size: 14px;
                  background-color: darkcyan; /* Ensures button is dark cyan */
                  color: white;
                  border: none;
                  border-radius: 4px;
                  cursor: pointer;
                  flex-grow: 1; /* Helps center the button */
                  text-align: center;
              }

              .form-container button:hover {
                  background-color: #007a7a;
              }

              .form-container label {
                  font-size: 12px; /* Adjust the size as needed */
                  font-weight: bold;
                  color: #333; /* Optional: Makes it more readable */
              }

              /* Table Styling */
              table {
                  width: 90%; /* Adjust table width */
                  margin: 20px auto; /* Center the table */
                  border-collapse: collapse; /* Remove space between cells */
                  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Add a subtle shadow */
                  background-color: white; /* White background for the table */
                  border-radius: 8px; /* Rounded corners */
                  overflow: hidden; /* Ensure rounded corners are visible */
              }

              /* Table Header Styling */
              th {
                  background-color: darkcyan; /* Dark cyan background for headers */
                  color: white; /* White text for headers */
                  font-weight: bold; /* Bold text */
                  padding: 12px 15px; /* Padding for header cells */
                  text-align: left; /* Align text to the left */
                  font-size: 14px; /* Font size */
                  text-transform: uppercase; /* Uppercase text */
              }

              /* Table Body Styling */
              td {
                  padding: 10px 15px; /* Padding for body cells */
                  font-size: 14px; /* Font size */
                  border-bottom: 1px solid #e0f7fa; /* Light border between rows */
                  color: #333; /* Dark text color */
              }

              /* Alternate Row Background Color */
              tr:nth-child(even) {
                  background-color: #f9f9f9; /* Light gray background for even rows */
              }

              /* Hover Effect on Rows */
              tr:hover {
                  background-color: #e0f7fa; /* Light cyan background on hover */
                  transition: background-color 0.3s ease; /* Smooth transition */
              }

              /* Button Styling in Table */
              table button {
                  padding: 6px 12px; /* Padding for the button */
                  background-color: darkcyan; /* Dark cyan background */
                  color: white; /* White text */
                  border: none; /* Remove border */
                  border-radius: 4px; /* Rounded corners */
                  cursor: pointer; /* Pointer cursor on hover */
                  font-size: 12px; /* Font size */
                  transition: background-color 0.3s ease; /* Smooth transition */
              }

              table button:hover {
                  background-color: #007a7a; /* Darker cyan on hover */
              }

              /* Responsive Table */
              @media (max-width: 768px) {
                  table {
                      width: 100%; /* Full width on smaller screens */
                  }

                  th, td {
                      padding: 8px 10px; /* Smaller padding on smaller screens */
                  }
              }
    </style>
</head>
<body>
    <header class="header">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&s" alt="Logo">
        <nav class="nav-links">
            <a href="signup">Sign UP</a>
            <a href="raksha">Home</a>
            <br>
        </nav>
    </header>

    <div class="container">
        <h1>VENDOR SALES BILL</h1>
        <form id="salesForm" action="vending" method="post" class="form-container">
            <label for="productName">Product Name:</label>
            <select id="productName" name="productName" required>
                <option value="" disabled selected>Select Product</option>
                <c:forEach items="${listOfStock}" var="list">
                    <option value="${list.productName}">${list.productName}</option>
                </c:forEach>
            </select>
            <label for="customerName">Customer Name:</label>
            <select id="customerName" name="customerName" required>
                <option value="" disabled selected>Select Customer</option>
                <c:forEach items="${listOfDistributors}" var="contactPerson">
                    <option value="${contactPerson}">${contactPerson}</option>
                </c:forEach>
            </select>
            <label for="discount">Discount:</label>
            <input type="text" id="discount" name="discount" placeholder="Discount %" required>
            <label for="gst">GST:</label>
            <input type="text" id="gst" name="gst" placeholder="GST %" required>
            <label for="qty">Quantity:</label>
            <input type="text" id="qty" name="qty" placeholder="Quantity" required>
            <input type="hidden" id="rate" name="rate">
            <input type="hidden" id="hsn" name="hsn">
            <input type="hidden" id="batchNumber" name="batchNumber">
            <input type="hidden" id="mrp" name="mrp">
            <input type="hidden" id="totalAmount" name="totalAmount">
            <button type="submit">Submit</button>
        </form>

        <table>
            <thead>
                <tr>
                    <th>Sl.No.</th>
                    <th>Product Name</th>
                    <th>Rate</th>
                    <th>Customer Name</th>
                    <th>HSN</th>
                    <th>Batch Number</th>
                    <th>MRP</th>
                    <th>Discount</th>
                    <th>GST</th>
                    <th>Qty</th>
                    <th>Total Amount</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${vendor}" var="dto" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${dto.productName}</td>
                        <td>${dto.rate} Rs</td>
                        <td>${dto.customerName}</td>
                        <td>${dto.hsn}</td>
                        <td>${dto.batchNumber}</td>
                        <td>${dto.mrp} Rs</td>
                        <td>${dto.discount} %</td>
                        <td>${dto.gst}</td>
                        <td>${dto.qty}</td>
                        <td>${dto.amount} Rs</td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <button onclick="generateAllBills()" style="margin-top: 20px; padding: 10px 20px; background-color: darkcyan; color: white; border: none; border-radius: 4px; cursor: pointer;">
                Generate All Bills
            </button>
    </div>

    <footer class="footer">
        <div>
            <a href="https://wa.me" target="_blank">WhatsApp</a>
            <a href="https://linkedin.com" target="_blank">LinkedIn</a>
        </div>
        <div id="current-date-time"></div>
    </footer>

   <script>
      let products = {};
      <c:forEach items="${listOfStock}" var="list">
          products["${list.productName}"] = {
              rate: "${list.rate}",
              hsn: "${list.hsn}",
              batchNumber: "${list.batchNumber}",
              mrp: "${list.mrp}",
              discount: "",
              gst: "",
              qty: "",
              totalAmount: "${list.amount}"
          };
      </c:forEach>

      document.getElementById("productName").addEventListener("change", function() {
          let selectedProduct = this.value;
          if (selectedProduct in products) {
              document.getElementById("rate").value = products[selectedProduct].rate;
              document.getElementById("hsn").value = products[selectedProduct].hsn;
              document.getElementById("batchNumber").value = products[selectedProduct].batchNumber;
              document.getElementById("mrp").value = products[selectedProduct].mrp;
              document.getElementById("discount").value = products[selectedProduct].discount;
              document.getElementById("gst").value = products[selectedProduct].gst;
              document.getElementById("qty").value = products[selectedProduct].qty;
              document.getElementById("totalAmount").value = products[selectedProduct].totalAmount;
          }
      });

      document.getElementById("salesForm").addEventListener("submit", function(event) {
          event.preventDefault();

          let rate = parseFloat(document.getElementById("rate").value) || 0;
          let qty = parseInt(document.getElementById("qty").value) || 0;
          let discount = parseInt(document.getElementById("discount").value) || 0;
          let gst = parseFloat(document.getElementById("gst").value) || 0;

          let discountAmount = (rate * qty * discount) / 100;
          let gstAmount = ((rate * qty - discountAmount) * gst) / 100;
          let totalAmount = (rate * qty) - discountAmount + gstAmount;

          document.getElementById("totalAmount").value = totalAmount.toFixed(2);

          this.submit();
      });

      function generateAllBills() {
          const rows = document.querySelectorAll("table tbody tr");
          const salesData = {
              productName: [],
              customerName: [],
              rate: [],
              hsn: [],
              batchNumber: [],
              mrp: [],
              discount: [],
              gst: [],
              qty: [],
              totalAmount: []
          };

          rows.forEach((row) => {
              salesData.productName.push(row.cells[1].textContent);
              salesData.customerName.push(row.cells[3].textContent);
              salesData.rate.push(row.cells[2].textContent.replace(" Rs", ""));
              salesData.hsn.push(row.cells[4].textContent);
              salesData.batchNumber.push(row.cells[5].textContent);
              salesData.mrp.push(row.cells[6].textContent.replace(" Rs", ""));
              salesData.discount.push(row.cells[7].textContent.replace(" %", ""));
              salesData.gst.push(row.cells[8].textContent);
              salesData.qty.push(row.cells[9].textContent);
              salesData.totalAmount.push(row.cells[10].textContent.replace(" Rs", ""));
          });

          const params = new URLSearchParams();
          for (const key in salesData) {
              salesData[key].forEach(value => params.append(key, value));
          }

          const url = 'generate?' + params.toString();

          fetch(url, {
              method: 'GET',
              headers: {
                  'Content-Type': 'application/json'
              }
          })
          .then(response => {
              if (!response.ok) {
                  throw new Error('Network response was not ok');
              }
              return response.text();
          })
          .then(data => {
              console.log('Success:', data);
              alert("PDF generated successfully!");
          })
          .catch(error => {
              console.error('Error:', error);
              alert("Error generating PDF. Please check the console.");
          });
      }

      function updateDateTime() {
          const now = new Date();
          document.getElementById("current-date-time").innerText = now.toLocaleString();
      }
      setInterval(updateDateTime, 1000);
   </script>

</body>
</html>