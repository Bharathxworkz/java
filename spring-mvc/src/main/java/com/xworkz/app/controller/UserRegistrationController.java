package com.xworkz.app.controller;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserRegistrationController {

    @Autowired
    UserRegistrationService service;

    @PostMapping(value = "user")
    public String onSave(UserDto dto , Model model){
        model.addAttribute("name" , dto.getFirstName());
        service.save(dto);
        return "response.jsp";
    }

    @GetMapping(value = "getallusers")
    public String getAllUsers(Model model){
        List<UserDto> users = service.getAllUsers();
        model.addAttribute("ListOfUsers" , users);
        return "getallusers.jsp";
    }

    @GetMapping(value = "delete/{id}")
    public RedirectView delete(@PathVariable int  id , Model model , HttpServletRequest req){

        service.deleteUserById(id);
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getallusers");
        return redirectView;
    }

    @GetMapping(value = "fetchUser")
    public String fetchUser(int id , Model model){
        UserDto userDto =service.getUserById(id);
        model.addAttribute("user" , userDto);
        return "fetchuser.jsp";
    }

    @PostMapping(value = "updateuser")
    public String updateUser(UserDto userDto , Model model){
        service.updateUser(userDto);
        model.addAttribute("updateInfo" , "Updated SuccessFully");
        return "fetchuser.jsp";
    }


}

