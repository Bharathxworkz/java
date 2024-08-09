package com.xworkz.spotifyapp.playlist;

import com.xworkz.spotfyapp.song.Song;

public class Playlist {
    public String name;
    private Song song;

    public Playlist(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        if (song != null) {
            this.song = song;
            System.out.println("Added song: " + song.title);
        } else {
            System.out.println("Cannot add a null song.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        if (song != null) {
            song.displayDetails();
        } else {
            System.out.println("No songs in the playlist.");
        }
    }
}
