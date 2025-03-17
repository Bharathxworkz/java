package com.xworkz.app.service;

import com.xworkz.app.dto.DistributorDto;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DistributorService {

    boolean validAndSave(DistributorDto distributorDto);
    List<DistributorDto> getAllStocks();
    boolean deleteStockById(int id);

    DistributorDto getStockById(int id);

    void updateStock(DistributorDto distributorDto);



}
