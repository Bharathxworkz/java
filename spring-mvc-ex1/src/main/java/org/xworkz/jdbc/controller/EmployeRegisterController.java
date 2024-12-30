package org.xworkz.jdbc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xworkz.jdbc.dto.EmloyeDto;

@Component
@RequestMapping("/")
public class EmployeRegisterController {
    @RequestMapping("user")
    public String onSave(EmloyeDto dto, Model model){
        model.addAttribute("name",dto.getFirstName());
        return "response.jsp";
    }
}
