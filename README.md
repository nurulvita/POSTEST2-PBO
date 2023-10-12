# POSTEST2-PBO
NIM  : 2209116038
Nama : Nurul Vita Azizah
Tema : Playlist Music

Tentang Project Playlist Music
----------------------

Project "Playlist Music" ini adalah sebuah program sederhana yang memungkinkan pengguna untuk mengelola playlist musik dengan beberapa fungsionalitas dasar seperti menambahkan lagu, mengedit informasi lagu, menghapus lagu, dan menampilkan daftar lagu dalam playlist berdasarkan genre musiknya (Indie, Pop, atau Hip-Hop). Program ini dirancang menggunakan bahasa pemrograman Java dan program ini menerapkan fitur interface, penggunaan kelas, penggunaan koleksi data (ArrayList), enkapsulasi dengan akses modifier `private`, penggunaan getter dan setter, serta penggunaan final.

### Struktur Project

Project "Playlist Music" ini dibagi menjadi beberapa package dan kelas-kelas yang berbeda:

1. **Package `playlist.models`**: Package ini berisi antarmuka `Play` yang mendefinisikan kontrak untuk kelas-kelas playlist (Indie, Pop, dan Hip-Hop). Ini juga berisi implementasi kelas-kelas playlist seperti `Indie`, `Pop`, dan `HipHop`. Setiap kelas playlist ini mengimplementasikan antarmuka `Play`.

2. **Kelas `Song`**: Ini adalah kelas yang digunakan untuk merepresentasikan sebuah lagu dalam playlist. Kelas ini memiliki variabel anggota yang menyimpan informasi tentang lagu (judul, artis, genre) serta getter dan setter untuk mengakses dan mengubah informasi tersebut.

3. **Package `playlistmusic`**: Ini adalah package yang berisi kelas `PlaylistApp` yang berfungsi sebagai aplikasi utama untuk mengelola playlist musik. Kelas `PlaylistApp` menyediakan antarmuka pengguna berupa menu untuk menambahkan, mengedit, menghapus, atau menampilkan daftar lagu dalam playlist.

### Fungsionalitas Utama

Aplikasi "Playlist Music" ini memiliki beberapa fungsionalitas utama sebagai berikut:

1. **Menambahkan Lagu**: Pengguna dapat menambahkan lagu ke dalam playlist jenis Indie, Pop, atau Hip-Hop. Mereka dapat memasukkan judul lagu, artis, dan genre lagu.

2. **Mengedit Lagu**: Pengguna dapat mengedit informasi lagu yang sudah ada di dalam playlist. Mereka dapat memilih playlist mana yang ingin diedit dan memasukkan judul lagu yang akan diedit serta informasi baru (judul, artis, genre).

3. **Menghapus Lagu**: Pengguna dapat menghapus lagu dari playlist. Mereka memasukkan judul lagu yang ingin dihapus dan pilih playlist yang sesuai.

4. **Menampilkan Daftar Lagu**: Pengguna dapat memilih playlist yang ingin mereka lihat dan melihat daftar lagu yang ada di dalamnya. Daftar lagu akan mencakup judul lagu, artis, dan genre.

### Bagaimana Menggunakan Aplikasi

1. Jalankan aplikasi dengan menjalankan kelas `PlaylistApp` yang ada dalam package `playlistmusic`.

2. Ikuti menu yang tersedia di aplikasi untuk menambahkan, mengedit, menghapus, atau menampilkan daftar lagu dalam playlist.

3. Pilih playlist yang sesuai (Indie, Pop, atau Hip-Hop) ketika diminta dalam menu.
