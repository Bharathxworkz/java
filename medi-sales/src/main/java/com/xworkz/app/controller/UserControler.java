package com.xworkz.app.controller;

import com.xworkz.app.constant.ServiceConstant;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
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

@Controller
@RequestMapping("/")
@Slf4j
public class UserControler {
    @Autowired
    UserService userService;
    @PostMapping(value = "save")
    public String onSave(@Valid UserDto userDto, BindingResult bindingResult, Model model) {
        boolean hasErrors = bindingResult.hasErrors();
        if (hasErrors) {
            model.addAttribute("dto", userDto);
            List<ObjectError> allErrors = bindingResult.getAllErrors();

            // Loop through all errors and add each one to the model dynamically
            for (ObjectError error : allErrors) {
                if (error instanceof FieldError) {
                    FieldError fieldError = (FieldError) error;
                    String field = fieldError.getField();
                    String message = fieldError.getDefaultMessage();

                    // Add error message for the specific field dynamically
                    if (field.equalsIgnoreCase("companyName")) {
                        model.addAttribute("companyNameError", message);
                    } else if (field.equalsIgnoreCase("contactPerson")) {
                        model.addAttribute("contactPersonError", message);
                    } else if (field.equalsIgnoreCase("businessType")) {
                        model.addAttribute("businessTypeError", message); // Fixed typo here
                    } else if (field.equalsIgnoreCase("mobile")) {
                        model.addAttribute("mobileError", message);
                    } else if (field.equalsIgnoreCase("email")) {
                        model.addAttribute("emailError", message);
                    } else if (field.equalsIgnoreCase("address1")) {
                        model.addAttribute("address1Error", message);
                    } else if (field.equalsIgnoreCase("address2")) {
                        model.addAttribute("address2Error", message);
                    } else if (field.equalsIgnoreCase("pincode")) {
                        model.addAttribute("pincodeError", message);
                    } else if (field.equalsIgnoreCase("referral")) {
                        model.addAttribute("referralError", message);
                    } else if (field.equalsIgnoreCase("password")) {
                        model.addAttribute("passwordError", message);
                    } else if (field.equalsIgnoreCase("confirmPassword")) {
                        model.addAttribute("confirmPasswordError", message);
                    }
                }
            }
            return "signup";
        }

        // Save the valid data
        boolean isSaved = userService.save(userDto);
        if (!isSaved) {
            model.addAttribute("dto", userDto);
            return "signup";
        }

        // Add the contact person name to the model for the success page
        model.addAttribute("name", userDto.getContactPerson());
        return "response";
}


    @PostMapping(value = "login")
    public String login(@RequestParam String email,  @RequestParam String password, Model model,HttpSession session)
    {
        log.info("email is :: {}  password   ::   {} ", email, password);
        UserDto userDto = userService.getUserByEmailAndPassword(email, password);
        log.info("User in controller : {} " , userDto );
        if (userDto.getEmail()!=null && userDto.getEmail().equalsIgnoreCase(email) ) {
            model.addAttribute("dto",userDto);
            session.setAttribute("loggedInUser",userDto);
            return "dashboard";
        } else {
            model.addAttribute("notfound", "Wrong Password");
            return "signin";
        }
    }
    @GetMapping("resetPassword")
    public String updatePasswordByEmail(@RequestParam String email, String newPassword,String confirmPassword, Model model) {
        if (confirmPassword.equalsIgnoreCase(newPassword)){
            if (userService.updatePasswordByEmail(email,newPassword)){
                return "signin";
            } else {
                model.addAttribute("email",email);
                return "forgotpassword";
            }
        } else {
            model.addAttribute("email",email);
            return "forgotpassword";
        }
    }

    @PostMapping("reset")
    public String validateOtp(@RequestParam String otp, @RequestParam String email,Model model){
        log.info("Email  : {} Otp : {} " , email,otp);
        if (userService.validateOtp(otp,email)){
            model.addAttribute("email",email);
            return "forgotpassword";
        }
        else {
            return "otp";
        }
    }
    @PostMapping("profu")
    public String getUpdateProfile(
            @RequestParam int id, // Use @RequestParam instead of @PathVariable
            @ModelAttribute UserDto mediSaleDto, // Ensure DTO is populated
            Model model,
            HttpSession httpSession,
            HttpServletRequest request,
            @RequestParam(value = "file", required = false) MultipartFile multipartFile) { // Make file optional

        log.info("DTO Data: {}", mediSaleDto);
        log.info("File Name: {}", (multipartFile != null) ? multipartFile.getOriginalFilename() : "No file uploaded");
        System.err.println(id +"---"  +mediSaleDto.getId());
        UserDto sessionDto = (UserDto) request.getSession().getAttribute("userDto");
        userService.updateProfile(mediSaleDto, sessionDto, multipartFile);

        model.addAttribute("dto", mediSaleDto);
        httpSession.setAttribute("userDto", sessionDto);
        model.addAttribute("success", "Updated successfully");

        return "update"; // Ensure "update" exists in templates
    }


    @GetMapping("view/{imageName}")
    public void getImage(@PathVariable String imageName, HttpServletResponse response) throws IOException {
        Path path= Paths.get(ServiceConstant.FILE_PATH.getPath()+imageName);
        log.info("{}",path);
        Files.copy(path,response.getOutputStream());
        response.getOutputStream().flush();
    }
}
