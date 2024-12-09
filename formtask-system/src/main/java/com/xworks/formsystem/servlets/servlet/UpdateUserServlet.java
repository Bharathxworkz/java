package com.xworks.formsystem.servlets.servlet;

import com.xworks.formsystem.servlets.dto.FormDto;
import com.xworks.formsystem.servlets.service.FormService;
import com.xworks.formsystem.servlets.service.FormServiceImpl;

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
        String id=req.getParameter("id");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");
        String country = req.getParameter("country");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        FormDto formDto=new FormDto();
        formDto.setFirstName(firstName);
        formDto.setLastName(lastName);
        formDto.setEmail(email);
        formDto.setPhone(phone);
        formDto.setAddress(address);
        formDto.setCity(city);
        formDto.setState(state);
        formDto.setZip(zip);
        formDto.setCountry(country);
        formDto.setUserName(username);
        formDto.setPassword(password);


        formDto.setFirstName(firstName);
        formDto.setId(Integer.parseInt(id));

        FormService formService=new FormServiceImpl();
        formService.updateUser(formDto);

        req.setAttribute("updatedInfo","user info succesfully");
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("fetch-user.jsp");
        requestDispatcher.forward(req,resp);
    }
}
