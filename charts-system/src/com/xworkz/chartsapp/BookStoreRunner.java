package com.xworkz.chartsapp;

import com.xworkz.chartsapp.bookstore.Bookstror;
import com.xworkz.chartsapp.bookstore.impl.Impl;
import com.xworkz.chartsapp.charts.Charts;

import java.util.Scanner;

public class BookStoreRunner {
    public static void main(String[] args) {
        Bookstror bookstror = new Impl();  // Already asks for size
        Scanner scanner = new Scanner(System.in);

        // Since the size is already taken in Impl's constructor, we don't need to ask again
        Impl impl = (Impl) bookstror;  // Cast to Impl to access the array size
        int size = impl.charts.length; // Get the size of the charts array

        for (int index = 0; index < size; index++) {
            Charts charts = new Charts();

            System.out.println("Enter chart name:");
            String name = scanner.nextLine();
            charts.setChartsName(name);

            System.out.println("Enter the chart ID:");
            int id = scanner.nextInt();
            charts.setChartsID(id);

            // Consume the newline left-over
            scanner.nextLine();

            System.out.println("Enter the chart color:");
            String color = scanner.nextLine();
            charts.setChartsColor(color);

            System.out.println("Enter the chart type:");
            String type = scanner.nextLine();
            charts.setChartsType(type);

            System.out.println("Enter the charts noOfpics ");
            int pics=scanner.nextInt();
            charts.setChartsNoOfPics(pics);




            bookstror.updateNoOfPicturesBytype(pics,type);
            // Add the chart to the Bookstror
            bookstror.addCharts(charts);


        }

        bookstror.getCarts(); // Display the chart details
    }
}
