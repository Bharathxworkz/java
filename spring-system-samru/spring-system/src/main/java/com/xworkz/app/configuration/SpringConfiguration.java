package com.xworkz.app.configuration;


import com.xworkz.app.airport.Airport;
import com.xworkz.app.airport.Terminal;
import com.xworkz.app.patient.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.app")
public class SpringConfiguration {
    public SpringConfiguration() {

    }
//
//    @Bean
//    public String getStringValue() {
//        return "baba";
//    }
//
//    @Bean
//    public boolean getUserStetus() {
//        return true;
//    }
//
//    @Bean
//    public int getTotalUser() {
//        return 10;
//    }
//
//    @Bean
//    public double getTotalPrice() {
//        return 10.0;
//    }
//
//    @Bean
//    public float getFloat() {
//        return 17.5456667f;
//    }
//
//    @Bean
//    public long getLong() {
//        return 343L;
//    }
//
//    @Bean
//    public char getChar() {
//        return 'S';
//    }
//
//    @Bean
//    public short getShort() {
//        return 1;
//    }
//
//    @Bean
//    public byte getByte() {
//
//        return 3;
//    }
//
//    @Bean
//    public List<Integer> getIntegerList() {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        return list;
//    }
//
//    @Bean
//    public List<String> getStringList() {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("baba");
//        stringList.add("java");
//        stringList.add("spring");
//        return stringList;
//    }
//    @Bean
//    public List<Character> getCharList() {
//        List<Character> charList = new ArrayList<>();
//        charList.add('S');
//        charList.add('A');
//        charList.add('M');
//        charList.add('M');
//        charList.add('U');
//        return charList;
//    }
//
//    @Bean
//    public List<Byte> getByteList() {
//        List<Byte> byteList = new ArrayList<>();
//        byteList.add((byte) 1);
//        byteList.add((byte) 2);
//        byteList.add((byte) 3);
//        byteList.add((byte) 4);
//        byteList.add((byte) 5);
//        return byteList;
//    }
//    @Bean
//    public List<String>getBottleList(){
//        List<String> bottleList=new ArrayList<>();
//        bottleList.add("Melton");
//        bottleList.add("TupperWare");
//        return  bottleList;
//    }
//
//    @Bean
//    public List<String>getZeptoList(){
//        List<String> zeptoList=new ArrayList<>();
//        zeptoList.add("Kurkure");
//        zeptoList.add("Lays");
//        return  zeptoList;
//    }
//    @Bean
//    public List<String>getZomatoList(){
//        List<String> zomatoList=new ArrayList<>();
//        zomatoList.add("pizza");
//        zomatoList.add("burgger");
//        zomatoList.add("pasta");
//        return  zomatoList;
//    }
//
//    @Bean
//    public List<String>getSwiggyList(){
//        List<String> swiggyList=new ArrayList<>();
//        swiggyList.add("chiken");
//        swiggyList.add("motton");
//        swiggyList.add("maggi");
//        return  swiggyList;
//    }
//    @Bean
//    public List<String>getLaptopList(){
//        List<String> laptopList=new ArrayList<>();
//        laptopList.add("HP ");
//        laptopList.add("DELL");
//        laptopList.add("Lenovo");
//        return  laptopList;
//    }
//    @Bean
//    public List<String>getMobileList(){
//        List<String> mobileList=new ArrayList<>();
//        mobileList.add("Redmi");
//        mobileList.add("vivo");
//        mobileList.add("Realmi");
//        return  mobileList;
//    }
//
//    @Bean
//    public Patient getPatient() {
//        Address address = getAddress();
//        Patient patient = new Patient(address);
//        patient.patientName = "Raviraj";
//        patient.patientAge = 27;
//        patient.patientId = 109;
//        patient.phoneNumber = 9876543210L;
//        return patient;
//    }
//
//    @Bean
//    public Address getAddress() {
//        Country country = getCountry();
//        Address address = new Address(country);
//        return address;
//    }
//
//
//    @Bean
//    public Country getCountry() {
//        State state = getState();
//        Country country = new Country(state);
//        country.countryName = "India";
//        return country;
//    }
//
//    @Bean
//    public State getState() {
//        City city = getCity();
//        State state = new State(city);
//        state.stateName = "Karnataka";
//        return state;
//    }
//
//
//    @Bean
//    public City getCity() {
//        Area area = getArea();
//        City city = new City(area);
//        city.cityName = "Bengaluru";
//        return city;
//    }
//
//
//    @Bean
//    public Area getArea() {
//        Street street = getStreet();
//        Area area = new Area(street);
//        area.areaName = "Rajajinagar";
//        return area;
//    }
//
//
//    @Bean
//    public Street getStreet() {
//        Street street = new Street();
//        street.streetName = "Bhashyam Circle";
//        street.streetNumber = 123;
//        return street;
//    }

    @Bean
    public Airport createAirport(){
        Terminal terminal= getTerminal();
        Airport airport = new Airport(terminal);
        airport.setAirportName(airport.getAirportName());
        return airport;

    }
@Bean
    public Terminal getTerminal(){
        Terminal terminal=new Terminal();
        terminal.setTerminalName(terminal.getTerminalName());
        return terminal;

    }
}
