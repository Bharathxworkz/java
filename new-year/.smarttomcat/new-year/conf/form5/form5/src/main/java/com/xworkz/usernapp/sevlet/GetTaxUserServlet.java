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


@WebServlet(urlPatterns = {"/getTaxUser"},loadOnStartup  =+2)
public class GetTaxUserServlet extends HttpServlet {

    @Override

    protected  void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {


        String id=req.getParameter("id");


        TaxUserService taxUserService=new TaxUserServiceImpl();
        TaxUserDto taxUserDto=taxUserService.getTaxUserById(Integer.parseInt(id));

        req.setAttribute("taxUser",taxUserDto);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getTaxUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
