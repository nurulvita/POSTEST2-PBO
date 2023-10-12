/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist.models;

/**
 *
 * @author nurul
 */

import java.util.ArrayList;
import java.util.List;

public class Indie implements Play {
    private final List<Song> playlist = new ArrayList<>();

    @Override
    public void addSong(String music, String artist, String genre) {
        Song song = new Song(music, artist, genre);
        playlist.add(song);
    }

    @Override
    public void editSong(String oldMusic, String newMusic, String newArtist, String newGenre) {
        for (Song song : playlist) {
            if (song.getMusic().equals(oldMusic)) {
                song.setMusic(newMusic);
                song.setArtist(newArtist);
                song.setGenre(newGenre);
            }
        }
    }

    @Override
    public void deleteSong(String music) {
        playlist.removeIf(song -> song.getMusic().equals(music));
    }

    @Override
    public void displayPlaylist() {
        for (Song song : playlist) {
            System.out.println(" Song   : " + song.getMusic());
            System.out.println(" Artist : " + song.getArtist());
            System.out.println(" Genre  : " + song.getGenre());
            System.out.println("==================================");
            System.out.println();
        }
    }
}


// Implement Pop and HipHop classes similarly

