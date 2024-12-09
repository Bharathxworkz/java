<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin: 10px 0 5px;
            font-weight: bold;
            color: #555;
        }

        input, select, textarea, button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }

        button {
            background-color: #4caf50;
            color: white;
            font-size: 16px;
            cursor: pointer;
            border: none;
        }

        button:hover {
            background-color: #45a049;
        }

        .radio-group {
            display: flex;
            gap: 10px;
            align-items: center;
        }

        .radio-group label {
            margin: 0;
            font-weight: normal;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Add Event</h2>
        <form action="test" method="post">
            <label for="eventType">Event Type:</label>
            <select id="eventType" name="eventType" required>
                <option value="Leave">Leave</option>
                <option value="Holidays">Holidays</option>
                <option value="Birthdays">Birthdays</option>
                <option value="Travel">Travel</option>
            </select>

            <label for="who">Who:</label>
            <input type="text" id="who" name="who" placeholder="Enter the person's name" required>

            <label for="startDate">Start Date:</label>
            <input type="date" id="startDate" name="startDate" required>

            <label for="endDate">End Date:</label>
            <input type="date" id="endDate" name="endDate">

            <label for="description">Description:</label>
            <textarea id="description" name="description" rows="4" placeholder="Enter event details"></textarea>

            <label>All Day Event:</label>
            <div class="radio-group">
                <input type="radio" id="allDayYes" name="allDayEvent" value="Yes">
                <label for="allDayYes">Yes</label>
                <input type="radio" id="allDayNo" name="allDayEvent" value="No" checked>
                <label for="allDayNo">No</label>
            </div>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
