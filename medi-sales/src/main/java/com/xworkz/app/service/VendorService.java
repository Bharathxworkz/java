package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.VendorEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface VendorService {



    //boolean vendorSave(VendorDto vendorDto);


    List<UserDto> getDistributorCp();

    List<VendorDto> getVendor();

    void updatevendor(VendorDto vendorDto);
    boolean deleteStockById(int id);

    public VendorEntity findOneByCustomerAndProduct(String customerName, String productName);
}
