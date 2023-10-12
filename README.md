# POSTEST2-PBO
NIM  : 2209116038

Nama : Nurul Vita Azizah

Tema : Playlist Music

Tentang Project Playlist Music
----------------------

Project "Playlist Music" ini adalah sebuah program sederhana yang memungkinkan pengguna untuk mengelola playlist musik dengan beberapa fungsionalitas dasar seperti menambahkan lagu, mengedit informasi lagu, menghapus lagu, dan menampilkan daftar lagu dalam playlist berdasarkan genre musiknya (Indie, Pop, atau Hip-Hop). Program ini dirancang menggunakan bahasa pemrograman Java dan program ini menerapkan fitur interface, penggunaan kelas, penggunaan koleksi data (ArrayList), enkapsulasi dengan akses modifier `private`, penggunaan getter dan setter, penggunaan final, inheritance, serta override.

### Struktur Project

Project "Playlist Music" ini dibagi menjadi beberapa package dan kelas-kelas yang berbeda:

1. **Package `playlist.models`**: Package ini berisi antarmuka `Play` yang mendefinisikan kontrak untuk kelas-kelas playlist (Indie, Pop, dan Hip-Hop). Ini juga berisi implementasi kelas-kelas playlist seperti `Indie`, `Pop`, dan `HipHop`. Setiap kelas playlist ini mengimplementasikan antarmuka `Play`.

   ![image](https://github.com/nurulvita/POSTEST2-PBO/assets/121857360/43e448cd-2d76-49da-86e1-6bba3d0fb9f1)


3. **Kelas `Song`**: Ini adalah kelas yang digunakan untuk merepresentasikan sebuah lagu dalam playlist. Kelas ini memiliki variabel anggota yang menyimpan informasi tentang lagu (judul, artis, genre) serta getter dan setter untuk mengakses dan mengubah informasi tersebut.

4. **Package `playlistmusic`**: Ini adalah package yang berisi kelas `PlaylistApp` yang berfungsi sebagai aplikasi utama untuk mengelola playlist musik. Kelas `PlaylistApp` menyediakan antarmuka pengguna berupa menu untuk menambahkan, mengedit, menghapus, atau menampilkan daftar lagu dalam playlist.

### Fungsionalitas Utama

Aplikasi "Playlist Music" ini memiliki beberapa fungsionalitas utama sebagai berikut:

1. **Menambahkan Lagu**: Pengguna dapat menambahkan lagu ke dalam playlist jenis Indie, Pop, atau Hip-Hop. Mereka dapat memasukkan judul lagu, artis, dan genre lagu.

   '''
   
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
   '''

3. **Mengedit Lagu**: Pengguna dapat mengedit informasi lagu yang sudah ada di dalam playlist. Mereka dapat memilih playlist mana yang ingin diedit dan memasukkan judul lagu yang akan diedit serta informasi baru (judul, artis, genre).

   '''
   
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

   '''

5. **Menghapus Lagu**: Pengguna dapat menghapus lagu dari playlist. Mereka memasukkan judul lagu yang ingin dihapus dan pilih playlist yang sesuai.

   '''
   
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
   
   '''

7. **Menampilkan Daftar Lagu**: Pengguna dapat memilih playlist yang ingin mereka lihat dan melihat daftar lagu yang ada di dalamnya. Daftar lagu akan mencakup judul lagu, artis, dan genre.

'''

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

'''
### Cara Penggunaan PlaylistApp

1. Jalankan aplikasi dengan menjalankan kelas `PlaylistApp` yang ada dalam package `playlistmusic`.

2. Ikuti menu yang tersedia di aplikasi untuk menambahkan, mengedit, menghapus, atau menampilkan daftar lagu dalam playlist.

3. Pilih playlist yang sesuai (Indie, Pop, atau Hip-Hop) ketika diminta dalam menu.
