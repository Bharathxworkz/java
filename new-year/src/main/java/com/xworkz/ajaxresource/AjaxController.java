package com.xworkz.ajaxresource;

import com.xworkz.service.AjaxService;
import com.xworkz.service.NyearService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@Slf4j
public class AjaxController {
    @Autowired
    AjaxService ajaxService;
     @GetMapping("checkEmail/{email}")
    public String checkEmailExists(@PathVariable String email){
         log.info("Email : {}",email);
         return ajaxService.checkEmail(email);
     }
    @GetMapping("checkPhNo/{contact}")
    public String checkContactExists(@PathVariable Long contact){
        log.info("contact : {}",contact);
        return ajaxService.checkPhNo(contact);
    }
}
