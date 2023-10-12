/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package playlistmusic;

/**
 *
 * @author nurul
 */


import playlist.models.*;

import java.util.Scanner;

public final class PlaylistApp {
    public static void main(String[] args) {
        Play indiePlaylist = new Indie();
        Play popPlaylist = new Pop();
        Play hiphopPlaylist = new HipHop();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\t================================");
            System.out.println("\t\t        ~ PLAYLIST MENU ~        ");
            System.out.println("\t\t================================");
            System.out.println("\t\t|  (1.) Add Song               |");
            System.out.println("\t\t|  (2.) Edit Song              |");
            System.out.println("\t\t|  (3.) Delete Song            |");
            System.out.println("\t\t|  (4.) Display Playlist       |");
            System.out.println("\t\t|  (5.) Exit                   |");
            System.out.println("\t\t===============================");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("\t\tEnter your choice 1/2/3/4/5 : ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1 -> {
                    System.out.println("====================================");
                    System.out.println("      Add Song To Playlist          ");
                    System.out.println("====================================");
                    System.out.print("  Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("  Enter artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("  Enter genre: ");
                    String genre = scanner.nextLine();
                    
                    System.out.println("==================================");
                    System.out.println("        Select a Playlist:        ");
                    System.out.println("==================================");
                    System.out.println("1. Indie");
                    System.out.println("2. Pop");
                    System.out.println("3. Hip-Hop");
                    System.out.println("==================================");
                    System.out.print("  Enter your choice: ");
                    int playlistChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (playlistChoice) {
                        case 1 -> indiePlaylist.addSong(title, artist, genre);
                        case 2 -> popPlaylist.addSong(title, artist, genre);
                        case 3 -> hiphopPlaylist.addSong(title, artist, genre);
                        default -> System.out.println("Invalid playlist choice.");
                        
                    }
                }

                case 2 -> {
                    System.out.print("Enter song title to edit: ");
                    String songToEdit = scanner.nextLine();
                    System.out.println("==================================");
                    System.out.println("  Select a Playlist to edit from: ");
                    System.out.println("==================================");
                    System.out.println("     (1) Indie                    ");
                    System.out.println("     (2) Pop                      ");
                    System.out.println("     (3) Hip-Hop                  ");
                    System.out.println("==================================");
                    System.out.print("  Enter your choice: ");
                    int editPlaylistChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (editPlaylistChoice) {
                        case 1 -> {
                            if (indiePlaylist instanceof Indie indie) {
                                System.out.println("==================================");
                                System.out.print("Enter new song title: ");
                                String newTitle = scanner.nextLine();
                                System.out.print("Enter new artist: ");
                                String newArtist = scanner.nextLine();
                                System.out.print("Enter new genre: ");
                                String newGenre = scanner.nextLine();
                                indie.editSong(songToEdit, newTitle, newArtist, newGenre);
                            }
                    }
                        case 2 -> {
                            if (popPlaylist instanceof Pop pop) {
                                System.out.println("==================================");
                                System.out.print("Enter new song title: ");
                                String newTitle = scanner.nextLine();
                                System.out.print("Enter new artist: ");
                                String newArtist = scanner.nextLine();
                                System.out.print("Enter new genre: ");
                                String newGenre = scanner.nextLine();
                                pop.editSong(songToEdit, newTitle, newArtist, newGenre);
                            }
                    }

                        case 3 -> {
                            if (hiphopPlaylist instanceof HipHop hiphop) {
                                System.out.println("==================================");
                                System.out.print("Enter new song title: ");
                                String newTitle = scanner.nextLine();
                                System.out.print("Enter new artist: ");
                                String newArtist = scanner.nextLine();
                                System.out.print("Enter new genre: ");
                                String newGenre = scanner.nextLine();
                                hiphop.editSong(songToEdit, newTitle, newArtist, newGenre);
                            }
                    }

                        default -> System.out.println("Invalid playlist choice.");
                    }
                }

                case 3 -> {
                    System.out.println("==================================");
                    System.out.println("     Enter song title to delete     ");
                    System.out.println("==================================");
                    String songToDelete = scanner.nextLine();
                    
                    System.out.println("==================================");
                    System.out.println("Select a Playlist to delete from:");
                    System.out.println("==================================");
                    System.out.println("1. Indie");
                    System.out.println("2. Pop");
                    System.out.println("3. Hip-Hop");
                    System.out.println("==================================");
                    System.out.print("Enter your choice: ");
                    int deletePlaylistChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (deletePlaylistChoice) {
                        case 1 -> indiePlaylist.deleteSong(songToDelete);
                        case 2 -> popPlaylist.deleteSong(songToDelete);
                        case 3 -> hiphopPlaylist.deleteSong(songToDelete);
                        default -> System.out.println("Invalid playlist choice.");
                    }
                }


                case 4 -> {
                    System.out.println("==================================");
                    System.out.println("  Select a Playlist to display:   ");
                    System.out.println("==================================");
                    System.out.println("    (1) Indie                     ");
                    System.out.println("    (2) Pop                       ");
                    System.out.println("    (3) Hip-Hop                   ");
                    System.out.println("==================================");
                    System.out.print("  Enter your choice: ");
                    int displayPlaylistChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (displayPlaylistChoice) {
                        case 1 -> {
                            System.out.println("==================================");
                            System.out.println("         Indie Playlist           ");
                            System.out.println("==================================");
                            indiePlaylist.displayPlaylist();
                        }
                        case 2 -> {
                            System.out.println("==================================");
                            System.out.println("         Pop Playlist             ");
                            System.out.println("==================================");
                            popPlaylist.displayPlaylist();
                        }
                        case 3 -> {
                            System.out.println("==================================");
                            System.out.println("       Hip-Hop Playlist           ");
                            System.out.println("==================================");
                            hiphopPlaylist.displayPlaylist();
                        }
                        default -> System.out.println("Invalid playlist choice.");
                    }
                }


                case 5 -> {
                    System.out.println("==================================");
                    System.out.println("       Exiting Playlist App       ");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
