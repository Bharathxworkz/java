<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Job Application Form</title>
    <style>
         body {
                    font-family: Arial, sans-serif;
                    background-color: aqua;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                    margin: 0;
                }

                .form-container {
                    background-color: #ffffff;
                    padding: 20px;
                    border-radius: 8px;
                    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                    width: 350px;
                }

                h2 {
                    text-align: center;
                    margin-bottom: 20px;
                }

                label {
                    display: block;
                    margin-bottom: 5px;
                    font-size: 14px;
                }

                input, select {
                    width: 100%;
                    padding: 8px;
                    margin-bottom: 15px;
                    border: 1px solid #ccc;
                    border-radius: 4px;
                }

                button {
                    width: 100%;
                    padding: 10px;
                    background-color: #4CAF50;
                    color: #fff;
                    border: none;
                    border-radius: 4px;
                    cursor: pointer;
                }

                button:hover {
                    background-color: #45a049;
                }


                .index {
                    position: fixed;
                    left: 0;
                    top: 10%;
                    transform: translateY(-50%);
                    padding: 10px;
                }

                .styled-button {
                    background-color: #007bff;
                    color: white;
                    padding: 10px 20px;
                    text-decoration: none;
                    border-radius: 5px;
                    font-size: 16px;
                }

                .styled-button:hover {
                    background-color: #0056b3; /* Darker shade on hover */
                }

                .styled-button {
                    display: inline-block;
                    text-decoration: none;
                    background-color: #007BFF;
                    color: white;
                    font-size: 14px;
                    font-weight: bold;
                    padding: 10px 20px;
                    border-radius: 5px;
                    border: none;
                    cursor: pointer;
                }

                .styled-button:hover {
                    background-color: #0056b3;
                }
            </style>
</head>
<body>
   <div class="index">
            <a href="index.jsp" class="styled-button">Home</a>
            <a href="getAllUsers" class="styled-button">Back</a>
        </div>
    <div class="form-container">
        <h2>Job Application</h2>
        <form action= "updateUser" method= "post">

        <input type="text" hidden name = "id" value= ${user.getUserid() }>

            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required value= ${user.getName()} >

            <label for="email">Email Address:</label>
            <input type="email" id="email" name="email" required value= ${user.getEmail()} >

            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone" required value= ${user.getPhoneNo()} >

            <label for="position">Position Applied For:</label>
            <select id="position" name="position" required value= ${user.getPosition()} >
                <option value="" disabled selected>Select Position</option>
                <option value="developer">Developer</option>
                <option value="designer">Designer</option>
                <option value="manager">Manager</option>
                <option value="tester">Tester</option>
                <option value="team_lead">Team Lead</option>
                <option value="hr">HR</option>
                <option value="marketing_executive">Marketing Executive</option>
                <option value="business_analyst">Business Analyst</option>
                <option value="data_analyst">Data Analyst</option>
                <option value="product_manager">Product Manager</option>
                <option value="software_architect">Software Architect</option>
                <option value="ui_ux_designer">UI/UX Designer</option>
                <option value="content_writer">Content Writer</option>
            </select>


            <label for="experience">Years of Experience:</label>
            <input type="number" id="experience" name="experience" required value= ${user.getExperience()} min="0">

            <button type="submit" value= "Update">Apply Now</button>

        </form>
    </div>
</body>
</html>
