package com.xworkz.app.repository;

import com.xworkz.app.dto.DistributorDto;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.DistributorEntity;
import com.xworkz.app.entity.VendorEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistributorRepository {
    boolean save(DistributorEntity distributorEntity);

    List<DistributorDto> getAllstock();

    boolean deleteStockById(int id);

    DistributorEntity getStockById(int id);


    void updateStock(DistributorEntity distributorEntity);


}
