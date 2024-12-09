<html>
<head>
<title>Feedback</title>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Image Gallery</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h2>Page 8: Survey Form</h2>

    <form action="user" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        <label for="age-group">Age Group:</label>
        <select id="age-group" name="age-group">
            <option value="18-25">18-25</option>
            <option value="26-35">26-35</option>
            <option value="36-45">36-45</option>
            <option value="46+">46+</option>
        </select><br>
        <label for="gender">Gender:</label>
        <select id="gender" name="gender">
                    <option value="" disabled selected>Select your gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="nonbinary">Non-binary</option>
                    <option value="prefer-not-to-say">Prefer not to say</option>
                </select><br>
        <label for="feedback-survey">Survey Feedback:</label>
        <textarea id="feedback-survey" name="feedback-survey" placeholder="Share your thoughts">
        </textarea><br>
        <button type="submit">Submit Survey</button>
    </form>
    </body>
</html>


