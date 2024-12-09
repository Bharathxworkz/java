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

@WebServlet(urlPatterns = {"/fetchUser"})
public class FetchUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        EventService eventService = new Eventserviceimpl();
        EventDto dto = eventService.getUserEventById(Integer.parseInt(id));

        req.setAttribute("user" , dto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
