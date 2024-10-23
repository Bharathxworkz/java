package com.xworkz.spontify.spontifyapp.impl;

import com.xworkz.spontify.musicapp.MusicApp;
import com.xworkz.spontify.spontifyapp.SpontifySong;

public class SpontifyImpl implements MusicApp {

    SpontifySong spontifySong[] = new SpontifySong[6];
    int index;

    @Override
    public boolean addSong(SpontifySong spontifySong) {
        boolean isSongAdded = false;
        if (spontifySong != null && index < this.spontifySong.length) {
            this.spontifySong[index] = spontifySong;
            isSongAdded = true;
            index++;
        }
        return isSongAdded;
    }

    @Override
    public void getAllSongs() {
        System.out.println("The SpontifySong info:");
        for (SpontifySong spontifySong : this.spontifySong) {
            if (spontifySong != null) {
                System.out.println("The SpontifySong Details are: " + spontifySong);
            }
        }
    }

    @Override
    public SpontifySong getSongById(int id) {
        System.out.println("getSongById started");
        SpontifySong foundSong = null;
        for (SpontifySong ref : this.spontifySong) {
            if (ref != null && ref.getId() == id) {
                foundSong = ref;
                break;
            }
        }
        return foundSong;
    }

    @Override
    public SpontifySong getSongArtistByName(String artistName) {
        System.out.println("getSongArtistByName started");
        SpontifySong foundSong = null;
        for (SpontifySong ref : this.spontifySong) {
            if (ref != null && ref.getArtist().equals(artistName)) {
                foundSong = ref;
                break;
            }
        }
        return foundSong;
    }

    @Override
    public SpontifySong getNameById(int id) {
        System.out.println("getNameById started");
        SpontifySong foundSong = null;
        for (SpontifySong ref : this.spontifySong) {
            if (ref != null && ref.getId() == id) {
                foundSong = ref;
                break;
            }
        }
        return foundSong;
    }

    @Override
    public SpontifySong getNoOfPlaysByName(String songName) {
        System.out.println("getNoOfPlayByName started");
        SpontifySong foundSong = null;
        for (SpontifySong ref : this.spontifySong) {
            if (ref != null && ref.getName().equals(songName)) { // Corrected the condition to compare song name
                foundSong = ref;
                break;
            }
        }
        return foundSong;
    }

    @Override
    public SpontifySong getTimingsById(int id) {
        System.out.println("getTimingsById started");
        for (SpontifySong ref : this.spontifySong) {
            if (ref != null && ref.getId() == id) {
                System.out.println("Timings for song with ID " + id + ": " + ref.getTimings());
                return ref;
            }
        }
        System.out.println("No song found with the given ID: " + id);
        return null;
    }
}
