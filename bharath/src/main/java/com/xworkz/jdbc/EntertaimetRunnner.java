package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.Entertaiment;
import com.xworkz.jdbc.dao.EntertamentImpl;
import com.xworkz.jdbc.dto.Moviedto;
import com.xworkz.jdbc.servicejdbc.EntertainmentService;
import com.xworkz.jdbc.servicejdbc.EntertainmentServiceimpl;

public class EntertaimetRunnner {
    public static void main(String[] args) throws  Exception{
       /* Entertaiment entertament= new EntertamentImpl();

            Moviedto moviedto= new Moviedto();

        entertament.getNumberOfMOvies(moviedto);*/

        EntertainmentService entertainmentService= new EntertainmentServiceimpl();
        entertainmentService.getMovies();
    }
}
