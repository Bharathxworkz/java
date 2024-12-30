package com.xworkz.car.dao;

import com.xworkz.car.dto.CarDto;

import java.util.List;

public interface CarDao {

    boolean save(CarDto carDto);

    CarDto getUserById(int id);

    List<CarDto> getAllDetails(CarDto carDto);

    void updateUserById(int id, CarDto newUserData);

    boolean DeleteUserById(int id);

    String getNameByModel(String model);

    String getNameByPrice(double price);

    Object [] getNameModelByPrice(double price);

    boolean updateNameByModel(String name, String model);

    boolean deleteCarByName(String name);

}
