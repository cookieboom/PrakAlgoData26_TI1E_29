# Laporan JOBSHEET  10 Queue

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Praktikum 2.1

### Hasil Running

<img width="576" height="595" alt="Screenshot 2026-04-30 at 07 52 25" src="https://github.com/user-attachments/assets/1bcfd5e5-12ca-46b1-a65c-8f93fbeb3f09" />

### Pertanyaan 2.1

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),melainkan int i=front?
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
6. Tunjukkan potongan kode program yang merupakan queue overflow!
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

### Jawaban 2.1

1. Nilai front dan rear bernilai -1 menandakan queue kosong (tidak ada elemen valid), sedangkan size 0 menunjukkan jumlah elemen dalam queue adalah nol.
2. Method Enqueue menyimpan data dengan mengatur posisi rear secara circular menggunakan modulo, menyimpan data di posisi rear, dan menambah size.
3. Method Dequeue mengambil data dari posisi front, mengurangi size, kemudian menggeser front ke posisi berikutnya secara circular atau reset ke -1 jika queue kosong.
4. Perulangan dimulai dari front bukan 0 karena queue circular memungkinkan elemen pertama tidak berada di indeks 0 tergantung operasi sebelumnya.
5. Potongan kode `i = (i + 1) % max` berfungsi untuk pergerakan circular dalam array, ketika i mencapai max-1 maka kembali ke indeks 0.
6. Queue overflow terletak pada method Enqueue di bagian `if (IsFull())` yang mengecek apakah queue sudah penuh sebelum menambah elemen.
7. <img width="419" height="705" alt="Screenshot 2026-05-05 at 17 29 19" src="https://github.com/user-attachments/assets/ea8099fb-17d7-43ff-a3f6-3263c1ad62b5" />

## Praktikum 2.2

### Hasil Running

<img width="295" height="850" alt="Screenshot 2026-05-05 at 17 22 46" src="https://github.com/user-attachments/assets/f51ce7fc-8d8a-4a6d-b4a1-7baf9aa34189" />

### Pertanyaan 2.2

Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!

### Jawaban 2.2

<img width="490" height="180" alt="Screenshot 2026-05-05 at 17 23 57" src="https://github.com/user-attachments/assets/4479feda-f836-4bda-83b1-b88c41a21e4e" />
<img width="317" height="61" alt="Screenshot 2026-05-05 at 17 24 05" src="https://github.com/user-attachments/assets/4ae03cb7-ceaf-4e82-9d0f-dd68aeec762b" />

## Tugas

### Hasil Running

<img width="237" height="834" alt="Screenshot 2026-05-05 at 17 55 32" src="https://github.com/user-attachments/assets/dc017367-c7b8-4ceb-9be3-23a77e2caa7b" />
<img width="260" height="811" alt="Screenshot 2026-05-05 at 17 56 10" src="https://github.com/user-attachments/assets/e6614854-9293-4d7a-9ee5-1e7300d59ce6" />
<img width="427" height="546" alt="Screenshot 2026-05-05 at 17 56 27" src="https://github.com/user-attachments/assets/13a9aaaa-fbe4-40f0-8edc-bc84c8ef86fc" />
