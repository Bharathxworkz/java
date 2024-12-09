 <!DOCTYPE html>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>10 Forms</title>
     <style>
         body {
             font-family: Arial, sans-serif;
             margin: 20px;
         }
         form {
             margin-bottom: 40px;
             border: 1px solid #ccc;
             padding: 20px;
             border-radius: 8px;
         }
         h2 {
             margin-bottom: 15px;
         }
         input, select, textarea, button {
             margin-top: 10px;
             display: block;
             width: 100%;
             max-width: 300px;
             padding: 10px;
             font-size: 14px;
             margin-bottom: 15px;
         }
     </style>
 </head>
 <h2>Reservation Form</h2>
    <form action="user" method="post">
        <label for="date">Date:</label>
        <input type="date" id="date" name="date">
        <label for="time">Time:</label>
        <input type="time" id="time" name="time">
        <label for="guests">Number of Guests:</label>
        <input type="number" id="guests" name="guests" min="1" placeholder="Number of guests">
        <button type="submit">Reserve</button>
    </form>

