package com.xworkz.chartsapp.bookstore.impl;

import com.xworkz.chartsapp.bookstore.Bookstror;
import com.xworkz.chartsapp.charts.Charts;

import java.util.Scanner;

public class Impl implements Bookstror {

    public Charts[] charts;
    int index ;

    // Constructor to initialize charts array based on user input size
    public Impl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of charts:");
        int size = scanner.nextInt();
        charts = new Charts[size];  // Create an array based on the size input
    }

    @Override
    public boolean addCharts(Charts charts) {
        boolean isAdded = false;
        if (charts != null && charts.getChartsName() != null) {
            if (index < this.charts.length) { // Check if array has space
                this.charts[index++] = charts;
                isAdded = true;
            } else {
                System.out.println("No space to add more charts.");
            }
        }
        return isAdded;
    }

    @Override
    public void getCarts() {
        for (Charts chart : charts) {
            if (chart != null) {
                System.out.println("The Chart details: " + chart);
            }
        }
    }

    @Override
    public boolean updateNoOfPicturesBytype(int chartsNoOfPics, String chartsType) {
        boolean isUpdated=true;
        for (int index = 0; index < charts.length; index++) {
            if(charts[index] != null && charts[index].getChartsType()==chartsType){
                charts[index].getChartsNoOfPics();
                return true;
            }

        }
        return false;
    }
}
