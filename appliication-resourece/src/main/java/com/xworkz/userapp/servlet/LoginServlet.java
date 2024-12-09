package com.xworkz.userapp.servlet;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
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
        String dateOfBirth = req.getParameter("dob");
        String phoneNumber = req.getParameter("phone");
        String email = req.getParameter("email");
        String qualification = req.getParameter("qualification");
        String maritalStatus = req.getParameter("marital");
        String currentJobTitle = req.getParameter("job");
        String yearsOfExperience = req.getParameter("experience");


        UserDto userDto = new UserDto();
        userDto.setFirstName(firstName);
        userDto.setLastName(lastName);
        userDto.setAdharNumber(Long.valueOf(adharNumber));
        userDto.setGender(gender);
        userDto.setAddress(address);
        userDto.setDateOfBirth(dateOfBirth);
        userDto.setPhoneNumber(Long.valueOf(phoneNumber));
        userDto.setEmail(email);
        userDto.setQualification(qualification);
        userDto.setMaritalStatus(maritalStatus);
        userDto.setCurrentJobTitle(currentJobTitle);
        userDto.setYearsOfExperience(Integer.parseInt(yearsOfExperience));
        UserService service = new UserServiceImpl();
        boolean isSaved = service.validateAndSaveUser(userDto);
        /*PrintWriter printWriter = resp.getWriter();

        if (isSaved) {
            printWriter.write("User Registration for " + firstName + " " + lastName + " is successful.");
        } else {
            printWriter.write("User Registration failed. Please check the details and try again.");
        }*/
        req.setAttribute("key",firstName);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);
        System.out.println("dopost ended");
    }
}
