package com.xworkz.car.runner;

import com.xworkz.car.config.SpringConfiguration;
import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CarRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        CarDto carDto = new CarDto();
        CarService carService = applicationContext.getBean(CarService.class);

        carDto.setName("Kia");
        carDto.setModel("Sorento");
        carDto.setPrice(290000.75);
        carService.save(carDto);
        System.out.println("Added successfully...!!");

        CarDto getById = carService.getUserById(1);
        System.out.println(getById);

        List<CarDto> carDtos = carService.getAllDetails(carDto);
        System.out.println(carDtos);

        CarDto updateValue = new CarDto();
        updateValue.setName("Hyundi");
        updateValue.setModel("Elantra");
        updateValue.setPrice(170000.40);
        carService.updateUserById(7,updateValue);
        System.out.println("Updated successfully...!");

        carService.DeleteUserById(9);
        System.out.println("Row deleted");

        String model = "Model3";
        String name=carService.getNameByModel(model);
        System.out.println("The name of the car fo the model of "+model+" is"+name);

        double price = 35000;
        name = carService.getNameByPrice(price);
        System.out.println("The name of the car with price of "+price+" is"+name);

        System.out.println("get Name and Model By Price");
        carService.getNameModelByPrice(price);

        boolean updated = carService.updateNameByModel("Benz","Model3");
        System.out.println("Name updated: "+updated);

        boolean deleted = carService.deleteCarByName("Kia");
        System.out.println("Car deleted: "+deleted);
    }
}
