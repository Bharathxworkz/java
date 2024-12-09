package com.xworkz.userapp.servlet;

import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/test"}, loadOnStartup = 5)
public class GetdataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("id");
        if (id != null && !id.isEmpty()) {
            int parsedId = Integer.parseInt(id);
            UserService userService = new UserServiceImpl();
            req.setAttribute("user", userService.detailsByid(parsedId));
            req.getRequestDispatcher("getdata.jsp").forward(req, resp);
        }
    }
}
