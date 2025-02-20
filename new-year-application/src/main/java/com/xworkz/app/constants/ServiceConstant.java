package com.xworkz.app.constants;

import lombok.Getter;

@Getter
public enum ServiceConstant {
    FILE_PATH("C://newYearFile/"),FROM_EMAIL("bharathl.xworkz@gmail.com"),FROM_NAME("Bharath L"),PASSWORD("whql ejof uzmq tucp");

    private String path;

    private ServiceConstant(String path){

        this.path=path;
    }
}
