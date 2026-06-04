# Laporan JOBSHEET  14 Tree

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Praktikum 14.2

### Hasil Running


### Pertanyaan 14.2


### Jawaban 14.2

1. **Efektivitas BST:** Pencarian lebih cepat karena properti urutan (kiri < parent < kanan) memungkinkan eliminasi separuh data setiap iterasi → O(log n) vs O(n).

2. **Kegunaan left & right:** Menyimpan referensi ke node anak kiri dan kanan.

3. **a. Kegunaan root:** Menyimpan referensi ke node akar.
   **b. Nilai awal root:** `null` (tree kosong).

4. **Saat tree kosong ditambah node baru:** Node baru menjadi `root`.

5. **Metode add():** 
   - Jika tree kosong → node baru jadi root
   - Jika tidak kosong → bandingkan IPK baru dengan current node
   - IPK < current → cek ke kiri, IPK ≥ current → cek ke kanan
   - Ulangi sampai menemukan posisi kosong (`null`)

6. **delete() dengan 2 anak:**
   - `getSuccessor()` mencari node pengganti dari subtree kanan (elemen terkecil di sebelah kanan)
   - Node pengganti ini menggantikan posisi node yang dihapus sambil mempertahankan properti BST

## Praktikum 14.3

### Hasil Running


### Pertanyaan 14.3


### Jawaban 14.3

1. **data & idxLast:** `data` array menyimpan node-node tree, `idxLast` mencatat index elemen terakhir yang diisi.

2. **populateData():** Mengisi array dengan data mahasiswa dari array yang diberikan.

3. **traverseInOrder():** Menampilkan data tree dengan urutan In-Order (kiri → root → kanan).

4. **Posisi child di array indeks 2:**
   - Left child → indeks `2*2 + 1 = 5`
   - Right child → indeks `2*2 + 2 = 6`

5. **idxLast = 6:** Menandai bahwa elemen terakhir yang diisi berada di indeks 6 (7 mahasiswa total).

6. **Formula 2*idxStart+1 dan 2*idxStart+2:** Implementasi heap property dalam array representation:
   - Anak kiri dari node di indeks `i` → `2*i + 1`
   - Anak kanan dari node di indeks `i` → `2*i + 2`
   - Ini memastikan struktur pohon biner tetap valid dalam bentuk linear array.

## Tugas


### Hasil Running

