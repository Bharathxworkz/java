package com.xworkz.car.service;

import com.xworkz.car.dao.CarDao;
import com.xworkz.car.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;
    boolean isvalidated = false;

    @Override
    public boolean save(CarDto carDto) {
        if(carDto !=null){
            if(carDto.getName() != null && !carDto.getName().isEmpty()){
                System.out.println("Name validated");
                carDao.save(carDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public CarDto getUserById(int id) {
        return carDao.getUserById(id);
    }
    @Override
    public List<CarDto> getAllDetails(CarDto carDto) {
        return carDao.getAllDetails(carDto);
    }

    @Override
    public void updateUserById(int id, CarDto newUserData) {
        carDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return carDao.DeleteUserById(id);
    }

    @Override
    public String getNameByModel(String model) {
        return carDao.getNameByModel(model);
    }

    @Override
    public String getNameByPrice(double price) {
        return carDao.getNameByPrice(price);
    }

    @Override
    public Object[] getNameModelByPrice(double price) {
        Object [] obj = carDao.getNameModelByPrice(price);
        return obj;
    }

    @Override
    public boolean updateNameByModel(String name, String model) {
        return carDao.updateNameByModel(name,model);
    }

    @Override
    public boolean deleteCarByName(String name) {
        return carDao.deleteCarByName(name);
    }
}
