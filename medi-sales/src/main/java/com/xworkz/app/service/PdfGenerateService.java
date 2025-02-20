package com.xworkz.app.service;

import com.xworkz.app.dto.VendorDto;

import java.util.List;

public interface PdfGenerateService {
    void pdfGenerate(List<VendorDto> sales);
}
