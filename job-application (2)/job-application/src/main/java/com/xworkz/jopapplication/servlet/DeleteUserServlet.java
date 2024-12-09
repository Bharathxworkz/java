package com.xworkz.jopapplication.servlet;

import com.xworkz.jopapplication.service.JobService;
import com.xworkz.jopapplication.service.JobServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("userid");

        JobService jobService = new JobServiceImpl();
        jobService.deleteUserById(Integer.parseInt(id));

        resp.sendRedirect(req.getContextPath()+"/getAllUsers");

        /*RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUsers");
        requestDispatcher.forward(req,resp);*/
    }
}
