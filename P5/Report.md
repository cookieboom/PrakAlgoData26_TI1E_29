# Laporan JOBSHEET V BRUTE FORCE DAN DIVIDE CONQUER

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Percobaan 5.2

### Hasil Running



### Pertanyaan 5.2



### Jawaban 5.2
1. if adalah base case dari fungsi rekursif, sedangkan else adalah recursive case dari fungsi rekursif. Rekursif case akan terus dijalankan sampai mencapai base case.
2. Selain menggunkan for loop, kita juga bisa menggunakan while loop untuk melakukan iterasi pada array. Dengan while yang akan berhenti ketika nilai i sudah sama dengan atau lebih dari panjang parameter n.
3. Fakto *= i; adalah cara untuk mengalikan nilai fakto dengan nilai i pada setiap iterasi, sedangkan int fakto = n * faktorialDC(n-1); adalah cara untuk menghitung faktorial dengan menggunakan rekursi, dimana nilai n akan dikalikan dengan hasil dari faktorialDC(n-1) sampai mencapai base case.
4. Perbedaan utama antara metode brute force dan divide and conquer adalah melakukan iterasi pada array untuk menghitung nilai faktorial sekaligus, sedangkan divide and conquer menggunakan pendekatan rekursif untuk membagi masalah menjadi sub-masalah yang lebih kecil dan menyelesaikannya secara terpisah.

## Percobaan 5.3

### Hasil Running



### Pertanyaan 5.3



### Jawaban 5.3
1. Untuk method pangkatBF() menggunakan metode brute force, sedangkan untuk method pangkatDC() menggunakan metode divide and conquer.
2. Pada metode pangkatDC(), tahap combine sudah termasuk dalam kode tersebut. Hal ini terlihat pada bagian return pangkatDC(a, n/2) * pangkatDC(a, n/2); dimana hasil dari dua pemanggilan rekursif digabungkan untuk menghasilkan hasil akhir.
3. Menurut saya, method pangkatBF() tetap relevan untuk memiliki parameter karena memungkinkan kita untuk menghitung pangkat dari nilai yang berbeda tanpa harus membuat instance baru dari class Pangkat. Namun, jika kita ingin membuat method pangkatBF() tanpa parameter, kita bisa menggunakan atribut nilai dan pangkat yang sudah ada di class Pangkat. Berikut adalah contoh method pangkatBF() tanpa parameter:

```java
public int pangkatBF() {
    int result = 1;
    for (int i = 0; i < this.pangkat; i++) {
        result *= this.nilai;
    }
    return result;

4. Perbedaan antara kedua metode tersebut adalah:
- method pangkatBF() menggunakan pendekatan brute force dengan melakukan iterasi menggunakan loop for untuk menghitung pangkat.
- method pangkatDC() menggunakan pendekatan divide and conquer dengan membagi masalah menjadi sub-masalah yang lebih kecil dan menyelesaikannya secara terpisah.

## Percobaan 5.4

### Hasil Running



### Pertanyaan 5.4



### Jawaban 5.4
1. Variable mid dibutuhkan pada method TotalDC() untuk menentukan titik tengah dari array yang akan dibagi menjadi dua bagian.
2. Statement lsum dan rsum pada method TotalDC() digunakan untuk menyimpan hasil penjumlahan dari bagian kiri dan bagian kanan dari array yang telah dibagi.
3. Untuk menjumlahkan antara bagian kiri dan bagian kanan pada method TotalDC() dari hasil pembagian array tadi.
4. Base case pada method TotalDC() adalah ketika nilai n sama dengan 1, dimana method akan mengembalikan nilai dari array pada indeks 0.
5. totalDC() menggunakan pendekatan divide and conquer dengan membagi array menjadi dua bagian hingga mencapai base case, yaitu ketika n sama dengan 1. Kemudian, hasil dari bagian kiri dan bagian kanan akan dijumlahkan untuk menghasilkan total keseluruhan dari array tersebut.

## Latiihan 1

### Soal



### Hasil Running




