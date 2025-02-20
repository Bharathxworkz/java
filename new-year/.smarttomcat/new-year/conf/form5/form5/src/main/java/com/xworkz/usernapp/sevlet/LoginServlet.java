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


@WebServlet(urlPatterns = {"/taxUser"},loadOnStartup  =+2)
public class LoginServlet extends HttpServlet {

    public LoginServlet(){
        System.out.println("Login Servlet Is Created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fName = req.getParameter("fName");
        String lName = req.getParameter("lName");
        String pNumber = req.getParameter("pNumber");
        String income = req.getParameter("income");

        TaxUserDto taxUserDto = new TaxUserDto();
        //taxUserDto.setId(4);
        taxUserDto.setFName(fName);
        taxUserDto.setLName(lName);
        taxUserDto.setPNumber(Long.parseLong(pNumber));
        taxUserDto.setIncome(Double.parseDouble(income));

        TaxUserService taxUserService = new TaxUserServiceImpl();
        taxUserService.addTaxUser(taxUserDto);

        req.setAttribute("key",fName);



        RequestDispatcher requestDispatcher=req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);

        /*PrintWriter writer = resp.getWriter();
        writer.write("Thank You for Registration " + fName);*/
    }
}


