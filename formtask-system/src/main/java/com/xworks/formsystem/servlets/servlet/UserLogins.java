package com.xworks.formsystem.servlets.servlet;

import com.xworks.formsystem.servlets.dto.FormDto;
import com.xworks.formsystem.servlets.service.FormService;
import com.xworks.formsystem.servlets.service.FormServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/login"},loadOnStartup = +8)
public class UserLogins extends HttpServlet {
    FormService formService=null;

 public UserLogins(){
       System.out.println("object is invoked");
   }

    @Override
    public void init(ServletConfig config) throws ServletException {
     formService=new FormServiceImpl();
        System.out.println("Initialisation process request");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service phase the rqst and resp");
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

        FormDto formDto = new FormDto();
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

        FormService formService = new FormServiceImpl();
          formService.addForm(formDto);

//        FormDto formDto1 = formService.getUserById(1);
//        System.out.println(formDto1);

        req.setAttribute("sinch",firstName);


//       List<FormDto> dtos= FormService.getAllUsers;
//       System.out.println(dtos);



        RequestDispatcher requestDispatcher=req.getRequestDispatcher(("response.jsp"));
        requestDispatcher.forward(req,resp);


//        PrintWriter printWriter = resp.getWriter();
////             l


























































































































































































































































































































































































































































































































//
//
//
//
//        printWriter.println("<html>");
//        printWriter.println("<head>");
//        printWriter.println("<link rel='stylesheet' href='(link unavailable)'>");
//        printWriter.println("<style>");
//        printWriter.println(".rotating-diamond {");
//        printWriter.println("  position: relative;");
//        printWriter.println("  width: 200px;");
//        printWriter.println("  height: 200px;");
//        printWriter.println("  margin: 0 auto;");
//        printWriter.println("  transform: rotate(0deg);");
//        printWriter.println("  animation: rotate 5s linear infinite;");
//        printWriter.println("}");
//        printWriter.println(".diamond {");
//        printWriter.println("  position: absolute;");
//        printWriter.println("  top: 50%;");
//        printWriter.println("  left: 50%;");
//        printWriter.println("  transform: translate(-50%, -50%) rotate(45deg);");
//        printWriter.println("  width: 100px;");
//        printWriter.println("  height: 100px;");
//        printWriter.println("  background-color: #007bff;");
//        printWriter.println("}");
//        printWriter.println("@keyframes rotate {");
//        printWriter.println("  0% { transform: rotate(0deg); }");
//        printWriter.println("  100% { transform: rotate(360deg); }");
//        printWriter.println("}");
//        printWriter.println("</style>");
//        printWriter.println("</head>");
//        printWriter.println("<body style='text-align: center; background-color: pink; color: black; padding-top: 20%;'>");
//        printWriter.println("<div class='container'>");
//        printWriter.println("<div class='row justify-content-center'>");
//        printWriter.println("<div class='col-md-6'>");
//        printWriter.println("<div class='rotating-diamond'>");
//        printWriter.println("<div class='diamond'></div>");
//        printWriter.println("<h2 style='position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);'>Thank you " + firstName + " for Registering!</h2>");
//        printWriter.println("</div>");
//        printWriter.println("</div>");
//        printWriter.println("</div>");
//        printWriter.println("</div>");
//        printWriter.println("</body>");
//        printWriter.println("</html>");

    }
}