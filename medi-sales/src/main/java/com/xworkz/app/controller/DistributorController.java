package com.xworkz.app.controller;

import com.xworkz.app.dto.DistributorDto;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.DistributorEntity;
import com.xworkz.app.service.DistributorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
@Slf4j
public class DistributorController {

    @Autowired
    DistributorService distributorService;

    @PostMapping("saving")
    public String onSave(@Valid DistributorDto distributorDto, UserDto userDto, Model model) {
        boolean isSaved = distributorService.validAndSave(distributorDto);

        if (isSaved) {
            model.addAttribute("add","stock Sucessfully added");
            return "dashboard";
        }
        else {

            model.addAttribute("dto", distributorDto);
            return "createstock";

        }
    }
    @GetMapping(value = "getallStocks")
    public String getAllUsers(Model model){
        List<DistributorDto> users = distributorService.getAllStocks();
        model.addAttribute("listOfStocks" , users);
        return "getstockdetails";
    }
    @GetMapping(value = "delete/{id}")
    public RedirectView delete(@PathVariable int  id , Model model , HttpServletRequest req){
        distributorService.deleteStockById(id);
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getallStocks");
        return redirectView;
    }
    @GetMapping(value = "fetchstocks")
    public String fetchUser(int id , Model model){

        DistributorDto distributorDto =distributorService.getStockById(id);
        model.addAttribute("stock" , distributorDto);
        return "fetchStock";
    }

    @PostMapping(value = "updateStock")
    public RedirectView updateUser(DistributorDto distributorDto , Model model,HttpServletRequest req){
        distributorService.updateStock(distributorDto);
        model.addAttribute("updateInfo" , "Updated SuccessFully");
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl(req.getContextPath()+"/getallStocks");
        return redirectView;
    }



}