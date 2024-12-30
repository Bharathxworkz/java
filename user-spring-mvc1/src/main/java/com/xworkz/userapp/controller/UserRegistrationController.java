package com.xworkz.userapp.controller;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Component
@RequestMapping("/")
public class UserRegistrationController {
    @Autowired
    UserRegistrationService userRegistrationService;

    @RequestMapping("user")
    public String onSave(UserDto userDto, Model model){
        model.addAttribute("name",userDto.getFirstName());
        userRegistrationService.save(userDto);
        return  "response.jsp";
    }
    @GetMapping("getAllUsers")
    public  String getAllUsers(Model model){
        List<UserDto> users= userRegistrationService.getAllUsers();
        model.addAttribute("listOfUsers",users);
        return  "getAllUsers.jsp";
    }

    @GetMapping("delete")
    public RedirectView delete(int id, Model model, HttpServletRequest req){

        userRegistrationService.deleteUserById(id);
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getAllUsers");
        return redirectView;
    }

    @GetMapping(value = "fetchUser")
    public String fetchUser(int id , Model model){
        UserDto userDto =userRegistrationService.getUserById(id);
        model.addAttribute("user" , userDto);
        return "fetchuser.jsp";
    }

    @PostMapping(value = "updateuser")
    public String updateUser(UserDto userDto , Model model){
        userRegistrationService.updateUser(userDto);
        model.addAttribute("updateInfo" , "Updated SuccessFully");
        return "fetchuser.jsp";
    }



}
