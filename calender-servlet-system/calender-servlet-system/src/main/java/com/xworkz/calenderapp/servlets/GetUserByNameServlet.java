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

@WebServlet(urlPatterns = {"/getuserbyname"})
public class GetUserByNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        EventService eventService = new Eventserviceimpl();
        EventDto eventDto = eventService.getUserEventByName(name);

        req.setAttribute("user",eventDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUserByName.jsp");
        requestDispatcher.forward(req,resp);
    }
}
