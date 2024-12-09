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

@WebServlet(urlPatterns = "/delete")
public class DeleteUserServlets extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id=req.getParameter("id");

        FormService formService=new FormServiceImpl();
        boolean isDeleted=formService.deleteUserById(Integer.parseInt(id));

       // resp.sendRedirect(req.getContextPath()+"/getalluser");




       RequestDispatcher requestDispatcher=req.getRequestDispatcher("getalluserlist");
      requestDispatcher.forward(req,resp);


    }
}


