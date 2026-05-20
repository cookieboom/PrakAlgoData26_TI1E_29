package P12.CM;

import java.util.Scanner;

public class restoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        DLLP antrian = new DLLP();
        DLLO pesanan = new DLLO();

        do {
            System.out.println("===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    String noHP = sc.nextLine();
                    people p = new people(nama, noHP);
                    antrian.tambahAntrian(p);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + p.noAntrian);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    people pembeli = antrian.head.data;
                    antrian.hapusAntrian();
                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int hargaPesanan = sc.nextInt();
                    sc.nextLine();
                    order o = new order(kode, namaPesanan, hargaPesanan);
                    pesanan.tambahPesanan(o);
                    System.out.println(pembeli.namaPembeli + " telah memesan " + o.namaPesanan);
                    break;
                case 4:
                    pesanan.cetakPesananOrder();
                    break;
                case 0:
                    System.out.println("Sistem selesai.");
                    sc.close();
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
    }
}
