package com.xworkz.app.dao;

import com.xworkz.app.dto.AmazonDto;

import java.util.List;

public interface AmazonDao {

    boolean save(AmazonDto amazonDto);
    void UpdateProductId(int id ,AmazonDto amazonDto);
    boolean deleteProductId(int id);
    AmazonDto getUserById(int id);
    List<AmazonDto> getAllDetails(AmazonDto amazonDto);

    Object[] getProductNameAndQualityById(int id);
}
