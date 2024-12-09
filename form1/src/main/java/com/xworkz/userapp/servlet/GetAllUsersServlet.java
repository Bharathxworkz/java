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
import java.util.List;

@WebServlet(urlPatterns = {"/getAllUser"},loadOnStartup  =-7)
public class GetAllUsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        UserService userService=new UserServiceImpl();

        List<UserDto>dtos=userService.getAllUsers();


        req.setAttribute("user",dtos);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);
    }


}
