package com.xworkz.usernapp.sevlet;


import com.xworkz.usernapp.servlet.service.TaxUserService;
import com.xworkz.usernapp.servlet.service.TaxUserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/delete"},loadOnStartup  =+2)
public class DeleteUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {





        String id=req.getParameter("id");


        TaxUserService taxUserService=new TaxUserServiceImpl();
        boolean isDeleted=taxUserService.deleteUserById(Integer.parseInt(id));


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllUser");
        requestDispatcher.forward(req,resp);
    }


}
