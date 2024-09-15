package com.xworkz.chartsapp.bookstore;

import com.xworkz.chartsapp.charts.Charts;

public interface Bookstror {

    boolean addCharts(Charts charts);
    void getCarts();
    boolean  updateNoOfPicturesBytype(int chartsNoOfPics, String chartsType);

}
