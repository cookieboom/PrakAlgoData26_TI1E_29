package P3;

import java.util.Scanner;

public class MatakuliahDemo29 {
    public static void main(String[] args) {
        Scanner satria = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, jumlahData;

        System.out.print("Masukkan jumlah data Matakuliah : ");
        dummy = satria.nextLine();
        jumlahData = Integer.parseInt(dummy);
        System.out.println("-------------------------------------");

        Matakuliah29[] arrayOfMatakuliah = new Matakuliah29[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            arrayOfMatakuliah[i] = new Matakuliah29("", "", 0, 0);
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode            : ");
            kode = satria.nextLine();
            System.out.print("Nama            : ");
            nama = satria.nextLine();
            System.out.print("Sks             : ");
            dummy = satria.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam      : ");
            dummy = satria.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("-------------------------------------");
        }

        satria.close();
    }
}
