package com.xworkz.spontify.musicapp;

import com.xworkz.spontify.spontifyapp.SpontifySong;

public interface MusicApp {

    boolean addSong(SpontifySong spontifySong);
    void getAllSongs();
    SpontifySong getSongById(int id);
    SpontifySong getSongArtistByName(String getSongArtistByName);
    SpontifySong getNameById(int id);
    SpontifySong getNoOfPlaysByName(String getNoOfPlaysByName);
    SpontifySong  getTimingsById(int getTimingsById);
}
