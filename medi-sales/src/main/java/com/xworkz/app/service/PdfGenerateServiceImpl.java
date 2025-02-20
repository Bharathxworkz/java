package com.xworkz.app.service;

import com.itextpdf.html2pdf.HtmlConverter;
import com.xworkz.app.dto.VendorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PdfGenerateServiceImpl implements PdfGenerateService {

    @Autowired
    private TemplateEngine templateEngine;

    @Override
    public void pdfGenerate(List<VendorDto> sales) {
        double grandTotal = 0.0;
        for (VendorDto sale : sales) {
            grandTotal += sale.getAmount();
        }

        Context context = new Context();
        context.setVariable("sales", sales);
        context.setVariable("invoiceNumber", "INV-" + (100000 + (int) (Math.random() * 900000)));
        context.setVariable("invoiceDate", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        context.setVariable("grandTotal", grandTotal);

        String htmlData = templateEngine.process("SalesBill", context);

        try {
            File file = new File("C:\\pdfTemplate\\salesBill.pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            HtmlConverter.convertToPdf(htmlData, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error generating PDF: " + e.getMessage());
        }
    }
}