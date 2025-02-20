package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.VendorEntity;
import com.xworkz.app.repository.VendorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class VendorServicImpl implements  VendorService {
    @Autowired
    VendorRepository vendorRepository;
//    @Override
//    public boolean vendorSave(VendorDto vendorDto) {
//        VendorEntity vendorEntity = new VendorEntity();
//
//        BeanUtils.copyProperties(vendorDto,vendorEntity);
//        double rate = vendorDto.getRate();
//        int qty = vendorDto.getQty();
//        int discount = vendorDto.getDiscount();
//        double gst = vendorDto.getGst();
//
//        double discountAmount = (rate * qty * discount) / 100.0;
//        double gstAmount = (discountAmount * gst) / 100.0;
//        double totalAmount = (rate * qty) - discountAmount + gstAmount;
//
//        vendorEntity.setAmount(totalAmount);
//
//        vendorRepository.vendorSave(vendorEntity);
//        return true;
//    }

    @Override
    public List<UserDto> getDistributorCp() {
        return vendorRepository.getDistributorCp();
    }

    @Override
    public List<VendorDto> getVendor() {

        return vendorRepository.getVendor();
    }

    @Override
    public void updatevendor(VendorDto vendorDto) {
        VendorEntity vendorEntity = vendorRepository.findOneByCustomerAndProduct(vendorDto.getCustomerName(), vendorDto.getProductName());

        if (vendorEntity == null) {
            log.warn("No existing vendor found for customer: {} and product: {}", vendorDto.getCustomerName(), vendorDto.getProductName());
            return;
        }

        BeanUtils.copyProperties(vendorDto, vendorEntity);

        double rate = vendorDto.getRate();
        int qty = vendorDto.getQty();
        int discount = vendorDto.getDiscount();
        double gst = vendorDto.getGst();

        double discountAmount = (rate * qty * discount) / 100.0;
        double gstAmount = (discountAmount * gst) / 100.0;
        double totalAmount = (rate * qty) - discountAmount + gstAmount;

        vendorEntity.setAmount(totalAmount);

        vendorRepository.updatevendor(vendorEntity);
    }


    @Override
    public boolean deleteStockById(int id) {
        return vendorRepository.deleteStockById(id);
    }

    @Override
    public VendorEntity findOneByCustomerAndProduct(String customerName, String productName) {
        return vendorRepository.findOneByCustomerAndProduct(customerName,productName);
    }


}
