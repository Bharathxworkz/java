package com.xworkz.collection;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString

public class Productdto {
    int id;
    String name;

    public Productdto(int id,String name) {
        this.id=id;
        this.name=name;

    }


}
