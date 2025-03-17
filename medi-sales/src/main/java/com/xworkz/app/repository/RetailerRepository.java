package com.xworkz.app.repository;

import com.xworkz.app.dto.AddRetailerDto;
import com.xworkz.app.entity.AddRetailerEntity;

import java.util.List;

public interface RetailerRepository {
    boolean save(AddRetailerEntity addRetailerEntity);

    List<AddRetailerDto> getAllRetailers(int id);
}
