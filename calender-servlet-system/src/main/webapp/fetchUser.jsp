<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: antiquewhite;
        }

        form {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }

        input[type="text"], input[type="email"], input[type="number"], input[type="password"], input[type="date"], textarea {
            width: 100%;
            height: 40px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        textarea {
            height: 100px;
        }

        input[type="submit"], input[type="reset"] {
            width: 100%;
            height: 40px;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: #fff;
        }

        input[type="reset"] {
            background-color: #ccc;
            color: #333;
        }

        select {
            width: 100%;
            height: 40px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .radio-container {
            margin-bottom: 10px;
        }

        .radio-container input {
            margin-right: 10px;
        }
    </style>
    <script>
        function clearDropdown() {
            var dropdown = document.getElementById("eventType");
            dropdown.innerHTML = '<option value="" disabled>---Select---</option>'; // clear existing options
        }
    </script>
</head>
<body>
<a href="index.jsp">
<button type="submit" >Home</button>
</a>
    <h3 align-text=> ${updateInfo} </h3>

    <h2>Update Calendar Event</h2>
    <form action="updateUser" method="post" onsubmit="clearDropdown()">
        <!-- Hidden Field for Event ID -->
        <input type="hidden" name="id" value="${user.getId()}">

        <!-- Event Type -->
        <label for="eventType">Event Type</label>
        <select name="eventType" id="eventType" required>
            <option value="" disabled>---Select---</option>
            <option>None</option>
            <option value="Leave" ${user.getEventType() == 'Leave' ? 'selected' : ''}>Leave</option>
            <option value="Holidays" ${user.getEventType() == 'Holidays' ? 'selected' : ''}>Holidays</option>
            <option value="Birthdays" ${user.getEventType() == 'Birthdays' ? 'selected' : ''}>Birthdays</option>
            <option value="Travel" ${user.getEventType() == 'Travel' ? 'selected' : ''}>Travel</option>
        </select>
        <br><br>

        <!-- Reason for Event -->
        <label for="reasonForEvent">Reason For Event</label>
        <input type="text" name="reasonForEvent" id="reasonForEvent" value="${user.getReasonForEvent()}" required>
        <br><br>

        <!-- Name -->
        <label for="name">Your Name</label>
        <input type="text" name="name" id="name" value="${user.getName()}" required>
        <br><br>

        <!-- Start Date -->
        <label for="startDate">Start Date</label>
        <input type="date" name="startDate" id="startDate" value="${user.getStartDate()}" required>
        <br><br>

        <!-- End Date -->
        <label for="endDate">End Date</label>
        <input type="date" name="endDate" id="endDate" value="${user.getEndDate()}" required>
        <br><br>

        <!-- All-Day Event -->
        <label>All Day Event</label>
        <div class="radio-container">
            <input type="radio" name="allDayEvent" value="Yes" ${user.getAllDayEvent().equals('Yes') ? 'checked' : ''}> Yes
            <input type="radio" name="allDayEvent" value="No" ${user.getAllDayEvent().equals('No') ? 'checked' : ''}> No
        </div>
        <br><br>

        <!-- Description -->
        <fieldset>
            <legend>Description</legend>
            <textarea name="description" id="description">${user.getDescription()}</textarea>
        </fieldset>
        <br>

        <!-- Submit Button -->
        <input type="submit" value="Update">
    </form>
</body>
</html>
