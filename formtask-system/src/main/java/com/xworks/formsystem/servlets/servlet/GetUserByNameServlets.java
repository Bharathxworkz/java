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

@WebServlet(urlPatterns = {"/getuserbyname"})
public class GetUserByNameServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName=req.getParameter("firstName");


        FormService formService=new FormServiceImpl();
        FormDto formDto=formService.getUserFormbyFirstname(firstName);

       req.setAttribute("user",formDto);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getuserbyname.jsp");
        requestDispatcher.forward(req,resp);



    }
}
