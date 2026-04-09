package P6;

import java.util.Scanner;

public class MahasiswaDemo29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi29 listMhs = new MahasiswaBerprestasi29();

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Berapa banyak mahasiswa yang akan diinput? ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();

            Mahasiswa29 mhs = new Mahasiswa29(nim, nama, kelas, ipk);
            listMhs.tambah(mhs);
        }

        System.out.println("\n\n=== Data mahasiswa sebelum sorting ===");
        listMhs.tampil();

        System.out.println("\n=== Data mahasiswa setelah sorting (diurutkan berdasarkan IPK DESC) ===");
        listMhs.bubbleSort();
        listMhs.tampil();

        System.out.println("\n=== Data yang sudah terurut menggunakan INSERTION SORT (ASC) ===");
        listMhs.insertionSort();
        listMhs.tampil();

        input.close();
    }
}
