package com.xworkz.jdbc.servicejdbc;

import com.xworkz.jdbc.dao.Entertaiment;
import com.xworkz.jdbc.dao.EntertamentImpl;
import com.xworkz.jdbc.dto.Moviedto;

public class EntertainmentServiceimpl implements EntertainmentService{
    @Override
    public void getMovies() {

              Entertaiment entertaimentm= new EntertamentImpl();
            //dao
            entertaimentm.getNumberOfMOvies();

    }
}
