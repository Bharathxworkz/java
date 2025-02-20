<%@ page isELIgnored="false" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MEGA Gym</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
        /* Reset and base styles */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: #333;
        }

        /* Header styles */
        header {
            background-image: url("https://i.pinimg.com/736x/47/b0/5e/47b05efc77dd8bdd44aeecbaa496dce5.jpg");
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
            color: #fff;
            padding: 1rem;
        }

       nav {
           display: flex;
           align-items: center;
           justify-content: space-between;
           background-color: #333;
           padding: 10px 20px;
           color: #fff;
           font-family: Arial, sans-serif;
       }

       nav a {
           color: #fff;
           text-decoration: none;
           margin: 0 10px;
           padding: 8px 15px;
           border-radius: 5px;
           transition: background-color 0.3s ease;
       }

       nav a:hover {
           background-color: #555;
       }

       nav span {
           color: #ccc;
           font-size: 1rem;
           margin-right: 10px;
       }

       nav .d-flex {
           display: flex;
           align-items: center;
       }

       nav img {
           width: 50px;
           height: 50px;
           border-radius: 50%;

           object-fit: cover;
       }

       nav .ms-2 {
           margin-left: 10px;
       }


        header h1 {
            font-size: 4rem;
            margin-bottom: 1rem;
            padding-top: 17%;
        }

        header h2 {
            font-size: 20px;
            margin-bottom: 2rem;
        }

        header p {
            margin-bottom: 2rem;
            max-width: 600px;
        }

        .btn {
            display: inline-block;
            background-color: #f00;
            color: #fff;
            padding: 1rem 2rem;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        .btn:hover {
            background-color: #c00;
        }

        /* Section styles */
        section {
            padding: 4rem 1rem;
            text-align: center;
        }

        section h2 {
            font-size: 2.5rem;
            margin-bottom: 2rem;
        }

        /* Process section */
        .process {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            max-width: 1200px;
            margin: 0 auto;
        }

        .process-item {
            background-color: #f5f5f5;
            padding: 2rem;
            margin: 1rem;
            text-align: center;
            border-radius: 5px;
            width: 200px;
            transition: background-color 0.3s;
        }

        .process-item:hover {
            background-color: #e5e5e5;
        }

        .process-item i {
            font-size: 3rem;
            color: #f00;
            margin-bottom: 1rem;
        }

        /* Stats section */
        .stats {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            max-width: 1200px;
            margin: 0 auto;
        }

        .stat {
            background-color: #f5f5f5;
            padding: 2rem;
            margin: 1rem;
            text-align: center;
            border-radius: 5px;
            width: 150px;
            transition: background-color 0.3s;
        }

        .stat:hover {
            background-color: #e5e5e5;
        }

        .stat i {
            font-size: 2rem;
            color: #f00;
            margin-bottom: 1rem;
        }

        /* Pricing section */
        .pricing {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            max-width: 1200px;
            margin: 0 auto;
            padding-top: 2%;
            padding-right: 2%;
        }

        .pricing-plan {
            background-color: #f5f5f5;
            padding: 2rem;
            margin: 1rem;
            text-align: center;
            border-radius: 5px;
            width: 300px;
            transition: background-color 0.3s, transform 0.3s;
        }

        .pricing-plan:hover {
            background-color: #e5e5e5;
            transform: translateY(-5px);
        }

        .pricing-plan h2 {
            margin-bottom: 1rem;
        }

        .pricing-plan h3 {
            font-size: 3rem;
            margin-bottom: 2rem;
        }

        .pricing-plan ul {
            list-style: none;
            padding: 0;
            margin-bottom: 2rem;
        }

        .pricing-plan li {
            margin-bottom: 0.5rem;
        }

        .pricing-plan button {
            background-color: #f00;
            color: #fff;
            padding: 1rem 2rem;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .pricing-plan button:hover {
            background-color: #c00;
        }

        .pricing-plan.featured {
            background-color: #f00;
            color: #fff;
            transform: scale(1.1);
        }

        .pricing-plan.featured button {
            background-color: #fff;
            color: #f00;
        }

        /* Keep in Touch section */
        .keep-in-touch {
            background-color: #333;
            color: #fff;
            padding: 4rem 1rem;
            text-align: center;
        }

        .keep-in-touch h2 {
            margin-bottom: 2rem;
        }

        .contact-info p {
            margin-bottom: 1rem;
        }

        .social-links a {
            color: #fff;
            font-size: 2rem;
            margin: 0 1rem;
            transition: color 0.3s;
        }

        .social-links a:hover {
            color: #f00;
        }
        .contact-form {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        align-items: center;
        padding: 20px;
        background-color: #f5f5f5;
        }

        .contact-form h2 {
        flex-basis: 100%;
        margin-bottom: 10px;
        }

        .contact-form p {
        flex-basis: 100%;
        margin-bottom: 20px;
        }

        .contact-form form {
        flex-basis: 50%;
        padding-right: 20px;
        }

        .contact-form input,
        .contact-form textarea,
        .contact-form select {
        display: block;
        width: 100%;
        margin-bottom: 10px;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        }

        .contact-form button {
        background-color: #ff5a5f;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        }

        .contact-image {
        flex-basis: 50%;
        }

        .contact-image img {
        max-width: 100%;
        height: auto;
        }
        /* Center the Contact Section */
        .contact-section {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            margin: 0 auto;
            padding: 20px;
            max-width: 800px; /* Adjust based on your design */
        }

        /* Social Links Below Contact Form */
        .social-links {
            margin-top: 10px;
            padding-bottom: 2%; /* Adjust as needed */
        }

        /* Footer Styles */
        footer {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            text-align: center;
            width: 100%;
            position: static;
            bottom: 0;
        }
            /* Example for Facebook icon */
        .social-links a.fa-facebook {
            color: #3B5998; /* Facebook blue */
        }

        .social-links a.fa-facebook:hover {
            color: #5073A1; /* Darker shade for hover */
        }

        /* Example for Twitter icon */
        .social-links a.fa-twitter {
            color: #1DA1F2; /* Twitter blue */
        }

        .social-links a.fa-twitter:hover {
            color: #14171A; /* Darker shade for hover */
        }
        /* Define default color for social links */
        .social-links a {
            color: #333; /* Default color, adjust as needed */
            transition: color 0.3s ease; /* Smooth transition for color change */
        }

        /* Change color on hover */
        .social-links a:hover {
            color: #00B6F1; /* Example color for Twitter, adjust as needed */
        }
        .team-container {
        display: flex; /* Arrange members horizontally */
        flex-direction: row;
        justify-content: space-between; /* Distribute space evenly */
        flex-wrap: nowrap; /* Keep members in one line */
        margin: 0 auto; /* Center horizontally */
        margin-top: 5%;
        max-width: 90%;
        padding-bottom: 5%;
        }

        .team-member {
        padding: 50px;
        padding-left: 50px;
        background-color: #fff; /* White background */
        border-radius: 5px;
        text-align: center;
        margin: 0 5px;
        width: calc(33.33% - 10px); /* Adjust width dynamically (3 members) */
        transition: all 0.3s ease-in-out; /* Smooth transition for hover */
        }

        .team-member img {
        width: 150px;
        height: 150px;
        border-radius: 50%;
        margin-bottom: 10px;
        }

        .team-member h3 {
        font-size: 20px;
        margin-bottom: 5px;
        }

        .team-member p {
        color: #666; /* Light gray text */
        }

        .heading {
        font-size: 45px;
        margin-bottom: 20px;
        text-align: center;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        color: #007bff; /* Blue heading */
        }
        .heading-image {
        /* Add styles for your heading image */
        width: 30%; /* Adjust width as needed */
        max-width: 400px; /* Optional maximum width */
        margin-bottom: 0%;
        margin-left: 30%; /* Adjust margin as needed */
        padding-top: 5%;
        }

        /* Hover animations */
        .team-member:hover {
        background-color: #f5f5f5; /* Light gray on hover */
        box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.1); /* Subtle shadow on hover */
        transform: scale(1.05); /* Slight zoom on hover */
        }

        /* Responsive adjustments for smaller screens */
        @media only screen and (max-width: 768px) {
        .team-member {
            width: 100%; /* Adjust width for smaller screens */
        }
        }


/* Continue for other social icons */


    </style>
</head>
<body>
<header>
    <nav >
        <a href="#">Home</a>
        <a href="#our-process">Our Process</a>
        <a href="#athlete-facts">Athlete Facts</a>
        <a href="#MeetTheTeam">Meet The Team</a>
        <a href="#Plans">Plans</a>
        <a href="#contactUs">Contact Us</a>


        <span>Hi ${name} </span>
        <a href="update?id=${dto.getId()} ">update</a>
        <div class="d-flex align-items-center">
                            <img src="view/${dto.getFileName()}" alt="Profile" class="rounded-circle" style="width: 50px; height: 50px;">
                            <div class="ms-2">
                          <a href="viewprofile">View profile</a>
    </nav>

    <h1>AI FITNESS WEB APP</h1>
    <h2>"AI Fitness: Where Tech Meets Fitness"</h2>
    <!-- <p>TRAIN THE FIGHTER IN YOU</p> -->
    <!-- <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Obcaecati, enim. Inventore atque voluptates reiciendis? Nam repellat maxime assumenda beatae aliquam!</p> -->
    <a href="#Plans" class="btn">TRY IT OUT</a>
</header>

<section id="our-process">
    <h2>OUR PROCESS</h2>
    <div class="process">
        <div class="process-item">
            <i class="fas fa-chart-line"></i>
            <h3>ANIMATED VISUAL TRAINING</h3>
        </div>
        <div class="process-item">
            <i class="fas fa-flask"></i>
            <h3>WORK HARD ON IT</h3>
        </div>
        <div class="process-item">
            <i class="fas fa-user-edit"></i>
            <h3>VIRTUAL TECHNIQUES</h3>
        </div>
        <div class="process-item">
            <i class="fas fa-gem"></i>
            <h3>ACHIEVE YOUR DESTINY</h3>
        </div>
    </div>
</section>

<section id="athlete-facts">
    <h2>ATHLETE FACTS</h2>
    <div class="stats">
        <div class="stat">
            <i class="fas fa-square-full"></i>
            <h3>2650</h3>
            <p>SQM.</p>
        </div>
        <div class="stat">
            <i class="fas fa-dumbbell"></i>
            <h3>320+</h3>
            <p>MACHINES</p>
        </div>
        <div class="stat">
            <i class="fas fa-user-friends"></i>
            <h3>354</h3>
            <p>TRAINERS</p>
        </div>
        <div class="stat">
            <i class="fas fa-swimmer"></i>
            <h3>50</h3>
            <p>METRES POOL</p>
        </div>
        <div class="stat">
            <i class="fas fa-bolt"></i>
            <h3>100</h3>
            <p>M. TRACK</p>
        </div>
    </div>
</section>

<section id="Plans">
    <h2> PLANS</h2>
    <p>Go with the right one</p>
    <div class="pricing">
        <div class="pricing-plan">
            <h2>Diamond</h2>

            <ul>
                <li>Chest</li>
                <li>Back</li>
                <li>Legs</li>
                <li>Arms</li>
                <li>Shoulder</li>
                <li>Cardio</li>
                <li>Neck</li>
                <li>Waist</li>
            </ul>
            <button onclick="window.location.href='Exercise'">TRY NOW</button>
        </div>
        <div class="pricing-plan featured">
            <h2>Gold</h2>

            <ul>
                <li>Chest</li>
                <li>Back</li>
                <li>Legs</li>
                <li>Arms</li>
                <li>Shoulder</li>

            </ul>
            <button onclick="window.location.href='Exercise'">TRY NOW</button>
        </div>
        <div class="pricing-plan">
            <h2>Silver</h2>

            <ul>
                <li>Chest</li>
                <li>Back</li>
                <li>Legs</li>

            </ul>
            <button onclick="window.location.href='Exercise'">TRY NOW</button>
        </div>
    </div>
</section>

<section id="our-process">
    <h2>New Feature under Maintainence....(Virtual personal Workout) </h2>
    <div class="process">

    </div>
    </div>
</section>


<section id="MeetTheTeam">
    <div class="heading-image">
        <img src="data:image/jpeg;base64,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" style="height: 100px; width: 300px; margin-left: 45%;" alt="Your Team's Name">
    </div>
    <div class="team-container">
        <div class="team-member">
            <img src="download (1).png" alt="Sai Tejas Kr">
            <h3>Bharath L</h3>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Consequatur, assumenda..</p>
            <div class="social-links">
                <a href="replace-with-linkedin-profile-url">
                    <i class="fab fa-linkedin"></i>
                </a>
                <a href="replace-with-github-username-url">
                    <i class="fab fa-github"></i>
                </a>
                <a href="replace-with-instagram-handle-url">
                    <i class="fab fa-instagram"></i>
                </a>
            </div>
        </div>
        <div class="team-member">
            <img src="person.png" alt="Suhas P R">
            <h3>Nandan</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, enim.</p>
            <div class="social-links">
                <a href="replace-with-linkedin-profile-url">
                    <i class="fab fa-linkedin"></i>
                </a>
                <a href="replace-with-github-username-url">
                    <i class="fab fa-github"></i>
                </a>
                <a href="replace-with-instagram-handle-url">
                    <i class="fab fa-instagram"></i>
                </a>
            </div>
        </div>
        <div class="team-member">
            <img src="person.png" alt="Vishwas L">
            <h3>Hariprasad </h3>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia, quidem!</p>
            <div class="social-links">
                <a href="replace-with-linkedin-profile-url">
                    <i class="fab fa-linkedin"></i>
                </a>
                <a href="replace-with-github-username-url">
                    <i class="fab fa-github"></i>
                </a>
                <a href="replace-with-instagram-handle-url">
                    <i class="fab fa-instagram"></i>
                </a>
            </div>
        </div>
        <div class="team-member">
            <img src="person.png" alt="Vishwas L">
            <h3>Teja Akhil Ram</h3>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia, quidem!</p>
            <div class="social-links">
                <a href="replace-with-linkedin-profile-url">
                    <i class="fab fa-linkedin"></i>
                </a>
                <a href="replace-with-github-username-url">
                    <i class="fab fa-github"></i>
                </a>
                <a href="replace-with-instagram-handle-url">
                    <i class="fab fa-instagram"></i>
                </a>
            </div>
        </div>
    </div>
</section>

<section id="contactUs">
    <div class="contact-section">
        <div class="contact-form">
            <!-- Contact form content -->
            <h2>CONTACT US</h2>
            <p>We'd love to hear from you.</p>
            <p>General inquiries, suggestions or comments, let us know!</p>
            <form>
                <input type="text" placeholder="First Name" />
                <input type="text" placeholder="Last Name" />
                <input type="email" placeholder="Email" />
                <input type="tel" placeholder="Phone" />
                <textarea placeholder="Message"></textarea>
                <select>
                    <option value="">How did you hear about us?</option>
                    <option value="option1">Through Friend </option>
                    <option value="option2">Social Media</option>
                    <option value="option3">Connections</option>
                </select>
                <button type="submit">SUBMIT</button>
            </form>
        </div>
        <div class="social-links">
            <!-- Social links -->
            <a href="#"><i class="fab fa-facebook"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-youtube"></i></a>
        </div>
    </div>
</section>

<!-- Footer Section -->
<footer>
    <p>&copy; 2024 AiFitnessApp. All rights reserved.</p>
</footer>




</body>
</html>