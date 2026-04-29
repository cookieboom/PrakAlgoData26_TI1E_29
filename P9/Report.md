# Laporan JOBSHEET  9 Stack

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Praktikum 2.1

### Hasil Running

<img width="415" height="824" alt="Screenshot 2026-04-28 at 09 50 28" src="https://github.com/user-attachments/assets/54371ee3-0f66-4c2d-8f3d-49e0456c5123" />


### Pertanyaan 2.1

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana yang perlu diperbaiki?
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan
kode programnya!
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!

### Jawaban 2.1

1. Pada kode saya saat saya jalankan, tidak terdapat error. Mungkin error sudah diperbaiki oleh copilot suggestuon.
2. StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
Kode tersebut digunakan untuk membuat objek stack dengan kapasitas 5.
3. Karena jika stack full dan data tetap dimasukkan, maka akan terjadi overflow yang dapat menyebabkan program crash.
4. <img width="411" height="23" alt="Screenshot 2026-04-28 at 09 51 13" src="https://github.com/user-attachments/assets/d82f76df-91fd-4c9b-bdf2-a10e3789018d" />
<img width="645" height="110" alt="Screenshot 2026-04-28 at 09 51 37" src="https://github.com/user-attachments/assets/3ec72743-f8c0-47e0-b2b4-0f6d68687664" />
5. <img width="353" height="19" alt="Screenshot 2026-04-28 at 09 51 24" src="https://github.com/user-attachments/assets/b22cdb15-f0fb-4b0b-adfd-5ec53825ec75" />
<img width="544" height="71" alt="Screenshot 2026-04-28 at 09 51 47" src="https://github.com/user-attachments/assets/2ae47dc0-8e3d-4c58-9cbe-86aa2655fa82" />

## Praktikum 2.2

### Hasil Running

<img width="660" height="442" alt="Screenshot 2026-04-28 at 10 10 43" src="https://github.com/user-attachments/assets/efa53d35-dfac-4c62-86ee-7c421b8fa589" />


### Pertanyaan 2.2

1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!

### Jawaban 2.2
Jelaskan alur kerja dari method konversiDesimalKeBiner!
1. Method konversiDesimalKeBiner bekerja dengan cara mengambil nilai desimal yang ingin dikonversi, kemudian menggunakan stack untuk menyimpan sisa hasil pembagian nilai desimal dengan 2. Proses ini dilakukan secara berulang hingga nilai desimal menjadi 0. Setelah itu, sisa-sisa yang disimpan dalam stack akan diambil dan digabungkan untuk membentuk representasi biner dari nilai desimal tersebut.
2. Akan menyembabkan error ketika nilau yang dimasukkan adalah negatuf.

## Tugas

### Hasil Running

<img width="419" height="804" alt="Screenshot 2026-04-29 at 09 12 31" src="https://github.com/user-attachments/assets/fada595b-d83a-4bd9-a766-1b76108003cb" />
