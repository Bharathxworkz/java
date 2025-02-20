package com.xworkz.app.ajaxresource;

import com.xworkz.app.service.AjaxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/")

public class AjaxCnotroller {
    @Autowired
    AjaxService ajaxService;

    @GetMapping("checkEmail/{email}")
    public String checkEmailExists(@PathVariable String email){
        log.info("Email is : {} " , email);
        return ajaxService.checkEmail(email);

    }

    @GetMapping("checkPhoneNumber/{mobileNumber}")
    public String checkExists(@PathVariable long mobileNumber){
        log.info("Mobile Number is : {} " , mobileNumber);
        return ajaxService.checkPhoneNumber(mobileNumber);
    }
    @GetMapping("checkingEmail/{email}")
    public String checkingEmailExiist(@PathVariable String email){
        log.info("Email is : {} " , email);
        return ajaxService.chekingEmail(email);

    }
    @GetMapping("sendOtp/{email}")
    public String sendOtp(@PathVariable String email){
        return ajaxService.sendOtp(email);
    }

}
