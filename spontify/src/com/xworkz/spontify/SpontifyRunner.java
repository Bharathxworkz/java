package com.xworkz.spontify;

import com.xworkz.spontify.musicapp.MusicApp;
import com.xworkz.spontify.spontifyapp.SpontifySong;
import com.xworkz.spontify.spontifyapp.impl.SpontifyImpl;

public class SpontifyRunner {

    public static void main(String[] args) {

        SpontifySong spontifySong = new SpontifySong();
        spontifySong.setId(1);
        spontifySong.setName("Devara");
        spontifySong.setArtist("NTR");
        spontifySong.setNoOfPlays("5 times");
        spontifySong.setTimings(1);

        SpontifySong spontifySong2 = new SpontifySong();
        spontifySong2.setId(2);
        spontifySong2.setName("Devara");
        spontifySong2.setArtist("NTR");
        spontifySong2.setNoOfPlays("5 times");
        spontifySong2.setTimings(3);

        SpontifySong spontifySong3 = new SpontifySong();
        spontifySong3.setId(3);
        spontifySong3.setName("Devara");
        spontifySong3.setArtist("NTR");
        spontifySong3.setNoOfPlays("5 times");
        spontifySong3.setTimings(10);

        SpontifySong spontifySong4 = new SpontifySong();
        spontifySong4.setId(4);
        spontifySong4.setName("Devara");
        spontifySong4.setArtist("NTR");
        spontifySong4.setNoOfPlays("5 times");
        spontifySong4.setTimings(12);

        SpontifySong spontifySong5 = new SpontifySong();
        spontifySong5.setId(5);
        spontifySong5.setName("Devara");
        spontifySong5.setArtist("NTR");
        spontifySong5.setNoOfPlays("5 times");
        spontifySong5.setTimings(14);

        SpontifySong spontifySong6 = new SpontifySong();
        spontifySong6.setId(6);
        spontifySong6.setName("Devara");
        spontifySong6.setArtist("NTR");
        spontifySong6.setNoOfPlays("5 times");
        spontifySong6.setTimings(10);

        MusicApp musicApp = new SpontifyImpl();

        musicApp.addSong(spontifySong);
        musicApp.addSong(spontifySong2);
        musicApp.addSong(spontifySong3);
        musicApp.addSong(spontifySong4);
        musicApp.addSong(spontifySong5);
        musicApp.addSong(spontifySong6);

        musicApp.getAllSongs();

        SpontifySong timings = musicApp.getTimingsById(1);
        System.out.println("Timings of song with ID 3: " + timings);

        SpontifySong songById = musicApp.getSongById(2);
        if (songById != null) {
            System.out.println("Song with ID 2: " + songById.getName());
        } else {
            System.out.println("No song found with ID 2.");
        }

        SpontifySong songByArtist = musicApp.getSongArtistByName("NTR");
        if (songByArtist != null) {
            System.out.println("Song by artist NTR: " + songByArtist.getName());
        } else {
            System.out.println("No song found by artist NTR.");
        }

        SpontifySong nameById = musicApp.getNameById(4);
        if (nameById != null) {
            System.out.println("Song with ID 4: " + nameById.getName());
        } else {
            System.out.println("No song found with ID 4.");
        }

        SpontifySong noOfPlaysByName = musicApp.getNoOfPlaysByName("Devara");
        if (noOfPlaysByName != null) {
            System.out.println("Number of plays for 'Devara': " + noOfPlaysByName.getNoOfPlays());
        } else {
            System.out.println("No song found with the name 'Devara'.");
        }
    }
}
