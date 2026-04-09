package P7.cm;

import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        // Data semua mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        daftarMahasiswa[0] = new Mahasiswa("22001", "Andi", "Teknik Informatika");
        daftarMahasiswa[1] = new Mahasiswa("22002", "Budi", "Teknik Informatika");
        daftarMahasiswa[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        // Data semua buku
        Buku[] daftarBuku = new Buku[4];
        daftarBuku[0] = new Buku("B001", "Algoritma", 2020);
        daftarBuku[1] = new Buku("B002", "Basis Data", 2019);
        daftarBuku[2] = new Buku("B003", "Pemrograman", 2021);
        daftarBuku[3] = new Buku("B004", "Fisika", 2024);

        // Data semua peminjaman
        Peminjaman[] daftarPeminjaman = new Peminjaman[5];
        daftarPeminjaman[0] = new Peminjaman(daftarMahasiswa[0], daftarBuku[0], 7);
        daftarPeminjaman[0].hitungDenda();

        daftarPeminjaman[1] = new Peminjaman(daftarMahasiswa[1], daftarBuku[1], 3);
        daftarPeminjaman[1].hitungDenda();

        daftarPeminjaman[2] = new Peminjaman(daftarMahasiswa[2], daftarBuku[2], 10);
        daftarPeminjaman[2].hitungDenda();

        daftarPeminjaman[3] = new Peminjaman(daftarMahasiswa[2], daftarBuku[3], 6);
        daftarPeminjaman[3].hitungDenda();

        daftarPeminjaman[4] = new Peminjaman(daftarMahasiswa[0], daftarBuku[1], 4);
        daftarPeminjaman[4].hitungDenda();

        // Deklarasi pendukung
        Scanner sc = new Scanner(System.in);
        int pilihan;

        // Loop sistem menu
        while (true) {
            // Menu
            System.out.println();
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            // Switch case menu
            switch (pilihan) {
                case 1:
                    // Tampilkan mahasiswa
                    System.out.println();
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    // Tampilkan buku
                    System.out.println();
                    System.out.println("Daftar Buku: ");
                    for (Buku buku : daftarBuku) {
                        buku.tampilBuku();
                    }
                    break;
                case 3:
                    // Tampilkan peminjaman
                    System.out.println();
                    System.out.println("Daftar Peminjaman: ");
                    for (Peminjaman pinjam : daftarPeminjaman) {
                        pinjam.tampilPeminjaman();
                    }
                    break;
                case 4:
                    // Urutkan berdasarkan denda
                    // Logika pengurutan data (Menggunakan array index urut agar array peminjaman tidak berubah)
                    int[] indexUrut = {0, 1, 2, 3, 4};
                    for (int i = 1; i <= daftarPeminjaman.length - 1; i++) {
                        int temp = daftarPeminjaman[indexUrut[i]].denda;
                        int j = i - 1;
                        while (j >= 0 && daftarPeminjaman[indexUrut[j]].denda < temp) {
                            indexUrut[j + 1] = indexUrut[j];
                            j--;
                        }
                        indexUrut[j + 1] = i;
                    }
                    // Tampilkan hasil pengurutan
                    System.out.println();
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    for (int i = 0; i < indexUrut.length; i++) {
                        daftarPeminjaman[indexUrut[i]].tampilPeminjaman();
                    }
                    break;
                case 5:
                    // Cari berdasarkan NIM
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.next();
                    boolean ditemukan = false;
                    int left = 0, right = daftarMahasiswa.length, mid, perbandingan;
                    while (left<=right) {
                        mid = (left + right) / 2;
                        perbandingan = nimCari.compareTo(daftarMahasiswa[mid].nim);
                        if (perbandingan > 0) {
                            left = mid + 1;
                        } else if (perbandingan < 0 ) {
                            right = mid - 1;
                        } else {
                            daftarMahasiswa[mid].tampilMahasiswa();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan");
                    }
                    break;
                case 0:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    // Tutup scanner
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        }
    }
}
