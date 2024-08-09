package com.xworkz.spotfyapp;
import com.xworkz.spotfyapp.song.Song;
import com.xworkz.spotifyapp.playlist.Playlist;
public class SpotifyRunner {
    public static void main(String[] args) {

        Song song = new Song("Blinding Lights", "The Weeknd", "After Hours", 200);


        Playlist playlist = new Playlist("Top Hits 2024");


        playlist.addSong(song);


        playlist.displayPlaylist();
    }
}
