<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Job Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
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

    </style>
</head>
<body>
    <div class="form-container">
        <h2>Job Application</h2>
        <form action= "user" method="post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email Address:</label>
            <input type="email" id="email" name="email" required>

            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone" required>

            <label for="position">Position Applied For:</label>
            <select id="position" name="position" value="${user.getPosition()}" required>
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
            <input type="number" id="experience" name="experience" min="0" required>

            <button type="submit">Apply Now</button>


        </form>
    </div>
</body>
</html>
