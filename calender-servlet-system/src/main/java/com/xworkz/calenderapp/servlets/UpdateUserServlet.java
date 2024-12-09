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
        // Get all the form parameters
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String eventType = req.getParameter("eventType");
        String reasonForEvent = req.getParameter("reasonForEvent");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String allDayEvent = req.getParameter("allDayEvent");
        String description = req.getParameter("description");

        // Create an EventDto object and set all the fields
        EventDto eventDto = new EventDto();
        eventDto.setId(Integer.parseInt(id));
        eventDto.setName(name);
        eventDto.setEventType(eventType);
        eventDto.setReasonForEvent(reasonForEvent);
        eventDto.setStartDate(startDate);
        eventDto.setEndDate(endDate);
        eventDto.setAllDayEvent(allDayEvent);
        eventDto.setDescription(description);

        // Call the service to update the user
        EventService eventService = new Eventserviceimpl();
        eventService.updateUser(eventDto);
      req.setAttribute("user",eventDto);
        // Set success message and forward to another page
        req.setAttribute("updateInfo", "Updated Successfully");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchUser.jsp");
        requestDispatcher.forward(req, resp);
    }
}
