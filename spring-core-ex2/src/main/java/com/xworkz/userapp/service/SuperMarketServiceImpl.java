package com.xworkz.userapp.service;


import com.xworkz.userapp.dao.SuperMarketDao;
import com.xworkz.userapp.dto.SuperMarketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SuperMarketServiceImpl implements SuperMarketService {
    @Autowired
    private SuperMarketDao dao;

    @Override
    public boolean save(SuperMarketDto superMarketDto) {

        boolean productValid = false;
        boolean isProductNameValid = false;
        if(superMarketDto != null){
            if(superMarketDto.getProductName() != null  && !superMarketDto.getProductName().isEmpty()){
                isProductNameValid = true;
            }
            if(isProductNameValid == true){
                productValid = dao.save(superMarketDto);
            }
        }
        return productValid;
    }

    @Override
    public SuperMarketDto getSuperMarketDetailsById(int id) {
        return dao.getSuperMarketDetailsById(id);
    }

    @Override
    public SuperMarketDto getSuperMarketDetailsByName(String name) {
        return dao.getSuperMarketDetailsByName(name);
    }

    @Override
    public List<SuperMarketDto> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public boolean deleteSuperMarketById(int id) {
        return dao.deleteSuperMarketById(id);
    }


    @Override
    public int getPriceById(int id) {
        int price = 0;
        if (id>0){
            price = dao.getPriceById(id);
        }
        return price;
    }

    @Override
    public Object[] getProductNameAndProductCategoryById(int id) {
        Object obj[] = null;
        if (id>0){
            obj = dao.getProductNameAndProductCategoryById(id);
        }
        return obj;
    }

    @Override
    public Object[] getProductNameAndProductCategoryByManufactureDate(String manufactureDate) {
        return dao.getProductNameAndProductCategoryByManufactureDate(manufactureDate);
    }


    @Override
    public boolean updatePriceByProductName(int price,String productName) {
        boolean isUpdated = false;
        if (price!=0  && productName!=null && !productName.isEmpty())
            isUpdated =  dao.updatePriceByProductName(price,productName);
        return isUpdated;
    }
}
