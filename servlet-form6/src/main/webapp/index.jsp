<html>
<body bgcolor="goldenrod">
<h1>User Information Form</h1>
<form action="login" method="post">
First Name:
<input type ="text" name= "fname"><br><br>
Last Name:
<input type ="text" name= "lname"><br><br>
Adhaar Number:<br>
<input type="number"  name="adhar" required><br><br>
Gender:
<br>
<input type="radio" name="gender" value="male" required>
Male<br>
<input type="radio" name="gender" value="female" required>
Female<br>
<input type="radio" name="gender" value="other" required>
Other<br><br>
Address:<br>
<textarea name="address" rows="4" cols="50" required></textarea><br><br>
<input type = "submit" value="Submit">
</form>
</body>
</html>
