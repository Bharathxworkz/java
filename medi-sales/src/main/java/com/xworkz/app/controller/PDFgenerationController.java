package com.xworkz.app.controller;

import com.xworkz.app.dto.SaleDTO;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.service.PdfGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/")
public class PDFgenerationController {
    @Autowired
    private PdfGenerateService pdfGenerateService;

    @GetMapping("generate")
    public String getPdf(@RequestParam List<String> productName,
                         @RequestParam List<String> customerName,
                         @RequestParam List<String> rate,
                         @RequestParam List<String> hsn,
                         @RequestParam List<String> batchNumber,
                         @RequestParam List<String> mrp,
                         @RequestParam List<String> discount,
                         @RequestParam List<String> gst,
                         @RequestParam List<String> qty,
                         @RequestParam List<String> totalAmount,
                         Model model) {

        List<VendorDto> sales = new ArrayList<>();
        double grandTotal = 0.0;

        for (int i = 0; i < productName.size(); i++) {
            VendorDto sale = new VendorDto();
            sale.setProductName(productName.get(i));
            sale.setCustomerName(customerName.get(i));
            sale.setRate(Double.parseDouble(rate.get(i)));
            sale.setHsn(Long.parseLong(hsn.get(i)));
            sale.setBatchNumber(batchNumber.get(i));
            sale.setMrp(Long.parseLong(mrp.get(i)));
            sale.setDiscount(Integer.parseInt(discount.get(i)));
            sale.setGst(Double.parseDouble(gst.get(i)));
            sale.setQty(Integer.parseInt(qty.get(i)));
            sale.setAmount(Double.parseDouble(totalAmount.get(i)));

            grandTotal += sale.getAmount();
            sales.add(sale);
        }

        model.addAttribute("sales", sales);
        model.addAttribute("invoiceNumber", "INV-" + (100000 + (int) (Math.random() * 900000)));
        model.addAttribute("invoiceDate", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        model.addAttribute("grandTotal", grandTotal);

        pdfGenerateService.pdfGenerate(sales);

        return "SalesBill";
    }

}