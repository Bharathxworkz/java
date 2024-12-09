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
@WebServlet("/register")
public class CustomerServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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

        CustomerService customerService = new CustomerServiceImpl();
        customerService.validateAndSaveUser(customerDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you " + givenName + " for registering with us");

    }
}

