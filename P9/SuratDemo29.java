package P9;

import java.util.Scanner;

public class SuratDemo29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S: Sakit, I: Izin Keperluan Lain): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    Surat surat = new Surat(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat diproses = stack.pop();
                    if (diproses != null) {
                        String jenisKeterangan = diproses.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Memproses surat izin dari " + diproses.namaMahasiswa);
                        System.out.println("ID Surat: " + diproses.idSurat);
                        System.out.println("Kelas: " + diproses.kelas);
                        System.out.println("Jenis Izin: " + jenisKeterangan);
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                        System.out.println("Surat izin dari " + diproses.namaMahasiswa + " telah divalidasi");
                    }
                    break;
                case 3:
                    Surat lihat = stack.peek();
                    if (lihat != null) {
                        String jenisKeterangan = lihat.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Surat terakhir diterima dari: " + lihat.namaMahasiswa);
                        System.out.println("ID Surat: " + lihat.idSurat);
                        System.out.println("Kelas: " + lihat.kelas);
                        System.out.println("Jenis Izin: " + jenisKeterangan);
                        System.out.println("Durasi: " + lihat.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = scan.nextLine();
                    Surat hasil = stack.cari(namaCari);
                    if (hasil != null) {
                        String jenisKeterangan = hasil.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Surat ditemukan!");
                        System.out.println("ID Surat: " + hasil.idSurat);
                        System.out.println("Nama: " + hasil.namaMahasiswa);
                        System.out.println("Kelas: " + hasil.kelas);
                        System.out.println("Jenis Izin: " + jenisKeterangan);
                        System.out.println("Durasi: " + hasil.durasi + " hari");
                    } else {
                        System.out.println("Surat izin dari " + namaCari + " tidak ditemukan");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        scan.close();
    }
}
