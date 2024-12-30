package com.xworkz.userapp.controller;


import com.xworkz.userapp.dto.TaxUserDto;
import com.xworkz.userapp.service.TaxUserRegistrationService;
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

public class TaxUserRegistrationController {
    @Autowired
    TaxUserRegistrationService taxUserRegistrationService;

    @RequestMapping("user")
    public String onSave(TaxUserDto taxUserDto, Model model){
        model.addAttribute("name",taxUserDto.getFirstName());
        taxUserRegistrationService.save(taxUserDto);
        return  "response.jsp";
    }
    @GetMapping("getAllUsers")
    public  String getAllUsers(Model model){
        List<TaxUserDto> users= taxUserRegistrationService.getAllTaxUsers();
        model.addAttribute("listOfUsers",users);
        return  "getAllUsers.jsp";
    }
    @GetMapping("delete")
    public RedirectView delete(int id, Model model, HttpServletRequest req){

        taxUserRegistrationService.deleteTaxUserById(id);
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getAllUsers");
        return redirectView;
    }
    @GetMapping(value = "fetchUser")
    public String fetchTaxUser(int id , Model model){
        TaxUserDto taxUserDto =taxUserRegistrationService.getTaxUserById(id);
        model.addAttribute("user" , taxUserDto);
        return "fetchuser.jsp";
    }

    @PostMapping(value = "updateuser")
    public String updateTaxUser(TaxUserDto taxUserDto , Model model){
        taxUserRegistrationService.updateTaxUser(taxUserDto);
        model.addAttribute("updateInfo" , "Updated SuccessFully");
        return "fetchuser.jsp";
    }
}
