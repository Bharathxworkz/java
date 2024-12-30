package com.xworkz.app.service;

import com.xworkz.app.dto.AmazonDto;

import java.util.List;

public interface AmazonService {

    boolean saveAndValidate(AmazonDto amazonDto);
    void UpdateProductId(int id ,AmazonDto amazonDto);
    boolean deleteProductId(int id);
    AmazonDto getUserById(int id);
    List<AmazonDto> getAllDetails(AmazonDto amazonDto);
    Object [] getProductNameAndQualityById(int id);
}
