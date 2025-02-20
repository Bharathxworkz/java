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

@WebServlet(urlPatterns = {"/updateUser"},loadOnStartup  =+2)
public class UpdateUserServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fName = req.getParameter("fName");
        String lName = req.getParameter("lName");
        String pNumber = req.getParameter("pNumber");
        String income = req.getParameter("income");
        String id= req.getParameter("id");


        TaxUserDto taxUserDto=new TaxUserDto();
        taxUserDto.setFName(fName);
        taxUserDto.setLName(lName);
        taxUserDto.setPNumber(Long.parseLong(pNumber));
        taxUserDto.setIncome(Double.parseDouble(income));
        taxUserDto.setId(Integer.parseInt(id));


        TaxUserService taxUserService=new TaxUserServiceImpl();
        taxUserService.updateUser(taxUserDto);

        req.setAttribute("updateInfo","Updated Successfully");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
