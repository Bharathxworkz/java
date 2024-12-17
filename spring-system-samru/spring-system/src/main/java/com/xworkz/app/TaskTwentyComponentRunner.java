package com.xworkz.app;

import com.xworkz.app.Bar.Bar;
import com.xworkz.app.Bar.Pivot;
import com.xworkz.app.airport.Airport;
import com.xworkz.app.classs.Candidate;
import com.xworkz.app.classs.Class;
import com.xworkz.app.configuration.SpringConfiguration;
import com.xworkz.app.dubai.BurjKhalifa;
import com.xworkz.app.dubai.Dubai;
import com.xworkz.app.fashion.FashionDesigners;
import com.xworkz.app.fashion.Model;
import com.xworkz.app.parlour.Baeutician;
import com.xworkz.app.parlour.Parlour;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskTwentyComponentRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


//        Airport airport = applicationContext.getBean(Airport.class);
//        System.out.println(airport.getAirportName());
//
//        Terminal terminal = airport.terminal;
//        System.out.println(terminal.getTerminalName());

        System.out.println("-------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Bank bank = applicationContext.getBean(Bank.class);
//        System.out.println(bank.getBankName());
//
//        Manager manager = bank.manager;
//        System.out.println(manager.getManagerName());

        System.out.println("-------------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Defence defence = applicationContext.getBean(Defence.class);
//        System.out.println(defence.getPlace());
//
//        Soldier soldier = defence.soldier;
//        System.out.println(soldier.getSoldierName());

        System.out.println("-------------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Farmer farmer = applicationContext.getBean(Farmer.class);
//        System.out.println(farmer.getFarmerName());
//
//        Property property = farmer.property;
//        System.out.println(property.getNoOfAcres());

        System.out.println("--------------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        IPL ipl = applicationContext.getBean(IPL.class);
//        System.out.println(ipl.getSeason());
//
//        Franchise franchise = ipl.franchise;
//        System.out.println(franchise.getFranchiseName());

        System.out.println("----------------");

 //      ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Media media = applicationContext.getBean(Media.class);
//        System.out.println(media.getMediaName());
//
//        News news = media.news;
//        System.out.println(news.getNewsName());

        System.out.println("---------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Mobile mobile = applicationContext.getBean(Mobile.class);
//        System.out.println(mobile.getMobileName());
//
//        Sim sim = mobile.sim;
//        System.out.println(sim.getSimName());

        System.out.println("-------------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Moon moon = applicationContext.getBean(Moon.class);
//        System.out.println(moon.getMoonColor());
//
//        Sun sun = moon.sun;
//        System.out.println(sun.getSunColor());

        System.out.println("----------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Stock stock = applicationContext.getBean(Stock.class);
//        System.out.println(stock.getStockName());
//
//        Shares shares = stock.shares;
//        System.out.println(shares.getNoOfShares());

        System.out.println("--------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        PoliceStation policeStation = applicationContext.getBean(PoliceStation.class);
//        System.out.println(policeStation.getPoliceStationName());
//
//        Police police = policeStation.police;
//        System.out.println(police.getDesignation());

        System.out.println("----------------");

//        Tamilnadu tamilnadu = applicationContext.getBean(Tamilnadu.class);
//        System.out.println(tamilnadu.getCapitalCity());
//
//        Kaveri kaveri = tamilnadu.kaveri;
//        System.out.println(kaveri.getStartingPoint());


        System.out.println("-------------");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        TeleVision teleVision = applicationContext.getBean(TeleVision.class);
//
//
//        Remote remote = teleVision.remote;
//        System.out.println(remote.getNoOfButtons());

        System.out.println("---------------");

//        Visa visa = applicationContext.getBean(Visa.class);
//        System.out.println(visa.getPlace());
//
//        Passport passport = visa.passport;
//        System.out.println(passport.getName());

        System.out.println("--------------");

//        PlayStation playStation = applicationContext.getBean(PlayStation.class);
//        System.out.println(playStation.getPlayStationName());
//
//        Games games = playStation.games;
//        System.out.println(games.getGameName());

        System.out.println("----------------");

//        MumbaiIndians mumbaiIndians = applicationContext.getBean(MumbaiIndians.class);
//        System.out.println(mumbaiIndians.getCity());
//
//        AmbaniGroups ambaniGroups = mumbaiIndians.ambaniGroups;
//        System.out.println(ambaniGroups.getName());

        System.out.println("-------------------");

//        Youtube youtube = applicationContext.getBean(Youtube.class);
//        System.out.println(youtube.getLanguage());
//
//        Channel channel = youtube.channel;
//        System.out.println(channel.getChannelName());

        System.out.println("--------------------");

//        Parlour parlour = applicationContext.getBean(Parlour.class);
//        System.out.println(parlour.getPlace());
//
//        Baeutician baeutician = parlour.baeutician;
//        System.out.println(baeutician.getName());

        System.out.println("-------------------");

//        Bar bar = applicationContext.getBean(Bar.class);
//        System.out.println(bar.getBarName());
//
//        Pivot pivot = bar.pivot;
//        System.out.println(pivot.getPivotAge());

        System.out.println("-----------------");

//        Class aClass = applicationContext.getBean(Class.class);
//        System.out.println(aClass.getBranch());
//
//        Candidate candidate = aClass.candidate;
//        System.out.println(candidate.getCandidateName());

        System.out.println("------------------");

//        Dubai dubai = applicationContext.getBean(Dubai.class);
//        System.out.println(dubai.getName());
//
//        BurjKhalifa burjKhalifa = dubai.burjKhalifa;
//        System.out.println(burjKhalifa.getNoOfFloors());

        System.out.println("---------------");
//
//        FashionDesigners fashionDesigners = applicationContext.getBean(FashionDesigners.class);
//        System.out.println(fashionDesigners.getPlace());
//
//        Model model = fashionDesigners.model;
//        System.out.println(model.getName());

        System.out.println("Using Beans");

        Airport airport = applicationContext.getBean(Airport.class);
        airport.getAirportDetails();

    }
}
