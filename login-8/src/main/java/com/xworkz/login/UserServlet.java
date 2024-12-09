package com.xworkz.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String feedback = req.getParameter("feedback");
        String ratings = req.getParameter("ratings");

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you for your feedback");
    }
}
