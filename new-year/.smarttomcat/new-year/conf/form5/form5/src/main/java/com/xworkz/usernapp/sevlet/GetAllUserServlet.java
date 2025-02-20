package com.xworkz.usernapp.sevlet;

import com.xworkz.usernapp.servlet.dto.TaxUserDto;
import com.xworkz.usernapp.servlet.service.TaxUserService;
import com.xworkz.usernapp.servlet.service.TaxUserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = {"/getAllUser"},loadOnStartup  =+2)
public class GetAllUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        TaxUserService taxUserService=new TaxUserServiceImpl();

        List<TaxUserDto> dtos=taxUserService.getAllUser();


        req.setAttribute("taxUser",dtos);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
