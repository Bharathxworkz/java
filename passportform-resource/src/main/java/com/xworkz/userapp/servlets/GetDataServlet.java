package com.xworkz.userapp.servlets;

import com.xworkz.userapp.service.CustomerService;
import com.xworkz.userapp.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/test")
public class GetDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("id");
        if (id != null && !id.isEmpty()) {
            int parsedId = Integer.parseInt(id);
            CustomerService userService = new CustomerServiceImpl();
            req.setAttribute("user", userService.getdetailsbyid(parsedId));
            req.getRequestDispatcher("data.jsp").forward(req, resp);
        }
    }
}
