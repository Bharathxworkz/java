package com.xworkz.userapp.servlet;

import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/text")
public class Mailservlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String mail=  req.getParameter("email");
        UserService userService = new UserServiceImpl();
        userService.detailsBymail(mail);
        RequestDispatcher requestDispatcher =new R

    }
}
