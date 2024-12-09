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

@WebServlet(urlPatterns = {"/delete"},loadOnStartup  =-7)
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {





        String id=req.getParameter("id");




        UserService userService=new UserServiceImpl();
        boolean isDeleted=userService.deleteUserById(Integer.parseInt(id));
       // resp.sendRedirect(req.getContextPath()+"/getAllUser");

      RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllUser");
       requestDispatcher.forward(req,resp);
    }


}
