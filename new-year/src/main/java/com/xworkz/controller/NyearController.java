package com.xworkz.controller;

import com.xworkz.dto.NyearDto;
import com.xworkz.service.NyearService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/")
public class NyearController {
    @Autowired
    private NyearService service;
    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping(value = "user")
    public String onSave(@Valid NyearDto dto, BindingResult bindingResult, Model model) {
        log.info("data svae method started {}", dto);
        if (bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            allErrors.forEach(error -> {
                FieldError fieldError = (FieldError) error;
                System.out.println(fieldError.getField() + " -> Error Message: " + fieldError.getDefaultMessage());

                if (fieldError.getField().equalsIgnoreCase("firstName")) {
                    model.addAttribute("fname", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("lastName")) {
                    model.addAttribute("lname", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("email")) {
                    model.addAttribute("emailError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("alternateEmail")) {
                    model.addAttribute("altEmailError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("contact")) {
                    model.addAttribute("contactError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("alternateContact")) {
                    model.addAttribute("altContactError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("dateOdBirth")) {
                    model.addAttribute("dobError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("place")) {
                    model.addAttribute("placeError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("state")) {
                    model.addAttribute("stateError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("district")) {
                    model.addAttribute("districtError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("password")) {
                    model.addAttribute("passwordError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("confirmPassword")) {
                    model.addAttribute("confirmPasswordError", fieldError.getDefaultMessage());
                }
            });
            model.addAttribute("dto",dto);
            return "Registration";
        }
        if (service.save(dto)) {
          boolean sk =  service.save(dto);
            System.out.println(sk);
            model.addAttribute("name", dto.getFirstName());
            return "response";
        }else {
            model.addAttribute("dto",dto);
            model.addAttribute("saveError","Email already registerd");
            return "Registration";
        }


    }
    @GetMapping("login")
    public String login(String email, String password, HttpSession httpSession, /*BindingResult bindingResult,*/ Model model) {
       /*boolean haserors=  bindingResult.hasErrors();
       if (haserors){
           List<ObjectError>allErors=bindingResult.getAllErrors();
           allErors.forEach(eror->{
               FieldError fieldError =(FieldError) eror;
               System.out.println(fieldError.getField()+" Eror Message "+fieldError.getDefaultMessage());
               if (fieldError.getField().equalsIgnoreCase("email")){
                   model.addAttribute("falsemail",fieldError.getDefaultMessage());
               }

           });
           return "singnup";
       }*/
        NyearDto nyearDto = service.getDtoByEmail(email,password);
        if (nyearDto !=null){
            model.addAttribute("dto",nyearDto);
            model.addAttribute("name",nyearDto.getFirstName());
            httpSession.setAttribute("dto",nyearDto);
            return "test";
        } else {

            model.addAttribute("notfound", "User not registerd");
            return "signin";
        }
    }

    @GetMapping("resetPassword")
    public String updatePasswordByEmail(String email, String newPassword, String confirmPassword, Model model) {
        NyearDto entity = service.checkEmail(email);
        log.info("{}",entity);
        if (entity != null && email.equals(entity.getEmail())) {
            service.updatePasswordByEmail(email, newPassword,confirmPassword);
            return "signin";
        } else {
            model.addAttribute("dto",email);
            model.addAttribute("notfound", "Email not registered");
            return "forgetpassword";
        }
    }

    @PostMapping(value = "/getUser")
    public String getAllUser(){
        return "viewprofile";
    }


}
