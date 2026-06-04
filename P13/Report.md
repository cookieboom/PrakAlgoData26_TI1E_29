# Laporan JOBSHEET  14 Tree

Nama : Satria Rizky Ramadhan

NIM : 254107020128

Kelas : TI-1E

## Praktikum 14.2

### Hasil Running

<img width="458" height="716" alt="Screenshot 2026-06-04 at 12 30 22" src="https://github.com/user-attachments/assets/876758ac-a567-4540-a075-867bb2262292" />

### Pertanyaan 14.2

<img width="626" height="426" alt="Screenshot 2026-06-04 at 12 55 03" src="https://github.com/user-attachments/assets/ab97b645-9fdb-470b-a484-f502b236b1d4" />

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

<img width="460" height="171" alt="Screenshot 2026-06-04 at 12 55 40" src="https://github.com/user-attachments/assets/66894050-e3c7-4a5c-b2fe-15682095c42c" />

### Pertanyaan 14.3

<img width="618" height="189" alt="Screenshot 2026-06-04 at 12 55 58" src="https://github.com/user-attachments/assets/ba10d44a-5cb0-44d4-96dc-fa92ae5b2de1" />

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

<img width="626" height="263" alt="Screenshot 2026-06-04 at 12 56 24" src="https://github.com/user-attachments/assets/eca123b2-ac1e-468d-b1f5-a8fea322653d" />

### Hasil Running

<img width="510" height="373" alt="Screenshot 2026-06-04 at 12 57 10" src="https://github.com/user-attachments/assets/9a4acc58-1b60-488b-8379-eaf385f61b00" />
