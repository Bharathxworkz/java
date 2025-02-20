package com.xworkz.app.service;

import com.xworkz.app.dto.DistributorDto;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.DistributorEntity;
import com.xworkz.app.entity.VendorEntity;
import com.xworkz.app.repository.DistributorRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class DistributorServiceImpl implements DistributorService{
    @Autowired
    private DistributorRepository distributorRepository;

    @Autowired
    HttpSession session;



    @Override
    public boolean validAndSave(DistributorDto distributorDto) {
        DistributorEntity distributorEntity=new DistributorEntity();

        BeanUtils.copyProperties(distributorDto,distributorEntity);
        distributorEntity.setMfgDate(LocalDate.parse(distributorDto.getMfgDate()));
        distributorEntity.setExpiryDate(LocalDate.parse(distributorDto.getExpiryDate()));

        UserDto loggedInUser = (UserDto) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            distributorEntity.setCreatedBy(loggedInUser.getContactPerson());
            log.info("Setting createdBy as: {}", loggedInUser.getContactPerson());
        } else {
            log.warn("No logged-in user found in session, createdBy not set.");
        }

        distributorEntity.setCreatedDate(LocalDate.now());

        LocalDate now = LocalDate.now();
        String hsn = String.format("%02d%02d%02d%02d%02d%02d",
                now.getDayOfMonth(), now.getMonthValue(), now.getYear() % 100,
                java.time.LocalTime.now().getHour(), java.time.LocalTime.now().getMinute(),
                java.time.LocalTime.now().getSecond());

        distributorEntity.setHsn(Long.parseLong(hsn));

        log.info("Generated HSN: {}", hsn);

        String productName = distributorDto.getProductName();
        String productCompany = distributorDto.getProductCompany();

        char firstCharProduct = (productName != null && !productName.isEmpty()) ? productName.charAt(0) : 'X';
        char firstCharCompany = (productCompany != null && !productCompany.isEmpty()) ? productCompany.charAt(0) : 'Y';

        int randomNum = (int) (Math.random() * 10000);

        String batchNumber = firstCharProduct + "" + firstCharCompany + randomNum;
        distributorEntity.setBatchNumber(batchNumber);

        log.info("Generated Batch Number: {}", batchNumber);

        double rate = distributorDto.getRate();
        int qty = distributorDto.getQty();
        int discount = distributorDto.getDiscount();
        double gst = distributorDto.getGst();

        double discountAmount = (rate * qty * discount) / 100.0;
        double gstAmount = (discountAmount * gst) / 100.0;
        double totalAmount = (rate * qty) - discountAmount + gstAmount;

        distributorEntity.setAmount(totalAmount);
        log.info("Calculated Total Amount: {}", totalAmount);
        System.out.println(distributorEntity);
        if (distributorRepository.save(distributorEntity)) {
            return true;
        }
        else
            return false;
    }

    @Override
    public List<DistributorDto>getAllStocks() {
        return distributorRepository.getAllstock();
    }

    @Override
    public boolean deleteStockById(int id) {
        return distributorRepository.deleteStockById(id);
    }

    @Override
    public DistributorDto getStockById(int id) {
        DistributorDto distributorDto = new DistributorDto();
        DistributorEntity distributorEntity = distributorRepository.getStockById(id);
        BeanUtils.copyProperties(distributorEntity, distributorDto);

        distributorDto.setMfgDate(distributorEntity.getMfgDate().toString());
        distributorDto.setExpiryDate(distributorEntity.getExpiryDate().toString());

        return distributorDto;
    }

    @Override
    public void updateStock(DistributorDto distributorDto) {
        DistributorEntity distributorEntity = new DistributorEntity();

        BeanUtils.copyProperties(distributorDto, distributorEntity);

        distributorEntity.setMfgDate(LocalDate.parse(distributorDto.getMfgDate()));
        distributorEntity.setExpiryDate(LocalDate.parse(distributorDto.getExpiryDate()));

        UserDto loggedInUser = (UserDto) session.getAttribute("loggedInUser");

        if (loggedInUser != null) {
            if (distributorEntity.getCreatedBy() == null) {
                distributorEntity.setCreatedBy(loggedInUser.getContactPerson());
            }
            distributorEntity.setUpdatedBy(loggedInUser.getContactPerson());
            log.info("Setting createdBy as: {}", distributorEntity.getCreatedBy());
        } else {
            log.warn("No logged-in user found in session, createdBy not set.");
        }

        if (distributorEntity.getCreatedDate() == null) {
            distributorEntity.setCreatedDate(LocalDate.now());
        }
        distributorEntity.setUpdatedDate(LocalDate.now());

        LocalDate now = LocalDate.now();
        String hsn = String.format("%02d%02d%02d%02d%02d%02d",
                now.getDayOfMonth(), now.getMonthValue(), now.getYear() % 100,
                java.time.LocalTime.now().getHour(), java.time.LocalTime.now().getMinute(),
                java.time.LocalTime.now().getSecond());

        distributorEntity.setHsn(Long.parseLong(hsn));

        log.info("Generated HSN: {}", hsn);

        String productName = distributorDto.getProductName();
        String productCompany = distributorDto.getProductCompany();

        char firstCharProduct = (productName != null && !productName.isEmpty()) ? productName.charAt(0) : 'X';
        char firstCharCompany = (productCompany != null && !productCompany.isEmpty()) ? productCompany.charAt(0) : 'Y';

        int randomNum = (int) (Math.random() * 10000);

        String batchNumber = firstCharProduct + "" + firstCharCompany + randomNum;
        distributorEntity.setBatchNumber(batchNumber);

        log.info("Generated Batch Number: {}", batchNumber);

        double rate = distributorDto.getRate();
        int qty = distributorDto.getQty();
        int discount = distributorDto.getDiscount();
        double gst = distributorDto.getGst();

        double discountAmount = (rate * qty * discount) / 100.0;
        double gstAmount = (discountAmount * gst) / 100.0;
        double totalAmount = (rate * qty) - discountAmount + gstAmount;

        distributorEntity.setAmount(totalAmount);

        distributorRepository.updateStock(distributorEntity);
    }



}