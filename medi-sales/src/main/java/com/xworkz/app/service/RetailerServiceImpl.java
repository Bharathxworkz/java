package com.xworkz.app.service;

import com.xworkz.app.dto.AddRetailerDto;
import com.xworkz.app.entity.AddRetailerEntity;
import com.xworkz.app.repository.RetailerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class RetailerServiceImpl implements RetailerService {
    @Autowired
    RetailerRepository retailerRepository;

    @Override
    public boolean validAndSave(AddRetailerDto addRetailerDto) {
        AddRetailerEntity addRetailerEntity = new AddRetailerEntity();
        BeanUtils.copyProperties(addRetailerDto,addRetailerEntity);
        System.out.println("Entity is " + addRetailerEntity);
        System.out.println("Dto is " + addRetailerDto);
        return retailerRepository.save(addRetailerEntity);
    }

    @Override
    public List<AddRetailerDto> getAllRetailers(int id) {
        return retailerRepository.getAllRetailers(id);
    }
}
