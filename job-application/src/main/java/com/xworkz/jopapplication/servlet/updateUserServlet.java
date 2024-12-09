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

@WebServlet("/updateUser")
public class updateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String email = req.getParameter("email");
        String phoneNo = req.getParameter("phone");
        String position = req.getParameter("position");
        String experience = req.getParameter("experience");

        JobDto jobDto = new JobDto();
        jobDto.setName(name);
        jobDto.setUserid(Integer.parseInt(id));
        jobDto.setEmail(email);
        jobDto.setPhoneNo(phoneNo);
        jobDto.setPosition(position);
        jobDto.setExperience(experience);

        JobService jobService = new JobServiceImpl();
        jobService.updateUserById(jobDto);

        req.setAttribute("updateInfo", "User info updated successfully");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetch-user.jsp");
        requestDispatcher.forward(req, resp);
    }
}
