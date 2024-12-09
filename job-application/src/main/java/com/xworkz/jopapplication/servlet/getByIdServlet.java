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

@WebServlet("/getuserbyid")
public class getByIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        JobService jobService = new JobServiceImpl();
        JobDto jobDto = jobService.getById(Integer.parseInt(id));

        req.setAttribute("dto",jobDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("searchById.jsp");
        requestDispatcher.forward(req,resp);
    }
}
