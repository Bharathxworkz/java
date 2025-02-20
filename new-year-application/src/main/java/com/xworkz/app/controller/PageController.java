package com.xworkz.app.controller;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.MailService;
import com.xworkz.app.service.Userservice;
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
    Userservice userservice;

    @GetMapping("response")
    public String getResponse() {
        return "response";
    }

    @GetMapping("SignUp")
    public String getPage() {
        return "signup";
    }

    @GetMapping("signin")
    public String getSigninPage() {
        return "signin";
    }

    @GetMapping("dashboard")
    public String getDashboard() {
        return "dashboard";
    }

    @GetMapping("forgotpassword")
    public String getForgotPasswordPage() {
        return "forgotpassword";
    }

    @GetMapping("raksha")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("update")
    public String getUpdate(@RequestParam Integer id, Model model, HttpSession httpSession) {
        log.info("Id is :  {} ", id);
        UserDto userDto = userservice.getUserById(id);
        httpSession.setAttribute("userDto", userDto);
        model.addAttribute("dto", userDto);
        model.addAttribute("fName", userDto.getFName());
        return "update";
    }

    @GetMapping("viewprofile")
    public String getProfile() {
        return "viewprofile";
    }


    @GetMapping("mailSent")
    public String mailSent() {
        mailService.sendRegistrationMessage("Hello", "Thanks", "xworkzdev4@gmail.com");
        return null;
    }

    @GetMapping("otp")
    public String getOtp(){
        return "otp";
    }
}
