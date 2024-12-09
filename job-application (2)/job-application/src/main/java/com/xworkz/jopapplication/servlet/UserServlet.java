package com.xworkz.jopapplication.servlet;

import com.xworkz.jopapplication.dto.JobDto;
import com.xworkz.jopapplication.service.JobService;
import com.xworkz.jopapplication.service.JobServiceImpl;

import javax.jws.soap.SOAPBinding;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    public UserServlet(){
        System.out.println("Servlet object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet is initialized");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("service started the request");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phoneNo = req.getParameter("phone");
        String position = req.getParameter("position");
        String experience = req.getParameter("experience");

        JobDto jobDto = new JobDto();
        jobDto.setName(name);
        jobDto.setEmail(email);
        jobDto.setPhoneNo(phoneNo);
        jobDto.setPosition(position);
        jobDto.setExperience(experience);

        JobService jobService = new JobServiceImpl();
        jobService.validAndSave(jobDto);

        req.setAttribute("key",name);
        req.setAttribute("email",email);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}
