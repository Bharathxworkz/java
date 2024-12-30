package com.xworkz.app.controller;


import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
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
public class UserRegisterController {
    @Autowired
      UserService userService;
    //@PostMapping("user")
    @PostMapping(value ="user")
    public String onSave(UserDto dto, Model model){

        model.addAttribute("name",dto.getFirstName());
        userService.validateAndSave(dto);

        return "response.jsp";
    }
    @GetMapping("getAlluser")
    public  String getAll(UserDto dto,Model model){
        List<UserDto> users = userService.getallUser();
        model.addAttribute("ListOfusers",users);
        return "getAlluser.jsp";


    }
    @GetMapping(value = "delete")
    public RedirectView deleteUserById(int id, Model model, HttpServletRequest req){
        userService.deleteUserById(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getAlluser");
        return redirectView;
    }
    @GetMapping(value = "fetchUser")
    public String fetchUser(int id , Model model){
        UserDto userDto =userService.getUserById(id);
        model.addAttribute("user" , userDto);
        return "fetchuser.jsp";
    }
    @PostMapping(value = "updateuser")
    public String updateUser(UserDto userDto , Model model){
        userService.updateUser(userDto);
        model.addAttribute("updateInfo" , "Updated SuccessFully");
        return "fetchuser.jsp";
    }
}
