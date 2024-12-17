package com.xworkz.app.runner;

import com.xworkz.app.flight.Flight;
import com.xworkz.app.flight.Pilot;

public class RunnerFlight {


    public static void main(String[] args) {

        Flight flight = new Flight();
        flight.flightId = 1;
        flight.noOfSeats = 200;
        flight.flightName = "KBS";

        Pilot pilot = new Pilot();
        flight.pilot = pilot;
    }
}
