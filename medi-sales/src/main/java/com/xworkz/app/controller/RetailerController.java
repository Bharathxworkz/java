package com.xworkz.app.controller;

import com.xworkz.app.dto.AddRetailerDto;
import com.xworkz.app.dto.AddVendorDto;
import com.xworkz.app.service.RetailerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
@Slf4j
public class RetailerController {

    @Autowired
    RetailerService retailerService;


    @PostMapping("addingretailer")
    public String onSave(@Valid AddRetailerDto addRetailerDto, Model model, HttpSession session) {

        //Integer distributorId = (Integer) session.getAttribute("loggedInDistributorId");
        if (addRetailerDto.getMedisalesId() > 0) {
            // addVendorDto.setDistributorId(distributorId); // Set distributor ID automatically
            boolean isSaved = retailerService.validAndSave(addRetailerDto);
            System.out.println("Distributor ID from DTO: {}"+ addRetailerDto.getMedisalesId());
            if (!isSaved) {
                model.addAttribute("dto", addRetailerDto);
                return "addretailer";
            }
        }

        else {
            model.addAttribute("success", "Retailer SuccessFully added");
            return "dashboard";
        }
        return "dashboard";
    }
    @GetMapping("getallretailerss/{id}")
    public String getAllretailers(Model model,@PathVariable int id){
        List<AddRetailerDto> retailers = retailerService.getAllRetailers(id);
        model.addAttribute("listOfretailers",retailers);
        return "getallretailers";
    }


}