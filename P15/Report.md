# Laporan JOBSHEET  16 Collection

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## 16.2. Kegiatan Praktikum 1
### Hasil Running

### Pertanyaan

### Jwaban
1. Semua jenis data bisa ditampung ke dalam ArrayList pada baris 25-36 karena deklarasi menggunakan tipe Object (List<Object> l = new ArrayList<>()). Dalam Java, Object adalah parent class dari semua tipe data, sehingga ArrayList dapat menerima int, String, dan tipe data lainnya. Hal ini disebut polymorphism.
2. 
3. 
4. 
5. -ArrayList (tipe Object): Bisa menyimpan berbagai tipe karena menggunakan parent class Object
-LinkedList (tipe String): Hanya menyimpan String, lebih aman dan type-safe
-Method set(): Mengubah elemen di index 0 dari "Noureen" menjadi "My Kid"
-Method toString(): Menampilkan seluruh isi LinkedList dalam format list

## 16.3. Kegiatan Praktikum 2
### Hasil Running

### Pertanyaan

### Jawaban
1. -push() : Menambahkan elemen ke stack
-add() : Menambahkan elemen ke list
2. Jika dihilangkan, operasi pop() pada while loop (baris 21-23) akan mengosongkan semua elemen, sehingga tidak ada data tersisa untuk Iterator, stream(), dan loop index berikutnya. Hasilnya 3 output terakhir akan kosong.
3. Penjelasan: Loop ini menggunakan Iterator untuk menampilkan setiap elemen dari Stack fruits.
4. Jika mengubah baris 8 menjadi List<String>, akan terjadi ERROR karena:

Method push() tidak ada di List - hanya ada di Stack
Method pop() tidak ada di List - hanya ada di Stack
Method empty() tidak ada di List - hanya ada di Stack

Program akan GAGAL KOMPILASI di baris 10, 13, 21, 25, dan 26.
5. 
6. 

### 16.4. Kegiatan Praktikum 3
### Hasil Running

### Pertanyaan

### Jawaban
1. Semua jenis data bisa ditampung ke dalam ArrayList pada baris 25-36 karena deklarasi menggunakan tipe Object (List<Object> l = new ArrayList<>()). Dalam Java, Object adalah parent class dari semua tipe data, sehingga ArrayList dapat menerima int, String, dan tipe data lainnya. Hal ini disebut polymorphism.
2. 
3. 

## 16.5. Tugas Praktikum
1. 

2. 