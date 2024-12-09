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
import java.util.List;

@WebServlet(urlPatterns = {"/getalluserlist"})
public class GetAllUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        FormService formService=new FormServiceImpl();
       List<FormDto> formDto=formService.getAllForm();

        req.setAttribute("user",formDto);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getalluser.jsp");
        requestDispatcher.forward(req,resp);



    }
}
