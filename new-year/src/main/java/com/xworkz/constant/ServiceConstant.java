package com.xworkz.constant;

import lombok.Getter;

@Getter
public enum ServiceConstant {

    FIlE_PATH("C://newYearFile/"),FROM_EMAIL("bharathl.xworkz@gmail.com"),FROM_NAME("Bhartaht L"),FROM_PASSWORD("whql ejof uzmq tucp");
    private String path;
    private ServiceConstant(String path){
        System.out.println("came enum file");
        this.path=path;

    }
}
