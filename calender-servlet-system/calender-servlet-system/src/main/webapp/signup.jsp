<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %>
<html>
<head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
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


input[type="text"], input[type="email"], input[type="number"], input[type="password"] {
    width: 100%;
    height: 40px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
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
</style>
</head>
<body>
<h2>Calender Event</h2>
<form action="register" method ="post">
Event Type
<br>
<select name="eventType" class ="select">
<option>---Select---</option>
<option>Leave</option>
<option>Holidays</option>
<option>BirthDays</option>
<option>Travel</option>
</select>
<br>
<br>
Reason For Event
<br>
<input type ="text" name="reasonForEvent" required>
<br>
<br>
Your Name
<br>
<input type ="text" name="name" required>
<br>
<br>
Start Date
<br>
<input type ="date" name="startDate" required>
<br>
<br>
End Date
<br>
<input type ="date" name="endDate" required>
<br>
<br>
All day event
<br>
<input type = "radio" name="isAllDayEvent" value="Yes" required>
Yes
<br>
<input type = "radio" name="isAllDayEvent" value="No" required>
No
<br>
<br>
<fieldset>
<legend>Description</legend>
<input type ="text" name="description" required>
<br>
</fieldset>
<br>
<input type="submit" value="Submit">
</form>
</body>
</html>