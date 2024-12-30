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

@WebServlet(urlPatterns = {"/updateUser"})
public class UpdateUserServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String phoneNumber = req.getParameter("phoneNumber");
        String adhaar = req.getParameter("adhaar");
        String id= req.getParameter("id");


        UserDto userDto=new UserDto();

        userDto.setFirstName(firstName);
       userDto.setId(Integer.parseInt(id));
       userDto.setLastName(lastName);
       userDto.setAge(Integer.parseInt(age));
       userDto.setPhoneNumber(Long.parseLong(phoneNumber));
       userDto.setAdhaar(adhaar);


        UserService userService=new UserServiceImpl();
        userService.updateUser(userDto);

        req.setAttribute("updateInfo","Updated Successfully");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}

