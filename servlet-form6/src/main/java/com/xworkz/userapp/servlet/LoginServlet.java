package com.xworkz.userapp.servlet;

import com.xworkz.userapp.constraint.Gender;
import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;
import lombok.Getter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String adharNumber = req.getParameter("adhar");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");

        UserDto userDto = new UserDto();
       userDto.setUserId(1);
       userDto.setFirstName(firstName);
       userDto.setLastName(lastName);
       userDto.setAdharNumber(Long.parseLong(adharNumber));
        userDto.setGender(gender);
        userDto.setAddress(address);


        UserService service = new UserServiceImpl();
        service.validateAndSaveUser(userDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("User Registration for " + firstName + " " + lastName + " is successfull");

    }
}
