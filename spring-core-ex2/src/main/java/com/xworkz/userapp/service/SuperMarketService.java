package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.SuperMarketDto;

import java.util.List;

public interface SuperMarketService {
    boolean save(SuperMarketDto superMarketDto);
    SuperMarketDto getSuperMarketDetailsById(int id);
    SuperMarketDto getSuperMarketDetailsByName(String name);
    List<SuperMarketDto> getAllUsers();
    boolean deleteSuperMarketById(int id);
    int getPriceById(int id);
    Object[] getProductNameAndProductCategoryById(int id);
    Object[] getProductNameAndProductCategoryByManufactureDate(String manufactureDate);
    boolean updatePriceByProductName(int price,String productName);

}
