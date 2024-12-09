package com.xworkz.calenderapp.servlets;

import com.xworkz.calenderapp.dto.EventDto;
import com.xworkz.calenderapp.service.EventService;
import com.xworkz.calenderapp.service.Eventserviceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/updateUser"})
public class UpdateUserServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String id = req.getParameter("id");




        EventDto eventDto = new EventDto();
        eventDto.setName(name);
        eventDto.setId(Integer.parseInt(id));

        EventService eventService = new Eventserviceimpl();
        eventService.updateUser(eventDto);

        req.setAttribute("updateInfo","Updated Successfully");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
