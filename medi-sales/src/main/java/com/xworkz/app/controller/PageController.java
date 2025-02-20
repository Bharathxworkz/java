package com.xworkz.app.controller;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.MailService;
import com.xworkz.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
@Slf4j
public class PageController {
    @Autowired
    private MailService mailService;
    @Autowired
    UserService userService;
    @GetMapping(value = "signup")
    public String getSignup(){
        return "signup";
    }
    @GetMapping(value = "response")
    public String getresponse(){
        return "response";
    }
    @GetMapping(value = "signin")
    public String getsignin(){
        return "signin";
    }
    @GetMapping(value = "test")
    public String getmain(){
        return "test";
    }
    @GetMapping(value = "index")
    public String getindex(){
        return "index";
    }
    @GetMapping(value = "dashboard")
    public String getdashboard(){
        return "dashboard";
    }
    @GetMapping(value = "createstock")
    public String getcreatestock(){
        return "createstock";
    }
    @GetMapping(value = "getstockdetails")
    public String getAllStock(){
        return "getstockdetails";
    }
    @GetMapping(value = "fetchStock")
    public String fetchStock(){
        return "fetchStock";
    }
    @GetMapping(value = "vendor")
    public String fetchvendor(){
        return "vendor";
    }
    @GetMapping("mailSent")
    public String mailSent() {
        mailService.sendRegistrationMessage("Hello", "Thanks", "xworkzdev4@gmail.com");
        return null;
    }
    @GetMapping("update")
    public String getUpdate(@RequestParam Integer id, Model model, HttpSession httpSession) {
        log.info("Id is :  {} ", id);
        UserDto userDto = userService.getUserById(id);
        httpSession.setAttribute("userDto", userDto);
        model.addAttribute("dto", userDto);
        model.addAttribute("fName", userDto.getContactPerson());
        return "update";
    }

    @GetMapping("viewprofile")
    public String getProfile(@RequestParam Integer id, Model model) {
        UserDto userDto = userService.getUserById(id);
        model.addAttribute("dto", userDto);
        return "viewprofile";
    }

    @GetMapping("otp")
    public String getOtp(){
        return "otp";
    }

    @GetMapping("forgotpassword")
    public String getForgotPasswordPage() {
        return "forgotpassword";
    }
}

