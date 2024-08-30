package constructorchaining;

import constructorchaining.area.Area;
import constructorchaining.country.Country;

public class ConstructorRunner {
    public static void main(String[] args) {
        Area area = new Area();
        area.areaName="Vijaynagar";
        area.getareadetails();
        Country country=new Country();
        country.countryName="Indaia";
        country.getCountrydetails();

    }
}
