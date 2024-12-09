package com.xworks.formsystem.servlets.servlet;

import com.xworks.formsystem.servlets.dto.FormDto;
import com.xworks.formsystem.servlets.service.FormService;
import com.xworks.formsystem.servlets.service.FormServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/fetchUser"},loadOnStartup = +7)
public class GetUserServletById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String id= req.getParameter("id");

        FormService formService=new FormServiceImpl();
        FormDto dto=formService.getUserById(Integer.parseInt(id));



        req.setAttribute("userInfo",dto );//scope




        RequestDispatcher requestDispatcher=req.getRequestDispatcher("fetch-user.jsp");//forwarding the request to thejsp
        requestDispatcher.forward(req,resp);


    }
}
