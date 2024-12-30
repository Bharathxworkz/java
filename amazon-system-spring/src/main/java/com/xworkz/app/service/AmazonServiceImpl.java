package com.xworkz.app.service;

import com.xworkz.app.dao.AmazonDao;
import com.xworkz.app.dto.AmazonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class AmazonServiceImpl implements AmazonService{

    @Autowired
    private AmazonDao amazonDao;

    @Override
    public boolean saveAndValidate(AmazonDto amazonDto) {
        boolean productValid = false;
        boolean isProductNameValid = false;
        if(amazonDto != null){
            if(amazonDto.getProductName() != null  && !amazonDto.getProductName().isEmpty()){
                isProductNameValid = true;
            }
            if(isProductNameValid){
                productValid = amazonDao.save(amazonDto);
            }
        }
        return productValid;
    }

    @Override
    public void UpdateProductId(int id, AmazonDto amazonDto) {
   amazonDao.UpdateProductId(id, amazonDto);
    }

    @Override
    public boolean deleteProductId(int id) {
        if (id > 0){
            System.out.println("delete user by id");
        }
        return amazonDao.deleteProductId(id);
    }

    @Override
    public AmazonDto getUserById(int id) {
        return amazonDao.getUserById(id);
    }

    @Override
    public List<AmazonDto> getAllDetails(AmazonDto amazonDto) {
        return amazonDao.getAllDetails(amazonDto);
    }

    @Override
    public Object[] getProductNameAndQualityById(int id) {
        return amazonDao.getProductNameAndQualityById(id);
    }
}
