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
import java.util.List;

@WebServlet(urlPatterns = {"/getalluserslist"} )
public class GetAllUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EventService eventService = new Eventserviceimpl();
        List<EventDto> dto = eventService.getAllUsers();

        req.setAttribute("userlist" , dto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getallusers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
