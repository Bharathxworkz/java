package com.xworkz.app.controller;

import com.xworkz.app.constants.ServiceConstant;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.sun.xml.internal.ws.streaming.XMLStreamWriterUtil.getOutputStream;

@Controller
@RequestMapping("/")
public class CustomerRegistrationController {

    private static final Logger log = LoggerFactory.getLogger(CustomerRegistrationController.class);
    @Autowired
    private Userservice userservice;

    @PostMapping(value = "signup")
    public String onSave(@Valid UserDto dto, BindingResult bindingResult, Model model) {
        boolean hasErrors = bindingResult.hasErrors();
        if (hasErrors) {
            model.addAttribute("dto", dto);
            List<ObjectError> allerror = bindingResult.getAllErrors();
            allerror.forEach(err -> {
                FieldError fieldError = (FieldError) err;
                System.out.println(fieldError.getField() + " Error Message:: " + fieldError.getDefaultMessage());
                if (fieldError.getField().equalsIgnoreCase("fName")) {
                    model.addAttribute("fnameError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("lName")) {
                    model.addAttribute("lnameError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("email")) {
                    model.addAttribute("emailerror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("alterEmail")) {
                    model.addAttribute("alteremailerror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("contactNumber")) {
                    model.addAttribute("contactnumbererrod", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("alterContactNumber")) {
                    model.addAttribute("altercontactnumbererror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("dateOfBirth")) {
                    model.addAttribute("dateofbirtherror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("place")) {
                    model.addAttribute("placeerror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("state")) {
                    model.addAttribute("stateerror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("district")) {
                    model.addAttribute("districterror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("password")) {
                    model.addAttribute("passworderror", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("confirmPassword")) {
                    model.addAttribute("confirmpassworderror", fieldError.getDefaultMessage());
                }

            });
            return "signup";
        }
        if (userservice.save(dto)) {
            model.addAttribute("name", dto.getFName());
            return "response";
        } else {
            model.addAttribute("dto", dto);
            model.addAttribute("emailregisterederror", "Email already Registered");
            return "signup";
        }

    }



    @PostMapping("login")
    public String login(@RequestParam String email, HttpSession httpSession, @RequestParam String password, Model model) {
        log.info("email is :: {}  password   ::   {} ", email, password);
        UserDto userDto = userservice.getUserByEmailAndPassword(email, password);
        log.info("User in controller : {} " , userDto );
        if (userDto.getEmail()!=null && userDto.getEmail().equalsIgnoreCase(email) && userDto.getAttempt()<=2) {
            model.addAttribute("dto",userDto);
            model.addAttribute("fName", userDto.getFName());
            httpSession.setAttribute("dto",userDto);
            return "dashboard";
        } else {
            model.addAttribute("notfound", "User Not found");

            if (userDto.getAttempt()>2){
                model.addAttribute("notfound","Account blocked");
            }
            return "signin";
        }
    }

    @GetMapping("resetPassword")
    public String updatePasswordByEmail(@RequestParam String email, String newPassword,String confirmPassword, Model model) {
        if (confirmPassword.equalsIgnoreCase(newPassword)){
            if (userservice.updatePasswordByEmail(email,newPassword)){
                return "signin";
            }else {
                model.addAttribute("email",email);
                return "forgotpassword";
            }
        }else {
            model.addAttribute("email",email);
            return "forgotpassword";
        }
    }

    @PostMapping("updateProfile")
    public String getUpdateProfile(UserDto userDto, Model model, HttpSession httpSession, HttpServletRequest request, @RequestParam("file")MultipartFile multipartFile){
        log.info("{}",userDto);
        log.info("File Name {} ", multipartFile.getOriginalFilename());
        UserDto sessionDto = (UserDto) request.getSession().getAttribute("userDto");
        userservice.updateProfile(userDto,sessionDto,multipartFile);
        model.addAttribute("dto",userDto);
        httpSession.setAttribute("userDto",sessionDto);
        model.addAttribute("success","Updated successfully");
        return "update";
    }

    @GetMapping("view/{imageName}")
    public void getImage(@PathVariable String imageName, HttpServletResponse response) throws IOException {
        Path path= Paths.get(ServiceConstant.FILE_PATH.getPath()+imageName);
        log.info("{}",path);
        Files.copy(path,response.getOutputStream());
        response.getOutputStream().flush();
    }

    @PostMapping(value = "/getUser")
    public String getAllUsers() {
        return "viewprofile";
    }

    @PostMapping("reset")
    public String validateOtp(@RequestParam String otp, @RequestParam String email,Model model){
        log.info("Email  : {} Otp : {} " , email,otp);
        if (userservice.validateOtp(otp,email)){
            model.addAttribute("email",email);
            return "forgotpassword";
        }
        else {
            return "otp";
        }

    }


}