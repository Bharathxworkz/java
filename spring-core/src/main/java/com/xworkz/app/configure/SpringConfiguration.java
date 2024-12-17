package com.xworkz.app.configure;


import com.xworkz.app.Airpot.Airpot;
import com.xworkz.app.Airpot.Terminal;
import com.xworkz.app.Bank.Bank;
import com.xworkz.app.Bank.Manager;
import com.xworkz.app.Ipl.Frachise;
import com.xworkz.app.Ipl.Ipl;
import com.xworkz.app.patient.*;
import com.xworkz.app.police.Police;
import com.xworkz.app.police.PoliceStation;
import com.xworkz.app.police.Salary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Configuration
@ComponentScan(basePackages = "com.xworkz.app")
public class SpringConfiguration {

    public SpringConfiguration() {

    }

    @Bean
    public String getStringValue() {
      return "baba";

    }
    @Bean
    public boolean getuserStatus(){
        return true;
    }
    @Bean
    public int getflightId(){
        return 2;
    }
    @Bean
    public float getuservalue(){
        return 865;
    }

    @Bean
    public double getUserValue(){
        return 8.765;
    }
    @Bean
    public char getUservalue(){
        return 'a';
    }
    @Bean
    public short getuservalues(){
        return -32456;
    }
    @Bean
    public long getuserValues(){
        return 7654397654543l;
    }
    @Bean
    public byte getuserValue(){
        return -126;
    }

    @Bean
    public List<String> getListOfName(){
  List<String>  Name = new ArrayList<String>();
  Name.add(new String("abhi"));
  Name.add(new String("megha"));
  Name.add(new String("swetha"));
  return Name;
    }

    @Bean
    public List<Integer> getListOfId() {
        List<Integer> ref = new ArrayList<Integer>();
        ref.add(new Integer(1));
        ref.add(new Integer(2));
        ref.add(new Integer(3));
        return ref;
    }

    @Bean
    public List<Float> getListOffloat() {
        List<Float> ref = new ArrayList<Float>();
        ref.add(new Float(1.0f));
        ref.add(new Float(2.0f));
        ref.add(new Float(3.0f));
        return ref;

    }
    /*@Bean
    public Patient getPatient() {
        Address address = getAddress();
        Patient patient = new Patient(address);
        return patient;
    }
    @Bean
    public  Address getAddress(){
        Country country = getCountry();
        Address address = new Address(country);
        address.getAddressDetails();

        return address;
    }
    @Bean
    public  Country getCountry(){
        State state= getState();
        Country country =new Country(state);
        country.CountryName="India";
        return country;
    }
    @Bean
    public  State getState(){
        City city = getCity();
        State state = new State(city);
        state.stateName="Karnataka";
        return state;

    }
  @Bean
    public City getCity() {
        Area area = getAraea();
        City city = new City(area);
        city.cityName="Benaglore";
        return city;
    }
  @Bean
    public Area getAraea() {
        Area area = new Area();
        area.areaName="Hosalli";
        area.streetName="Shivaganapath colony";
        area.streetNo=24;
        return area;
    }
*/
    @Bean
    public Patient patient(){
        Address address = getAddress();
        return new Patient(address);
    }

    @Bean
    public Address getAddress() {
        Country country = getCountry();
        Address address = new Address(country);
    /*    address.Address = "VijayNagar";*/
        return address;

    }

    @Bean
    public Country getCountry() {
        State state = getState();
        Country
                country = new Country(state);
        country.CountryName = "India";
        return country;

    }

    @Bean
    public State getState() {
        City city = getCity();
        State state = new State(city);
        state.stateName = "Karnataka";
        return state;
    }

    @Bean
    public City getCity() {
        Area area = getArea();
        City city = new City(area);
        city.cityName = "Bangalore";
        return city;
    }

    @Bean
    public Area getArea() {
        Area area = new Area();
        area.areaName="Raji";
        area.streetName = "2nd block";
        area.streetNo=32;
        return area;
    }

   // @Bean
    public Airpot getAirpot() {
        Terminal terminal = getTerminal();
        return new Airpot(terminal);
    }

    //@Bean
    public Terminal getTerminal() {
        Terminal terminal = new Terminal();
        terminal.setTerminalname("Nagara");
        return terminal;
    }
   // @Bean
    public Bank getBank(){
        Manager manager = getmanager();
        return new Bank (manager);
    }
   // @Bean
    public Manager getmanager(){
       Manager manager = new Manager();
       manager.setManagerName("Mayank");
       return manager;
    }
  //  @Bean
public Ipl getIpl(){
    Frachise frachise = getfrachise();
    Ipl ipl =new Ipl(frachise);
    return ipl;
}
//@Bean
public Frachise getfrachise(){
        Frachise frachise= new Frachise();
        frachise.FranchiseNmae="RCB";
        return frachise;
}
@Bean
public PoliceStation getpolicestation(){
    Police police =getpolice();
    PoliceStation policeStation = new PoliceStation(police);
    policeStation.policeStation="KR puram";
    return policeStation;


}
//@Bean
public Police getpolice(){
    Salary salary =getsalary();
    Police police = new Police(salary);
    police.Name = "Bharath L";
    return police;
}
//@Bean
public  Salary getsalary(){
     Salary salary = new Salary();
     salary.Salary=200000;
     return salary;
}
}

