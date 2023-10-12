/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist.models;

/**
 *
 * @author nurul
 */

public interface Play {
    void addSong(String music, String artist, String genre);
    void editSong(String oldMusic, String newMusic, String newArtist, String newGenre);
    void deleteSong(String music);
    void displayPlaylist();
}

