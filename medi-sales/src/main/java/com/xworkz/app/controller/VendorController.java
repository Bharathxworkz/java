package com.xworkz.app.controller;

import com.xworkz.app.dto.DistributorDto;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.service.DistributorService;
import com.xworkz.app.service.VendorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
@Slf4j
public class VendorController {

    @Autowired
    DistributorService distributorService;
    @Autowired
    VendorService vendorService;

    @GetMapping(value = "vendorr")
    public String getStockPage(HttpSession session, Model model) {

        List<VendorDto> vendorData = (List<VendorDto>) session.getAttribute("vendorList");
        if (vendorData == null) {
            vendorData = new ArrayList<>();
            session.setAttribute("vendorList", vendorData);
        }

        List<DistributorDto> dto = distributorService.getAllStocks();
        List<UserDto> dto1 = vendorService.getDistributorCp();

        model.addAttribute("listOfStock", dto);
        model.addAttribute("vendor", vendorData);
        model.addAttribute("listOfDistributors", dto1);

        log.info("Vendor data in session: {}", vendorData);

        return "vendor";
    }

    @PostMapping(value = "vending")
    public String addStock(@RequestParam String productName,
                           @RequestParam String customerName,
                           @RequestParam(defaultValue = "0") double rate,
                           @RequestParam(defaultValue = "0") long hsn,
                           @RequestParam String batchNumber,
                           @RequestParam(defaultValue = "0") long mrp,
                           @RequestParam(defaultValue = "0") int discount,
                           @RequestParam(defaultValue = "0") double gst,
                           @RequestParam(defaultValue = "0") int qty,
                           HttpSession session) {

        // Calculate discount and gst amounts
        double discountAmount = (rate * qty * discount) / 100.0;
        double gstAmount = (discountAmount * gst) / 100.0;
        double totalAmount = (rate * qty) - discountAmount + gstAmount;

        log.info("Calculated total amount: {}", totalAmount);

        List<VendorDto> vendorData = (List<VendorDto>) session.getAttribute("vendorList");

        if (vendorData == null) {
            vendorData = new ArrayList<>();
        }

        // Check if the same productName and customerName already exist
        boolean isUpdated = false;
        for (VendorDto existingVendor : vendorData) {
            if (existingVendor.getProductName().equals(productName) &&
                    existingVendor.getCustomerName().equals(customerName)) {
                // If the entry exists, update the quantity and total amount
                existingVendor.setQty(existingVendor.getQty() + qty);
                existingVendor.setAmount(existingVendor.getRate() * existingVendor.getQty() -
                        (existingVendor.getRate() * existingVendor.getQty() * existingVendor.getDiscount()) / 100 +
                        (existingVendor.getRate() * existingVendor.getQty() * existingVendor.getGst()) / 100);
                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            VendorDto newStock = new VendorDto(productName, customerName, rate, hsn, batchNumber, mrp, discount, gst, qty, totalAmount);
            vendorData.add(newStock);
        }

        session.setAttribute("vendorList", vendorData);

        return "redirect:/vendorr";
    }
}