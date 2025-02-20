package com.xworkz.app.repository;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.VendorEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VendorRepository {

   // boolean vendorSave(VendorEntity vendorEntity);


    List<UserDto> getDistributorCp();

    List<VendorDto> getVendor();

    void updatevendor(VendorEntity vendorEntity);

    boolean deleteStockById(int id);

    public VendorEntity findOneByCustomerAndProduct(String customerName, String productName);
}
