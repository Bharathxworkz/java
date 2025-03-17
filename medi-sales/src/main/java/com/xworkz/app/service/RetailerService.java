package com.xworkz.app.service;

import com.xworkz.app.dto.AddRetailerDto;

import java.util.List;

public interface RetailerService {
    public boolean validAndSave(AddRetailerDto addRetailerDto);

    List<AddRetailerDto> getAllRetailers(int id);
}
