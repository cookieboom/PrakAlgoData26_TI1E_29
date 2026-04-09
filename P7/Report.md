# Laporan JOBSHEET 6 searching
Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Praktikum 6.2
### Hasil Running

<img width="504" height="784" alt="Screenshot 2026-04-09 at 22 18 14" src="https://github.com/user-attachments/assets/66099aa4-53aa-46b5-9f99-d79ffa77146f" />


### Pertanyaan 6.2

<img width="638" height="344" alt="Screenshot 2026-04-09 at 22 05 33" src="https://github.com/user-attachments/assets/f16b8a43-2bee-4422-8680-d69e887b95e5" />


### Jawaban 6.2

1. TampilPosisi digunakan untuk memberitahu jika data berhasil ditemukan, sedangkan TampilData digunakan untuk menampilkan data yang ditemukan.
2. Break digunakan untuk menghentikan perulangan setelah data ditemukan, sehingga tidak perlu melanjutkan pencarian.
3. variabel pos digunakan untuk menyimpan posisi index dari data yang ditemukan, sehingga dapat digunakan untuk menampilkan posisi data tersebut.
4. Jika terdapat 2 data yang sama, maka data yang pertama kali ditemukan akan ditampilkan.
5. Pencarian terus berlanjut hingga seluruh elemen dalam array diperiksa.

## Praktikum 6.3

### Hasil Running

<img width="390" height="803" alt="Screenshot 2026-04-09 at 22 28 32" src="https://github.com/user-attachments/assets/c5e54fe9-83e7-494b-bbaf-43b526a1c0f2" />


### Pertanyaan 6.3

<img width="646" height="334" alt="Screenshot 2026-04-09 at 22 05 46" src="https://github.com/user-attachments/assets/b9dd12db-3e49-450f-8ba3-568dec13b482" />


### Jawaban 6.3

1. Proses divide: int mid = (low + high) / 2;
2. Proses conquer: if (data[mid] == cari) { return mid; }
3. fungsi left, right, dan mid digunakan untuk menentukan batas pencarian dalam array
4. program akan berjalan, tetapi hasilnya kemungkianan besar akan salah karena mungkin ada array yang terlewat
5. Tidak ditemukan, perlu perbaikan
6. Akana mengmablikan nilai -1 jika tidak menemukan yang dicari
7.
