package com.xworkz.spotfyapp.song;

public class Song {
    public String title;
    public String artist;
    public String album;
    public int durationInSeconds;

    public Song(String title, String artist, String album, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.durationInSeconds = durationInSeconds;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Album: " + album);
        System.out.println("Duration: " + durationInSeconds + " seconds");
    }
}
