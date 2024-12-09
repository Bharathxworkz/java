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

@WebServlet("/getAllUsers")
public class getAllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JobService jobService = new JobServiceImpl();
        List<JobDto> jobDtos = jobService.getAllUsers();

        req.setAttribute("jobDto", jobDtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUsers.jsp");
        requestDispatcher.forward(req, resp);

    }
}

