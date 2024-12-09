package com.xworkz.jopapplication.servlet;

import com.xworkz.jopapplication.dto.JobDto;
import com.xworkz.jopapplication.service.JobService;
import com.xworkz.jopapplication.service.JobServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/fetchUser")
public class FetchUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        JobService jobService = new JobServiceImpl();
        JobDto jobDto = jobService.getById(Integer.parseInt(id));

        req.setAttribute("user",jobDto);
req.setAttribute("user",jobDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetch-user.jsp");
        requestDispatcher.forward(req,resp);


    }
}

