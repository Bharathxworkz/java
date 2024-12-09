package com.xworkz.calenderapp.servlets;

import com.xworkz.calenderapp.dto.EventDto;
import com.xworkz.calenderapp.service.EventService;
import com.xworkz.calenderapp.service.Eventserviceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet("/register")
public class WebServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String eventType = req.getParameter("eventType");
        String reasonForEvent = req.getParameter("reasonForEvent");
        String name = req.getParameter("name");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String isAllDayEvent = req.getParameter("isAllDayEvent");
        String description = req.getParameter("description");

        EventDto eventDto = new EventDto();
        eventDto.setEventType(eventType);
        eventDto.setReasonForEvent(reasonForEvent);
        eventDto.setName(name);
        eventDto.setStartDate(startDate);
        eventDto.setEndDate(endDate);
        eventDto.setAllDayEvent(isAllDayEvent);
        eventDto.setDescription(description);

        EventService eventService = new Eventserviceimpl();
        eventService.validateAndSaveEvent(eventDto);
//        EventDto eventDto1 = eventService.getUserEventById(1);
//        System.out.println(eventDto1);
        List<EventDto> eventDtoList = eventService.getAllUsers();
        System.out.println(eventDtoList);


        req.setAttribute("key" , name);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);

    }
}
