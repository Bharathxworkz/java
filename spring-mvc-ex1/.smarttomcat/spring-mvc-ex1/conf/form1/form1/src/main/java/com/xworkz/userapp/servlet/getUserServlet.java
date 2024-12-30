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

@WebServlet(urlPatterns = {"/getUser"},loadOnStartup  =-7)
public class getUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id=req.getParameter("id");
        //String firstName=req.getParameter("firstName");

        UserService userService=new UserServiceImpl();
        UserDto userDto=userService.getUserById(Integer.parseInt(id));
       // UserDto userDto=userService.getUserByName(firstName);

        req.setAttribute("user",userDto);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getUser.jsp");
   requestDispatcher.forward(req,resp);
    }


    }
