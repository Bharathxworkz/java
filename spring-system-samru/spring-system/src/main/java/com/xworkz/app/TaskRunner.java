package com.xworkz.app;

import com.xworkz.app.configuration.SpringConfiguration;
import com.xworkz.app.task.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TaskRunner {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Product product =applicationContext.getBean(Product.class);
//        product.productId=1;
//        product.productName="Himalaya Baby Body Lotion";
//        product.price=167.00;
//        product.quanyity="200ml";
//        System.out.println(product.productId +" "+product.productName +" "+product.price +" "+product.quanyity);
//        System.out.println(product);
//        Product product1=applicationContext.getBean(Product.class);
//        product1.productId=2;
//        product1.productName="Streax Hair Serum";
//        product1.price=300.00;
//        product1.quanyity="100ml";
//        System.out.println(product1.productId +" "+product1.productName +" "+product1.price +" "+product1.quanyity);
//        System.out.println(product1);
//        product1.getProduct();
//
//        Swiggy swiggy=applicationContext.getBean(Swiggy.class);
//        swiggy.id=1;
//        swiggy.foodName="Chilli Chicken ";
//        swiggy.price=200.00;
//        swiggy.quantity=1;
//        System.out.println(swiggy.id +" "+swiggy.foodName+" "+swiggy.price+" "+swiggy.quantity);
//        System.out.println(swiggy);
//        Swiggy swiggy1=applicationContext.getBean(Swiggy.class);
//        swiggy1.id=2;
//        swiggy1.foodName="paneer Khollapuri ";
//        swiggy1.price=300.00;
//        swiggy1.quantity=2;
//        System.out.println(swiggy1.id +" "+swiggy1.foodName+" "+swiggy1.price+" "+swiggy1.quantity);
//        System.out.println(swiggy1);
//        swiggy1.getSwiggy();
//
//
//        Zomato zomato=applicationContext.getBean(Zomato.class);
//        zomato.id=1;
//        zomato.foodName="Paneer Pizza";
//        zomato.price=2000.00;
//        zomato.quantity=5;
//        System.out.println(zomato.id+" "+zomato.foodName+" "+zomato.price+" "+ zomato.quantity);
//        System.out.println(zomato);
//        Zomato zomato1=applicationContext.getBean(Zomato.class);
//        zomato1.id=1;
//        zomato1.foodName="Snadwich";
//        zomato1.price=670.00;
//        zomato1.quantity=3;
//        System.out.println(zomato1.id+" "+zomato1.foodName+" "+zomato1.price+" "+ zomato1.quantity);
//        System.out.println(zomato1);
//        zomato1.getZomatodetails();
//
//        Mobile mobile=applicationContext.getBean(Mobile.class);
//        mobile.brandName="OnePlus";
//        mobile.price=500000.0;
//        mobile.operatingSystem="OxygenOS";
//        mobile.ramMemory="16 GB";
//        System.out.println(mobile.brandName+" "+mobile.price+" "+mobile.operatingSystem+" "+mobile.ramMemory);
//        System.out.println(mobile);
//
//        Mobile mobile1=applicationContext.getBean(Mobile.class);
//        mobile1.brandName="Samsung";
//        mobile1.price=800000.0;
//        mobile1.operatingSystem="Android";
//        mobile1.ramMemory="12  GB";
//        System.out.println(mobile1.brandName+" "+mobile1.price+" "+mobile1.operatingSystem+" "+mobile1.ramMemory);
//        System.out.println(mobile1);
//        mobile1.getMobileDetails();
//
//
//        Cricket cricket=applicationContext.getBean(Cricket.class);
//        cricket.noOfPlayers=11;
//        cricket.noOfTeams=4;
//        System.out.println(cricket.noOfPlayers+" "+cricket.noOfTeams);
//        System.out.println(cricket);
//        Cricket cricket1=applicationContext.getBean(Cricket.class);
//        cricket1.noOfPlayers=10;
//        cricket1.noOfTeams=5;
//        System.out.println(cricket1.noOfPlayers+" "+cricket1.noOfTeams);
//        System.out.println(cricket1);
//        cricket1.getCricketDetails();
//
//       Bus bus=applicationContext.getBean(Bus.class);
//       bus.founders="Phanindra Sama";
//       bus.ceo="Prakash Sangam";
//       bus.headquarters="pune";
//       bus.busName="VRL";
//       bus.price=26000.00;
//       System.out.println(bus.founders+" "+bus.ceo+" "+bus.headquarters+" "+bus.busName+" "+bus.price);
//       System.out.println(bus);
//
//        Bus bus1=applicationContext.getBean(Bus.class);
//        bus1.founders="Sudhakar";
//        bus1.ceo="Prakash Sangam";
//        bus1.headquarters="Benglore";
//        bus1.busName="SRS";
//        bus1.price=2000.00;
//        System.out.println(bus1.founders+" "+bus1.ceo+" "+bus1.headquarters+" "+bus1.busName+" "+bus1.price);
//        System.out.println(bus1);
//        bus1.busDetails();
//
//
//
//      Laptop laptop=applicationContext.getBean(Laptop.class);
//      laptop.brandName="HP";
//      laptop.operatingSystem="Windows OS";
//      laptop.memory="8GB";
//      laptop.price=900000.0;
//      System.out.println(laptop.brandName+" "+laptop.operatingSystem+" "+laptop.memory+" "+laptop.price);
//      System.out.println(laptop);
//
//        Laptop laptop1=applicationContext.getBean(Laptop.class);
//        laptop1.brandName="DELL";
//        laptop1.operatingSystem="Windows OS";
//        laptop1.memory="8GB";
//        laptop1.price=1000000.0;
//        System.out.println(laptop1.brandName+" "+laptop1.operatingSystem+" "+laptop1.memory+" "+laptop1.price);
//        System.out.println(laptop1);
//        laptop.getLaptopDetails();
//
//
//        Chair chair=applicationContext.getBean(Chair.class);
//        chair.brandName="Sleep Company";
//        chair.colour="Grey";
//        chair.backStyle="Solid Back";
//        chair.price=10000.00;
//        System.out.println(chair.brandName+" "+chair.colour+" "+chair.backStyle+" "+chair.price);
//        System.out.println(chair);
//        Chair chair1=applicationContext.getBean(Chair.class);
//        chair1.brandName="CELLBELL";
//        chair1.colour="black";
//        chair1.backStyle="Wing  Back";
//        chair1.price=50000.00;
//        System.out.println(chair1.brandName+" "+chair1.colour+" "+chair1.backStyle+" "+chair1.price);
//        System.out.println(chair1);
//        chair1.getChairDetails();
//
//
//         Charger charger=applicationContext.getBean(Charger.class);
//         charger.brandName="DR VAKU";
//         charger.connectivityTechnology="USB";
//         charger.colour="White";
//         charger.price=1000.00;
//        System.out.println(charger.brandName+" "+charger.connectivityTechnology+" "+ charger.colour+" "+charger.price);
//        System.out.println(charger);
//
//        Charger charger1 =applicationContext.getBean(Charger.class);
//        charger1.brandName="Samsung";
//        charger1.connectivityTechnology="USB";
//        charger1.colour="black";
//        charger1.price=1200.00;
//        System.out.println(charger1.brandName+" "+ charger1.connectivityTechnology+" "+ charger1.colour+" "+ charger1.price);
//        System.out.println(charger1);
//        charger1.getChargerDetails();
//
//
//          Bottle bottle=applicationContext.getBean(Bottle.class);
//          bottle.colour="Silver";
//          bottle.brandName="MILTON";
//          bottle.price=400;
//          bottle.capacity="1000 Milliliters";
//        System.out.println(bottle.colour+" "+bottle.brandName+" "+bottle.price+" "+bottle.capacity);
//        System.out.println(bottle);
//        Bottle bottle1 =applicationContext.getBean(Bottle.class);
//        bottle1.colour=" Stainless steel";
//        bottle1.brandName="MILTON";
//        bottle1.price=700;
//        bottle1.capacity="700 Milliliters";
//        System.out.println(bottle1.colour+" "+ bottle1.brandName+" "+ bottle1.price+" "+ bottle1.capacity);
//        System.out.println(bottle1);
//        bottle1.bottleDetails();
//
//
//        Kettle kettle=applicationContext.getBean(Kettle.class);
//        kettle.brandName="Prestige";
//        kettle.finishType="steel";
//        kettle.color="silver";
//        kettle.price=5000.00;
//        System.out.println(kettle.brandName+" "+kettle.finishType+" "+kettle.color+" "+kettle.price);
//        System.out.println(kettle);
//        Kettle kettle1 =applicationContext.getBean(Kettle.class);
//        kettle1.brandName="Borosil";
//        kettle1.finishType="steel";
//        kettle1.color="silver";
//        kettle1.price=7000.00;
//        System.out.println(kettle1.brandName+" "+ kettle1.finishType+" "+ kettle1.color+" "+ kettle1.price);
//        System.out.println(kettle1);
//        kettle1.getKettleDetails();
//
//
//        EarDopes earDopes=applicationContext.getBean(EarDopes.class);
//        earDopes.brandName="onePlus";
//        earDopes.price=15000.0;
//        earDopes.color="black";
//        System.out.println(earDopes.brandName+" "+earDopes.price+" "+earDopes.color);
//        System.out.println(earDopes);
//
//        EarDopes earDopes1 =applicationContext.getBean(EarDopes.class);
//        earDopes1.brandName="boAt";
//        earDopes1.price=8000.0;
//        earDopes1.color="white";
//        System.out.println(earDopes1.brandName+" "+ earDopes1.price+" "+ earDopes1.color);
//        System.out.println(earDopes1);
//        earDopes1.getEardopsDetails();
//
//      Pen pen=applicationContext.getBean(Pen.class);
//      pen.brandName="Ballpoint";
//      pen.color="black";
//      pen.price=10.00;
//      System.out.println(pen.brandName+" " +pen.color+" "+pen.price);
//      System.out.println(pen);
//
//        Pen pen1 =applicationContext.getBean(Pen.class);
//        pen1.brandName="Bright";
//        pen1.color="blue";
//        pen1.price=50.00;
//        System.out.println(pen1.brandName+" " + pen1.color+" "+ pen1.price);
//        System.out.println(pen1);
//
//        pen1.getPen();
//
//
//
//      Nayka nayka=applicationContext.getBean(Nayka.class);
//      nayka.id=1;
//      nayka.productName="Bella Vita Date Women Perfume";
//      nayka.quantity=1;
//      nayka.rating=3.8;
//      System.out.println(nayka.id+" "+nayka.productName+" "+nayka.quantity+" "+nayka.rating);
//      System.out.println(nayka);
//        Nayka nayka1 =applicationContext.getBean(Nayka.class);
//        nayka1.id=2;
//        nayka1.productName="ROUGE ALLURE LIPSTIC";
//        nayka1.quantity=2;
//        nayka1.rating=4.8;
//        System.out.println(nayka1.id+" "+ nayka1.productName+" "+ nayka1.quantity+" "+ nayka1.rating);
//        System.out.println(nayka1);
//        nayka.nayakaDetails();
//
//
//         TV tv=applicationContext.getBean(TV.class);
//         tv.brandName="Sony";
//         tv.displayTechnology="LED";
//         tv.screenSize="65 Inches";
//         tv.price=87666.00;
//        System.out.println(tv.brandName+" "+tv.screenSize+" "+tv.displayTechnology+" "+tv.price);
//        System.out.println(tv);
//
//        TV tv1 =applicationContext.getBean(TV.class);
//        tv1.brandName="Samusung";
//        tv1.displayTechnology="LED";
//        tv1.screenSize="70 Inches";
//        tv1.price=99666.00;
//        System.out.println(tv1.brandName+" "+ tv1.screenSize+" "+ tv1.displayTechnology+" "+ tv1.price);
//        System.out.println(tv1);
//        tv1.getTVdetails();
//
//        CustomerDto customerDto=applicationContext.getBean(CustomerDto.class);
//        customerDto.customerId=1;
//        customerDto.name="sam";
//        customerDto.phoneNumber=8310877627l;
//        customerDto.address="Rajajinagar";
//        System.out.println(customerDto.customerId+" "+customerDto.name+" "+customerDto.phoneNumber+" "+ customerDto.address);
//        System.out.println(customerDto);
//
//
//        CustomerDto customerDto1=applicationContext.getBean(CustomerDto.class);
//        customerDto1.customerId=2;
//        customerDto1.name="sush";
//        customerDto1.phoneNumber=9990877627l;
//        customerDto1.address="Rajajinagar";
//        System.out.println(customerDto1.customerId+" "+customerDto1.name+" "+customerDto1.phoneNumber+" "+ customerDto1.address);
//        System.out.println(customerDto1);
//        customerDto.getCustomerDetails();
//
//
//        Zepto zepto=applicationContext.getBean(Zepto.class);
//        zepto.productId=1;
//        zepto.productName="Silk chocklet";
//        zepto.ratting=3.9;
//        zepto.price=200.00;
//        System.out.println(zepto.productId+" "+zepto.productName+" "+ zepto.ratting+" "+zepto.price);
//        System.out.println(zepto);
//
//        Zepto zepto1=applicationContext.getBean(Zepto.class);
//        zepto1.productId=2;
//        zepto1.productName="kitkat chocklet";
//        zepto1.ratting=4.9;
//        zepto1.price=1800.00;
//        System.out.println(zepto1.productId+" "+zepto1.productName+" "+ zepto1.ratting+" "+zepto1.price);
//        System.out.println(zepto1);
//        zepto1.getZepto();
//
//
//        Jacket jacket=applicationContext.getBean(Jacket.class);
//        jacket.jacketId=1;
//        jacket.brandName="puma";
//        jacket.price=10020.00;
//        jacket.color="black";
//        System.out.println(jacket.jacketId+" "+jacket.brandName+" "+ jacket.price+" "+jacket.color);
//        System.out.println(jacket);
//
//        Jacket jacket1=applicationContext.getBean(Jacket.class);
//        jacket1.jacketId=2;
//        jacket1.brandName="ZARA";
//        jacket1.price=20000.00;
//        jacket1.color="blue";
//        System.out.println(jacket1.jacketId+" "+jacket1.brandName+" "+ jacket1.price+" "+jacket1.color);
//        System.out.println(jacket1);
//        jacket1.jaketDetails();
//
//
//
//        Fan fan=applicationContext.getBean(Fan.class);
//        fan.id=1;
//        fan.brandName="Havells";
//        fan.speedSettings=5;
//        fan.numberOfBlades=3;
//        System.out.println(fan.id+" "+fan.brandName+" "+fan.speedSettings+" "+fan.numberOfBlades);
//        System.out.println(fan);
//
//        Fan fan1=applicationContext.getBean(Fan.class);
//        fan1.id=2;
//        fan1.brandName="Bajaj";
//        fan1.speedSettings=4;
//        fan1.numberOfBlades=3;
//        System.out.println(fan1.id+" "+fan1.brandName+" "+fan1.speedSettings+" "+fan1.numberOfBlades);
//        System.out.println(fan1);
//        fan1.fanDetails();
//
//
//        Stove stove=applicationContext.getBean(Stove.class);
//        stove.id=1;
//        stove.brandName="Prestige Marvel ";
//        stove.price=8000.00;
//        stove.rating=4.5;
//        System.out.println(stove.id+" "+stove.brandName+" "+stove.price+" "+stove.rating);
//        System.out.println(stove);
//
//        Stove stove1=applicationContext.getBean(Stove.class);
//        stove1.id=2;
//        stove1.brandName="Pigeon ";
//        stove1.price=2000.00;
//        stove1.rating=2.5;
//        System.out.println(stove1.id+" "+stove1.brandName+" "+stove1.price+" "+stove1.rating);
//        System.out.println(stove1);
//        stove1.getStoveDetails();
//
//
//
//       String value = applicationContext.getBean(String.class);
//        System.out.println(value);
//
//        boolean value1 = applicationContext.getBean(boolean.class);
//        System.out.println(value1);
//
//        double value2 = applicationContext.getBean(double.class);
//        System.out.println(value2);
//
//        float value3 = applicationContext.getBean(float.class);
//        System.out.println(value3);
//
//        long value4 = applicationContext.getBean(long.class);
//        System.out.println(value4);
//
//        char value5 = applicationContext.getBean(char.class);
//        System.out.println(value5);
//
//        short value6 = applicationContext.getBean(short.class);
//        System.out.println(value6);
//
//        byte value7 = applicationContext.getBean(byte.class);
//        System.out.println(value7);
//
//
//        List<Integer> integerList = applicationContext.getBean("getIntegerList",List.class);
//        System.out.println(integerList);
//
//        List<String> stringList = applicationContext.getBean("getStringList", List.class);
//        System.out.println(stringList);
//
//        List<Character> charList = applicationContext.getBean("getCharList", List.class);
//        System.out.println(charList);
//
//        List<Byte> byteList = applicationContext.getBean("getByteList", List.class);
//        System.out.println(byteList);
//
//
//
//        List<String> bottleList = applicationContext.getBean("getBottleList", List.class);
//        System.out.println(bottleList);
//
//        List<String> zeptoList = applicationContext.getBean("getZeptoList", List.class);
//        System.out.println(zeptoList);
//
//        List<String> zomatoList = applicationContext.getBean("getZomatoList", List.class);
//        System.out.println(zomatoList);
//
//        List<String> swiggyList = applicationContext.getBean("getSwiggyList", List.class);
//        System.out.println(swiggyList);
//
//        List<String> laptopList = applicationContext.getBean("getLaptopList", List.class);
//        System.out.println(laptopList);
//
//        List<String> mobileList = applicationContext.getBean("getMobileList", List.class);
//        System.out.println(mobileList);


    }
}
