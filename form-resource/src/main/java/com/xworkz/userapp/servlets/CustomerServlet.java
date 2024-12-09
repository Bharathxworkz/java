package com.xworkz.userapp.servlets;

import com.xworkz.userapp.dto.CustomerDto;
import com.xworkz.userapp.service.CustomerService;
import com.xworkz.userapp.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/register")
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Fetching parameters
        String registerToApplyAt = req.getParameter("apply");
        String passportOffice = req.getParameter("passportOffice");
        String givenName = req.getParameter("givenName");
        String surName = req.getParameter("surName");
        String dob = req.getParameter("dob");
        String email = req.getParameter("email");
        String isEmailIdSame = req.getParameter("isEmailIdSame");
        String loginId = req.getParameter("loginId");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String hintQuestion = req.getParameter("hintQuestion");
        String hintAnswer = req.getParameter("hintAnswer");
        String captcha = req.getParameter("captcha");

        // Validation logic
        PrintWriter printWriter = resp.getWriter();

        // Validate required fields
        if (registerToApplyAt == null || passportOffice == null || givenName == null || surName == null || dob == null || email == null || loginId == null || password == null || confirmPassword == null || hintQuestion == null || hintAnswer == null || captcha == null) {
            printWriter.write("<h5>Error: All fields are required!</h5>");
            return;
        }

        // Validate email format using regex
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher emailMatcher = emailPattern.matcher(email);
        if (!emailMatcher.matches()) {
            printWriter.write("<h5>Error: Invalid email format!</h5>");
            return;
        }

        // Check if password and confirm password match
        if (!password.equals(confirmPassword)) {
            printWriter.write("<h5>Error: Passwords do not match!</h5>");
            return;
        }

        // Password strength validation (basic example)
        if (password.length() < 6) {
            printWriter.write("<h5>Error: Password should be at least 6 characters long!</h5>");
            return;
        }

        // Creating CustomerDto object
        CustomerDto customerDto = new CustomerDto();
        customerDto.setRegisterToApplyAt(registerToApplyAt);
        customerDto.setPassportOffice(passportOffice);
        customerDto.setGivenName(givenName);
        customerDto.setSurName(surName);
        customerDto.setDob(dob);
        customerDto.setEmail(email);
        customerDto.setIsEmailIdSame(isEmailIdSame);
        customerDto.setLoginId(loginId);
        customerDto.setPassword(password);
        customerDto.setConfirmPassword(confirmPassword);
        customerDto.setHintQuestion(hintQuestion);
        customerDto.setHintAnswer(hintAnswer);
        customerDto.setCaptcha(captcha);

        // Save the user if valid
        CustomerService customerService = new CustomerServiceImpl();
        customerService.validateAndSaveUser(customerDto);

        // Display success message
        printWriter.write("<h5>Thank you " + givenName + " for registering with us.</h5>");
    }
}
