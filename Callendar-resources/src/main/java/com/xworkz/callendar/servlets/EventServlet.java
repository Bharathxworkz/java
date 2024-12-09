package com.xworkz.callendar.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class EventServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String eventType = req.getParameter("eventType");
        String who = req.getParameter("who");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String description = req.getParameter("description");
        String allDayEvent = req.getParameter("allDayEvent");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Event Submitted Successfully!</h1>");
        out.println("<p>Event Type: " + eventType + "</p>");
        out.println("<p>Who: " + who + "</p>");
        out.println("<p>Start Date: " + startDate + "</p>");
        out.println("<p>End Date: " + endDate + "</p>");
        out.println("<p>Description: " + description + "</p>");
        out.println("<p>All Day Event: " + allDayEvent + "</p>");
    }
}
