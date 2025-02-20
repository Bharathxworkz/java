package com.xworkz.userapp.servlet;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import com.xworkz.userapp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/user"},loadOnStartup  =-3)
public class LoginServlet extends HttpServlet {
    UserService userService=null;

    public  LoginServlet() {
        System.out.println("Login Servlet Object is created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet  intitialisation");

        userService=new UserServiceImpl();


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("Service  phase to process the requset and response");
        String value = req.getParameter("firstName");
        String value1 = req.getParameter("lastName");
        String value2 = req.getParameter("age");
        String value3 = req.getParameter("phoneNumber");
        String value4 = req.getParameter("adhaar");


       UserDto userDto=new UserDto();
      //userDto.setId(5);
       userDto.setFirstName(value);
       userDto.setLastName(value1);
       userDto.setAge(Integer.parseInt(value2));
       userDto.setPhoneNumber(Long.parseLong(value3));
       userDto.setAdhaar(value4);


        UserService userService=new UserServiceImpl();
        userService.addUser(userDto);

        req.setAttribute("key",value);



        RequestDispatcher requestDispatcher=req.getRequestDispatcher("response1.jsp");
        requestDispatcher.forward(req,resp);
                


      /*  PrintWriter writer = resp.getWriter();

        writer.write("<html><body>");



        writer.write("Succefully Register your Application " +value  );*/
      /*  writer.write("<ul>");
        writer.println("<li> First Name " + value + "</li>");
        writer.println("<li> Last Name " + value1 + "</li>");
        writer.println("<li> Age " + value2 + "</li>");
        writer.println("<li> phoneNumber " + value3 + "</li>");
        writer.println("<li> adhaar " + value4 + "</li>");*/


    }
}

