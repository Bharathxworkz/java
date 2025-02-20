package com.xworkz.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Controller
public class  InvoiceController {
    @GetMapping("/invoice")
    public String getInvoice(Model model) {
        model.addAttribute("invoiceNumber", "INV-" + new Random().nextInt(100000));
        model.addAttribute("invoiceDate", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        return "SalesBill"; // Thymeleaf template name
    }
}
