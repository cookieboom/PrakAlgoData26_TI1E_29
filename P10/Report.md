# Laporan JOBSHEET  10 Queue

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Praktikum 2.1

### Hasil Running



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
7. 

### Hasil Running



### Pertanyaan 2.2

Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!

### Jawaban 2.2



## Tugas

### Hasil Running

