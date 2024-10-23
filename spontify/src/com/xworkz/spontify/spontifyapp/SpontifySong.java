package com.xworkz.spontify.spontifyapp;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class SpontifySong {

    private int id;
    private String Name;
    private  String artist;
    private int timings;
    private String noOfPlays;
}
