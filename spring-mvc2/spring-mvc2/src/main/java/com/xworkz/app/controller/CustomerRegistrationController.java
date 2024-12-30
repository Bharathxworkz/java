package com.xworkz.app.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.app.dto.CustomerDto;
import com.xworkz.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerRegistrationController {
    @Autowired
    CustomerService customerService;


    @PostMapping(value = "signup")
    public String onSave(CustomerDto dto , Model model){
        model.addAttribute("name" , dto.getFirstName());
        customerService.save(dto);
        return "response.jsp";
    }

    @GetMapping(value = "getallusers")
    public String getAllUsers(Model model){
        List<CustomerDto> users = customerService.getAllUsers();
        model.addAttribute("ListOfUsers" , users);
        return "getallusers.jsp";
    }

    @GetMapping(value = "delete")
    public RedirectView deleteUser(int id , Model model , HttpServletRequest req){
        customerService.deleteCustomer(id);
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getallusers");
        return redirectView;
    }

    @GetMapping(value = "fetchUser")
    public String fetchUser(int id, Model model){
        CustomerDto customer = customerService.getUserById(id);
        model.addAttribute("customer", customer);
        return "fetchuser.jsp";
    }

    @PostMapping(value = "updateUser")
    public String updateUser(CustomerDto dto , Model model){
        customerService.updateUser(dto);
        model.addAttribute("updateInfo" , "Updated Successfully");
        return "fetchuser.jsp";
    }
}

