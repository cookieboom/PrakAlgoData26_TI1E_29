# Laporan Praktik P3: Array of Object

## Uji Coba 3.2: Apakah Class yang Dibuat Array of Object Harus Selalu Memiliki Atribut dan Sekaligus Method?

### Jawaban: **TIDAK**

Berdasarkan uji coba 3.2, **class yang dijadikan array of object TIDAK harus selalu memiliki method**. Class bisa hanya memiliki atribut saja.

---

## Penjelasan

### 1. **Class Mahasiswa hanya memiliki atribut**
```java
public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}
```

Class `Mahasiswa` pada uji coba 3.2 hanya memiliki **4 atribut** tanpa ada method khusus yang didefinisikan oleh programmer. Namun, class ini tetap dapat digunakan sebagai array of object.

### 2. **Penggunaan Array of Object**
```java
Mahasiswa[] arrayofMahasiswa = new Mahasiswa[3];

arrayofMahasiswa[0] = new Mahasiswa();
arrayofMahasiswa[0].nim = "2441070060033";
arrayofMahasiswa[0].nama = "AGNES TITANIA KINANTI";
arrayofMahasiswa[0].kelas = "S1B-1E";
arrayofMahasiswa[0].ipk = (float) 3.75;
```

Array dari class `Mahasiswa` berhasil dibuat dan digunakan dengan **hanya mengakses atributnya**, tanpa memerlukan method apapun.

### 3. **Struktur Class yang Hasil Output:**

Contoh output program:
```
NIM           : 2441070060033
Nama          : AGNES TITANIA KINANTI
Kelas         : S1B-1E
IPK           : 3.75
```

Hanya mengakses atribut dan menampilkannya langsung menggunakan `System.out.println()` di main method.

---

## Kesimpulan

1. **Atribut adalah keharusan** - Untuk menyimpan data dalam array of object, class setidaknya harus memiliki atribut.

2. **Method adalah opsional** - Class tidak harus memiliki method sendiri. Jika hanya perlu menyimpan data, atribut sudah cukup.

3. **Fleksibilitas struktur class** - Kita bisa membuat class:
   - Hanya dengan atribut (seperti Mahasiswa di P3 ini)
   - Dengan atribut dan method
   - Bahkan hanya dengan method saja (tidak umum)

4. **Best Practice** - Walaupun bukan keharusan, dalam praktik yang baik, sebaiknya menambahkan method untuk:
   - Enkapsulasi data (getter/setter)
   - Validasi data
   - Functionality yang lebih lengkap

---

## Verifikasi Eksperimen

| Aspek | Hasil |
|-------|-------|
| Class hanya dengan atribut | ✓ Berhasil |
| Array of object | ✓ Terbuat |
| Akses atribut | ✓ Berhasil |
| Tanpa method khusus | ✓ Tetap berfungsi |

**Kesimpulan akhir: Class yang akan dijadikan array of object TIDAK harus selalu memiliki atribut DAN method. Atribut saja sudah cukup untuk membentuk array of object yang fungsional.**