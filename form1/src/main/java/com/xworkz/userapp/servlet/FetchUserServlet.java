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

@WebServlet(urlPatterns = {"/fetchUser"})
public class FetchUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        UserService userService=new UserServiceImpl();
       UserDto dto = userService.getUserById(Integer.parseInt(id));

        req.setAttribute("user" , dto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchUser.jsp");
        requestDispatcher.forward(req,resp);
    }


}
